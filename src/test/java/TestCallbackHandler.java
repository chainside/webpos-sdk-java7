import com.fasterxml.jackson.databind.ObjectMapper;
import it.sdkboilerplate.exceptions.CallbackVerificationException;
import net.webpossdk.api.ChainsideApiContext;
import net.webpossdk.api.ChainsideClient;
import net.webpossdk.api.ChainsideHeaders;
import net.webpossdk.callbacks.ChainsideCallbackHandler;
import net.webpossdk.lib.Hashers;
import net.webpossdk.objects.*;
import org.apache.commons.codec.binary.Base64;
import org.junit.Assert;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;


public class TestCallbackHandler {

    private ChainsideApiContext ctx;
    private ChainsideCallbackHandler handler;
    private MessageDigest hasher;
    private String testBody;
    private byte[] vkey;
    private HashMap<String, String> headers;
    private ObjectMapper mapper;

    public TestCallbackHandler() throws Exception {
        HashMap<String, Object> config = new HashMap();
        config.put("mode", "live");
        config.put("clientId", "testClientId");
        config.put("secret", "testSecret");
        this.ctx = new ChainsideApiContext(config);
        this.handler = new ChainsideCallbackHandler(this.ctx);
        this.hasher = MessageDigest.getInstance(Hashers.SHA_256);
        this.testBody = "testRawBody";
        this.vkey = this.hasher.digest("testSecret".getBytes());
        this.headers = new HashMap();
        this.mapper = new ObjectMapper();
    }

    /**
     * Tests correct verification
     */
    @Test
    public void testVerify() throws Exception {
        byte[] hmac = Whitebox.invokeMethod(this.handler, "getHMAC", this.testBody.getBytes(), this.vkey);
        String encodedHmac = Base64.encodeBase64String(hmac);
        this.headers.put(ChainsideHeaders.SIGNATURE, encodedHmac);
        handler.verify(this.headers, this.testBody.getBytes());

    }

    /**
     * Tests No signature header
     */
    @Test(expected = CallbackVerificationException.class)
    public void testVerifyFailure() throws Exception {
        HashMap<String, String> headers = new HashMap();
        handler.verify(headers, this.testBody.getBytes());
    }

    /**
     * Signature not matching
     */
    @Test(expected = CallbackVerificationException.class)
    public void testSignatureMismatch() throws Exception {
        String failBody = "testFailBody";
        byte[] hmac = Whitebox.invokeMethod(this.handler, "getHMAC", this.testBody.getBytes(), vkey);
        String encodedHmac = Base64.encodeBase64String(hmac);
        this.headers.put(ChainsideHeaders.SIGNATURE, encodedHmac);
        handler.verify(this.headers, failBody.getBytes());
    }

    /**
     * Callback Parsing
     */
    @Test
    public void testCallbackParsing() throws Exception {
        CallbackPaymentOrder paymentOrder = new CallbackPaymentOrder();
        TransactionCollection transactions = new TransactionCollection(new ArrayList());

        paymentOrder.setAddress("testAddress");
        paymentOrder.setAmount("10.00");
        paymentOrder.setBtcAmount(3);
        paymentOrder.setTransactions(transactions);

        HashMap<String, Object> serialized = paymentOrder.toHashMap();
        HashMap<String, Object> callbackBody = new HashMap();
        callbackBody.put("event", "payment.completed");
        callbackBody.put("object", serialized);
        callbackBody.put("created_at", "2017-05-06 18:51");
        callbackBody.put("object_type", "paymentOrder");

        String jsonSerialization = this.mapper.writeValueAsString(callbackBody);
        byte[] hmac = Whitebox.invokeMethod(this.handler, "getHMAC", jsonSerialization.getBytes(), this.vkey);
        this.headers.put(ChainsideHeaders.SIGNATURE, Base64.encodeBase64String(hmac));
        PaymentCompletedCallback cb = (PaymentCompletedCallback) this.handler.parse(this.headers, jsonSerialization.getBytes());
        CallbackPaymentOrder parsed = cb.getObject();
        Assert.assertEquals(parsed.address, "testAddress");
        Assert.assertEquals(parsed.amount, "10.00");
        Assert.assertEquals(parsed.btc_amount, (Integer) 3);

    }


}

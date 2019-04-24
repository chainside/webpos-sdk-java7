package net.webpossdk.hooks;

import it.sdkboilerplate.hooks.PreSendHook;
import it.sdkboilerplate.http.Headers;
import it.sdkboilerplate.http.SdkRequest;
import it.sdkboilerplate.lib.ApiContext;
import org.apache.commons.codec.binary.Base64;


/**
 * Pre-send hook class which fetches credentials from the configuration and
 */
public class AuthenticationHook extends PreSendHook {
    public AuthenticationHook(ApiContext ctx, SdkRequest sdkRequest) {
        super(ctx, sdkRequest);
    }

    public void run() {
        String clientId = this.ctx.getConfig().get("clientId").toString();
        String secret = this.ctx.getConfig().get("secret").toString();
        String encoded = Base64.encodeBase64String((clientId + ":" + secret).getBytes());
        this.sdkRequest.setHeader(Headers.AUTHORIZATION, "Basic " + encoded);
    }
}

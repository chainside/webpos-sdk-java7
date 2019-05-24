/*
Nigiri auto-generated file
*/
package net.webpossdk.callbacks;

import it.sdkboilerplate.objects.SdkObject;
import net.webpossdk.objects.*;

import java.util.HashMap;

public class ChainsideCallbackFactory {
    public static HashMap<String, Class<? extends SdkObject>> getCallbacks() {
        HashMap<String, Class<? extends SdkObject>> callbacks = new HashMap();
        callbacks.put("payment.completed", PaymentCompletedCallback.class);
        callbacks.put("payment.dispute.start", PaymentDisputeStartCallback.class);
        callbacks.put("payment.overpaid", PaymentOverpaidCallback.class);
        callbacks.put("payment.cancelled", PaymentCancelledCallback.class);
        callbacks.put("payment.dispute.end", PaymentDisputeEndCallback.class);
        callbacks.put("payment.expired", PaymentExpiredCallback.class);
        callbacks.put("payment.chargeback", PaymentChargebackCallback.class);
        return callbacks;
    }
}
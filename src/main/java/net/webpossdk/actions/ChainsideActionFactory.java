/*
Nigiri auto-generated file
*/
package net.webpossdk.actions;

import it.sdkboilerplate.actions.*;

import net.webpossdk.api.*;

import java.util.HashMap;

public class ChainsideActionFactory extends ActionsFactory{
    public HashMap<String, Class<? extends Action>> getActions(){
        HashMap<String, Class<? extends Action>> actions = new HashMap();
        actions.put("clientCredentialsLogin" , ClientCredentialsLoginAction.class);
        actions.put("getCallbacks" , GetCallbacksAction.class);
        actions.put("paymentReset" , PaymentResetAction.class);
        actions.put("paymentUpdate" , PaymentUpdateAction.class);
        actions.put("deletePaymentOrder" , DeletePaymentOrderAction.class);
        actions.put("getPaymentOrder" , GetPaymentOrderAction.class);
        actions.put("getPaymentOrders" , GetPaymentOrdersAction.class);
        actions.put("createPaymentOrder" , CreatePaymentOrderAction.class);
        return actions;
    }
    public ChainsideActionFactory(ChainsideApiContext ctx){
        super(ctx);
    }
}
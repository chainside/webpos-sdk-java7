/*
Nigiri auto-generated file
*/
package net.webpossdk.actions;

import net.webpossdk.objects.*;
import net.webpossdk.lib.*;
import net.webpossdk.exceptions.*;

import it.sdkboilerplate.exceptions.*;
import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.lib.*;
import it.sdkboilerplate.validation.*;

import java.util.*;

public class PaymentUpdateAction extends ChainsideAuthenticatedAction{
    public PaymentUpdateAction(ApiContext ctx){
        super(ctx);
    }
    @Override
    public String getRoute(){
            return "/payment-order/{payment_order_uuid}/test/";
    }
    @Override
    public String getVerb(){
        return "PATCH";

    }
    @Override
    public Schema getQueryParametersSchema () {return new Schema();}
    @Override
    public Schema getRouteParametersSchema () {return new Schema();}

    public HashMap<String, Class<? extends SdkHttpException>> getErrors() {
        HashMap<String, Class<? extends SdkHttpException>> errors = new HashMap();
        errors.putAll(super.getErrors());
        errors.put("3001" , NotFoundException.class);
        errors.put("0013" , InvalidCallbackException.class);
        return errors;
        }
    @Override
    public Class<? extends SdkBodyType> getRequestBodyClass() {
        return PaymentUpdateObject.class;
        }
    @Override
    public Class<? extends SdkBodyType> getResponseBodyClass() {
        return null;
        }
    @Override
    public HashMap<String, String> getHeaders(){
        HashMap<String, String> headers = new HashMap();
        headers.put("Content-Type", "application/json");
        headers.put("Accept", "application/json");
        headers.put("X-Api-Version", "v1");
        return headers;
    }
    public void setPaymentOrderUuid(String value){
        this.setRouteParameter("payment_order_uuid", value);
    }
    public void setPaymentUpdateObject(PaymentUpdateObject value)
        throws UnserializableObjectException{
        this.setRequestBody(value);
    }
    }
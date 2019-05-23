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

public class DeletePaymentOrderAction extends ChainsideAuthenticatedAction{
    public DeletePaymentOrderAction(ApiContext ctx){
        super(ctx);
    }
    @Override
    public String getRoute(){
            return "/payment-order/{payment_order_uuid}";
    }
    @Override
    public String getVerb(){
        return "DELETE";

    }
    @Override
    public Schema getQueryParametersSchema () {return new Schema();}
    @Override
    public Schema getRouteParametersSchema () {return new Schema();}

    public HashMap<String, Class<? extends SdkHttpException>> getErrors() {
        HashMap<String, Class<? extends SdkHttpException>> errors = new HashMap();
        errors.putAll(super.getErrors());
        
        errors.put("3001" , NotFoundException.class);
        
        return errors;
        }
    @Override
    public Class<? extends SdkBodyType> getRequestBodyClass() {
        return null;
        }
    @Override
    public Class<? extends SdkBodyType> getResponseBodyClass() {
        return PaymentOrderDeletionResponse.class;
        }
    @Override
    public HashMap<String, String> getHeaders(){
        HashMap<String, String> headers = new HashMap();
        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        headers.put("X-Api-Version", "v1");
        return headers;
    }

    public void setPaymentOrderUuid(String value){
        this.setRouteParameter("payment_order_uuid", value);
    }
    }
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

public class GetPaymentOrdersAction extends ChainsideAuthenticatedAction{
    public GetPaymentOrdersAction(ApiContext ctx){
        super(ctx);
    }
    @Override
    public String getRoute(){
            return "/payment-order";
    }
    @Override
    public String getVerb(){
        return "GET";

    }
    @Override
    public Schema getQueryParametersSchema () {return new Schema();}
    @Override
    public Schema getRouteParametersSchema () {return new Schema();}

    public HashMap<String, Class<? extends SdkHttpException>> getErrors() {
        HashMap<String, Class<? extends SdkHttpException>> errors = new HashMap();
        errors.putAll(super.getErrors());
        
        return errors;
        }
    @Override
    public Class<? extends SdkBodyType> getRequestBodyClass() {
        return null;
        }
    @Override
    public Class<? extends SdkBodyType> getResponseBodyClass() {
        return PaymentOrderList.class;
        }
    @Override
    public HashMap<String, String> getHeaders(){
        HashMap<String, String> headers = new HashMap();
        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        headers.put("X-Api-Version", "v1");
        return headers;
    }

    public void setPage(String value){
        this.setQueryParameter("page", value);
    }
    public void setPageSize(String value){
        this.setQueryParameter("page_size", value);
    }
    public void setSortBy(String value){
        this.setQueryParameter("sort_by", value);
    }
    public void setSortOrder(String value){
        this.setQueryParameter("sort_order", value);
    }
    public void setStatus(String value){
        this.setQueryParameter("status", value);
    }
    }
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

public class ClientCredentialsLoginAction extends ChainsideAuthenticatingAction{
    public ClientCredentialsLoginAction(ApiContext ctx){
        super(ctx);
    }
    @Override
    public String getRoute(){
            return "/token";
    }
    @Override
    public String getVerb(){
        return "POST";

    }
    @Override
    public Schema getQueryParametersSchema () {return new Schema();}
    @Override
    public Schema getRouteParametersSchema () {return new Schema();}

    public HashMap<String, Class<? extends SdkHttpException>> getErrors() {
        HashMap<String, Class<? extends SdkHttpException>> errors = new HashMap();
        errors.putAll(super.getErrors());
        
        errors.put("1002" , InvalidGrantTypeException.class);
        errors.put("1013" , InvalidScopeException.class);
        errors.put("1001" , UnauthorizedClientException.class);
        
        return errors;
        }
    @Override
    public Class<? extends SdkBodyType> getRequestBodyClass() {
        return ClientCredentials.class;
        }
    @Override
    public Class<? extends SdkBodyType> getResponseBodyClass() {
        return ClientCredentialsLoginResponse.class;
        }
    @Override
    public HashMap<String, String> getHeaders(){
        HashMap<String, String> headers = new HashMap();
        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/x-www-form-urlencoded");
        headers.put("X-Api-Version", "v1");
        return headers;
    }

    public void setClientCredentials(ClientCredentials value)
        throws UnserializableObjectException{
        this.setRequestBody(value);
    }
    }
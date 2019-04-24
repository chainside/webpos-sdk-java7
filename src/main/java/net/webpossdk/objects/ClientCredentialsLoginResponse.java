/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class ClientCredentialsLoginResponse extends SdkObject{
    public Integer expires_in;
    public String id_token;
    public String scope;
    public String access_token;
    public String token_type;
    public Schema getSchema() throws JsonSerializationException{
            return new Schema(ClientCredentialsLoginResponseSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        return subObjects;
        }
        public Integer getExpiresIn(){
            return this.expires_in;
        }
        public void setExpiresIn(Integer value){
            this.expires_in = value;
        }
        public String getIdToken(){
            return this.id_token;
        }
        public void setIdToken(String value){
            this.id_token = value;
        }
        public String getScope(){
            return this.scope;
        }
        public void setScope(String value){
            this.scope = value;
        }
        public String getAccessToken(){
            return this.access_token;
        }
        public void setAccessToken(String value){
            this.access_token = value;
        }
        public String getTokenType(){
            return this.token_type;
        }
        public void setTokenType(String value){
            this.token_type = value;
        }
        public ClientCredentialsLoginResponse(){}
}

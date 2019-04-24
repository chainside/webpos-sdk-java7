/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class PaymentOrderDeletionResponse extends SdkObject{
    public String cancel_url;
    public Schema getSchema() throws JsonSerializationException{
            return new Schema(PaymentOrderDeletionResponseSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        return subObjects;
        }
        public String getCancelUrl(){
            return this.cancel_url;
        }
        public void setCancelUrl(String value){
            this.cancel_url = value;
        }
        public PaymentOrderDeletionResponse(){}
}

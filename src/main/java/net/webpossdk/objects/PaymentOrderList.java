/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class PaymentOrderList extends SdkObject{
    public PaymentOrderRetrievalCollection paymentorders;
    public Schema getSchema() throws JsonSerializationException{
            return new Schema(PaymentOrderListSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        subObjects.put("paymentorders", PaymentOrderRetrievalCollection.class);
        return subObjects;
        }
        public PaymentOrderRetrievalCollection getPaymentorders(){
            return this.paymentorders;
        }
        public void setPaymentorders(PaymentOrderRetrievalCollection value){
            this.paymentorders = value;
        }
        public PaymentOrderList(){}
}

/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;
import java.util.ArrayList;


public class PaymentOrderRetrievalCollection extends SdkCollection<PaymentOrderRetrieval>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(PaymentOrderRetrievalSchema.jsonSchema);
        }
        public static Class<PaymentOrderRetrieval> getElementsClass(){
                return PaymentOrderRetrieval.class;
        }
        public PaymentOrderRetrievalCollection(ArrayList<PaymentOrderRetrieval> elements){
                super(elements);
        }
}
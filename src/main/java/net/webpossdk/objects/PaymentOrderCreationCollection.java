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


public class PaymentOrderCreationCollection extends SdkCollection<PaymentOrderCreation>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(PaymentOrderCreationSchema.jsonSchema);
        }
        public static Class<PaymentOrderCreation> getElementsClass(){
                return PaymentOrderCreation.class;
        }
        public PaymentOrderCreationCollection(ArrayList<PaymentOrderCreation> elements){
                super(elements);
        }
}
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


public class PaymentOrderCreatorCollection extends SdkCollection<PaymentOrderCreator>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(PaymentOrderCreatorSchema.jsonSchema);
        }
        public static Class<PaymentOrderCreator> getElementsClass(){
                return PaymentOrderCreator.class;
        }
        public PaymentOrderCreatorCollection(ArrayList<PaymentOrderCreator> elements){
                super(elements);
        }
}
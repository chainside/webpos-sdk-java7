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


public class PaymentOrderStateCollection extends SdkCollection<PaymentOrderState>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(PaymentOrderStateSchema.jsonSchema);
        }
        public static Class<PaymentOrderState> getElementsClass(){
                return PaymentOrderState.class;
        }
        public PaymentOrderStateCollection(ArrayList<PaymentOrderState> elements){
                super(elements);
        }
}
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


public class PaymentOrderListCollection extends SdkCollection<PaymentOrderList>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(PaymentOrderListSchema.jsonSchema);
        }
        public static Class<PaymentOrderList> getElementsClass(){
                return PaymentOrderList.class;
        }
        public PaymentOrderListCollection(ArrayList<PaymentOrderList> elements){
                super(elements);
        }
}
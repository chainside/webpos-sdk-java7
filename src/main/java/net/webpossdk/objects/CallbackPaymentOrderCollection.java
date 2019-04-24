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


public class CallbackPaymentOrderCollection extends SdkCollection<CallbackPaymentOrder>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(CallbackPaymentOrderSchema.jsonSchema);
        }
        public static Class<CallbackPaymentOrder> getElementsClass(){
                return CallbackPaymentOrder.class;
        }
        public CallbackPaymentOrderCollection(ArrayList<CallbackPaymentOrder> elements){
                super(elements);
        }
}
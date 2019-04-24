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


public class PaymentUpdateObjectCollection extends SdkCollection<PaymentUpdateObject>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(PaymentUpdateObjectSchema.jsonSchema);
        }
        public static Class<PaymentUpdateObject> getElementsClass(){
                return PaymentUpdateObject.class;
        }
        public PaymentUpdateObjectCollection(ArrayList<PaymentUpdateObject> elements){
                super(elements);
        }
}
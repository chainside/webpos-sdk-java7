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


public class CallbackCollection extends SdkCollection<Callback>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(CallbackSchema.jsonSchema);
        }
        public static Class<Callback> getElementsClass(){
                return Callback.class;
        }
        public CallbackCollection(ArrayList<Callback> elements){
                super(elements);
        }
}
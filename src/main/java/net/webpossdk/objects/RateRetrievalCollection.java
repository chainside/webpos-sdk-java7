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


public class RateRetrievalCollection extends SdkCollection<RateRetrieval>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(RateRetrievalSchema.jsonSchema);
        }
        public static Class<RateRetrieval> getElementsClass(){
                return RateRetrieval.class;
        }
        public RateRetrievalCollection(ArrayList<RateRetrieval> elements){
                super(elements);
        }
}
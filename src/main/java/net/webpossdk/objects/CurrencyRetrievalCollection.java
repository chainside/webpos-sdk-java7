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


public class CurrencyRetrievalCollection extends SdkCollection<CurrencyRetrieval>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(CurrencyRetrievalSchema.jsonSchema);
        }
        public static Class<CurrencyRetrieval> getElementsClass(){
                return CurrencyRetrieval.class;
        }
        public CurrencyRetrievalCollection(ArrayList<CurrencyRetrieval> elements){
                super(elements);
        }
}
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


public class PaidStatusCollection extends SdkCollection<PaidStatus>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(PaidStatusSchema.jsonSchema);
        }
        public static Class<PaidStatus> getElementsClass(){
                return PaidStatus.class;
        }
        public PaidStatusCollection(ArrayList<PaidStatus> elements){
                super(elements);
        }
}
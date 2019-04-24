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


public class DepositAccountLiteCollection extends SdkCollection<DepositAccountLite>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(DepositAccountLiteSchema.jsonSchema);
        }
        public static Class<DepositAccountLite> getElementsClass(){
                return DepositAccountLite.class;
        }
        public DepositAccountLiteCollection(ArrayList<DepositAccountLite> elements){
                super(elements);
        }
}
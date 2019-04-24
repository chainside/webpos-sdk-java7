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


public class TransactionCollection extends SdkCollection<Transaction>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(TransactionSchema.jsonSchema);
        }
        public static Class<Transaction> getElementsClass(){
                return Transaction.class;
        }
        public TransactionCollection(ArrayList<Transaction> elements){
                super(elements);
        }
}
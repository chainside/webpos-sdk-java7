/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class CurrencyRetrieval extends SdkObject{
    public String name;
    public String uuid;
    public String type;
    public Schema getSchema() throws JsonSerializationException{
            return new Schema(CurrencyRetrievalSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        return subObjects;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String value){
            this.name = value;
        }
        public String getUuid(){
            return this.uuid;
        }
        public void setUuid(String value){
            this.uuid = value;
        }
        public String getType(){
            return this.type;
        }
        public void setType(String value){
            this.type = value;
        }
        public CurrencyRetrieval(){}
}

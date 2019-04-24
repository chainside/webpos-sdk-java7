/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class Callback extends SdkObject{
    public String name;
    public Schema getSchema() throws JsonSerializationException{
            return new Schema(CallbackSchema.jsonSchema);
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
        public Callback(){}
}

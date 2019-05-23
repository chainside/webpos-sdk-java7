/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class Out extends SdkObject{
    public Integer n;
    public Integer amount;
    public Schema getSchema() throws JsonSerializationException{
            return new Schema(OutSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        return subObjects;
        }
        public Integer getN(){
            return this.n;
        }
        public void setN(Integer value){
            this.n = value;
        }
        public Integer getAmount(){
            return this.amount;
        }
        public void setAmount(Integer value){
            this.amount = value;
        }
        public Out(){}
}

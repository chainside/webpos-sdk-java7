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


public class ClientCredentialsCollection extends SdkCollection<ClientCredentials>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(ClientCredentialsSchema.jsonSchema);
        }
        public static Class<ClientCredentials> getElementsClass(){
                return ClientCredentials.class;
        }
        public ClientCredentialsCollection(ArrayList<ClientCredentials> elements){
                super(elements);
        }
}
/*
Nigiri auto-generated file
*/
package net.webpossdk.objects.schemas;

public class ClientCredentialsLoginResponseSchema {
    public final static String jsonSchema = "{\"rules\": [], \"schema\": {\"access_token\": {\"rules\": [\"required\"], \"type\": \"string\"}, \"expires_in\": {\"rules\": [\"required\"], \"type\": \"integer\"}, \"id_token\": {\"rules\": [\"regex:^[A-Za-z0-9-_=]+\\\\.[A-Za-z0-9-_=]+\\\\.?[A-Za-z0-9-_.+/=]*$\", \"required\"], \"type\": \"string\"}, \"scope\": {\"rules\": [\"nullable\"], \"type\": \"string\"}, \"token_type\": {\"rules\": [\"equals:Bearer\", \"required\"], \"type\": \"string\"}}, \"type\": \"object\"}";
}
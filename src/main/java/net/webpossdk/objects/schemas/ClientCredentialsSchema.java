/*
Nigiri auto-generated file
*/
package net.webpossdk.objects.schemas;

public class ClientCredentialsSchema {
    public final static String jsonSchema = "{\"rules\": [], \"schema\": {\"grant_type\": {\"rules\": [\"equals:client_credentials\", \"required\"], \"type\": \"string\"}, \"scope\": {\"rules\": [\"in:*\", \"required\"], \"type\": \"string\"}}, \"type\": \"object\"}";
}
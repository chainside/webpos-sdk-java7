/*
Nigiri auto-generated file
*/
package net.webpossdk.objects.schemas;

public class PaymentOrderCreationSchema {
    public final static String jsonSchema = "{\"rules\": [], \"schema\": {\"amount\": {\"rules\": [\"required\", \"decimal\"], \"type\": \"string\"}, \"callback_url\": {\"rules\": [\"regex[https_url]:^https://\", \"nullable\", \"maxlen:300\"], \"type\": \"url\"}, \"cancel_url\": {\"rules\": [\"regex[https_url]:^https://\", \"nullable\", \"maxlen:300\"], \"type\": \"url\"}, \"continue_url\": {\"rules\": [\"regex[https_url]:^https://\", \"nullable\", \"maxlen:300\"], \"type\": \"url\"}, \"details\": {\"rules\": [\"required\", \"maxlen:300\"], \"type\": \"string\"}, \"reference\": {\"rules\": [\"maxlen:300\"], \"type\": \"string\"}, \"required_confirmations\": {\"rules\": [\"min:0\", \"nullable\"], \"type\": \"integer\"}}, \"type\": \"object\"}";
}
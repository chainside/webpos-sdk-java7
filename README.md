<!--
Nigiri auto-generated file
-->
<p>
<img src="https://www.chainside.net/wp-content/themes/chainside2018/assets/favicon//favicon-192.png" alt="chainside" width="80">
<br \><br \>
developed with :heart: by <a href="https://www.chainside.net">chainside</a>
</p>


<!-- START doctoc -->
<!-- END doctoc  -->

# Introduction

This project is the **official** SDK library for the integration with the [Chainside Pay]() Platform.
This repository contains the source code compatible with jdk1.7. The main repository of the library can be found at
https://github.com/chainside/webpos-sdk-java
 
# Installation

Follow these steps to install the SDK library into your system:

Follow these steps to install the SDK library into your system. You can install it either using
the maven-dependency-plugin, configuring the pom.xml or configuring the gradle.build (for gradle users)

With Maven plugin:

```bash
mvn org.apache.maven.plugins:maven-dependency-plugin:2.1:get 
-Dartifact=net.chainside.webpossdk:webpos-sdk-java7:1.3.0  
-DrepoUrl=http://central.maven.org/maven2/
```

In pom.xml:

```xml
<dependency>
            <groupId>net.chainside.webpossdk</groupId>
            <artifactId>webpos-sdk-java7</artifactId>
            <version>1.3.0</version>
</dependency>
```

In gradle.build:
```bash
compile 'net.chainside.webpossdk:webpos-sdk-java7:1.3.0'
```

#### TLS version
If you are experiencing protocol errors during the download, you might need to upgrade the TLS version used from
the dependency manager.
Depending on the jdk1.7 version used, you might need to enable TLSv1.2 protocol to download dependencies.
This can be achieved by passing -Dhttps.protocols=TLSv1.2 to the chosen package manager command

# Structure

The following sections will describe the high level structure of the
SDK library.

## Configuration

In order to be able to configure your SDK client you have to set some
configuration parameters. Here is the list of the configuration parameters
used by the library:

| Parameter | Type | Required | Default | Description |
|-----------|------|----------|---------|-------------|
| **mode** | _string_ | Yes | `live` | The SDK mode, can be `sandbox` or `live` |
| **clientId** | _string_ | Yes | `null` | Your WebPos client id |
| **secret** | _string_ | Yes | `null` | Your WebPos secret |
| **proxy**  | HashMap | No | `null` | Proxy Configuration

#### Proxy settings 
If a proxy configuration is given, the requests are sent using the configured proxy. A proxy configuration
must be specified as:

| Parameter | Type | Required | Default | Description |
|-----------|------|----------|---------|-------------|
| **hostname** | _string_ | Yes | `null` | Hostname of the proxy server |
| **port** | _int_ | Yes | `null` | Port of the proxy server |
| **protocol** | _string_ | Yes | `null` | Proxy server protocol (http , https)|
| **credentials** | HashMap | No | `null` | Credentials to authenticate on the proxy server

If the proxy server requires authentication, credentials must be specified in the proxy configuration
parameters as:

| Parameter | Type | Required | Default | Description |
|-----------|------|----------|---------|-------------|
| **user** | _string_ | Yes | `live` | Username to perform authentication  |
| **password** | _string_ | Yes | `null` | Proxy server password |

Example:

```java
import net.webpossdk.api.ChainsideClient;
import net.webpossdk.object.CallbackList;

HashMap<String, Object> config = new HashMap<>();
config.put("mode", "live");
config.put("clientId", WEBPOS_CLIENT_ID);
config.put("secret", WEBPOS_SECRET);
HashMap<String,String> credentials = new HashMap();
credentials.put("user", PROXY_USERNAME);    
credentials.put("password", PROXY_PWD);
HashMap<String,Object> proxyConfig =  new HashMap();
    proxyConfig.put("hostname", PROXY_HOSTNAME);
    proxyConfig.put("port", 8000);
    proxyConfig.put("protocol", "http");
    proxyConfig.put("credentials", credentials);

ChainsideClient client = new ChainsideClient(config); 
```

## Client

The Library exposes a _client_ object which is instantiated with the system configuration and
provides an high-level interface to send requests. Client's instances take care of compiling and
sending http request and parse responses into [SdkObject](#Objects) instances. 

## Objects

The library defines an SdkObject class which is extended by actual objects which represent Chainside-Pay
API requests and response bodies. Every json object defined in the API has a corresponding SdkObject
class which is either the input of a _client_ instance method (for creation) or returned (for reading)

## Callbacks

Callbacks are requests sent by the server to your application in order to notify about some events. 
Every callback is sent **only to HTTPS** webhooks and will be securely signed by the server in order to be verified.

# Usage

The following sections will describe how to use the SDK library and
all the detail needed to integrate your business with Chainside Pay.

## Instantiate and use the client

In order to communicate with our backend first you need to instantiate
the client:

```java
import net.webpossdk.api.ChainsideClient;
import net.webpossdk.object.CallbackList;

HashMap<String, Object> config = new HashMap<>();
config.put("mode", "live");
config.put("clientId", "{webpos_client_id}");
config.put("secret", "{webpos_secret}");

PaymentOrderCreation paymentOrder = new PaymentOrderCreation();
paymentOrder.setAmount("10.00");
paymentOrder.setReference("#1");
paymentOrder.setDetails("#1 details");
paymentOrder.setRequiredConfirmations(3);
PaymentOrderCreationResponse resp = client.createPaymentOrder(paymentOrder);

String btcAddress = resp.address // will output the payment order address
                        
```


Once the client is instantiated and configured, you can use the following
methods to send requests:


| Method |
|--------|
| `clientCredentialsLogin`(clientcredentials:ClientCredentials) : [ClientCredentialsLoginResponse](#ClientCredentialsLoginResponse)| 
| `deletePaymentOrder`(paymentOrderUuid:uuid) : [PaymentOrderDeletionResponse](#PaymentOrderDeletionResponse)| 
| `getPaymentOrder`(paymentOrderUuid:uuid) : [PaymentOrderRetrieval](#PaymentOrderRetrieval)| 
| `getWebPosPayments`(posUuid:uuid,page:integer,sortOrder:string,status:string,sortBy:string,pageSize:integer) : [PaymentOrderList](#PaymentOrderList)| 
| `createPaymentOrder`(paymentordercreation:PaymentOrderCreation) : [PaymentOrderCreationResponse](#PaymentOrderCreationResponse)| 
| `getCallbacks`(paymentOrderUuid:uuid) : [CallbackList](#CallbackList)| 
| `paymentReset`(paymentOrderUuid:uuid) : [PaymentOrderRetrieval](#PaymentOrderRetrieval)| 
| `paymentUpdate`(paymentOrderUuid:uuid,paymentupdateobject:PaymentUpdateObject) : [None](#None)| 



## Objects

### ClientCredentials

Data required to perform a confidential client login

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| scope | _string_ | Yes | Oauth2 scope of the client's authorization |
| grant_type | _string_ | Yes | Oauth2 Authorization's grant type |


### ClientCredentialsLoginResponse

Response data for a login performed by a confidential client.

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| id_token | _string_ | Yes | Jwt Token containing identity's informations |
| scope | _string_ | No | Authorization's scope |
| expires_in | _integer_ | Yes | Token's expiration time |
| access_token | _string_ | Yes | User's access token |
| token_type | _string_ | Yes | Token's type |


### PaymentOrderDeletionResponse

Payment order deletion response

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| cancel_url | _string_ | Yes | The URL where the user is redirected upon payment order expiration/cancellation |


### PaymentOrderRetrieval

Payment order retrieval data

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| uuid | _string_ | Yes | UUID of the payment order |
| reference | _string_ | Yes | Business' reference for the payment order |
| callback_url | _string_ | Yes | The URL contacted to send callbacks related to payment status changes |
| details | _string_ | Yes | Payment order's details |
| redirect_url | _string_ | Yes | URL where to redirect the user to perform the payment |
| expiration_time | _string_ | Yes | Expiration date of the payment order |
| btc_amount | _integer_ | Yes |  Bitcoin amount of the payment order |
| amount | _string_ | Yes | Fiat's amount of the payment order |
| required_confirmations | _integer_ | Yes | Required confirmations for transactions paying the payment order |
| expires_in | _integer_ | Yes |  Expiration time of the payment order |
| chargeback_date | _string_ | Yes | Time at which either the payment order has been fully paid or is expired |
| currency | _[CurrencyRetrieval](#currencyretrieval)_ | Yes | Fiat currency of the payment order |
| state | _[PaymentOrderState](#paymentorderstate)_ | Yes | Current payment state of the payment order |
| created_by | _[PaymentOrderCreator](#paymentordercreator)_ | Yes | Data of the pos which created the payment order |
| transactions | _[[Transaction](#Transaction)]_ | Yes | Transactions paying the payment order |
| dispute_start_date | _string_ | Yes | Time at which either the payment order has been fully paid or is expired |
| rate | _[RateRetrieval](#rateretrieval)_ | Yes | Crypto/Fiat rate of the payment order |
| resolved_at | _string_ | Yes | Time at which either the payment order has been fully paid or is expired |
| address | _string_ | Yes | Bitcoin address of the payment order |
| uri | _string_ | Yes | Bitcoin uri |
| created_at | _string_ | Yes | Creation date of the payment order |


### CurrencyRetrieval

Currency Data

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| uuid | _string_ | Yes | UUID of the currency |
| name | _string_ | Yes | Name of the currency |
| type | _string_ | Yes | Currency's type (fiat/crypto) |


### PaymentOrderState

Data describing the current state of a payment order

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| paid | _[PaidStatus](#paidstatus)_ | Yes | Payment order's paid amount |
| unpaid | _[PaidStatus](#paidstatus)_ | Yes | Payment order's unpaid amount |
| in_confirmation | _[PaidStatus](#paidstatus)_ | Yes | Payment order's paid but unconfirmed amount |
| status | _string_ | Yes | Payment order's status |
| blockchain_status | _string_ | Yes | Payment order's internal status |


### PaidStatus

Cryto and fiat paid amounts

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| fiat | _string_ | Yes | Fiat Amount |
| crypto | _integer_ | Yes | Cryto Amount |


### PaymentOrderCreator

Data of payment order's creator

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| uuid | _string_ | Yes | Payment order creator's uuid |
| active | _bool_ | No | Wheter the creator active |
| name | _string_ | Yes | Payment order creator's name |
| deposit_account | _[DepositAccountLite](#depositaccountlite)_ | Yes | Deposit account associated to the payment order's creator |
| type | _string_ | Yes | Payment order creator's type |


### DepositAccountLite

Deposit account lite object when sent nested in other api objects

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| uuid | _string_ | Yes | Deposit account's uuid |
| name | _string_ | Yes | Deposit account's name |
| type | _string_ | Yes | Deposit account's type |


### Transaction

Bitcoin transaction paying a payment order

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| outs | _[[Out](#Out)]_ | Yes | Transaction's outputs |
| outs_sum | _integer_ | Yes | Paying amount of the transaction |
| txid | _string_ | Yes | Transaction's id |
| blockchain_status | _string_ | Yes | Transaction's internal status |
| created_at | _string_ | Yes |  |
| status | _string_ | Yes | Transaction's status |
| normalized_txid | _string_ | Yes | Transaction's normalized id |


### Out

Transaction's output

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| amount | _integer_ | Yes | Output's amount |
| n | _integer_ | Yes | Transaction output's index |


### RateRetrieval

Rate Data

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| value | _string_ | Yes | Value of the rate |
| from | _string_ | No | Starting currency for rate calculation |
| created_at | _string_ | Yes | Creation's date of the rate |
| to | _string_ | No | Target currency for rate calculation |
| source | _string_ | Yes | Exchange providing the rate |


### PaymentOrderList

List of Business' payment orders

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| total_pages | _integer_ | Yes | Total number of pages given the requested page size |
| total_items | _integer_ | Yes | Total number of items |
| paymentorders | _[[PaymentOrderRetrieval](#PaymentOrderRetrieval)]_ | Yes | Business' payment orders |


### PaymentOrderCreation

Data required to create a new payment order

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| continue_url | _string_ | No | The URL where the user is redirected upon successful payment |
| reference | _string_ | No | Business' reference of the payment order |
| details | _string_ | Yes | Payment order's details |
| amount | _string_ | Yes | Payment order's fiat amount |
| cancel_url | _string_ | No | The URL where the user is redirected upon successful payment order expiration/cancellation |
| callback_url | _string_ | No | The URL contacted to send callbacks related to payment status changes |
| required_confirmations | _integer_ | No | Required confirmations for transactions paying the payment order |


### PaymentOrderCreationResponse

Response data for a payment order creation request

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| uuid | _string_ | Yes | UUID of the payment order |
| redirect_url | _string_ | Yes | URL where to redirect the user to perform the payment |
| rate | _[RateRetrieval](#rateretrieval)_ | Yes | Crypto/Fiat rate of the payment order |
| expiration_time | _string_ | Yes | Expiration's date of the payment order |
| address | _string_ | Yes | Bitcoin address of the payment order |
| amount | _integer_ | Yes | Crypto amount of the payment order |
| uri | _string_ | Yes | Bitcoin uri according to BIP 21 (https://github.com/bitcoin/bips/blob/master/bip-0021.mediawiki) |
| expires_in | _integer_ | Yes | Expiration's time of the payment order |


### CallbackList

Callback list object

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| callbacks | _[[Callback](#Callback)]_ | Yes | Valid payment transitions callbacks |


### Callback

Callback Retrieval object

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| name | _string_ | Yes | Namespace of a callback sent after the related payment status' transition |


### PaymentUpdateObject

Callback's trigger request body

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| callback | _string_ | Yes | Name of the callback to be sent |


### CallbackPaymentOrder

Payment order retrieval data

#### Attributes

| Attribute | Type | Required | Description |
|-----------|------|----------|-------------|
| uuid | _string_ | Yes | UUID of the payment order |
| continue_url | _string_ | Yes | The URL where the user is redirected upon successful payment |
| reference | _string_ | Yes | Business' reference for the payment order |
| redirect_url | _string_ | Yes | URL where to redirect the user to perform the payment |
| details | _string_ | Yes | Payment order's details |
| callback_url | _string_ | Yes | The URL contacted to send callbacks related to payment status changes |
| expiration_time | _string_ | Yes | Expiration date of the payment order |
| btc_amount | _integer_ | Yes |  Bitcoin amount of the payment order |
| amount | _string_ | Yes | Fiat's amount of the payment order |
| required_confirmations | _integer_ | Yes | Required confirmations for transactions paying the payment order |
| expires_in | _integer_ | Yes |  Expiration time of the payment order |
| chargeback_date | _string_ | Yes | Time at which either the payment order has been fully paid or is expired |
| currency | _[CurrencyRetrieval](#currencyretrieval)_ | Yes | Fiat currency of the payment order |
| state | _[PaymentOrderState](#paymentorderstate)_ | Yes | Current payment state of the payment order |
| created_by | _[PaymentOrderCreator](#paymentordercreator)_ | Yes | Data of the pos which created the payment order |
| cancel_url | _string_ | Yes | The URL where the user is redirected upon payment order expiration/cancellation |
| transactions | _[[Transaction](#Transaction)]_ | Yes | Transactions paying the payment order |
| dispute_start_date | _string_ | Yes | Time at which either the payment order has been fully paid or is expired |
| rate | _[RateRetrieval](#rateretrieval)_ | Yes | Crypto/Fiat rate of the payment order |
| resolved_at | _string_ | Yes | Time at which either the payment order has been fully paid or is expired |
| address | _string_ | Yes | Bitcoin address of the payment order |
| uri | _string_ | Yes | Bitcoin uri |
| created_at | _string_ | Yes | Creation date of the payment order |




## Exceptions

Every exception raised due to Chainside error responses contains debug informations.

```java

try{
    client.createPaymentOrder(paymentOrder)
}catch (ChainsideHttpExceptio e){
    System.out.println(e.getDebugInfo())
    System.out.println(e.getRequestId())
}

```  
Debug Info contains general information about request and response headers, body and status code.
Request Id is an internal id which can be communicated to chainside in order to help debugging the
problem in case this cannot be identified.

## Callbacks

Chainside will send callbacks if some event is triggered regarding one of your assets registered on the Business Panel.
Our server will send a request to your webhooks that you need to parse and verify. You can do this using this SDK library
in the following way:

```java
HashMap<String, Object> config = new HashMap<>();
config.put("mode", "live");
config.put("clientId", "{webpos_client_id}");
config.put("secret", "{webpos_secret}");

ChainsideApiContext ctx = new ChainsideApiContext(config);
ChainsideCallbackHandler handler = new ChainsideCallbackHandler(ctx);

/* Retrieve http request and raw body in as an array of bytes
HashMap<String, String> headers = request.getHeaders(); 
byte[] rawBody = request.getRawBody(); 
*/

SdkObject parsedObject = handler.parse(headers, rawBody);
```

### Callback structure

| Parameter | Type | Required | Description |
|-----------|------|----------|-------------|
| event | _string_ | Yes | Event which triggered the callback |
| object | [CallbackPaymentOrder](#callbackpaymentorder) | Yes |  |
| created_at | _string_ | Yes | Date in which the callback was sent |
| object_type | _string_ | Yes | Type of the object sent in the callback |


### Triggered events

| Event | Object Class |
|------------|--------------|
| `payment.completed` | [CallbackPaymentOrder](#callbackpaymentorder) |
| `payment.dispute.start` | [CallbackPaymentOrder](#callbackpaymentorder) |
| `payment.overpaid` | [CallbackPaymentOrder](#callbackpaymentorder) |
| `payment.cancelled` | [CallbackPaymentOrder](#callbackpaymentorder) |
| `payment.dispute.end` | [CallbackPaymentOrder](#callbackpaymentorder) |
| `payment.expired` | [CallbackPaymentOrder](#callbackpaymentorder) |
| `payment.chargeback` | [CallbackPaymentOrder](#callbackpaymentorder) |


# Contributing

In order to maintain consistency between our backend and our SDKs, contributing through pull requests is highly
discouraged. Consider posting an issue if you need to signal any problem with this library.

# Security Issues

In case of a discovery of an actual or potential security issue please contact us at [info@chainside.net](mailto:info@chaniside.net)


# ProvidersApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**providersGet**](ProvidersApi.md#providersGet) | **GET** /providers | Get all providers
[**providersPost**](ProvidersApi.md#providersPost) | **POST** /providers | Create a provider
[**providersProviderIdDelete**](ProvidersApi.md#providersProviderIdDelete) | **DELETE** /providers/{providerId} | Delete a provider
[**providersProviderIdGet**](ProvidersApi.md#providersProviderIdGet) | **GET** /providers/{providerId} | Get a provider
[**providersProviderIdPut**](ProvidersApi.md#providersProviderIdPut) | **PUT** /providers/{providerId} | Update a provider

<a name="providersGet"></a>
# **providersGet**
> ProviderCollection providersGet(page, length, sort, q, fields, with)

Get all providers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


ProvidersApi apiInstance = new ProvidersApi();
Integer page = 56; // Integer | 
Integer length = 56; // Integer | 
String sort = "sort_example"; // String | 
String q = "q_example"; // String | 
String fields = "fields_example"; // String | 
String with = "with_example"; // String | 
try {
    ProviderCollection result = apiInstance.providersGet(page, length, sort, q, fields, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvidersApi#providersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional]
 **length** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]
 **q** | **String**|  | [optional]
 **fields** | **String**|  | [optional]
 **with** | **String**|  | [optional]

### Return type

[**ProviderCollection**](ProviderCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="providersPost"></a>
# **providersPost**
> ProviderRecord providersPost(body)

Create a provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


ProvidersApi apiInstance = new ProvidersApi();
ProviderPayload body = new ProviderPayload(); // ProviderPayload | 
try {
    ProviderRecord result = apiInstance.providersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvidersApi#providersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProviderPayload**](ProviderPayload.md)|  |

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="providersProviderIdDelete"></a>
# **providersProviderIdDelete**
> providersProviderIdDelete(providerId)

Delete a provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


ProvidersApi apiInstance = new ProvidersApi();
Integer providerId = 56; // Integer | 
try {
    apiInstance.providersProviderIdDelete(providerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvidersApi#providersProviderIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="providersProviderIdGet"></a>
# **providersProviderIdGet**
> ProviderRecord providersProviderIdGet(providerId)

Get a provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


ProvidersApi apiInstance = new ProvidersApi();
Integer providerId = 56; // Integer | 
try {
    ProviderRecord result = apiInstance.providersProviderIdGet(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvidersApi#providersProviderIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Integer**|  |

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="providersProviderIdPut"></a>
# **providersProviderIdPut**
> ProviderRecord providersProviderIdPut(body, providerId)

Update a provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


ProvidersApi apiInstance = new ProvidersApi();
ProviderPayload body = new ProviderPayload(); // ProviderPayload | 
Integer providerId = 56; // Integer | 
try {
    ProviderRecord result = apiInstance.providersProviderIdPut(body, providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvidersApi#providersProviderIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProviderPayload**](ProviderPayload.md)|  |
 **providerId** | **Integer**|  |

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


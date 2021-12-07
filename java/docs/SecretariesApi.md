# SecretariesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secretariesGet**](SecretariesApi.md#secretariesGet) | **GET** /secretaries | Get all secretaries
[**secretariesPost**](SecretariesApi.md#secretariesPost) | **POST** /secretaries | Create a secretary
[**secretariesSecretaryIdDelete**](SecretariesApi.md#secretariesSecretaryIdDelete) | **DELETE** /secretaries/{secretaryId} | Delete a secretary
[**secretariesSecretaryIdGet**](SecretariesApi.md#secretariesSecretaryIdGet) | **GET** /secretaries/{secretaryId} | Get a secretary
[**secretariesSecretaryIdPut**](SecretariesApi.md#secretariesSecretaryIdPut) | **PUT** /secretaries/{secretaryId} | Update a secretary

<a name="secretariesGet"></a>
# **secretariesGet**
> SecretaryCollection secretariesGet(page, length, sort, q, fields, with)

Get all secretaries

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


SecretariesApi apiInstance = new SecretariesApi();
Integer page = 56; // Integer | 
Integer length = 56; // Integer | 
String sort = "sort_example"; // String | 
String q = "q_example"; // String | 
String fields = "fields_example"; // String | 
String with = "with_example"; // String | 
try {
    SecretaryCollection result = apiInstance.secretariesGet(page, length, sort, q, fields, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretariesApi#secretariesGet");
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

[**SecretaryCollection**](SecretaryCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secretariesPost"></a>
# **secretariesPost**
> SecretaryRecord secretariesPost(body)

Create a secretary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


SecretariesApi apiInstance = new SecretariesApi();
SecretaryPayload body = new SecretaryPayload(); // SecretaryPayload | 
try {
    SecretaryRecord result = apiInstance.secretariesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretariesApi#secretariesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecretaryPayload**](SecretaryPayload.md)|  |

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secretariesSecretaryIdDelete"></a>
# **secretariesSecretaryIdDelete**
> secretariesSecretaryIdDelete(secretaryId)

Delete a secretary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


SecretariesApi apiInstance = new SecretariesApi();
Integer secretaryId = 56; // Integer | 
try {
    apiInstance.secretariesSecretaryIdDelete(secretaryId);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretariesApi#secretariesSecretaryIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretaryId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="secretariesSecretaryIdGet"></a>
# **secretariesSecretaryIdGet**
> SecretaryRecord secretariesSecretaryIdGet(secretaryId)

Get a secretary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


SecretariesApi apiInstance = new SecretariesApi();
Integer secretaryId = 56; // Integer | 
try {
    SecretaryRecord result = apiInstance.secretariesSecretaryIdGet(secretaryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretariesApi#secretariesSecretaryIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretaryId** | **Integer**|  |

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secretariesSecretaryIdPut"></a>
# **secretariesSecretaryIdPut**
> SecretaryRecord secretariesSecretaryIdPut(body, secretaryId)

Update a secretary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


SecretariesApi apiInstance = new SecretariesApi();
SecretaryPayload body = new SecretaryPayload(); // SecretaryPayload | 
Integer secretaryId = 56; // Integer | 
try {
    SecretaryRecord result = apiInstance.secretariesSecretaryIdPut(body, secretaryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretariesApi#secretariesSecretaryIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecretaryPayload**](SecretaryPayload.md)|  |
 **secretaryId** | **Integer**|  |

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


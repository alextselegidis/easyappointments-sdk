# ServicesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**servicesGet**](ServicesApi.md#servicesGet) | **GET** /services | Get all services
[**servicesPost**](ServicesApi.md#servicesPost) | **POST** /services | Create a service
[**servicesServiceIdDelete**](ServicesApi.md#servicesServiceIdDelete) | **DELETE** /services/{serviceId} | Delete a service
[**servicesServiceIdGet**](ServicesApi.md#servicesServiceIdGet) | **GET** /services/{serviceId} | Get a service
[**servicesServiceIdPut**](ServicesApi.md#servicesServiceIdPut) | **PUT** /services/{serviceId} | Update a service

<a name="servicesGet"></a>
# **servicesGet**
> ServiceCollection servicesGet(page, length, sort, q, fields, with)

Get all services

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


ServicesApi apiInstance = new ServicesApi();
Integer page = 56; // Integer | 
Integer length = 56; // Integer | 
String sort = "sort_example"; // String | 
String q = "q_example"; // String | 
String fields = "fields_example"; // String | 
String with = "with_example"; // String | 
try {
    ServiceCollection result = apiInstance.servicesGet(page, length, sort, q, fields, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#servicesGet");
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

[**ServiceCollection**](ServiceCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="servicesPost"></a>
# **servicesPost**
> ServiceRecord servicesPost(body)

Create a service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


ServicesApi apiInstance = new ServicesApi();
ServicePayload body = new ServicePayload(); // ServicePayload | 
try {
    ServiceRecord result = apiInstance.servicesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#servicesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicePayload**](ServicePayload.md)|  |

### Return type

[**ServiceRecord**](ServiceRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="servicesServiceIdDelete"></a>
# **servicesServiceIdDelete**
> servicesServiceIdDelete(serviceId)

Delete a service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


ServicesApi apiInstance = new ServicesApi();
Integer serviceId = 56; // Integer | 
try {
    apiInstance.servicesServiceIdDelete(serviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#servicesServiceIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="servicesServiceIdGet"></a>
# **servicesServiceIdGet**
> ServiceRecord servicesServiceIdGet(serviceId)

Get a service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


ServicesApi apiInstance = new ServicesApi();
Integer serviceId = 56; // Integer | 
try {
    ServiceRecord result = apiInstance.servicesServiceIdGet(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#servicesServiceIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **Integer**|  |

### Return type

[**ServiceRecord**](ServiceRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="servicesServiceIdPut"></a>
# **servicesServiceIdPut**
> ServiceRecord servicesServiceIdPut(body, serviceId)

Update a service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


ServicesApi apiInstance = new ServicesApi();
ServicePayload body = new ServicePayload(); // ServicePayload | 
Integer serviceId = 56; // Integer | 
try {
    ServiceRecord result = apiInstance.servicesServiceIdPut(body, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#servicesServiceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicePayload**](ServicePayload.md)|  |
 **serviceId** | **Integer**|  |

### Return type

[**ServiceRecord**](ServiceRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


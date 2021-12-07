# UnavailabilitiesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**unavailabilitiesGet**](UnavailabilitiesApi.md#unavailabilitiesGet) | **GET** /unavailabilities | Get all unavailabilities
[**unavailabilitiesPost**](UnavailabilitiesApi.md#unavailabilitiesPost) | **POST** /unavailabilities | Create an unavailability
[**unavailabilitiesUnavailabilityIdDelete**](UnavailabilitiesApi.md#unavailabilitiesUnavailabilityIdDelete) | **DELETE** /unavailabilities/{unavailabilityId} | Delete an unavailability
[**unavailabilitiesUnavailabilityIdGet**](UnavailabilitiesApi.md#unavailabilitiesUnavailabilityIdGet) | **GET** /unavailabilities/{unavailabilityId} | Get an unavailability
[**unavailabilitiesUnavailabilityIdPut**](UnavailabilitiesApi.md#unavailabilitiesUnavailabilityIdPut) | **PUT** /unavailabilities/{unavailabilityId} | Update an unavailability

<a name="unavailabilitiesGet"></a>
# **unavailabilitiesGet**
> UnavailabilityCollection unavailabilitiesGet(page, length, sort, q, fields, with)

Get all unavailabilities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UnavailabilitiesApi;


UnavailabilitiesApi apiInstance = new UnavailabilitiesApi();
Integer page = 56; // Integer | 
Integer length = 56; // Integer | 
String sort = "sort_example"; // String | 
String q = "q_example"; // String | 
String fields = "fields_example"; // String | 
String with = "with_example"; // String | 
try {
    UnavailabilityCollection result = apiInstance.unavailabilitiesGet(page, length, sort, q, fields, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnavailabilitiesApi#unavailabilitiesGet");
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

[**UnavailabilityCollection**](UnavailabilityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unavailabilitiesPost"></a>
# **unavailabilitiesPost**
> UnavailabilityRecord unavailabilitiesPost(body)

Create an unavailability

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UnavailabilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


UnavailabilitiesApi apiInstance = new UnavailabilitiesApi();
UnavailabilityPayload body = new UnavailabilityPayload(); // UnavailabilityPayload | 
try {
    UnavailabilityRecord result = apiInstance.unavailabilitiesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnavailabilitiesApi#unavailabilitiesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UnavailabilityPayload**](UnavailabilityPayload.md)|  |

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unavailabilitiesUnavailabilityIdDelete"></a>
# **unavailabilitiesUnavailabilityIdDelete**
> unavailabilitiesUnavailabilityIdDelete(unavailabilityId)

Delete an unavailability

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UnavailabilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


UnavailabilitiesApi apiInstance = new UnavailabilitiesApi();
Integer unavailabilityId = 56; // Integer | 
try {
    apiInstance.unavailabilitiesUnavailabilityIdDelete(unavailabilityId);
} catch (ApiException e) {
    System.err.println("Exception when calling UnavailabilitiesApi#unavailabilitiesUnavailabilityIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unavailabilityId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unavailabilitiesUnavailabilityIdGet"></a>
# **unavailabilitiesUnavailabilityIdGet**
> UnavailabilityRecord unavailabilitiesUnavailabilityIdGet(unavailabilityId)

Get an unavailability

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UnavailabilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


UnavailabilitiesApi apiInstance = new UnavailabilitiesApi();
Integer unavailabilityId = 56; // Integer | 
try {
    UnavailabilityRecord result = apiInstance.unavailabilitiesUnavailabilityIdGet(unavailabilityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnavailabilitiesApi#unavailabilitiesUnavailabilityIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unavailabilityId** | **Integer**|  |

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unavailabilitiesUnavailabilityIdPut"></a>
# **unavailabilitiesUnavailabilityIdPut**
> UnavailabilityRecord unavailabilitiesUnavailabilityIdPut(body, unavailabilityId)

Update an unavailability

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UnavailabilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


UnavailabilitiesApi apiInstance = new UnavailabilitiesApi();
UnavailabilityPayload body = new UnavailabilityPayload(); // UnavailabilityPayload | 
Integer unavailabilityId = 56; // Integer | 
try {
    UnavailabilityRecord result = apiInstance.unavailabilitiesUnavailabilityIdPut(body, unavailabilityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnavailabilitiesApi#unavailabilitiesUnavailabilityIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UnavailabilityPayload**](UnavailabilityPayload.md)|  |
 **unavailabilityId** | **Integer**|  |

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


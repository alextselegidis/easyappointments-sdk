# AvailabilitiesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**availabilitiesGet**](AvailabilitiesApi.md#availabilitiesGet) | **GET** /availabilities | Gets availability

<a name="availabilitiesGet"></a>
# **availabilitiesGet**
> Availabilities availabilitiesGet(providerId, serviceId, date)

Gets availability

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvailabilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


AvailabilitiesApi apiInstance = new AvailabilitiesApi();
Integer providerId = 56; // Integer | 
Integer serviceId = 56; // Integer | 
String date = "date_example"; // String | 
try {
    Availabilities result = apiInstance.availabilitiesGet(providerId, serviceId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvailabilitiesApi#availabilitiesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Integer**|  | [optional]
 **serviceId** | **Integer**|  | [optional]
 **date** | **String**|  | [optional]

### Return type

[**Availabilities**](Availabilities.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


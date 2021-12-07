# AppointmentsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appointmentsAppointmentIdDelete**](AppointmentsApi.md#appointmentsAppointmentIdDelete) | **DELETE** /appointments/{appointmentId} | Delete an appointment
[**appointmentsAppointmentIdGet**](AppointmentsApi.md#appointmentsAppointmentIdGet) | **GET** /appointments/{appointmentId} | Get an appointment
[**appointmentsAppointmentIdPut**](AppointmentsApi.md#appointmentsAppointmentIdPut) | **PUT** /appointments/{appointmentId} | Update an appointment
[**appointmentsGet**](AppointmentsApi.md#appointmentsGet) | **GET** /appointments | Get all appointments
[**appointmentsPost**](AppointmentsApi.md#appointmentsPost) | **POST** /appointments | Create an appointment

<a name="appointmentsAppointmentIdDelete"></a>
# **appointmentsAppointmentIdDelete**
> appointmentsAppointmentIdDelete(appointmentId)

Delete an appointment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppointmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


AppointmentsApi apiInstance = new AppointmentsApi();
Integer appointmentId = 56; // Integer | 
try {
    apiInstance.appointmentsAppointmentIdDelete(appointmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentsApi#appointmentsAppointmentIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointmentId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appointmentsAppointmentIdGet"></a>
# **appointmentsAppointmentIdGet**
> AppointmentRecord appointmentsAppointmentIdGet(appointmentId)

Get an appointment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppointmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


AppointmentsApi apiInstance = new AppointmentsApi();
Integer appointmentId = 56; // Integer | 
try {
    AppointmentRecord result = apiInstance.appointmentsAppointmentIdGet(appointmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentsApi#appointmentsAppointmentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointmentId** | **Integer**|  |

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appointmentsAppointmentIdPut"></a>
# **appointmentsAppointmentIdPut**
> AppointmentRecord appointmentsAppointmentIdPut(body, appointmentId)

Update an appointment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppointmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


AppointmentsApi apiInstance = new AppointmentsApi();
AppointmentPayload body = new AppointmentPayload(); // AppointmentPayload | 
Integer appointmentId = 56; // Integer | 
try {
    AppointmentRecord result = apiInstance.appointmentsAppointmentIdPut(body, appointmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentsApi#appointmentsAppointmentIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentPayload**](AppointmentPayload.md)|  |
 **appointmentId** | **Integer**|  |

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appointmentsGet"></a>
# **appointmentsGet**
> AppointmentCollection appointmentsGet(page, length, sort, q, fields, with, aggregates)

Get all appointments

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppointmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


AppointmentsApi apiInstance = new AppointmentsApi();
Integer page = 56; // Integer | 
Integer length = 56; // Integer | 
String sort = "sort_example"; // String | 
String q = "q_example"; // String | 
String fields = "fields_example"; // String | 
String with = "with_example"; // String | 
String aggregates = "aggregates_example"; // String | 
try {
    AppointmentCollection result = apiInstance.appointmentsGet(page, length, sort, q, fields, with, aggregates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentsApi#appointmentsGet");
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
 **aggregates** | **String**|  | [optional]

### Return type

[**AppointmentCollection**](AppointmentCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appointmentsPost"></a>
# **appointmentsPost**
> AppointmentRecord appointmentsPost(body)

Create an appointment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppointmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


AppointmentsApi apiInstance = new AppointmentsApi();
AppointmentPayload body = new AppointmentPayload(); // AppointmentPayload | 
try {
    AppointmentRecord result = apiInstance.appointmentsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentsApi#appointmentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentPayload**](AppointmentPayload.md)|  |

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


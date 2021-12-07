# EasyappointmentsApi.AppointmentsApi

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
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.AppointmentsApi();
let appointmentId = 56; // Number | 

apiInstance.appointmentsAppointmentIdDelete(appointmentId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointmentId** | **Number**|  | 

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appointmentsAppointmentIdGet"></a>
# **appointmentsAppointmentIdGet**
> AppointmentRecord appointmentsAppointmentIdGet(appointmentId)

Get an appointment

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.AppointmentsApi();
let appointmentId = 56; // Number | 

apiInstance.appointmentsAppointmentIdGet(appointmentId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointmentId** | **Number**|  | 

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appointmentsAppointmentIdPut"></a>
# **appointmentsAppointmentIdPut**
> AppointmentRecord appointmentsAppointmentIdPut(body, appointmentId)

Update an appointment

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.AppointmentsApi();
let body = new EasyappointmentsApi.AppointmentPayload(); // AppointmentPayload | 
let appointmentId = 56; // Number | 

apiInstance.appointmentsAppointmentIdPut(body, appointmentId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentPayload**](AppointmentPayload.md)|  | 
 **appointmentId** | **Number**|  | 

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appointmentsGet"></a>
# **appointmentsGet**
> AppointmentCollection appointmentsGet(opts)

Get all appointments

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.AppointmentsApi();
let opts = { 
  'page': 56, // Number | 
  'length': 56, // Number | 
  'sort': "sort_example", // String | 
  'q': "q_example", // String | 
  'fields': "fields_example", // String | 
  '_with': "_with_example", // String | 
  'aggregates': "aggregates_example" // String | 
};
apiInstance.appointmentsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**|  | [optional] 
 **length** | **Number**|  | [optional] 
 **sort** | **String**|  | [optional] 
 **q** | **String**|  | [optional] 
 **fields** | **String**|  | [optional] 
 **_with** | **String**|  | [optional] 
 **aggregates** | **String**|  | [optional] 

### Return type

[**AppointmentCollection**](AppointmentCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appointmentsPost"></a>
# **appointmentsPost**
> AppointmentRecord appointmentsPost(body)

Create an appointment

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.AppointmentsApi();
let body = new EasyappointmentsApi.AppointmentPayload(); // AppointmentPayload | 

apiInstance.appointmentsPost(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentPayload**](AppointmentPayload.md)|  | 

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


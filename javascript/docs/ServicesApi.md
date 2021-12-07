# EasyappointmentsApi.ServicesApi

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
> ServiceCollection servicesGet(opts)

Get all services

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.ServicesApi();
let opts = { 
  'page': 56, // Number | 
  'length': 56, // Number | 
  'sort': "sort_example", // String | 
  'q': "q_example", // String | 
  'fields': "fields_example", // String | 
  '_with': "_with_example" // String | 
};
apiInstance.servicesGet(opts, (error, data, response) => {
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

### Return type

[**ServiceCollection**](ServiceCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="servicesPost"></a>
# **servicesPost**
> ServiceRecord servicesPost(body)

Create a service

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.ServicesApi();
let body = new EasyappointmentsApi.ServicePayload(); // ServicePayload | 

apiInstance.servicesPost(body, (error, data, response) => {
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
 **body** | [**ServicePayload**](ServicePayload.md)|  | 

### Return type

[**ServiceRecord**](ServiceRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="servicesServiceIdDelete"></a>
# **servicesServiceIdDelete**
> servicesServiceIdDelete(serviceId)

Delete a service

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.ServicesApi();
let serviceId = 56; // Number | 

apiInstance.servicesServiceIdDelete(serviceId, (error, data, response) => {
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
 **serviceId** | **Number**|  | 

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="servicesServiceIdGet"></a>
# **servicesServiceIdGet**
> ServiceRecord servicesServiceIdGet(serviceId)

Get a service

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.ServicesApi();
let serviceId = 56; // Number | 

apiInstance.servicesServiceIdGet(serviceId, (error, data, response) => {
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
 **serviceId** | **Number**|  | 

### Return type

[**ServiceRecord**](ServiceRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="servicesServiceIdPut"></a>
# **servicesServiceIdPut**
> ServiceRecord servicesServiceIdPut(body, serviceId)

Update a service

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.ServicesApi();
let body = new EasyappointmentsApi.ServicePayload(); // ServicePayload | 
let serviceId = 56; // Number | 

apiInstance.servicesServiceIdPut(body, serviceId, (error, data, response) => {
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
 **body** | [**ServicePayload**](ServicePayload.md)|  | 
 **serviceId** | **Number**|  | 

### Return type

[**ServiceRecord**](ServiceRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


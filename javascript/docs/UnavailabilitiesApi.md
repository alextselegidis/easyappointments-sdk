# EasyappointmentsApi.UnavailabilitiesApi

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
> UnavailabilityCollection unavailabilitiesGet(opts)

Get all unavailabilities

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';

let apiInstance = new EasyappointmentsApi.UnavailabilitiesApi();
let opts = { 
  'page': 56, // Number | 
  'length': 56, // Number | 
  'sort': "sort_example", // String | 
  'q': "q_example", // String | 
  'fields': "fields_example", // String | 
  '_with': "_with_example" // String | 
};
apiInstance.unavailabilitiesGet(opts, (error, data, response) => {
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
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.UnavailabilitiesApi();
let body = new EasyappointmentsApi.UnavailabilityPayload(); // UnavailabilityPayload | 

apiInstance.unavailabilitiesPost(body, (error, data, response) => {
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
 **body** | [**UnavailabilityPayload**](UnavailabilityPayload.md)|  | 

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unavailabilitiesUnavailabilityIdDelete"></a>
# **unavailabilitiesUnavailabilityIdDelete**
> unavailabilitiesUnavailabilityIdDelete(unavailabilityId)

Delete an unavailability

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.UnavailabilitiesApi();
let unavailabilityId = 56; // Number | 

apiInstance.unavailabilitiesUnavailabilityIdDelete(unavailabilityId, (error, data, response) => {
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
 **unavailabilityId** | **Number**|  | 

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unavailabilitiesUnavailabilityIdGet"></a>
# **unavailabilitiesUnavailabilityIdGet**
> UnavailabilityRecord unavailabilitiesUnavailabilityIdGet(unavailabilityId)

Get an unavailability

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.UnavailabilitiesApi();
let unavailabilityId = 56; // Number | 

apiInstance.unavailabilitiesUnavailabilityIdGet(unavailabilityId, (error, data, response) => {
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
 **unavailabilityId** | **Number**|  | 

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unavailabilitiesUnavailabilityIdPut"></a>
# **unavailabilitiesUnavailabilityIdPut**
> UnavailabilityRecord unavailabilitiesUnavailabilityIdPut(body, unavailabilityId)

Update an unavailability

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.UnavailabilitiesApi();
let body = new EasyappointmentsApi.UnavailabilityPayload(); // UnavailabilityPayload | 
let unavailabilityId = 56; // Number | 

apiInstance.unavailabilitiesUnavailabilityIdPut(body, unavailabilityId, (error, data, response) => {
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
 **body** | [**UnavailabilityPayload**](UnavailabilityPayload.md)|  | 
 **unavailabilityId** | **Number**|  | 

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


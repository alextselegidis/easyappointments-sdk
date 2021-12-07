# EasyappointmentsApi.AvailabilitiesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**availabilitiesGet**](AvailabilitiesApi.md#availabilitiesGet) | **GET** /availabilities | Gets availability

<a name="availabilitiesGet"></a>
# **availabilitiesGet**
> Availabilities availabilitiesGet(opts)

Gets availability

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.AvailabilitiesApi();
let opts = { 
  'providerId': 56, // Number | 
  'serviceId': 56, // Number | 
  '_date': "_date_example" // String | 
};
apiInstance.availabilitiesGet(opts, (error, data, response) => {
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
 **providerId** | **Number**|  | [optional] 
 **serviceId** | **Number**|  | [optional] 
 **_date** | **String**|  | [optional] 

### Return type

[**Availabilities**](Availabilities.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


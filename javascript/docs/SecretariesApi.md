# EasyappointmentsApi.SecretariesApi

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
> SecretaryCollection secretariesGet(opts)

Get all secretaries

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.SecretariesApi();
let opts = { 
  'page': 56, // Number | 
  'length': 56, // Number | 
  'sort': "sort_example", // String | 
  'q': "q_example", // String | 
  'fields': "fields_example", // String | 
  '_with': "_with_example" // String | 
};
apiInstance.secretariesGet(opts, (error, data, response) => {
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

[**SecretaryCollection**](SecretaryCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secretariesPost"></a>
# **secretariesPost**
> SecretaryRecord secretariesPost(body)

Create a secretary

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.SecretariesApi();
let body = new EasyappointmentsApi.SecretaryPayload(); // SecretaryPayload | 

apiInstance.secretariesPost(body, (error, data, response) => {
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
 **body** | [**SecretaryPayload**](SecretaryPayload.md)|  | 

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secretariesSecretaryIdDelete"></a>
# **secretariesSecretaryIdDelete**
> secretariesSecretaryIdDelete(secretaryId)

Delete a secretary

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.SecretariesApi();
let secretaryId = 56; // Number | 

apiInstance.secretariesSecretaryIdDelete(secretaryId, (error, data, response) => {
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
 **secretaryId** | **Number**|  | 

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="secretariesSecretaryIdGet"></a>
# **secretariesSecretaryIdGet**
> SecretaryRecord secretariesSecretaryIdGet(secretaryId)

Get a secretary

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.SecretariesApi();
let secretaryId = 56; // Number | 

apiInstance.secretariesSecretaryIdGet(secretaryId, (error, data, response) => {
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
 **secretaryId** | **Number**|  | 

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secretariesSecretaryIdPut"></a>
# **secretariesSecretaryIdPut**
> SecretaryRecord secretariesSecretaryIdPut(body, secretaryId)

Update a secretary

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.SecretariesApi();
let body = new EasyappointmentsApi.SecretaryPayload(); // SecretaryPayload | 
let secretaryId = 56; // Number | 

apiInstance.secretariesSecretaryIdPut(body, secretaryId, (error, data, response) => {
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
 **body** | [**SecretaryPayload**](SecretaryPayload.md)|  | 
 **secretaryId** | **Number**|  | 

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# EasyappointmentsApi.ProvidersApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**providersGet**](ProvidersApi.md#providersGet) | **GET** /providers | Get all providers
[**providersPost**](ProvidersApi.md#providersPost) | **POST** /providers | Create a provider
[**providersProviderIdDelete**](ProvidersApi.md#providersProviderIdDelete) | **DELETE** /providers/{providerId} | Delete a provider
[**providersProviderIdGet**](ProvidersApi.md#providersProviderIdGet) | **GET** /providers/{providerId} | Get a provider
[**providersProviderIdPut**](ProvidersApi.md#providersProviderIdPut) | **PUT** /providers/{providerId} | Update a provider

<a name="providersGet"></a>
# **providersGet**
> ProviderCollection providersGet(opts)

Get all providers

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.ProvidersApi();
let opts = { 
  'page': 56, // Number | 
  'length': 56, // Number | 
  'sort': "sort_example", // String | 
  'q': "q_example", // String | 
  'fields': "fields_example", // String | 
  '_with': "_with_example" // String | 
};
apiInstance.providersGet(opts, (error, data, response) => {
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

[**ProviderCollection**](ProviderCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="providersPost"></a>
# **providersPost**
> ProviderRecord providersPost(body)

Create a provider

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.ProvidersApi();
let body = new EasyappointmentsApi.ProviderPayload(); // ProviderPayload | 

apiInstance.providersPost(body, (error, data, response) => {
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
 **body** | [**ProviderPayload**](ProviderPayload.md)|  | 

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="providersProviderIdDelete"></a>
# **providersProviderIdDelete**
> providersProviderIdDelete(providerId)

Delete a provider

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.ProvidersApi();
let providerId = 56; // Number | 

apiInstance.providersProviderIdDelete(providerId, (error, data, response) => {
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
 **providerId** | **Number**|  | 

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="providersProviderIdGet"></a>
# **providersProviderIdGet**
> ProviderRecord providersProviderIdGet(providerId)

Get a provider

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.ProvidersApi();
let providerId = 56; // Number | 

apiInstance.providersProviderIdGet(providerId, (error, data, response) => {
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
 **providerId** | **Number**|  | 

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="providersProviderIdPut"></a>
# **providersProviderIdPut**
> ProviderRecord providersProviderIdPut(body, providerId)

Update a provider

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.ProvidersApi();
let body = new EasyappointmentsApi.ProviderPayload(); // ProviderPayload | 
let providerId = 56; // Number | 

apiInstance.providersProviderIdPut(body, providerId, (error, data, response) => {
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
 **body** | [**ProviderPayload**](ProviderPayload.md)|  | 
 **providerId** | **Number**|  | 

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


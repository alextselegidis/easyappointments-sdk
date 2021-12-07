# EasyappointmentsApi.AdminsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminsAdminIdDelete**](AdminsApi.md#adminsAdminIdDelete) | **DELETE** /admins/{adminId} | Delete an admin
[**adminsAdminIdGet**](AdminsApi.md#adminsAdminIdGet) | **GET** /admins/{adminId} | Get an admin
[**adminsAdminIdPut**](AdminsApi.md#adminsAdminIdPut) | **PUT** /admins/{adminId} | Update an admin
[**adminsGet**](AdminsApi.md#adminsGet) | **GET** /admins | Get all admins
[**adminsPost**](AdminsApi.md#adminsPost) | **POST** /admins | Create an admin

<a name="adminsAdminIdDelete"></a>
# **adminsAdminIdDelete**
> adminsAdminIdDelete(adminId)

Delete an admin

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.AdminsApi();
let adminId = 56; // Number | 

apiInstance.adminsAdminIdDelete(adminId, (error, data, response) => {
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
 **adminId** | **Number**|  | 

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminsAdminIdGet"></a>
# **adminsAdminIdGet**
> AdminRecord adminsAdminIdGet(adminId)

Get an admin

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.AdminsApi();
let adminId = 56; // Number | 

apiInstance.adminsAdminIdGet(adminId, (error, data, response) => {
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
 **adminId** | **Number**|  | 

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminsAdminIdPut"></a>
# **adminsAdminIdPut**
> AdminRecord adminsAdminIdPut(body, adminId)

Update an admin

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.AdminsApi();
let body = new EasyappointmentsApi.AdminPayload(); // AdminPayload | 
let adminId = 56; // Number | 

apiInstance.adminsAdminIdPut(body, adminId, (error, data, response) => {
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
 **body** | [**AdminPayload**](AdminPayload.md)|  | 
 **adminId** | **Number**|  | 

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminsGet"></a>
# **adminsGet**
> AdminCollection adminsGet(opts)

Get all admins

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.AdminsApi();
let opts = { 
  'page': 56, // Number | 
  'length': 56, // Number | 
  'sort': "sort_example", // String | 
  'q': "q_example", // String | 
  'fields': "fields_example", // String | 
  '_with': "_with_example" // String | 
};
apiInstance.adminsGet(opts, (error, data, response) => {
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

[**AdminCollection**](AdminCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminsPost"></a>
# **adminsPost**
> AdminRecord adminsPost(body)

Create an admin

### Example
```javascript
import {EasyappointmentsApi} from 'easyappointments_api';
let defaultClient = EasyappointmentsApi.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';


let apiInstance = new EasyappointmentsApi.AdminsApi();
let body = new EasyappointmentsApi.AdminPayload(); // AdminPayload | 

apiInstance.adminsPost(body, (error, data, response) => {
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
 **body** | [**AdminPayload**](AdminPayload.md)|  | 

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


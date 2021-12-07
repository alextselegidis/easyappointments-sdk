# AdminsApi

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


AdminsApi apiInstance = new AdminsApi();
Integer adminId = 56; // Integer | 
try {
    apiInstance.adminsAdminIdDelete(adminId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminsApi#adminsAdminIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminsAdminIdGet"></a>
# **adminsAdminIdGet**
> AdminRecord adminsAdminIdGet(adminId)

Get an admin

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


AdminsApi apiInstance = new AdminsApi();
Integer adminId = 56; // Integer | 
try {
    AdminRecord result = apiInstance.adminsAdminIdGet(adminId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminsApi#adminsAdminIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminId** | **Integer**|  |

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminsAdminIdPut"></a>
# **adminsAdminIdPut**
> AdminRecord adminsAdminIdPut(body, adminId)

Update an admin

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


AdminsApi apiInstance = new AdminsApi();
AdminPayload body = new AdminPayload(); // AdminPayload | 
Integer adminId = 56; // Integer | 
try {
    AdminRecord result = apiInstance.adminsAdminIdPut(body, adminId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminsApi#adminsAdminIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminPayload**](AdminPayload.md)|  |
 **adminId** | **Integer**|  |

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminsGet"></a>
# **adminsGet**
> AdminCollection adminsGet(page, length, sort, q, fields, with)

Get all admins

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


AdminsApi apiInstance = new AdminsApi();
Integer page = 56; // Integer | 
Integer length = 56; // Integer | 
String sort = "sort_example"; // String | 
String q = "q_example"; // String | 
String fields = "fields_example"; // String | 
String with = "with_example"; // String | 
try {
    AdminCollection result = apiInstance.adminsGet(page, length, sort, q, fields, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminsApi#adminsGet");
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

[**AdminCollection**](AdminCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminsPost"></a>
# **adminsPost**
> AdminRecord adminsPost(body)

Create an admin

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


AdminsApi apiInstance = new AdminsApi();
AdminPayload body = new AdminPayload(); // AdminPayload | 
try {
    AdminRecord result = apiInstance.adminsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminsApi#adminsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminPayload**](AdminPayload.md)|  |

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


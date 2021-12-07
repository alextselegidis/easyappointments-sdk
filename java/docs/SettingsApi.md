# SettingsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**settingsGet**](SettingsApi.md#settingsGet) | **GET** /settings | Get all settings
[**settingsSettingNameGet**](SettingsApi.md#settingsSettingNameGet) | **GET** /settings/{settingName} | Get a setting
[**settingsSettingNamePut**](SettingsApi.md#settingsSettingNamePut) | **PUT** /settings/{settingName} | Update a setting

<a name="settingsGet"></a>
# **settingsGet**
> SettingCollection settingsGet(page, length, sort, q, fields, with)

Get all settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


SettingsApi apiInstance = new SettingsApi();
Integer page = 56; // Integer | 
Integer length = 56; // Integer | 
String sort = "sort_example"; // String | 
String q = "q_example"; // String | 
String fields = "fields_example"; // String | 
String with = "with_example"; // String | 
try {
    SettingCollection result = apiInstance.settingsGet(page, length, sort, q, fields, with);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#settingsGet");
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

[**SettingCollection**](SettingCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="settingsSettingNameGet"></a>
# **settingsSettingNameGet**
> SettingRecord settingsSettingNameGet(settingName)

Get a setting

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


SettingsApi apiInstance = new SettingsApi();
String settingName = "settingName_example"; // String | 
try {
    SettingRecord result = apiInstance.settingsSettingNameGet(settingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#settingsSettingNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingName** | **String**|  |

### Return type

[**SettingRecord**](SettingRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="settingsSettingNamePut"></a>
# **settingsSettingNamePut**
> SettingRecord settingsSettingNamePut(body, settingName)

Update a setting

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


SettingsApi apiInstance = new SettingsApi();
SettingPayload body = new SettingPayload(); // SettingPayload | 
String settingName = "settingName_example"; // String | 
try {
    SettingRecord result = apiInstance.settingsSettingNamePut(body, settingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#settingsSettingNamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SettingPayload**](SettingPayload.md)|  |
 **settingName** | **String**|  |

### Return type

[**SettingRecord**](SettingRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


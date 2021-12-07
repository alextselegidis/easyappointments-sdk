# IO.Swagger.Api.SettingsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SettingsGet**](SettingsApi.md#settingsget) | **GET** /settings | Get all settings
[**SettingsSettingNameGet**](SettingsApi.md#settingssettingnameget) | **GET** /settings/{settingName} | Get a setting
[**SettingsSettingNamePut**](SettingsApi.md#settingssettingnameput) | **PUT** /settings/{settingName} | Update a setting

<a name="settingsget"></a>
# **SettingsGet**
> SettingCollection SettingsGet (int? page = null, int? length = null, string sort = null, string q = null, string fields = null, string with = null)

Get all settings

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SettingsGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SettingsApi();
            var page = 56;  // int? |  (optional) 
            var length = 56;  // int? |  (optional) 
            var sort = sort_example;  // string |  (optional) 
            var q = q_example;  // string |  (optional) 
            var fields = fields_example;  // string |  (optional) 
            var with = with_example;  // string |  (optional) 

            try
            {
                // Get all settings
                SettingCollection result = apiInstance.SettingsGet(page, length, sort, q, fields, with);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SettingsApi.SettingsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**|  | [optional] 
 **length** | **int?**|  | [optional] 
 **sort** | **string**|  | [optional] 
 **q** | **string**|  | [optional] 
 **fields** | **string**|  | [optional] 
 **with** | **string**|  | [optional] 

### Return type

[**SettingCollection**](SettingCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="settingssettingnameget"></a>
# **SettingsSettingNameGet**
> SettingRecord SettingsSettingNameGet (string settingName)

Get a setting

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SettingsSettingNameGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SettingsApi();
            var settingName = settingName_example;  // string | 

            try
            {
                // Get a setting
                SettingRecord result = apiInstance.SettingsSettingNameGet(settingName);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SettingsApi.SettingsSettingNameGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingName** | **string**|  | 

### Return type

[**SettingRecord**](SettingRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="settingssettingnameput"></a>
# **SettingsSettingNamePut**
> SettingRecord SettingsSettingNamePut (SettingPayload body, string settingName)

Update a setting

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SettingsSettingNamePutExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SettingsApi();
            var body = new SettingPayload(); // SettingPayload | 
            var settingName = settingName_example;  // string | 

            try
            {
                // Update a setting
                SettingRecord result = apiInstance.SettingsSettingNamePut(body, settingName);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SettingsApi.SettingsSettingNamePut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SettingPayload**](SettingPayload.md)|  | 
 **settingName** | **string**|  | 

### Return type

[**SettingRecord**](SettingRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

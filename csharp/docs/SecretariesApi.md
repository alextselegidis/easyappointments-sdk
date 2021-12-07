# IO.Swagger.Api.SecretariesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SecretariesGet**](SecretariesApi.md#secretariesget) | **GET** /secretaries | Get all secretaries
[**SecretariesPost**](SecretariesApi.md#secretariespost) | **POST** /secretaries | Create a secretary
[**SecretariesSecretaryIdDelete**](SecretariesApi.md#secretariessecretaryiddelete) | **DELETE** /secretaries/{secretaryId} | Delete a secretary
[**SecretariesSecretaryIdGet**](SecretariesApi.md#secretariessecretaryidget) | **GET** /secretaries/{secretaryId} | Get a secretary
[**SecretariesSecretaryIdPut**](SecretariesApi.md#secretariessecretaryidput) | **PUT** /secretaries/{secretaryId} | Update a secretary

<a name="secretariesget"></a>
# **SecretariesGet**
> SecretaryCollection SecretariesGet (int? page = null, int? length = null, string sort = null, string q = null, string fields = null, string with = null)

Get all secretaries

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SecretariesGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SecretariesApi();
            var page = 56;  // int? |  (optional) 
            var length = 56;  // int? |  (optional) 
            var sort = sort_example;  // string |  (optional) 
            var q = q_example;  // string |  (optional) 
            var fields = fields_example;  // string |  (optional) 
            var with = with_example;  // string |  (optional) 

            try
            {
                // Get all secretaries
                SecretaryCollection result = apiInstance.SecretariesGet(page, length, sort, q, fields, with);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SecretariesApi.SecretariesGet: " + e.Message );
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

[**SecretaryCollection**](SecretaryCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="secretariespost"></a>
# **SecretariesPost**
> SecretaryRecord SecretariesPost (SecretaryPayload body)

Create a secretary

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SecretariesPostExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SecretariesApi();
            var body = new SecretaryPayload(); // SecretaryPayload | 

            try
            {
                // Create a secretary
                SecretaryRecord result = apiInstance.SecretariesPost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SecretariesApi.SecretariesPost: " + e.Message );
            }
        }
    }
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="secretariessecretaryiddelete"></a>
# **SecretariesSecretaryIdDelete**
> void SecretariesSecretaryIdDelete (int? secretaryId)

Delete a secretary

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SecretariesSecretaryIdDeleteExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SecretariesApi();
            var secretaryId = 56;  // int? | 

            try
            {
                // Delete a secretary
                apiInstance.SecretariesSecretaryIdDelete(secretaryId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SecretariesApi.SecretariesSecretaryIdDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretaryId** | **int?**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="secretariessecretaryidget"></a>
# **SecretariesSecretaryIdGet**
> SecretaryRecord SecretariesSecretaryIdGet (int? secretaryId)

Get a secretary

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SecretariesSecretaryIdGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SecretariesApi();
            var secretaryId = 56;  // int? | 

            try
            {
                // Get a secretary
                SecretaryRecord result = apiInstance.SecretariesSecretaryIdGet(secretaryId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SecretariesApi.SecretariesSecretaryIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretaryId** | **int?**|  | 

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="secretariessecretaryidput"></a>
# **SecretariesSecretaryIdPut**
> SecretaryRecord SecretariesSecretaryIdPut (SecretaryPayload body, int? secretaryId)

Update a secretary

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SecretariesSecretaryIdPutExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SecretariesApi();
            var body = new SecretaryPayload(); // SecretaryPayload | 
            var secretaryId = 56;  // int? | 

            try
            {
                // Update a secretary
                SecretaryRecord result = apiInstance.SecretariesSecretaryIdPut(body, secretaryId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SecretariesApi.SecretariesSecretaryIdPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecretaryPayload**](SecretaryPayload.md)|  | 
 **secretaryId** | **int?**|  | 

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

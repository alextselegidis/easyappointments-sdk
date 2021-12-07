# IO.Swagger.Api.ProvidersApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ProvidersGet**](ProvidersApi.md#providersget) | **GET** /providers | Get all providers
[**ProvidersPost**](ProvidersApi.md#providerspost) | **POST** /providers | Create a provider
[**ProvidersProviderIdDelete**](ProvidersApi.md#providersprovideriddelete) | **DELETE** /providers/{providerId} | Delete a provider
[**ProvidersProviderIdGet**](ProvidersApi.md#providersprovideridget) | **GET** /providers/{providerId} | Get a provider
[**ProvidersProviderIdPut**](ProvidersApi.md#providersprovideridput) | **PUT** /providers/{providerId} | Update a provider

<a name="providersget"></a>
# **ProvidersGet**
> ProviderCollection ProvidersGet (int? page = null, int? length = null, string sort = null, string q = null, string fields = null, string with = null)

Get all providers

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ProvidersGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ProvidersApi();
            var page = 56;  // int? |  (optional) 
            var length = 56;  // int? |  (optional) 
            var sort = sort_example;  // string |  (optional) 
            var q = q_example;  // string |  (optional) 
            var fields = fields_example;  // string |  (optional) 
            var with = with_example;  // string |  (optional) 

            try
            {
                // Get all providers
                ProviderCollection result = apiInstance.ProvidersGet(page, length, sort, q, fields, with);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProvidersApi.ProvidersGet: " + e.Message );
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

[**ProviderCollection**](ProviderCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="providerspost"></a>
# **ProvidersPost**
> ProviderRecord ProvidersPost (ProviderPayload body)

Create a provider

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ProvidersPostExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ProvidersApi();
            var body = new ProviderPayload(); // ProviderPayload | 

            try
            {
                // Create a provider
                ProviderRecord result = apiInstance.ProvidersPost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProvidersApi.ProvidersPost: " + e.Message );
            }
        }
    }
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="providersprovideriddelete"></a>
# **ProvidersProviderIdDelete**
> void ProvidersProviderIdDelete (int? providerId)

Delete a provider

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ProvidersProviderIdDeleteExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ProvidersApi();
            var providerId = 56;  // int? | 

            try
            {
                // Delete a provider
                apiInstance.ProvidersProviderIdDelete(providerId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProvidersApi.ProvidersProviderIdDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **int?**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="providersprovideridget"></a>
# **ProvidersProviderIdGet**
> ProviderRecord ProvidersProviderIdGet (int? providerId)

Get a provider

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ProvidersProviderIdGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ProvidersApi();
            var providerId = 56;  // int? | 

            try
            {
                // Get a provider
                ProviderRecord result = apiInstance.ProvidersProviderIdGet(providerId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProvidersApi.ProvidersProviderIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **int?**|  | 

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="providersprovideridput"></a>
# **ProvidersProviderIdPut**
> ProviderRecord ProvidersProviderIdPut (ProviderPayload body, int? providerId)

Update a provider

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ProvidersProviderIdPutExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ProvidersApi();
            var body = new ProviderPayload(); // ProviderPayload | 
            var providerId = 56;  // int? | 

            try
            {
                // Update a provider
                ProviderRecord result = apiInstance.ProvidersProviderIdPut(body, providerId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProvidersApi.ProvidersProviderIdPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProviderPayload**](ProviderPayload.md)|  | 
 **providerId** | **int?**|  | 

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

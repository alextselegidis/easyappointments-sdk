# IO.Swagger.Api.UnavailabilitiesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UnavailabilitiesGet**](UnavailabilitiesApi.md#unavailabilitiesget) | **GET** /unavailabilities | Get all unavailabilities
[**UnavailabilitiesPost**](UnavailabilitiesApi.md#unavailabilitiespost) | **POST** /unavailabilities | Create an unavailability
[**UnavailabilitiesUnavailabilityIdDelete**](UnavailabilitiesApi.md#unavailabilitiesunavailabilityiddelete) | **DELETE** /unavailabilities/{unavailabilityId} | Delete an unavailability
[**UnavailabilitiesUnavailabilityIdGet**](UnavailabilitiesApi.md#unavailabilitiesunavailabilityidget) | **GET** /unavailabilities/{unavailabilityId} | Get an unavailability
[**UnavailabilitiesUnavailabilityIdPut**](UnavailabilitiesApi.md#unavailabilitiesunavailabilityidput) | **PUT** /unavailabilities/{unavailabilityId} | Update an unavailability

<a name="unavailabilitiesget"></a>
# **UnavailabilitiesGet**
> UnavailabilityCollection UnavailabilitiesGet (int? page = null, int? length = null, string sort = null, string q = null, string fields = null, string with = null)

Get all unavailabilities

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UnavailabilitiesGetExample
    {
        public void main()
        {
            var apiInstance = new UnavailabilitiesApi();
            var page = 56;  // int? |  (optional) 
            var length = 56;  // int? |  (optional) 
            var sort = sort_example;  // string |  (optional) 
            var q = q_example;  // string |  (optional) 
            var fields = fields_example;  // string |  (optional) 
            var with = with_example;  // string |  (optional) 

            try
            {
                // Get all unavailabilities
                UnavailabilityCollection result = apiInstance.UnavailabilitiesGet(page, length, sort, q, fields, with);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UnavailabilitiesApi.UnavailabilitiesGet: " + e.Message );
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

[**UnavailabilityCollection**](UnavailabilityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="unavailabilitiespost"></a>
# **UnavailabilitiesPost**
> UnavailabilityRecord UnavailabilitiesPost (UnavailabilityPayload body)

Create an unavailability

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UnavailabilitiesPostExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new UnavailabilitiesApi();
            var body = new UnavailabilityPayload(); // UnavailabilityPayload | 

            try
            {
                // Create an unavailability
                UnavailabilityRecord result = apiInstance.UnavailabilitiesPost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UnavailabilitiesApi.UnavailabilitiesPost: " + e.Message );
            }
        }
    }
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="unavailabilitiesunavailabilityiddelete"></a>
# **UnavailabilitiesUnavailabilityIdDelete**
> void UnavailabilitiesUnavailabilityIdDelete (int? unavailabilityId)

Delete an unavailability

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UnavailabilitiesUnavailabilityIdDeleteExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new UnavailabilitiesApi();
            var unavailabilityId = 56;  // int? | 

            try
            {
                // Delete an unavailability
                apiInstance.UnavailabilitiesUnavailabilityIdDelete(unavailabilityId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UnavailabilitiesApi.UnavailabilitiesUnavailabilityIdDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unavailabilityId** | **int?**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="unavailabilitiesunavailabilityidget"></a>
# **UnavailabilitiesUnavailabilityIdGet**
> UnavailabilityRecord UnavailabilitiesUnavailabilityIdGet (int? unavailabilityId)

Get an unavailability

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UnavailabilitiesUnavailabilityIdGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new UnavailabilitiesApi();
            var unavailabilityId = 56;  // int? | 

            try
            {
                // Get an unavailability
                UnavailabilityRecord result = apiInstance.UnavailabilitiesUnavailabilityIdGet(unavailabilityId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UnavailabilitiesApi.UnavailabilitiesUnavailabilityIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unavailabilityId** | **int?**|  | 

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="unavailabilitiesunavailabilityidput"></a>
# **UnavailabilitiesUnavailabilityIdPut**
> UnavailabilityRecord UnavailabilitiesUnavailabilityIdPut (UnavailabilityPayload body, int? unavailabilityId)

Update an unavailability

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UnavailabilitiesUnavailabilityIdPutExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new UnavailabilitiesApi();
            var body = new UnavailabilityPayload(); // UnavailabilityPayload | 
            var unavailabilityId = 56;  // int? | 

            try
            {
                // Update an unavailability
                UnavailabilityRecord result = apiInstance.UnavailabilitiesUnavailabilityIdPut(body, unavailabilityId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UnavailabilitiesApi.UnavailabilitiesUnavailabilityIdPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UnavailabilityPayload**](UnavailabilityPayload.md)|  | 
 **unavailabilityId** | **int?**|  | 

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

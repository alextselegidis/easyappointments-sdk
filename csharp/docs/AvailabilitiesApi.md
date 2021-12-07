# IO.Swagger.Api.AvailabilitiesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AvailabilitiesGet**](AvailabilitiesApi.md#availabilitiesget) | **GET** /availabilities | Gets availability

<a name="availabilitiesget"></a>
# **AvailabilitiesGet**
> Availabilities AvailabilitiesGet (int? providerId = null, int? serviceId = null, string date = null)

Gets availability

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AvailabilitiesGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AvailabilitiesApi();
            var providerId = 56;  // int? |  (optional) 
            var serviceId = 56;  // int? |  (optional) 
            var date = date_example;  // string |  (optional) 

            try
            {
                // Gets availability
                Availabilities result = apiInstance.AvailabilitiesGet(providerId, serviceId, date);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AvailabilitiesApi.AvailabilitiesGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **int?**|  | [optional] 
 **serviceId** | **int?**|  | [optional] 
 **date** | **string**|  | [optional] 

### Return type

[**Availabilities**](Availabilities.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

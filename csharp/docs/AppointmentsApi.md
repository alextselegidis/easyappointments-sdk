# IO.Swagger.Api.AppointmentsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AppointmentsAppointmentIdDelete**](AppointmentsApi.md#appointmentsappointmentiddelete) | **DELETE** /appointments/{appointmentId} | Delete an appointment
[**AppointmentsAppointmentIdGet**](AppointmentsApi.md#appointmentsappointmentidget) | **GET** /appointments/{appointmentId} | Get an appointment
[**AppointmentsAppointmentIdPut**](AppointmentsApi.md#appointmentsappointmentidput) | **PUT** /appointments/{appointmentId} | Update an appointment
[**AppointmentsGet**](AppointmentsApi.md#appointmentsget) | **GET** /appointments | Get all appointments
[**AppointmentsPost**](AppointmentsApi.md#appointmentspost) | **POST** /appointments | Create an appointment

<a name="appointmentsappointmentiddelete"></a>
# **AppointmentsAppointmentIdDelete**
> void AppointmentsAppointmentIdDelete (int? appointmentId)

Delete an appointment

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AppointmentsAppointmentIdDeleteExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AppointmentsApi();
            var appointmentId = 56;  // int? | 

            try
            {
                // Delete an appointment
                apiInstance.AppointmentsAppointmentIdDelete(appointmentId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AppointmentsApi.AppointmentsAppointmentIdDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointmentId** | **int?**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="appointmentsappointmentidget"></a>
# **AppointmentsAppointmentIdGet**
> AppointmentRecord AppointmentsAppointmentIdGet (int? appointmentId)

Get an appointment

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AppointmentsAppointmentIdGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AppointmentsApi();
            var appointmentId = 56;  // int? | 

            try
            {
                // Get an appointment
                AppointmentRecord result = apiInstance.AppointmentsAppointmentIdGet(appointmentId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AppointmentsApi.AppointmentsAppointmentIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointmentId** | **int?**|  | 

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="appointmentsappointmentidput"></a>
# **AppointmentsAppointmentIdPut**
> AppointmentRecord AppointmentsAppointmentIdPut (AppointmentPayload body, int? appointmentId)

Update an appointment

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AppointmentsAppointmentIdPutExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AppointmentsApi();
            var body = new AppointmentPayload(); // AppointmentPayload | 
            var appointmentId = 56;  // int? | 

            try
            {
                // Update an appointment
                AppointmentRecord result = apiInstance.AppointmentsAppointmentIdPut(body, appointmentId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AppointmentsApi.AppointmentsAppointmentIdPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentPayload**](AppointmentPayload.md)|  | 
 **appointmentId** | **int?**|  | 

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="appointmentsget"></a>
# **AppointmentsGet**
> AppointmentCollection AppointmentsGet (int? page = null, int? length = null, string sort = null, string q = null, string fields = null, string with = null, string aggregates = null)

Get all appointments

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AppointmentsGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AppointmentsApi();
            var page = 56;  // int? |  (optional) 
            var length = 56;  // int? |  (optional) 
            var sort = sort_example;  // string |  (optional) 
            var q = q_example;  // string |  (optional) 
            var fields = fields_example;  // string |  (optional) 
            var with = with_example;  // string |  (optional) 
            var aggregates = aggregates_example;  // string |  (optional) 

            try
            {
                // Get all appointments
                AppointmentCollection result = apiInstance.AppointmentsGet(page, length, sort, q, fields, with, aggregates);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AppointmentsApi.AppointmentsGet: " + e.Message );
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
 **aggregates** | **string**|  | [optional] 

### Return type

[**AppointmentCollection**](AppointmentCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="appointmentspost"></a>
# **AppointmentsPost**
> AppointmentRecord AppointmentsPost (AppointmentPayload body)

Create an appointment

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AppointmentsPostExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AppointmentsApi();
            var body = new AppointmentPayload(); // AppointmentPayload | 

            try
            {
                // Create an appointment
                AppointmentRecord result = apiInstance.AppointmentsPost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AppointmentsApi.AppointmentsPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentPayload**](AppointmentPayload.md)|  | 

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

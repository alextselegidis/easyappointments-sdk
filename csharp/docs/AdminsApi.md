# IO.Swagger.Api.AdminsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminsAdminIdDelete**](AdminsApi.md#adminsadminiddelete) | **DELETE** /admins/{adminId} | Delete an admin
[**AdminsAdminIdGet**](AdminsApi.md#adminsadminidget) | **GET** /admins/{adminId} | Get an admin
[**AdminsAdminIdPut**](AdminsApi.md#adminsadminidput) | **PUT** /admins/{adminId} | Update an admin
[**AdminsGet**](AdminsApi.md#adminsget) | **GET** /admins | Get all admins
[**AdminsPost**](AdminsApi.md#adminspost) | **POST** /admins | Create an admin

<a name="adminsadminiddelete"></a>
# **AdminsAdminIdDelete**
> void AdminsAdminIdDelete (int? adminId)

Delete an admin

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AdminsAdminIdDeleteExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AdminsApi();
            var adminId = 56;  // int? | 

            try
            {
                // Delete an admin
                apiInstance.AdminsAdminIdDelete(adminId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AdminsApi.AdminsAdminIdDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminId** | **int?**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="adminsadminidget"></a>
# **AdminsAdminIdGet**
> AdminRecord AdminsAdminIdGet (int? adminId)

Get an admin

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AdminsAdminIdGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AdminsApi();
            var adminId = 56;  // int? | 

            try
            {
                // Get an admin
                AdminRecord result = apiInstance.AdminsAdminIdGet(adminId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AdminsApi.AdminsAdminIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminId** | **int?**|  | 

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="adminsadminidput"></a>
# **AdminsAdminIdPut**
> AdminRecord AdminsAdminIdPut (AdminPayload body, int? adminId)

Update an admin

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AdminsAdminIdPutExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AdminsApi();
            var body = new AdminPayload(); // AdminPayload | 
            var adminId = 56;  // int? | 

            try
            {
                // Update an admin
                AdminRecord result = apiInstance.AdminsAdminIdPut(body, adminId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AdminsApi.AdminsAdminIdPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminPayload**](AdminPayload.md)|  | 
 **adminId** | **int?**|  | 

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="adminsget"></a>
# **AdminsGet**
> AdminCollection AdminsGet (int? page = null, int? length = null, string sort = null, string q = null, string fields = null, string with = null)

Get all admins

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AdminsGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AdminsApi();
            var page = 56;  // int? |  (optional) 
            var length = 56;  // int? |  (optional) 
            var sort = sort_example;  // string |  (optional) 
            var q = q_example;  // string |  (optional) 
            var fields = fields_example;  // string |  (optional) 
            var with = with_example;  // string |  (optional) 

            try
            {
                // Get all admins
                AdminCollection result = apiInstance.AdminsGet(page, length, sort, q, fields, with);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AdminsApi.AdminsGet: " + e.Message );
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

[**AdminCollection**](AdminCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="adminspost"></a>
# **AdminsPost**
> AdminRecord AdminsPost (AdminPayload body)

Create an admin

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AdminsPostExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AdminsApi();
            var body = new AdminPayload(); // AdminPayload | 

            try
            {
                // Create an admin
                AdminRecord result = apiInstance.AdminsPost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AdminsApi.AdminsPost: " + e.Message );
            }
        }
    }
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

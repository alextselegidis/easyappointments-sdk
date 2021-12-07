# IO.Swagger.Api.CategoriesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CategoriesCategoryIdDelete**](CategoriesApi.md#categoriescategoryiddelete) | **DELETE** /categories/{categoryId} | Delete a category
[**CategoriesCategoryIdGet**](CategoriesApi.md#categoriescategoryidget) | **GET** /categories/{categoryId} | Get a category
[**CategoriesCategoryIdPut**](CategoriesApi.md#categoriescategoryidput) | **PUT** /categories/{categoryId} | Update a category
[**CategoriesGet**](CategoriesApi.md#categoriesget) | **GET** /categories | Get all categories
[**CategoriesPost**](CategoriesApi.md#categoriespost) | **POST** /categories | Create a category

<a name="categoriescategoryiddelete"></a>
# **CategoriesCategoryIdDelete**
> void CategoriesCategoryIdDelete (int? categoryId)

Delete a category

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CategoriesCategoryIdDeleteExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CategoriesApi();
            var categoryId = 56;  // int? | 

            try
            {
                // Delete a category
                apiInstance.CategoriesCategoryIdDelete(categoryId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoriesApi.CategoriesCategoryIdDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **int?**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="categoriescategoryidget"></a>
# **CategoriesCategoryIdGet**
> CategoryRecord CategoriesCategoryIdGet (int? categoryId)

Get a category

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CategoriesCategoryIdGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CategoriesApi();
            var categoryId = 56;  // int? | 

            try
            {
                // Get a category
                CategoryRecord result = apiInstance.CategoriesCategoryIdGet(categoryId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoriesApi.CategoriesCategoryIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **int?**|  | 

### Return type

[**CategoryRecord**](CategoryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="categoriescategoryidput"></a>
# **CategoriesCategoryIdPut**
> CategoryRecord CategoriesCategoryIdPut (CategoryPayload body, int? categoryId)

Update a category

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CategoriesCategoryIdPutExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CategoriesApi();
            var body = new CategoryPayload(); // CategoryPayload | 
            var categoryId = 56;  // int? | 

            try
            {
                // Update a category
                CategoryRecord result = apiInstance.CategoriesCategoryIdPut(body, categoryId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoriesApi.CategoriesCategoryIdPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryPayload**](CategoryPayload.md)|  | 
 **categoryId** | **int?**|  | 

### Return type

[**CategoryRecord**](CategoryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="categoriesget"></a>
# **CategoriesGet**
> CategoryCollection CategoriesGet (int? page = null, int? length = null, string sort = null, string q = null, string fields = null, string with = null)

Get all categories

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CategoriesGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CategoriesApi();
            var page = 56;  // int? |  (optional) 
            var length = 56;  // int? |  (optional) 
            var sort = sort_example;  // string |  (optional) 
            var q = q_example;  // string |  (optional) 
            var fields = fields_example;  // string |  (optional) 
            var with = with_example;  // string |  (optional) 

            try
            {
                // Get all categories
                CategoryCollection result = apiInstance.CategoriesGet(page, length, sort, q, fields, with);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoriesApi.CategoriesGet: " + e.Message );
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

[**CategoryCollection**](CategoryCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="categoriespost"></a>
# **CategoriesPost**
> CategoryRecord CategoriesPost (CategoryPayload body)

Create a category

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CategoriesPostExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: BasicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new CategoriesApi();
            var body = new CategoryPayload(); // CategoryPayload | 

            try
            {
                // Create a category
                CategoryRecord result = apiInstance.CategoriesPost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoriesApi.CategoriesPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryPayload**](CategoryPayload.md)|  | 

### Return type

[**CategoryRecord**](CategoryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

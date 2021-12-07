# Swagger\Client\AdminsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminsAdminIdDelete**](AdminsApi.md#adminsadminiddelete) | **DELETE** /admins/{adminId} | Delete an admin
[**adminsAdminIdGet**](AdminsApi.md#adminsadminidget) | **GET** /admins/{adminId} | Get an admin
[**adminsAdminIdPut**](AdminsApi.md#adminsadminidput) | **PUT** /admins/{adminId} | Update an admin
[**adminsGet**](AdminsApi.md#adminsget) | **GET** /admins | Get all admins
[**adminsPost**](AdminsApi.md#adminspost) | **POST** /admins | Create an admin

# **adminsAdminIdDelete**
> adminsAdminIdDelete($admin_id)

Delete an admin

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: BasicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');
    // Configure HTTP bearer authorization: BearerToken
    $config = Swagger\Client\Configuration::getDefaultConfiguration()
    ->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new Swagger\Client\Api\AdminsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$admin_id = 56; // int | 

try {
    $apiInstance->adminsAdminIdDelete($admin_id);
} catch (Exception $e) {
    echo 'Exception when calling AdminsApi->adminsAdminIdDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **admin_id** | **int**|  |

### Return type

void (empty response body)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **adminsAdminIdGet**
> \Swagger\Client\Model\AdminRecord adminsAdminIdGet($admin_id)

Get an admin

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: BasicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');
    // Configure HTTP bearer authorization: BearerToken
    $config = Swagger\Client\Configuration::getDefaultConfiguration()
    ->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new Swagger\Client\Api\AdminsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$admin_id = 56; // int | 

try {
    $result = $apiInstance->adminsAdminIdGet($admin_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminsApi->adminsAdminIdGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **admin_id** | **int**|  |

### Return type

[**\Swagger\Client\Model\AdminRecord**](../Model/AdminRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **adminsAdminIdPut**
> \Swagger\Client\Model\AdminRecord adminsAdminIdPut($body, $admin_id)

Update an admin

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: BasicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');
    // Configure HTTP bearer authorization: BearerToken
    $config = Swagger\Client\Configuration::getDefaultConfiguration()
    ->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new Swagger\Client\Api\AdminsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\AdminPayload(); // \Swagger\Client\Model\AdminPayload | 
$admin_id = 56; // int | 

try {
    $result = $apiInstance->adminsAdminIdPut($body, $admin_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminsApi->adminsAdminIdPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\AdminPayload**](../Model/AdminPayload.md)|  |
 **admin_id** | **int**|  |

### Return type

[**\Swagger\Client\Model\AdminRecord**](../Model/AdminRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **adminsGet**
> \Swagger\Client\Model\AdminCollection adminsGet($page, $length, $sort, $q, $fields, $with)

Get all admins

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: BasicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');
    // Configure HTTP bearer authorization: BearerToken
    $config = Swagger\Client\Configuration::getDefaultConfiguration()
    ->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new Swagger\Client\Api\AdminsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 56; // int | 
$length = 56; // int | 
$sort = "sort_example"; // string | 
$q = "q_example"; // string | 
$fields = "fields_example"; // string | 
$with = "with_example"; // string | 

try {
    $result = $apiInstance->adminsGet($page, $length, $sort, $q, $fields, $with);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminsApi->adminsGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**|  | [optional]
 **length** | **int**|  | [optional]
 **sort** | **string**|  | [optional]
 **q** | **string**|  | [optional]
 **fields** | **string**|  | [optional]
 **with** | **string**|  | [optional]

### Return type

[**\Swagger\Client\Model\AdminCollection**](../Model/AdminCollection.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **adminsPost**
> \Swagger\Client\Model\AdminRecord adminsPost($body)

Create an admin

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: BasicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');
    // Configure HTTP bearer authorization: BearerToken
    $config = Swagger\Client\Configuration::getDefaultConfiguration()
    ->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new Swagger\Client\Api\AdminsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\AdminPayload(); // \Swagger\Client\Model\AdminPayload | 

try {
    $result = $apiInstance->adminsPost($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminsApi->adminsPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\AdminPayload**](../Model/AdminPayload.md)|  |

### Return type

[**\Swagger\Client\Model\AdminRecord**](../Model/AdminRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


# Swagger\Client\ProvidersApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**providersGet**](ProvidersApi.md#providersget) | **GET** /providers | Get all providers
[**providersPost**](ProvidersApi.md#providerspost) | **POST** /providers | Create a provider
[**providersProviderIdDelete**](ProvidersApi.md#providersprovideriddelete) | **DELETE** /providers/{providerId} | Delete a provider
[**providersProviderIdGet**](ProvidersApi.md#providersprovideridget) | **GET** /providers/{providerId} | Get a provider
[**providersProviderIdPut**](ProvidersApi.md#providersprovideridput) | **PUT** /providers/{providerId} | Update a provider

# **providersGet**
> \Swagger\Client\Model\ProviderCollection providersGet($page, $length, $sort, $q, $fields, $with)

Get all providers

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


$apiInstance = new Swagger\Client\Api\ProvidersApi(
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
    $result = $apiInstance->providersGet($page, $length, $sort, $q, $fields, $with);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProvidersApi->providersGet: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\ProviderCollection**](../Model/ProviderCollection.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **providersPost**
> \Swagger\Client\Model\ProviderRecord providersPost($body)

Create a provider

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


$apiInstance = new Swagger\Client\Api\ProvidersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\ProviderPayload(); // \Swagger\Client\Model\ProviderPayload | 

try {
    $result = $apiInstance->providersPost($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProvidersApi->providersPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\ProviderPayload**](../Model/ProviderPayload.md)|  |

### Return type

[**\Swagger\Client\Model\ProviderRecord**](../Model/ProviderRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **providersProviderIdDelete**
> providersProviderIdDelete($provider_id)

Delete a provider

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


$apiInstance = new Swagger\Client\Api\ProvidersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$provider_id = 56; // int | 

try {
    $apiInstance->providersProviderIdDelete($provider_id);
} catch (Exception $e) {
    echo 'Exception when calling ProvidersApi->providersProviderIdDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **int**|  |

### Return type

void (empty response body)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **providersProviderIdGet**
> \Swagger\Client\Model\ProviderRecord providersProviderIdGet($provider_id)

Get a provider

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


$apiInstance = new Swagger\Client\Api\ProvidersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$provider_id = 56; // int | 

try {
    $result = $apiInstance->providersProviderIdGet($provider_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProvidersApi->providersProviderIdGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **int**|  |

### Return type

[**\Swagger\Client\Model\ProviderRecord**](../Model/ProviderRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **providersProviderIdPut**
> \Swagger\Client\Model\ProviderRecord providersProviderIdPut($body, $provider_id)

Update a provider

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


$apiInstance = new Swagger\Client\Api\ProvidersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\ProviderPayload(); // \Swagger\Client\Model\ProviderPayload | 
$provider_id = 56; // int | 

try {
    $result = $apiInstance->providersProviderIdPut($body, $provider_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProvidersApi->providersProviderIdPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\ProviderPayload**](../Model/ProviderPayload.md)|  |
 **provider_id** | **int**|  |

### Return type

[**\Swagger\Client\Model\ProviderRecord**](../Model/ProviderRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


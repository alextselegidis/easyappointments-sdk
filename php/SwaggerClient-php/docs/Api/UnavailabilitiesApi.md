# Swagger\Client\UnavailabilitiesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**unavailabilitiesGet**](UnavailabilitiesApi.md#unavailabilitiesget) | **GET** /unavailabilities | Get all unavailabilities
[**unavailabilitiesPost**](UnavailabilitiesApi.md#unavailabilitiespost) | **POST** /unavailabilities | Create an unavailability
[**unavailabilitiesUnavailabilityIdDelete**](UnavailabilitiesApi.md#unavailabilitiesunavailabilityiddelete) | **DELETE** /unavailabilities/{unavailabilityId} | Delete an unavailability
[**unavailabilitiesUnavailabilityIdGet**](UnavailabilitiesApi.md#unavailabilitiesunavailabilityidget) | **GET** /unavailabilities/{unavailabilityId} | Get an unavailability
[**unavailabilitiesUnavailabilityIdPut**](UnavailabilitiesApi.md#unavailabilitiesunavailabilityidput) | **PUT** /unavailabilities/{unavailabilityId} | Update an unavailability

# **unavailabilitiesGet**
> \Swagger\Client\Model\UnavailabilityCollection unavailabilitiesGet($page, $length, $sort, $q, $fields, $with)

Get all unavailabilities

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UnavailabilitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$page = 56; // int | 
$length = 56; // int | 
$sort = "sort_example"; // string | 
$q = "q_example"; // string | 
$fields = "fields_example"; // string | 
$with = "with_example"; // string | 

try {
    $result = $apiInstance->unavailabilitiesGet($page, $length, $sort, $q, $fields, $with);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UnavailabilitiesApi->unavailabilitiesGet: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\UnavailabilityCollection**](../Model/UnavailabilityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **unavailabilitiesPost**
> \Swagger\Client\Model\UnavailabilityRecord unavailabilitiesPost($body)

Create an unavailability

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


$apiInstance = new Swagger\Client\Api\UnavailabilitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\UnavailabilityPayload(); // \Swagger\Client\Model\UnavailabilityPayload | 

try {
    $result = $apiInstance->unavailabilitiesPost($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UnavailabilitiesApi->unavailabilitiesPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\UnavailabilityPayload**](../Model/UnavailabilityPayload.md)|  |

### Return type

[**\Swagger\Client\Model\UnavailabilityRecord**](../Model/UnavailabilityRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **unavailabilitiesUnavailabilityIdDelete**
> unavailabilitiesUnavailabilityIdDelete($unavailability_id)

Delete an unavailability

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


$apiInstance = new Swagger\Client\Api\UnavailabilitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$unavailability_id = 56; // int | 

try {
    $apiInstance->unavailabilitiesUnavailabilityIdDelete($unavailability_id);
} catch (Exception $e) {
    echo 'Exception when calling UnavailabilitiesApi->unavailabilitiesUnavailabilityIdDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unavailability_id** | **int**|  |

### Return type

void (empty response body)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **unavailabilitiesUnavailabilityIdGet**
> \Swagger\Client\Model\UnavailabilityRecord unavailabilitiesUnavailabilityIdGet($unavailability_id)

Get an unavailability

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


$apiInstance = new Swagger\Client\Api\UnavailabilitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$unavailability_id = 56; // int | 

try {
    $result = $apiInstance->unavailabilitiesUnavailabilityIdGet($unavailability_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UnavailabilitiesApi->unavailabilitiesUnavailabilityIdGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unavailability_id** | **int**|  |

### Return type

[**\Swagger\Client\Model\UnavailabilityRecord**](../Model/UnavailabilityRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **unavailabilitiesUnavailabilityIdPut**
> \Swagger\Client\Model\UnavailabilityRecord unavailabilitiesUnavailabilityIdPut($body, $unavailability_id)

Update an unavailability

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


$apiInstance = new Swagger\Client\Api\UnavailabilitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\UnavailabilityPayload(); // \Swagger\Client\Model\UnavailabilityPayload | 
$unavailability_id = 56; // int | 

try {
    $result = $apiInstance->unavailabilitiesUnavailabilityIdPut($body, $unavailability_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UnavailabilitiesApi->unavailabilitiesUnavailabilityIdPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\UnavailabilityPayload**](../Model/UnavailabilityPayload.md)|  |
 **unavailability_id** | **int**|  |

### Return type

[**\Swagger\Client\Model\UnavailabilityRecord**](../Model/UnavailabilityRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


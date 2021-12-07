# Swagger\Client\AvailabilitiesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**availabilitiesGet**](AvailabilitiesApi.md#availabilitiesget) | **GET** /availabilities | Gets availability

# **availabilitiesGet**
> \Swagger\Client\Model\Availabilities availabilitiesGet($provider_id, $service_id, $date)

Gets availability

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


$apiInstance = new Swagger\Client\Api\AvailabilitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$provider_id = 56; // int | 
$service_id = 56; // int | 
$date = "date_example"; // string | 

try {
    $result = $apiInstance->availabilitiesGet($provider_id, $service_id, $date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AvailabilitiesApi->availabilitiesGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **int**|  | [optional]
 **service_id** | **int**|  | [optional]
 **date** | **string**|  | [optional]

### Return type

[**\Swagger\Client\Model\Availabilities**](../Model/Availabilities.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


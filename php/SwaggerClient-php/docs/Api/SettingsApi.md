# Swagger\Client\SettingsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**settingsGet**](SettingsApi.md#settingsget) | **GET** /settings | Get all settings
[**settingsSettingNameGet**](SettingsApi.md#settingssettingnameget) | **GET** /settings/{settingName} | Get a setting
[**settingsSettingNamePut**](SettingsApi.md#settingssettingnameput) | **PUT** /settings/{settingName} | Update a setting

# **settingsGet**
> \Swagger\Client\Model\SettingCollection settingsGet($page, $length, $sort, $q, $fields, $with)

Get all settings

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


$apiInstance = new Swagger\Client\Api\SettingsApi(
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
    $result = $apiInstance->settingsGet($page, $length, $sort, $q, $fields, $with);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SettingsApi->settingsGet: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\SettingCollection**](../Model/SettingCollection.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **settingsSettingNameGet**
> \Swagger\Client\Model\SettingRecord settingsSettingNameGet($setting_name)

Get a setting

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


$apiInstance = new Swagger\Client\Api\SettingsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$setting_name = "setting_name_example"; // string | 

try {
    $result = $apiInstance->settingsSettingNameGet($setting_name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SettingsApi->settingsSettingNameGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setting_name** | **string**|  |

### Return type

[**\Swagger\Client\Model\SettingRecord**](../Model/SettingRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **settingsSettingNamePut**
> \Swagger\Client\Model\SettingRecord settingsSettingNamePut($body, $setting_name)

Update a setting

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


$apiInstance = new Swagger\Client\Api\SettingsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\SettingPayload(); // \Swagger\Client\Model\SettingPayload | 
$setting_name = "setting_name_example"; // string | 

try {
    $result = $apiInstance->settingsSettingNamePut($body, $setting_name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SettingsApi->settingsSettingNamePut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\SettingPayload**](../Model/SettingPayload.md)|  |
 **setting_name** | **string**|  |

### Return type

[**\Swagger\Client\Model\SettingRecord**](../Model/SettingRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


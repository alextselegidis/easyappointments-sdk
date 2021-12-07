# Swagger\Client\AppointmentsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appointmentsAppointmentIdDelete**](AppointmentsApi.md#appointmentsappointmentiddelete) | **DELETE** /appointments/{appointmentId} | Delete an appointment
[**appointmentsAppointmentIdGet**](AppointmentsApi.md#appointmentsappointmentidget) | **GET** /appointments/{appointmentId} | Get an appointment
[**appointmentsAppointmentIdPut**](AppointmentsApi.md#appointmentsappointmentidput) | **PUT** /appointments/{appointmentId} | Update an appointment
[**appointmentsGet**](AppointmentsApi.md#appointmentsget) | **GET** /appointments | Get all appointments
[**appointmentsPost**](AppointmentsApi.md#appointmentspost) | **POST** /appointments | Create an appointment

# **appointmentsAppointmentIdDelete**
> appointmentsAppointmentIdDelete($appointment_id)

Delete an appointment

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


$apiInstance = new Swagger\Client\Api\AppointmentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$appointment_id = 56; // int | 

try {
    $apiInstance->appointmentsAppointmentIdDelete($appointment_id);
} catch (Exception $e) {
    echo 'Exception when calling AppointmentsApi->appointmentsAppointmentIdDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointment_id** | **int**|  |

### Return type

void (empty response body)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **appointmentsAppointmentIdGet**
> \Swagger\Client\Model\AppointmentRecord appointmentsAppointmentIdGet($appointment_id)

Get an appointment

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


$apiInstance = new Swagger\Client\Api\AppointmentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$appointment_id = 56; // int | 

try {
    $result = $apiInstance->appointmentsAppointmentIdGet($appointment_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppointmentsApi->appointmentsAppointmentIdGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointment_id** | **int**|  |

### Return type

[**\Swagger\Client\Model\AppointmentRecord**](../Model/AppointmentRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **appointmentsAppointmentIdPut**
> \Swagger\Client\Model\AppointmentRecord appointmentsAppointmentIdPut($body, $appointment_id)

Update an appointment

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


$apiInstance = new Swagger\Client\Api\AppointmentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\AppointmentPayload(); // \Swagger\Client\Model\AppointmentPayload | 
$appointment_id = 56; // int | 

try {
    $result = $apiInstance->appointmentsAppointmentIdPut($body, $appointment_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppointmentsApi->appointmentsAppointmentIdPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\AppointmentPayload**](../Model/AppointmentPayload.md)|  |
 **appointment_id** | **int**|  |

### Return type

[**\Swagger\Client\Model\AppointmentRecord**](../Model/AppointmentRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **appointmentsGet**
> \Swagger\Client\Model\AppointmentCollection appointmentsGet($page, $length, $sort, $q, $fields, $with, $aggregates)

Get all appointments

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


$apiInstance = new Swagger\Client\Api\AppointmentsApi(
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
$aggregates = "aggregates_example"; // string | 

try {
    $result = $apiInstance->appointmentsGet($page, $length, $sort, $q, $fields, $with, $aggregates);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppointmentsApi->appointmentsGet: ', $e->getMessage(), PHP_EOL;
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
 **aggregates** | **string**|  | [optional]

### Return type

[**\Swagger\Client\Model\AppointmentCollection**](../Model/AppointmentCollection.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **appointmentsPost**
> \Swagger\Client\Model\AppointmentRecord appointmentsPost($body)

Create an appointment

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


$apiInstance = new Swagger\Client\Api\AppointmentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\AppointmentPayload(); // \Swagger\Client\Model\AppointmentPayload | 

try {
    $result = $apiInstance->appointmentsPost($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppointmentsApi->appointmentsPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\AppointmentPayload**](../Model/AppointmentPayload.md)|  |

### Return type

[**\Swagger\Client\Model\AppointmentRecord**](../Model/AppointmentRecord.md)

### Authorization

[BasicAuth](../../README.md#BasicAuth), [BearerToken](../../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


# swagger_client.AvailabilitiesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**availabilities_get**](AvailabilitiesApi.md#availabilities_get) | **GET** /availabilities | Gets availability

# **availabilities_get**
> Availabilities availabilities_get(provider_id=provider_id, service_id=service_id, _date=_date)

Gets availability

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: BasicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.AvailabilitiesApi(swagger_client.ApiClient(configuration))
provider_id = 56 # int |  (optional)
service_id = 56 # int |  (optional)
_date = '_date_example' # str |  (optional)

try:
    # Gets availability
    api_response = api_instance.availabilities_get(provider_id=provider_id, service_id=service_id, _date=_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AvailabilitiesApi->availabilities_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **int**|  | [optional] 
 **service_id** | **int**|  | [optional] 
 **_date** | **str**|  | [optional] 

### Return type

[**Availabilities**](Availabilities.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# swagger_client.SettingsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**settings_get**](SettingsApi.md#settings_get) | **GET** /settings | Get all settings
[**settings_setting_name_get**](SettingsApi.md#settings_setting_name_get) | **GET** /settings/{settingName} | Get a setting
[**settings_setting_name_put**](SettingsApi.md#settings_setting_name_put) | **PUT** /settings/{settingName} | Update a setting

# **settings_get**
> SettingCollection settings_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)

Get all settings

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
api_instance = swagger_client.SettingsApi(swagger_client.ApiClient(configuration))
page = 56 # int |  (optional)
length = 56 # int |  (optional)
sort = 'sort_example' # str |  (optional)
q = 'q_example' # str |  (optional)
fields = 'fields_example' # str |  (optional)
_with = '_with_example' # str |  (optional)

try:
    # Get all settings
    api_response = api_instance.settings_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SettingsApi->settings_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**|  | [optional] 
 **length** | **int**|  | [optional] 
 **sort** | **str**|  | [optional] 
 **q** | **str**|  | [optional] 
 **fields** | **str**|  | [optional] 
 **_with** | **str**|  | [optional] 

### Return type

[**SettingCollection**](SettingCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **settings_setting_name_get**
> SettingRecord settings_setting_name_get(setting_name)

Get a setting

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
api_instance = swagger_client.SettingsApi(swagger_client.ApiClient(configuration))
setting_name = 'setting_name_example' # str | 

try:
    # Get a setting
    api_response = api_instance.settings_setting_name_get(setting_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SettingsApi->settings_setting_name_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setting_name** | **str**|  | 

### Return type

[**SettingRecord**](SettingRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **settings_setting_name_put**
> SettingRecord settings_setting_name_put(body, setting_name)

Update a setting

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
api_instance = swagger_client.SettingsApi(swagger_client.ApiClient(configuration))
body = swagger_client.SettingPayload() # SettingPayload | 
setting_name = 'setting_name_example' # str | 

try:
    # Update a setting
    api_response = api_instance.settings_setting_name_put(body, setting_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SettingsApi->settings_setting_name_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SettingPayload**](SettingPayload.md)|  | 
 **setting_name** | **str**|  | 

### Return type

[**SettingRecord**](SettingRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


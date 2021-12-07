# swagger_client.ProvidersApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**providers_get**](ProvidersApi.md#providers_get) | **GET** /providers | Get all providers
[**providers_post**](ProvidersApi.md#providers_post) | **POST** /providers | Create a provider
[**providers_provider_id_delete**](ProvidersApi.md#providers_provider_id_delete) | **DELETE** /providers/{providerId} | Delete a provider
[**providers_provider_id_get**](ProvidersApi.md#providers_provider_id_get) | **GET** /providers/{providerId} | Get a provider
[**providers_provider_id_put**](ProvidersApi.md#providers_provider_id_put) | **PUT** /providers/{providerId} | Update a provider

# **providers_get**
> ProviderCollection providers_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)

Get all providers

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
api_instance = swagger_client.ProvidersApi(swagger_client.ApiClient(configuration))
page = 56 # int |  (optional)
length = 56 # int |  (optional)
sort = 'sort_example' # str |  (optional)
q = 'q_example' # str |  (optional)
fields = 'fields_example' # str |  (optional)
_with = '_with_example' # str |  (optional)

try:
    # Get all providers
    api_response = api_instance.providers_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProvidersApi->providers_get: %s\n" % e)
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

[**ProviderCollection**](ProviderCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **providers_post**
> ProviderRecord providers_post(body)

Create a provider

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
api_instance = swagger_client.ProvidersApi(swagger_client.ApiClient(configuration))
body = swagger_client.ProviderPayload() # ProviderPayload | 

try:
    # Create a provider
    api_response = api_instance.providers_post(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProvidersApi->providers_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProviderPayload**](ProviderPayload.md)|  | 

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **providers_provider_id_delete**
> providers_provider_id_delete(provider_id)

Delete a provider

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
api_instance = swagger_client.ProvidersApi(swagger_client.ApiClient(configuration))
provider_id = 56 # int | 

try:
    # Delete a provider
    api_instance.providers_provider_id_delete(provider_id)
except ApiException as e:
    print("Exception when calling ProvidersApi->providers_provider_id_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **providers_provider_id_get**
> ProviderRecord providers_provider_id_get(provider_id)

Get a provider

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
api_instance = swagger_client.ProvidersApi(swagger_client.ApiClient(configuration))
provider_id = 56 # int | 

try:
    # Get a provider
    api_response = api_instance.providers_provider_id_get(provider_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProvidersApi->providers_provider_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **int**|  | 

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **providers_provider_id_put**
> ProviderRecord providers_provider_id_put(body, provider_id)

Update a provider

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
api_instance = swagger_client.ProvidersApi(swagger_client.ApiClient(configuration))
body = swagger_client.ProviderPayload() # ProviderPayload | 
provider_id = 56 # int | 

try:
    # Update a provider
    api_response = api_instance.providers_provider_id_put(body, provider_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProvidersApi->providers_provider_id_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProviderPayload**](ProviderPayload.md)|  | 
 **provider_id** | **int**|  | 

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


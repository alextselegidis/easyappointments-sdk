# swagger_client.ServicesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**services_get**](ServicesApi.md#services_get) | **GET** /services | Get all services
[**services_post**](ServicesApi.md#services_post) | **POST** /services | Create a service
[**services_service_id_delete**](ServicesApi.md#services_service_id_delete) | **DELETE** /services/{serviceId} | Delete a service
[**services_service_id_get**](ServicesApi.md#services_service_id_get) | **GET** /services/{serviceId} | Get a service
[**services_service_id_put**](ServicesApi.md#services_service_id_put) | **PUT** /services/{serviceId} | Update a service

# **services_get**
> ServiceCollection services_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)

Get all services

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
api_instance = swagger_client.ServicesApi(swagger_client.ApiClient(configuration))
page = 56 # int |  (optional)
length = 56 # int |  (optional)
sort = 'sort_example' # str |  (optional)
q = 'q_example' # str |  (optional)
fields = 'fields_example' # str |  (optional)
_with = '_with_example' # str |  (optional)

try:
    # Get all services
    api_response = api_instance.services_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServicesApi->services_get: %s\n" % e)
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

[**ServiceCollection**](ServiceCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_post**
> ServiceRecord services_post(body)

Create a service

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
api_instance = swagger_client.ServicesApi(swagger_client.ApiClient(configuration))
body = swagger_client.ServicePayload() # ServicePayload | 

try:
    # Create a service
    api_response = api_instance.services_post(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServicesApi->services_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicePayload**](ServicePayload.md)|  | 

### Return type

[**ServiceRecord**](ServiceRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_service_id_delete**
> services_service_id_delete(service_id)

Delete a service

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
api_instance = swagger_client.ServicesApi(swagger_client.ApiClient(configuration))
service_id = 56 # int | 

try:
    # Delete a service
    api_instance.services_service_id_delete(service_id)
except ApiException as e:
    print("Exception when calling ServicesApi->services_service_id_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service_id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_service_id_get**
> ServiceRecord services_service_id_get(service_id)

Get a service

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
api_instance = swagger_client.ServicesApi(swagger_client.ApiClient(configuration))
service_id = 56 # int | 

try:
    # Get a service
    api_response = api_instance.services_service_id_get(service_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServicesApi->services_service_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service_id** | **int**|  | 

### Return type

[**ServiceRecord**](ServiceRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_service_id_put**
> ServiceRecord services_service_id_put(body, service_id)

Update a service

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
api_instance = swagger_client.ServicesApi(swagger_client.ApiClient(configuration))
body = swagger_client.ServicePayload() # ServicePayload | 
service_id = 56 # int | 

try:
    # Update a service
    api_response = api_instance.services_service_id_put(body, service_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServicesApi->services_service_id_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicePayload**](ServicePayload.md)|  | 
 **service_id** | **int**|  | 

### Return type

[**ServiceRecord**](ServiceRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


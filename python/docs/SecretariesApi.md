# swagger_client.SecretariesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secretaries_get**](SecretariesApi.md#secretaries_get) | **GET** /secretaries | Get all secretaries
[**secretaries_post**](SecretariesApi.md#secretaries_post) | **POST** /secretaries | Create a secretary
[**secretaries_secretary_id_delete**](SecretariesApi.md#secretaries_secretary_id_delete) | **DELETE** /secretaries/{secretaryId} | Delete a secretary
[**secretaries_secretary_id_get**](SecretariesApi.md#secretaries_secretary_id_get) | **GET** /secretaries/{secretaryId} | Get a secretary
[**secretaries_secretary_id_put**](SecretariesApi.md#secretaries_secretary_id_put) | **PUT** /secretaries/{secretaryId} | Update a secretary

# **secretaries_get**
> SecretaryCollection secretaries_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)

Get all secretaries

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
api_instance = swagger_client.SecretariesApi(swagger_client.ApiClient(configuration))
page = 56 # int |  (optional)
length = 56 # int |  (optional)
sort = 'sort_example' # str |  (optional)
q = 'q_example' # str |  (optional)
fields = 'fields_example' # str |  (optional)
_with = '_with_example' # str |  (optional)

try:
    # Get all secretaries
    api_response = api_instance.secretaries_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecretariesApi->secretaries_get: %s\n" % e)
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

[**SecretaryCollection**](SecretaryCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **secretaries_post**
> SecretaryRecord secretaries_post(body)

Create a secretary

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
api_instance = swagger_client.SecretariesApi(swagger_client.ApiClient(configuration))
body = swagger_client.SecretaryPayload() # SecretaryPayload | 

try:
    # Create a secretary
    api_response = api_instance.secretaries_post(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecretariesApi->secretaries_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecretaryPayload**](SecretaryPayload.md)|  | 

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **secretaries_secretary_id_delete**
> secretaries_secretary_id_delete(secretary_id)

Delete a secretary

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
api_instance = swagger_client.SecretariesApi(swagger_client.ApiClient(configuration))
secretary_id = 56 # int | 

try:
    # Delete a secretary
    api_instance.secretaries_secretary_id_delete(secretary_id)
except ApiException as e:
    print("Exception when calling SecretariesApi->secretaries_secretary_id_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretary_id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **secretaries_secretary_id_get**
> SecretaryRecord secretaries_secretary_id_get(secretary_id)

Get a secretary

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
api_instance = swagger_client.SecretariesApi(swagger_client.ApiClient(configuration))
secretary_id = 56 # int | 

try:
    # Get a secretary
    api_response = api_instance.secretaries_secretary_id_get(secretary_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecretariesApi->secretaries_secretary_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretary_id** | **int**|  | 

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **secretaries_secretary_id_put**
> SecretaryRecord secretaries_secretary_id_put(body, secretary_id)

Update a secretary

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
api_instance = swagger_client.SecretariesApi(swagger_client.ApiClient(configuration))
body = swagger_client.SecretaryPayload() # SecretaryPayload | 
secretary_id = 56 # int | 

try:
    # Update a secretary
    api_response = api_instance.secretaries_secretary_id_put(body, secretary_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecretariesApi->secretaries_secretary_id_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecretaryPayload**](SecretaryPayload.md)|  | 
 **secretary_id** | **int**|  | 

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


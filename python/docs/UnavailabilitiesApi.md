# swagger_client.UnavailabilitiesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**unavailabilities_get**](UnavailabilitiesApi.md#unavailabilities_get) | **GET** /unavailabilities | Get all unavailabilities
[**unavailabilities_post**](UnavailabilitiesApi.md#unavailabilities_post) | **POST** /unavailabilities | Create an unavailability
[**unavailabilities_unavailability_id_delete**](UnavailabilitiesApi.md#unavailabilities_unavailability_id_delete) | **DELETE** /unavailabilities/{unavailabilityId} | Delete an unavailability
[**unavailabilities_unavailability_id_get**](UnavailabilitiesApi.md#unavailabilities_unavailability_id_get) | **GET** /unavailabilities/{unavailabilityId} | Get an unavailability
[**unavailabilities_unavailability_id_put**](UnavailabilitiesApi.md#unavailabilities_unavailability_id_put) | **PUT** /unavailabilities/{unavailabilityId} | Update an unavailability

# **unavailabilities_get**
> UnavailabilityCollection unavailabilities_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)

Get all unavailabilities

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UnavailabilitiesApi()
page = 56 # int |  (optional)
length = 56 # int |  (optional)
sort = 'sort_example' # str |  (optional)
q = 'q_example' # str |  (optional)
fields = 'fields_example' # str |  (optional)
_with = '_with_example' # str |  (optional)

try:
    # Get all unavailabilities
    api_response = api_instance.unavailabilities_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UnavailabilitiesApi->unavailabilities_get: %s\n" % e)
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

[**UnavailabilityCollection**](UnavailabilityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unavailabilities_post**
> UnavailabilityRecord unavailabilities_post(body)

Create an unavailability

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
api_instance = swagger_client.UnavailabilitiesApi(swagger_client.ApiClient(configuration))
body = swagger_client.UnavailabilityPayload() # UnavailabilityPayload | 

try:
    # Create an unavailability
    api_response = api_instance.unavailabilities_post(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UnavailabilitiesApi->unavailabilities_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UnavailabilityPayload**](UnavailabilityPayload.md)|  | 

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unavailabilities_unavailability_id_delete**
> unavailabilities_unavailability_id_delete(unavailability_id)

Delete an unavailability

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
api_instance = swagger_client.UnavailabilitiesApi(swagger_client.ApiClient(configuration))
unavailability_id = 56 # int | 

try:
    # Delete an unavailability
    api_instance.unavailabilities_unavailability_id_delete(unavailability_id)
except ApiException as e:
    print("Exception when calling UnavailabilitiesApi->unavailabilities_unavailability_id_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unavailability_id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unavailabilities_unavailability_id_get**
> UnavailabilityRecord unavailabilities_unavailability_id_get(unavailability_id)

Get an unavailability

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
api_instance = swagger_client.UnavailabilitiesApi(swagger_client.ApiClient(configuration))
unavailability_id = 56 # int | 

try:
    # Get an unavailability
    api_response = api_instance.unavailabilities_unavailability_id_get(unavailability_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UnavailabilitiesApi->unavailabilities_unavailability_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unavailability_id** | **int**|  | 

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unavailabilities_unavailability_id_put**
> UnavailabilityRecord unavailabilities_unavailability_id_put(body, unavailability_id)

Update an unavailability

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
api_instance = swagger_client.UnavailabilitiesApi(swagger_client.ApiClient(configuration))
body = swagger_client.UnavailabilityPayload() # UnavailabilityPayload | 
unavailability_id = 56 # int | 

try:
    # Update an unavailability
    api_response = api_instance.unavailabilities_unavailability_id_put(body, unavailability_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UnavailabilitiesApi->unavailabilities_unavailability_id_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UnavailabilityPayload**](UnavailabilityPayload.md)|  | 
 **unavailability_id** | **int**|  | 

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


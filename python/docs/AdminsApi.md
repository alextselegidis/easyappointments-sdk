# swagger_client.AdminsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admins_admin_id_delete**](AdminsApi.md#admins_admin_id_delete) | **DELETE** /admins/{adminId} | Delete an admin
[**admins_admin_id_get**](AdminsApi.md#admins_admin_id_get) | **GET** /admins/{adminId} | Get an admin
[**admins_admin_id_put**](AdminsApi.md#admins_admin_id_put) | **PUT** /admins/{adminId} | Update an admin
[**admins_get**](AdminsApi.md#admins_get) | **GET** /admins | Get all admins
[**admins_post**](AdminsApi.md#admins_post) | **POST** /admins | Create an admin

# **admins_admin_id_delete**
> admins_admin_id_delete(admin_id)

Delete an admin

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
api_instance = swagger_client.AdminsApi(swagger_client.ApiClient(configuration))
admin_id = 56 # int | 

try:
    # Delete an admin
    api_instance.admins_admin_id_delete(admin_id)
except ApiException as e:
    print("Exception when calling AdminsApi->admins_admin_id_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **admin_id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admins_admin_id_get**
> AdminRecord admins_admin_id_get(admin_id)

Get an admin

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
api_instance = swagger_client.AdminsApi(swagger_client.ApiClient(configuration))
admin_id = 56 # int | 

try:
    # Get an admin
    api_response = api_instance.admins_admin_id_get(admin_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdminsApi->admins_admin_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **admin_id** | **int**|  | 

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admins_admin_id_put**
> AdminRecord admins_admin_id_put(body, admin_id)

Update an admin

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
api_instance = swagger_client.AdminsApi(swagger_client.ApiClient(configuration))
body = swagger_client.AdminPayload() # AdminPayload | 
admin_id = 56 # int | 

try:
    # Update an admin
    api_response = api_instance.admins_admin_id_put(body, admin_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdminsApi->admins_admin_id_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminPayload**](AdminPayload.md)|  | 
 **admin_id** | **int**|  | 

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admins_get**
> AdminCollection admins_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)

Get all admins

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
api_instance = swagger_client.AdminsApi(swagger_client.ApiClient(configuration))
page = 56 # int |  (optional)
length = 56 # int |  (optional)
sort = 'sort_example' # str |  (optional)
q = 'q_example' # str |  (optional)
fields = 'fields_example' # str |  (optional)
_with = '_with_example' # str |  (optional)

try:
    # Get all admins
    api_response = api_instance.admins_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdminsApi->admins_get: %s\n" % e)
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

[**AdminCollection**](AdminCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admins_post**
> AdminRecord admins_post(body)

Create an admin

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
api_instance = swagger_client.AdminsApi(swagger_client.ApiClient(configuration))
body = swagger_client.AdminPayload() # AdminPayload | 

try:
    # Create an admin
    api_response = api_instance.admins_post(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdminsApi->admins_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminPayload**](AdminPayload.md)|  | 

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


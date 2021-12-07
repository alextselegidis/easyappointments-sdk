# swagger_client.CustomersApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customers_customer_id_delete**](CustomersApi.md#customers_customer_id_delete) | **DELETE** /customers/{customerId} | Delete a customer
[**customers_customer_id_get**](CustomersApi.md#customers_customer_id_get) | **GET** /customers/{customerId} | Get a customer
[**customers_customer_id_put**](CustomersApi.md#customers_customer_id_put) | **PUT** /customers/{customerId} | Update a customer
[**customers_get**](CustomersApi.md#customers_get) | **GET** /customers | Get all customers
[**customers_post**](CustomersApi.md#customers_post) | **POST** /customers | Create a customer

# **customers_customer_id_delete**
> customers_customer_id_delete(customer_id)

Delete a customer

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
api_instance = swagger_client.CustomersApi(swagger_client.ApiClient(configuration))
customer_id = 56 # int | 

try:
    # Delete a customer
    api_instance.customers_customer_id_delete(customer_id)
except ApiException as e:
    print("Exception when calling CustomersApi->customers_customer_id_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customers_customer_id_get**
> CustomerRecord customers_customer_id_get(customer_id)

Get a customer

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
api_instance = swagger_client.CustomersApi(swagger_client.ApiClient(configuration))
customer_id = 56 # int | 

try:
    # Get a customer
    api_response = api_instance.customers_customer_id_get(customer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomersApi->customers_customer_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **int**|  | 

### Return type

[**CustomerRecord**](CustomerRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customers_customer_id_put**
> CustomerRecord customers_customer_id_put(body, customer_id)

Update a customer

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
api_instance = swagger_client.CustomersApi(swagger_client.ApiClient(configuration))
body = swagger_client.CustomerPayload() # CustomerPayload | 
customer_id = 56 # int | 

try:
    # Update a customer
    api_response = api_instance.customers_customer_id_put(body, customer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomersApi->customers_customer_id_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerPayload**](CustomerPayload.md)|  | 
 **customer_id** | **int**|  | 

### Return type

[**CustomerRecord**](CustomerRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customers_get**
> CustomerCollection customers_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)

Get all customers

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
api_instance = swagger_client.CustomersApi(swagger_client.ApiClient(configuration))
page = 56 # int |  (optional)
length = 56 # int |  (optional)
sort = 'sort_example' # str |  (optional)
q = 'q_example' # str |  (optional)
fields = 'fields_example' # str |  (optional)
_with = '_with_example' # str |  (optional)

try:
    # Get all customers
    api_response = api_instance.customers_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomersApi->customers_get: %s\n" % e)
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

[**CustomerCollection**](CustomerCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customers_post**
> CustomerRecord customers_post(body)

Create a customer

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
api_instance = swagger_client.CustomersApi(swagger_client.ApiClient(configuration))
body = swagger_client.CustomerPayload() # CustomerPayload | 

try:
    # Create a customer
    api_response = api_instance.customers_post(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomersApi->customers_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerPayload**](CustomerPayload.md)|  | 

### Return type

[**CustomerRecord**](CustomerRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


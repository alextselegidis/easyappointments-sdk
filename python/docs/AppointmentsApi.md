# swagger_client.AppointmentsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appointments_appointment_id_delete**](AppointmentsApi.md#appointments_appointment_id_delete) | **DELETE** /appointments/{appointmentId} | Delete an appointment
[**appointments_appointment_id_get**](AppointmentsApi.md#appointments_appointment_id_get) | **GET** /appointments/{appointmentId} | Get an appointment
[**appointments_appointment_id_put**](AppointmentsApi.md#appointments_appointment_id_put) | **PUT** /appointments/{appointmentId} | Update an appointment
[**appointments_get**](AppointmentsApi.md#appointments_get) | **GET** /appointments | Get all appointments
[**appointments_post**](AppointmentsApi.md#appointments_post) | **POST** /appointments | Create an appointment

# **appointments_appointment_id_delete**
> appointments_appointment_id_delete(appointment_id)

Delete an appointment

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
api_instance = swagger_client.AppointmentsApi(swagger_client.ApiClient(configuration))
appointment_id = 56 # int | 

try:
    # Delete an appointment
    api_instance.appointments_appointment_id_delete(appointment_id)
except ApiException as e:
    print("Exception when calling AppointmentsApi->appointments_appointment_id_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointment_id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **appointments_appointment_id_get**
> AppointmentRecord appointments_appointment_id_get(appointment_id)

Get an appointment

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
api_instance = swagger_client.AppointmentsApi(swagger_client.ApiClient(configuration))
appointment_id = 56 # int | 

try:
    # Get an appointment
    api_response = api_instance.appointments_appointment_id_get(appointment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppointmentsApi->appointments_appointment_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointment_id** | **int**|  | 

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **appointments_appointment_id_put**
> AppointmentRecord appointments_appointment_id_put(body, appointment_id)

Update an appointment

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
api_instance = swagger_client.AppointmentsApi(swagger_client.ApiClient(configuration))
body = swagger_client.AppointmentPayload() # AppointmentPayload | 
appointment_id = 56 # int | 

try:
    # Update an appointment
    api_response = api_instance.appointments_appointment_id_put(body, appointment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppointmentsApi->appointments_appointment_id_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentPayload**](AppointmentPayload.md)|  | 
 **appointment_id** | **int**|  | 

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **appointments_get**
> AppointmentCollection appointments_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with, aggregates=aggregates)

Get all appointments

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
api_instance = swagger_client.AppointmentsApi(swagger_client.ApiClient(configuration))
page = 56 # int |  (optional)
length = 56 # int |  (optional)
sort = 'sort_example' # str |  (optional)
q = 'q_example' # str |  (optional)
fields = 'fields_example' # str |  (optional)
_with = '_with_example' # str |  (optional)
aggregates = 'aggregates_example' # str |  (optional)

try:
    # Get all appointments
    api_response = api_instance.appointments_get(page=page, length=length, sort=sort, q=q, fields=fields, _with=_with, aggregates=aggregates)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppointmentsApi->appointments_get: %s\n" % e)
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
 **aggregates** | **str**|  | [optional] 

### Return type

[**AppointmentCollection**](AppointmentCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **appointments_post**
> AppointmentRecord appointments_post(body)

Create an appointment

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
api_instance = swagger_client.AppointmentsApi(swagger_client.ApiClient(configuration))
body = swagger_client.AppointmentPayload() # AppointmentPayload | 

try:
    # Create an appointment
    api_response = api_instance.appointments_post(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppointmentsApi->appointments_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentPayload**](AppointmentPayload.md)|  | 

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


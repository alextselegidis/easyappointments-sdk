# SwaggerClient::AppointmentsApi

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
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: BasicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

end

api_instance = SwaggerClient::AppointmentsApi.new
appointment_id = 56 # Integer | 


begin
  #Delete an appointment
  api_instance.appointments_appointment_id_delete(appointment_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AppointmentsApi->appointments_appointment_id_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointment_id** | **Integer**|  | 

### Return type

nil (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **appointments_appointment_id_get**
> AppointmentRecord appointments_appointment_id_get(appointment_id)

Get an appointment

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: BasicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

end

api_instance = SwaggerClient::AppointmentsApi.new
appointment_id = 56 # Integer | 


begin
  #Get an appointment
  result = api_instance.appointments_appointment_id_get(appointment_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AppointmentsApi->appointments_appointment_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointment_id** | **Integer**|  | 

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **appointments_appointment_id_put**
> AppointmentRecord appointments_appointment_id_put(bodyappointment_id)

Update an appointment

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: BasicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

end

api_instance = SwaggerClient::AppointmentsApi.new
body = SwaggerClient::AppointmentPayload.new # AppointmentPayload | 
appointment_id = 56 # Integer | 


begin
  #Update an appointment
  result = api_instance.appointments_appointment_id_put(bodyappointment_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AppointmentsApi->appointments_appointment_id_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentPayload**](AppointmentPayload.md)|  | 
 **appointment_id** | **Integer**|  | 

### Return type

[**AppointmentRecord**](AppointmentRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **appointments_get**
> AppointmentCollection appointments_get(opts)

Get all appointments

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: BasicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

end

api_instance = SwaggerClient::AppointmentsApi.new
opts = { 
  page: 56, # Integer | 
  length: 56, # Integer | 
  sort: 'sort_example', # String | 
  q: 'q_example', # String | 
  fields: 'fields_example', # String | 
  with: 'with_example', # String | 
  aggregates: 'aggregates_example' # String | 
}

begin
  #Get all appointments
  result = api_instance.appointments_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AppointmentsApi->appointments_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional] 
 **length** | **Integer**|  | [optional] 
 **sort** | **String**|  | [optional] 
 **q** | **String**|  | [optional] 
 **fields** | **String**|  | [optional] 
 **with** | **String**|  | [optional] 
 **aggregates** | **String**|  | [optional] 

### Return type

[**AppointmentCollection**](AppointmentCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **appointments_post**
> AppointmentRecord appointments_post(body)

Create an appointment

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: BasicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

end

api_instance = SwaggerClient::AppointmentsApi.new
body = SwaggerClient::AppointmentPayload.new # AppointmentPayload | 


begin
  #Create an appointment
  result = api_instance.appointments_post(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AppointmentsApi->appointments_post: #{e}"
end
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




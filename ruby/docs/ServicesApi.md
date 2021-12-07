# SwaggerClient::ServicesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**services_get**](ServicesApi.md#services_get) | **GET** /services | Get all services
[**services_post**](ServicesApi.md#services_post) | **POST** /services | Create a service
[**services_service_id_delete**](ServicesApi.md#services_service_id_delete) | **DELETE** /services/{serviceId} | Delete a service
[**services_service_id_get**](ServicesApi.md#services_service_id_get) | **GET** /services/{serviceId} | Get a service
[**services_service_id_put**](ServicesApi.md#services_service_id_put) | **PUT** /services/{serviceId} | Update a service

# **services_get**
> ServiceCollection services_get(opts)

Get all services

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

api_instance = SwaggerClient::ServicesApi.new
opts = { 
  page: 56, # Integer | 
  length: 56, # Integer | 
  sort: 'sort_example', # String | 
  q: 'q_example', # String | 
  fields: 'fields_example', # String | 
  with: 'with_example' # String | 
}

begin
  #Get all services
  result = api_instance.services_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServicesApi->services_get: #{e}"
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

### Return type

[**ServiceCollection**](ServiceCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **services_post**
> ServiceRecord services_post(body)

Create a service

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

api_instance = SwaggerClient::ServicesApi.new
body = SwaggerClient::ServicePayload.new # ServicePayload | 


begin
  #Create a service
  result = api_instance.services_post(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServicesApi->services_post: #{e}"
end
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



# **services_service_id_delete**
> services_service_id_delete(service_id)

Delete a service

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

api_instance = SwaggerClient::ServicesApi.new
service_id = 56 # Integer | 


begin
  #Delete a service
  api_instance.services_service_id_delete(service_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServicesApi->services_service_id_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service_id** | **Integer**|  | 

### Return type

nil (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **services_service_id_get**
> ServiceRecord services_service_id_get(service_id)

Get a service

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

api_instance = SwaggerClient::ServicesApi.new
service_id = 56 # Integer | 


begin
  #Get a service
  result = api_instance.services_service_id_get(service_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServicesApi->services_service_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service_id** | **Integer**|  | 

### Return type

[**ServiceRecord**](ServiceRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **services_service_id_put**
> ServiceRecord services_service_id_put(bodyservice_id)

Update a service

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

api_instance = SwaggerClient::ServicesApi.new
body = SwaggerClient::ServicePayload.new # ServicePayload | 
service_id = 56 # Integer | 


begin
  #Update a service
  result = api_instance.services_service_id_put(bodyservice_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServicesApi->services_service_id_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicePayload**](ServicePayload.md)|  | 
 **service_id** | **Integer**|  | 

### Return type

[**ServiceRecord**](ServiceRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




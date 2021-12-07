# SwaggerClient::SecretariesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secretaries_get**](SecretariesApi.md#secretaries_get) | **GET** /secretaries | Get all secretaries
[**secretaries_post**](SecretariesApi.md#secretaries_post) | **POST** /secretaries | Create a secretary
[**secretaries_secretary_id_delete**](SecretariesApi.md#secretaries_secretary_id_delete) | **DELETE** /secretaries/{secretaryId} | Delete a secretary
[**secretaries_secretary_id_get**](SecretariesApi.md#secretaries_secretary_id_get) | **GET** /secretaries/{secretaryId} | Get a secretary
[**secretaries_secretary_id_put**](SecretariesApi.md#secretaries_secretary_id_put) | **PUT** /secretaries/{secretaryId} | Update a secretary

# **secretaries_get**
> SecretaryCollection secretaries_get(opts)

Get all secretaries

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

api_instance = SwaggerClient::SecretariesApi.new
opts = { 
  page: 56, # Integer | 
  length: 56, # Integer | 
  sort: 'sort_example', # String | 
  q: 'q_example', # String | 
  fields: 'fields_example', # String | 
  with: 'with_example' # String | 
}

begin
  #Get all secretaries
  result = api_instance.secretaries_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecretariesApi->secretaries_get: #{e}"
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

[**SecretaryCollection**](SecretaryCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **secretaries_post**
> SecretaryRecord secretaries_post(body)

Create a secretary

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

api_instance = SwaggerClient::SecretariesApi.new
body = SwaggerClient::SecretaryPayload.new # SecretaryPayload | 


begin
  #Create a secretary
  result = api_instance.secretaries_post(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecretariesApi->secretaries_post: #{e}"
end
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



# **secretaries_secretary_id_delete**
> secretaries_secretary_id_delete(secretary_id)

Delete a secretary

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

api_instance = SwaggerClient::SecretariesApi.new
secretary_id = 56 # Integer | 


begin
  #Delete a secretary
  api_instance.secretaries_secretary_id_delete(secretary_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecretariesApi->secretaries_secretary_id_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretary_id** | **Integer**|  | 

### Return type

nil (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **secretaries_secretary_id_get**
> SecretaryRecord secretaries_secretary_id_get(secretary_id)

Get a secretary

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

api_instance = SwaggerClient::SecretariesApi.new
secretary_id = 56 # Integer | 


begin
  #Get a secretary
  result = api_instance.secretaries_secretary_id_get(secretary_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecretariesApi->secretaries_secretary_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretary_id** | **Integer**|  | 

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **secretaries_secretary_id_put**
> SecretaryRecord secretaries_secretary_id_put(bodysecretary_id)

Update a secretary

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

api_instance = SwaggerClient::SecretariesApi.new
body = SwaggerClient::SecretaryPayload.new # SecretaryPayload | 
secretary_id = 56 # Integer | 


begin
  #Update a secretary
  result = api_instance.secretaries_secretary_id_put(bodysecretary_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecretariesApi->secretaries_secretary_id_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecretaryPayload**](SecretaryPayload.md)|  | 
 **secretary_id** | **Integer**|  | 

### Return type

[**SecretaryRecord**](SecretaryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




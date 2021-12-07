# SwaggerClient::UnavailabilitiesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**unavailabilities_get**](UnavailabilitiesApi.md#unavailabilities_get) | **GET** /unavailabilities | Get all unavailabilities
[**unavailabilities_post**](UnavailabilitiesApi.md#unavailabilities_post) | **POST** /unavailabilities | Create an unavailability
[**unavailabilities_unavailability_id_delete**](UnavailabilitiesApi.md#unavailabilities_unavailability_id_delete) | **DELETE** /unavailabilities/{unavailabilityId} | Delete an unavailability
[**unavailabilities_unavailability_id_get**](UnavailabilitiesApi.md#unavailabilities_unavailability_id_get) | **GET** /unavailabilities/{unavailabilityId} | Get an unavailability
[**unavailabilities_unavailability_id_put**](UnavailabilitiesApi.md#unavailabilities_unavailability_id_put) | **PUT** /unavailabilities/{unavailabilityId} | Update an unavailability

# **unavailabilities_get**
> UnavailabilityCollection unavailabilities_get(opts)

Get all unavailabilities

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UnavailabilitiesApi.new
opts = { 
  page: 56, # Integer | 
  length: 56, # Integer | 
  sort: 'sort_example', # String | 
  q: 'q_example', # String | 
  fields: 'fields_example', # String | 
  with: 'with_example' # String | 
}

begin
  #Get all unavailabilities
  result = api_instance.unavailabilities_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UnavailabilitiesApi->unavailabilities_get: #{e}"
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

[**UnavailabilityCollection**](UnavailabilityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **unavailabilities_post**
> UnavailabilityRecord unavailabilities_post(body)

Create an unavailability

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

api_instance = SwaggerClient::UnavailabilitiesApi.new
body = SwaggerClient::UnavailabilityPayload.new # UnavailabilityPayload | 


begin
  #Create an unavailability
  result = api_instance.unavailabilities_post(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UnavailabilitiesApi->unavailabilities_post: #{e}"
end
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



# **unavailabilities_unavailability_id_delete**
> unavailabilities_unavailability_id_delete(unavailability_id)

Delete an unavailability

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

api_instance = SwaggerClient::UnavailabilitiesApi.new
unavailability_id = 56 # Integer | 


begin
  #Delete an unavailability
  api_instance.unavailabilities_unavailability_id_delete(unavailability_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UnavailabilitiesApi->unavailabilities_unavailability_id_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unavailability_id** | **Integer**|  | 

### Return type

nil (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **unavailabilities_unavailability_id_get**
> UnavailabilityRecord unavailabilities_unavailability_id_get(unavailability_id)

Get an unavailability

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

api_instance = SwaggerClient::UnavailabilitiesApi.new
unavailability_id = 56 # Integer | 


begin
  #Get an unavailability
  result = api_instance.unavailabilities_unavailability_id_get(unavailability_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UnavailabilitiesApi->unavailabilities_unavailability_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unavailability_id** | **Integer**|  | 

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **unavailabilities_unavailability_id_put**
> UnavailabilityRecord unavailabilities_unavailability_id_put(bodyunavailability_id)

Update an unavailability

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

api_instance = SwaggerClient::UnavailabilitiesApi.new
body = SwaggerClient::UnavailabilityPayload.new # UnavailabilityPayload | 
unavailability_id = 56 # Integer | 


begin
  #Update an unavailability
  result = api_instance.unavailabilities_unavailability_id_put(bodyunavailability_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UnavailabilitiesApi->unavailabilities_unavailability_id_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UnavailabilityPayload**](UnavailabilityPayload.md)|  | 
 **unavailability_id** | **Integer**|  | 

### Return type

[**UnavailabilityRecord**](UnavailabilityRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




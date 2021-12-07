# SwaggerClient::ProvidersApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**providers_get**](ProvidersApi.md#providers_get) | **GET** /providers | Get all providers
[**providers_post**](ProvidersApi.md#providers_post) | **POST** /providers | Create a provider
[**providers_provider_id_delete**](ProvidersApi.md#providers_provider_id_delete) | **DELETE** /providers/{providerId} | Delete a provider
[**providers_provider_id_get**](ProvidersApi.md#providers_provider_id_get) | **GET** /providers/{providerId} | Get a provider
[**providers_provider_id_put**](ProvidersApi.md#providers_provider_id_put) | **PUT** /providers/{providerId} | Update a provider

# **providers_get**
> ProviderCollection providers_get(opts)

Get all providers

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

api_instance = SwaggerClient::ProvidersApi.new
opts = { 
  page: 56, # Integer | 
  length: 56, # Integer | 
  sort: 'sort_example', # String | 
  q: 'q_example', # String | 
  fields: 'fields_example', # String | 
  with: 'with_example' # String | 
}

begin
  #Get all providers
  result = api_instance.providers_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProvidersApi->providers_get: #{e}"
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

[**ProviderCollection**](ProviderCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **providers_post**
> ProviderRecord providers_post(body)

Create a provider

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

api_instance = SwaggerClient::ProvidersApi.new
body = SwaggerClient::ProviderPayload.new # ProviderPayload | 


begin
  #Create a provider
  result = api_instance.providers_post(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProvidersApi->providers_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProviderPayload**](ProviderPayload.md)|  | 

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **providers_provider_id_delete**
> providers_provider_id_delete(provider_id)

Delete a provider

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

api_instance = SwaggerClient::ProvidersApi.new
provider_id = 56 # Integer | 


begin
  #Delete a provider
  api_instance.providers_provider_id_delete(provider_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProvidersApi->providers_provider_id_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **Integer**|  | 

### Return type

nil (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **providers_provider_id_get**
> ProviderRecord providers_provider_id_get(provider_id)

Get a provider

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

api_instance = SwaggerClient::ProvidersApi.new
provider_id = 56 # Integer | 


begin
  #Get a provider
  result = api_instance.providers_provider_id_get(provider_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProvidersApi->providers_provider_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **Integer**|  | 

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **providers_provider_id_put**
> ProviderRecord providers_provider_id_put(bodyprovider_id)

Update a provider

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

api_instance = SwaggerClient::ProvidersApi.new
body = SwaggerClient::ProviderPayload.new # ProviderPayload | 
provider_id = 56 # Integer | 


begin
  #Update a provider
  result = api_instance.providers_provider_id_put(bodyprovider_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProvidersApi->providers_provider_id_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProviderPayload**](ProviderPayload.md)|  | 
 **provider_id** | **Integer**|  | 

### Return type

[**ProviderRecord**](ProviderRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




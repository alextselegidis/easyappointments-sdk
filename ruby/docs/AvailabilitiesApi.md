# SwaggerClient::AvailabilitiesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**availabilities_get**](AvailabilitiesApi.md#availabilities_get) | **GET** /availabilities | Gets availability

# **availabilities_get**
> Availabilities availabilities_get(opts)

Gets availability

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

api_instance = SwaggerClient::AvailabilitiesApi.new
opts = { 
  provider_id: 56, # Integer | 
  service_id: 56, # Integer | 
  date: 'date_example' # String | 
}

begin
  #Gets availability
  result = api_instance.availabilities_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AvailabilitiesApi->availabilities_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **Integer**|  | [optional] 
 **service_id** | **Integer**|  | [optional] 
 **date** | **String**|  | [optional] 

### Return type

[**Availabilities**](Availabilities.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




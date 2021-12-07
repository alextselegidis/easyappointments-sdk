# SwaggerClient::CategoriesApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categories_category_id_delete**](CategoriesApi.md#categories_category_id_delete) | **DELETE** /categories/{categoryId} | Delete a category
[**categories_category_id_get**](CategoriesApi.md#categories_category_id_get) | **GET** /categories/{categoryId} | Get a category
[**categories_category_id_put**](CategoriesApi.md#categories_category_id_put) | **PUT** /categories/{categoryId} | Update a category
[**categories_get**](CategoriesApi.md#categories_get) | **GET** /categories | Get all categories
[**categories_post**](CategoriesApi.md#categories_post) | **POST** /categories | Create a category

# **categories_category_id_delete**
> categories_category_id_delete(category_id)

Delete a category

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

api_instance = SwaggerClient::CategoriesApi.new
category_id = 56 # Integer | 


begin
  #Delete a category
  api_instance.categories_category_id_delete(category_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoriesApi->categories_category_id_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **Integer**|  | 

### Return type

nil (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **categories_category_id_get**
> CategoryRecord categories_category_id_get(category_id)

Get a category

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

api_instance = SwaggerClient::CategoriesApi.new
category_id = 56 # Integer | 


begin
  #Get a category
  result = api_instance.categories_category_id_get(category_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoriesApi->categories_category_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **Integer**|  | 

### Return type

[**CategoryRecord**](CategoryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **categories_category_id_put**
> CategoryRecord categories_category_id_put(bodycategory_id)

Update a category

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

api_instance = SwaggerClient::CategoriesApi.new
body = SwaggerClient::CategoryPayload.new # CategoryPayload | 
category_id = 56 # Integer | 


begin
  #Update a category
  result = api_instance.categories_category_id_put(bodycategory_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoriesApi->categories_category_id_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryPayload**](CategoryPayload.md)|  | 
 **category_id** | **Integer**|  | 

### Return type

[**CategoryRecord**](CategoryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **categories_get**
> CategoryCollection categories_get(opts)

Get all categories

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

api_instance = SwaggerClient::CategoriesApi.new
opts = { 
  page: 56, # Integer | 
  length: 56, # Integer | 
  sort: 'sort_example', # String | 
  q: 'q_example', # String | 
  fields: 'fields_example', # String | 
  with: 'with_example' # String | 
}

begin
  #Get all categories
  result = api_instance.categories_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoriesApi->categories_get: #{e}"
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

[**CategoryCollection**](CategoryCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **categories_post**
> CategoryRecord categories_post(body)

Create a category

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

api_instance = SwaggerClient::CategoriesApi.new
body = SwaggerClient::CategoryPayload.new # CategoryPayload | 


begin
  #Create a category
  result = api_instance.categories_post(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoriesApi->categories_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryPayload**](CategoryPayload.md)|  | 

### Return type

[**CategoryRecord**](CategoryRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




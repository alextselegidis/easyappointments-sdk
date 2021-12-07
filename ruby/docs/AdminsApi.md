# SwaggerClient::AdminsApi

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
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: BasicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

end

api_instance = SwaggerClient::AdminsApi.new
admin_id = 56 # Integer | 


begin
  #Delete an admin
  api_instance.admins_admin_id_delete(admin_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminsApi->admins_admin_id_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **admin_id** | **Integer**|  | 

### Return type

nil (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **admins_admin_id_get**
> AdminRecord admins_admin_id_get(admin_id)

Get an admin

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

api_instance = SwaggerClient::AdminsApi.new
admin_id = 56 # Integer | 


begin
  #Get an admin
  result = api_instance.admins_admin_id_get(admin_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminsApi->admins_admin_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **admin_id** | **Integer**|  | 

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **admins_admin_id_put**
> AdminRecord admins_admin_id_put(bodyadmin_id)

Update an admin

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

api_instance = SwaggerClient::AdminsApi.new
body = SwaggerClient::AdminPayload.new # AdminPayload | 
admin_id = 56 # Integer | 


begin
  #Update an admin
  result = api_instance.admins_admin_id_put(bodyadmin_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminsApi->admins_admin_id_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminPayload**](AdminPayload.md)|  | 
 **admin_id** | **Integer**|  | 

### Return type

[**AdminRecord**](AdminRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **admins_get**
> AdminCollection admins_get(opts)

Get all admins

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

api_instance = SwaggerClient::AdminsApi.new
opts = { 
  page: 56, # Integer | 
  length: 56, # Integer | 
  sort: 'sort_example', # String | 
  q: 'q_example', # String | 
  fields: 'fields_example', # String | 
  with: 'with_example' # String | 
}

begin
  #Get all admins
  result = api_instance.admins_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminsApi->admins_get: #{e}"
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

[**AdminCollection**](AdminCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **admins_post**
> AdminRecord admins_post(body)

Create an admin

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

api_instance = SwaggerClient::AdminsApi.new
body = SwaggerClient::AdminPayload.new # AdminPayload | 


begin
  #Create an admin
  result = api_instance.admins_post(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminsApi->admins_post: #{e}"
end
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




# SwaggerClient::CustomersApi

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
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: BasicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

end

api_instance = SwaggerClient::CustomersApi.new
customer_id = 56 # Integer | 


begin
  #Delete a customer
  api_instance.customers_customer_id_delete(customer_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CustomersApi->customers_customer_id_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **Integer**|  | 

### Return type

nil (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **customers_customer_id_get**
> CustomerRecord customers_customer_id_get(customer_id)

Get a customer

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

api_instance = SwaggerClient::CustomersApi.new
customer_id = 56 # Integer | 


begin
  #Get a customer
  result = api_instance.customers_customer_id_get(customer_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CustomersApi->customers_customer_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **Integer**|  | 

### Return type

[**CustomerRecord**](CustomerRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **customers_customer_id_put**
> CustomerRecord customers_customer_id_put(bodycustomer_id)

Update a customer

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

api_instance = SwaggerClient::CustomersApi.new
body = SwaggerClient::CustomerPayload.new # CustomerPayload | 
customer_id = 56 # Integer | 


begin
  #Update a customer
  result = api_instance.customers_customer_id_put(bodycustomer_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CustomersApi->customers_customer_id_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerPayload**](CustomerPayload.md)|  | 
 **customer_id** | **Integer**|  | 

### Return type

[**CustomerRecord**](CustomerRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **customers_get**
> CustomerCollection customers_get(opts)

Get all customers

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

api_instance = SwaggerClient::CustomersApi.new
opts = { 
  page: 56, # Integer | 
  length: 56, # Integer | 
  sort: 'sort_example', # String | 
  q: 'q_example', # String | 
  fields: 'fields_example', # String | 
  with: 'with_example' # String | 
}

begin
  #Get all customers
  result = api_instance.customers_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CustomersApi->customers_get: #{e}"
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

[**CustomerCollection**](CustomerCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **customers_post**
> CustomerRecord customers_post(body)

Create a customer

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

api_instance = SwaggerClient::CustomersApi.new
body = SwaggerClient::CustomerPayload.new # CustomerPayload | 


begin
  #Create a customer
  result = api_instance.customers_post(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CustomersApi->customers_post: #{e}"
end
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




# SwaggerClient::SettingsApi

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**settings_get**](SettingsApi.md#settings_get) | **GET** /settings | Get all settings
[**settings_setting_name_get**](SettingsApi.md#settings_setting_name_get) | **GET** /settings/{settingName} | Get a setting
[**settings_setting_name_put**](SettingsApi.md#settings_setting_name_put) | **PUT** /settings/{settingName} | Update a setting

# **settings_get**
> SettingCollection settings_get(opts)

Get all settings

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

api_instance = SwaggerClient::SettingsApi.new
opts = { 
  page: 56, # Integer | 
  length: 56, # Integer | 
  sort: 'sort_example', # String | 
  q: 'q_example', # String | 
  fields: 'fields_example', # String | 
  with: 'with_example' # String | 
}

begin
  #Get all settings
  result = api_instance.settings_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SettingsApi->settings_get: #{e}"
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

[**SettingCollection**](SettingCollection.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **settings_setting_name_get**
> SettingRecord settings_setting_name_get(setting_name)

Get a setting

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

api_instance = SwaggerClient::SettingsApi.new
setting_name = 'setting_name_example' # String | 


begin
  #Get a setting
  result = api_instance.settings_setting_name_get(setting_name)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SettingsApi->settings_setting_name_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setting_name** | **String**|  | 

### Return type

[**SettingRecord**](SettingRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **settings_setting_name_put**
> SettingRecord settings_setting_name_put(bodysetting_name)

Update a setting

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

api_instance = SwaggerClient::SettingsApi.new
body = SwaggerClient::SettingPayload.new # SettingPayload | 
setting_name = 'setting_name_example' # String | 


begin
  #Update a setting
  result = api_instance.settings_setting_name_put(bodysetting_name)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SettingsApi->settings_setting_name_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SettingPayload**](SettingPayload.md)|  | 
 **setting_name** | **String**|  | 

### Return type

[**SettingRecord**](SettingRecord.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




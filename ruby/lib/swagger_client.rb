=begin
#Easy!Appointments API

#These are the OpenAPI specs that describe the REST API of Easy!Appointments.

OpenAPI spec version: 1.0.0
Contact: info@easyappointments.org
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.30
=end

# Common files
require 'swagger_client/api_client'
require 'swagger_client/api_error'
require 'swagger_client/version'
require 'swagger_client/configuration'

# Models
require 'swagger_client/models/admin_collection'
require 'swagger_client/models/admin_payload'
require 'swagger_client/models/admin_record'
require 'swagger_client/models/admin_record_settings'
require 'swagger_client/models/appointment_collection'
require 'swagger_client/models/appointment_payload'
require 'swagger_client/models/appointment_record'
require 'swagger_client/models/availabilities'
require 'swagger_client/models/category_collection'
require 'swagger_client/models/category_payload'
require 'swagger_client/models/category_record'
require 'swagger_client/models/customer_collection'
require 'swagger_client/models/customer_payload'
require 'swagger_client/models/customer_record'
require 'swagger_client/models/error_response'
require 'swagger_client/models/provider_collection'
require 'swagger_client/models/provider_payload'
require 'swagger_client/models/provider_payload_settings'
require 'swagger_client/models/provider_record'
require 'swagger_client/models/provider_record_settings'
require 'swagger_client/models/secretary_collection'
require 'swagger_client/models/secretary_payload'
require 'swagger_client/models/secretary_record'
require 'swagger_client/models/service_collection'
require 'swagger_client/models/service_payload'
require 'swagger_client/models/service_record'
require 'swagger_client/models/setting_collection'
require 'swagger_client/models/setting_payload'
require 'swagger_client/models/setting_record'
require 'swagger_client/models/unavailability_collection'
require 'swagger_client/models/unavailability_payload'
require 'swagger_client/models/unavailability_record'

# APIs
require 'swagger_client/api/admins_api'
require 'swagger_client/api/appointments_api'
require 'swagger_client/api/availabilities_api'
require 'swagger_client/api/categories_api'
require 'swagger_client/api/customers_api'
require 'swagger_client/api/providers_api'
require 'swagger_client/api/secretaries_api'
require 'swagger_client/api/services_api'
require 'swagger_client/api/settings_api'
require 'swagger_client/api/unavailabilities_api'

module SwaggerClient
  class << self
    # Customize default settings for the SDK using block.
    #   SwaggerClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
=begin
#Easy!Appointments API

#These are the OpenAPI specs that describe the REST API of Easy!Appointments.

OpenAPI spec version: 1.0.0
Contact: info@easyappointments.org
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.30
=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::AppointmentCollection
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AppointmentCollection' do
  before do
    # run before each test
    @instance = SwaggerClient::AppointmentCollection.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AppointmentCollection' do
    it 'should create an instance of AppointmentCollection' do
      expect(@instance).to be_instance_of(SwaggerClient::AppointmentCollection)
    end
  end
end

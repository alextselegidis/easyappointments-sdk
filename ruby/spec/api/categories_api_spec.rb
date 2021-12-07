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

# Unit tests for SwaggerClient::CategoriesApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CategoriesApi' do
  before do
    # run before each test
    @instance = SwaggerClient::CategoriesApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CategoriesApi' do
    it 'should create an instance of CategoriesApi' do
      expect(@instance).to be_instance_of(SwaggerClient::CategoriesApi)
    end
  end

  # unit tests for categories_category_id_delete
  # Delete a category
  # @param category_id 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'categories_category_id_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for categories_category_id_get
  # Get a category
  # @param category_id 
  # @param [Hash] opts the optional parameters
  # @return [CategoryRecord]
  describe 'categories_category_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for categories_category_id_put
  # Update a category
  # @param body 
  # @param category_id 
  # @param [Hash] opts the optional parameters
  # @return [CategoryRecord]
  describe 'categories_category_id_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for categories_get
  # Get all categories
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page 
  # @option opts [Integer] :length 
  # @option opts [String] :sort 
  # @option opts [String] :q 
  # @option opts [String] :fields 
  # @option opts [String] :with 
  # @return [CategoryCollection]
  describe 'categories_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for categories_post
  # Create a category
  # @param body 
  # @param [Hash] opts the optional parameters
  # @return [CategoryRecord]
  describe 'categories_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
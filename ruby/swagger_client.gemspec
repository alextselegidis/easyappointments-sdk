# -*- encoding: utf-8 -*-

=begin
#Easy!Appointments API

#These are the OpenAPI specs that describe the REST API of Easy!Appointments.

OpenAPI spec version: 1.0.0
Contact: info@easyappointments.org
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.30
=end

$:.push File.expand_path("../lib", __FILE__)
require "swagger_client/version"

Gem::Specification.new do |s|
  s.name        = "swagger_client"
  s.version     = SwaggerClient::VERSION
  s.platform    = Gem::Platform::RUBY
  s.authors     = ["Swagger-Codegen"]
  s.email       = ["info@easyappointments.org"]
  s.homepage    = "https://github.com/swagger-api/swagger-codegen"
  s.summary     = "Easy!Appointments API Ruby Gem"
  s.description = "These are the OpenAPI specs that describe the REST API of Easy!Appointments."
  s.license     = "Unlicense"
  s.required_ruby_version = ">= 1.9"

  s.add_runtime_dependency 'typhoeus', '~> 1.0', '>= 1.0.1'
  s.add_runtime_dependency 'json', '~> 2.1', '>= 2.1.0'

  s.add_development_dependency 'rspec', '~> 3.6', '>= 3.6.0'

  s.files         = `find *`.split("\n").uniq.sort.select { |f| !f.empty? }
  s.test_files    = `find spec/*`.split("\n")
  s.executables   = []
  s.require_paths = ["lib"]
end
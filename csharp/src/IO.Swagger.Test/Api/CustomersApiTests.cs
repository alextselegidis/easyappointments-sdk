/* 
 * Easy!Appointments API
 *
 * These are the OpenAPI specs that describe the REST API of Easy!Appointments.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@easyappointments.org
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing CustomersApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class CustomersApiTests
    {
        private CustomersApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new CustomersApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CustomersApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' CustomersApi
            //Assert.IsInstanceOfType(typeof(CustomersApi), instance, "instance is a CustomersApi");
        }

        /// <summary>
        /// Test CustomersCustomerIdDelete
        /// </summary>
        [Test]
        public void CustomersCustomerIdDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? customerId = null;
            //instance.CustomersCustomerIdDelete(customerId);
            
        }
        /// <summary>
        /// Test CustomersCustomerIdGet
        /// </summary>
        [Test]
        public void CustomersCustomerIdGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? customerId = null;
            //var response = instance.CustomersCustomerIdGet(customerId);
            //Assert.IsInstanceOf<CustomerRecord> (response, "response is CustomerRecord");
        }
        /// <summary>
        /// Test CustomersCustomerIdPut
        /// </summary>
        [Test]
        public void CustomersCustomerIdPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CustomerPayload body = null;
            //int? customerId = null;
            //var response = instance.CustomersCustomerIdPut(body, customerId);
            //Assert.IsInstanceOf<CustomerRecord> (response, "response is CustomerRecord");
        }
        /// <summary>
        /// Test CustomersGet
        /// </summary>
        [Test]
        public void CustomersGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? length = null;
            //string sort = null;
            //string q = null;
            //string fields = null;
            //string with = null;
            //var response = instance.CustomersGet(page, length, sort, q, fields, with);
            //Assert.IsInstanceOf<CustomerCollection> (response, "response is CustomerCollection");
        }
        /// <summary>
        /// Test CustomersPost
        /// </summary>
        [Test]
        public void CustomersPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CustomerPayload body = null;
            //var response = instance.CustomersPost(body);
            //Assert.IsInstanceOf<CustomerRecord> (response, "response is CustomerRecord");
        }
    }

}

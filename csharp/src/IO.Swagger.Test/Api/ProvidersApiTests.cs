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
    ///  Class for testing ProvidersApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ProvidersApiTests
    {
        private ProvidersApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ProvidersApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ProvidersApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ProvidersApi
            //Assert.IsInstanceOfType(typeof(ProvidersApi), instance, "instance is a ProvidersApi");
        }

        /// <summary>
        /// Test ProvidersGet
        /// </summary>
        [Test]
        public void ProvidersGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? length = null;
            //string sort = null;
            //string q = null;
            //string fields = null;
            //string with = null;
            //var response = instance.ProvidersGet(page, length, sort, q, fields, with);
            //Assert.IsInstanceOf<ProviderCollection> (response, "response is ProviderCollection");
        }
        /// <summary>
        /// Test ProvidersPost
        /// </summary>
        [Test]
        public void ProvidersPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ProviderPayload body = null;
            //var response = instance.ProvidersPost(body);
            //Assert.IsInstanceOf<ProviderRecord> (response, "response is ProviderRecord");
        }
        /// <summary>
        /// Test ProvidersProviderIdDelete
        /// </summary>
        [Test]
        public void ProvidersProviderIdDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? providerId = null;
            //instance.ProvidersProviderIdDelete(providerId);
            
        }
        /// <summary>
        /// Test ProvidersProviderIdGet
        /// </summary>
        [Test]
        public void ProvidersProviderIdGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? providerId = null;
            //var response = instance.ProvidersProviderIdGet(providerId);
            //Assert.IsInstanceOf<ProviderRecord> (response, "response is ProviderRecord");
        }
        /// <summary>
        /// Test ProvidersProviderIdPut
        /// </summary>
        [Test]
        public void ProvidersProviderIdPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ProviderPayload body = null;
            //int? providerId = null;
            //var response = instance.ProvidersProviderIdPut(body, providerId);
            //Assert.IsInstanceOf<ProviderRecord> (response, "response is ProviderRecord");
        }
    }

}

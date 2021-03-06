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
    ///  Class for testing SecretariesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class SecretariesApiTests
    {
        private SecretariesApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new SecretariesApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of SecretariesApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' SecretariesApi
            //Assert.IsInstanceOfType(typeof(SecretariesApi), instance, "instance is a SecretariesApi");
        }

        /// <summary>
        /// Test SecretariesGet
        /// </summary>
        [Test]
        public void SecretariesGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? length = null;
            //string sort = null;
            //string q = null;
            //string fields = null;
            //string with = null;
            //var response = instance.SecretariesGet(page, length, sort, q, fields, with);
            //Assert.IsInstanceOf<SecretaryCollection> (response, "response is SecretaryCollection");
        }
        /// <summary>
        /// Test SecretariesPost
        /// </summary>
        [Test]
        public void SecretariesPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //SecretaryPayload body = null;
            //var response = instance.SecretariesPost(body);
            //Assert.IsInstanceOf<SecretaryRecord> (response, "response is SecretaryRecord");
        }
        /// <summary>
        /// Test SecretariesSecretaryIdDelete
        /// </summary>
        [Test]
        public void SecretariesSecretaryIdDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? secretaryId = null;
            //instance.SecretariesSecretaryIdDelete(secretaryId);
            
        }
        /// <summary>
        /// Test SecretariesSecretaryIdGet
        /// </summary>
        [Test]
        public void SecretariesSecretaryIdGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? secretaryId = null;
            //var response = instance.SecretariesSecretaryIdGet(secretaryId);
            //Assert.IsInstanceOf<SecretaryRecord> (response, "response is SecretaryRecord");
        }
        /// <summary>
        /// Test SecretariesSecretaryIdPut
        /// </summary>
        [Test]
        public void SecretariesSecretaryIdPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //SecretaryPayload body = null;
            //int? secretaryId = null;
            //var response = instance.SecretariesSecretaryIdPut(body, secretaryId);
            //Assert.IsInstanceOf<SecretaryRecord> (response, "response is SecretaryRecord");
        }
    }

}

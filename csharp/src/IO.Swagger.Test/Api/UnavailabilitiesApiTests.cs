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
    ///  Class for testing UnavailabilitiesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class UnavailabilitiesApiTests
    {
        private UnavailabilitiesApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new UnavailabilitiesApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of UnavailabilitiesApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' UnavailabilitiesApi
            //Assert.IsInstanceOfType(typeof(UnavailabilitiesApi), instance, "instance is a UnavailabilitiesApi");
        }

        /// <summary>
        /// Test UnavailabilitiesGet
        /// </summary>
        [Test]
        public void UnavailabilitiesGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? length = null;
            //string sort = null;
            //string q = null;
            //string fields = null;
            //string with = null;
            //var response = instance.UnavailabilitiesGet(page, length, sort, q, fields, with);
            //Assert.IsInstanceOf<UnavailabilityCollection> (response, "response is UnavailabilityCollection");
        }
        /// <summary>
        /// Test UnavailabilitiesPost
        /// </summary>
        [Test]
        public void UnavailabilitiesPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //UnavailabilityPayload body = null;
            //var response = instance.UnavailabilitiesPost(body);
            //Assert.IsInstanceOf<UnavailabilityRecord> (response, "response is UnavailabilityRecord");
        }
        /// <summary>
        /// Test UnavailabilitiesUnavailabilityIdDelete
        /// </summary>
        [Test]
        public void UnavailabilitiesUnavailabilityIdDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? unavailabilityId = null;
            //instance.UnavailabilitiesUnavailabilityIdDelete(unavailabilityId);
            
        }
        /// <summary>
        /// Test UnavailabilitiesUnavailabilityIdGet
        /// </summary>
        [Test]
        public void UnavailabilitiesUnavailabilityIdGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? unavailabilityId = null;
            //var response = instance.UnavailabilitiesUnavailabilityIdGet(unavailabilityId);
            //Assert.IsInstanceOf<UnavailabilityRecord> (response, "response is UnavailabilityRecord");
        }
        /// <summary>
        /// Test UnavailabilitiesUnavailabilityIdPut
        /// </summary>
        [Test]
        public void UnavailabilitiesUnavailabilityIdPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //UnavailabilityPayload body = null;
            //int? unavailabilityId = null;
            //var response = instance.UnavailabilitiesUnavailabilityIdPut(body, unavailabilityId);
            //Assert.IsInstanceOf<UnavailabilityRecord> (response, "response is UnavailabilityRecord");
        }
    }

}

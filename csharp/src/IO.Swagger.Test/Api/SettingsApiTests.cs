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
    ///  Class for testing SettingsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class SettingsApiTests
    {
        private SettingsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new SettingsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of SettingsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' SettingsApi
            //Assert.IsInstanceOfType(typeof(SettingsApi), instance, "instance is a SettingsApi");
        }

        /// <summary>
        /// Test SettingsGet
        /// </summary>
        [Test]
        public void SettingsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? length = null;
            //string sort = null;
            //string q = null;
            //string fields = null;
            //string with = null;
            //var response = instance.SettingsGet(page, length, sort, q, fields, with);
            //Assert.IsInstanceOf<SettingCollection> (response, "response is SettingCollection");
        }
        /// <summary>
        /// Test SettingsSettingNameGet
        /// </summary>
        [Test]
        public void SettingsSettingNameGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string settingName = null;
            //var response = instance.SettingsSettingNameGet(settingName);
            //Assert.IsInstanceOf<SettingRecord> (response, "response is SettingRecord");
        }
        /// <summary>
        /// Test SettingsSettingNamePut
        /// </summary>
        [Test]
        public void SettingsSettingNamePutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //SettingPayload body = null;
            //string settingName = null;
            //var response = instance.SettingsSettingNamePut(body, settingName);
            //Assert.IsInstanceOf<SettingRecord> (response, "response is SettingRecord");
        }
    }

}

/*
 * Easy!Appointments API
 * These are the OpenAPI specs that describe the REST API of Easy!Appointments.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@easyappointments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.30
 *
 * Do not edit the class manually.
 *
 */
(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.EasyappointmentsApi);
  }
}(this, function(expect, EasyappointmentsApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('UnavailabilityCollection', function() {
      beforeEach(function() {
        instance = new EasyappointmentsApi.UnavailabilityCollection();
      });

      it('should create an instance of UnavailabilityCollection', function() {
        // TODO: update the code to test UnavailabilityCollection
        expect(instance).to.be.a(EasyappointmentsApi.UnavailabilityCollection);
      });

    });
  });

}));

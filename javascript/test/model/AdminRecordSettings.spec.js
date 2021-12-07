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
    describe('AdminRecordSettings', function() {
      beforeEach(function() {
        instance = new EasyappointmentsApi.AdminRecordSettings();
      });

      it('should create an instance of AdminRecordSettings', function() {
        // TODO: update the code to test AdminRecordSettings
        expect(instance).to.be.a(EasyappointmentsApi.AdminRecordSettings);
      });

      it('should have the property username (base name: "username")', function() {
        // TODO: update the code to test the property username
        expect(instance).to.have.property('username');
        // expect(instance.username).to.be(expectedValueLiteral);
      });

      it('should have the property password (base name: "password")', function() {
        // TODO: update the code to test the property password
        expect(instance).to.have.property('password');
        // expect(instance.password).to.be(expectedValueLiteral);
      });

      it('should have the property notifications (base name: "notifications")', function() {
        // TODO: update the code to test the property notifications
        expect(instance).to.have.property('notifications');
        // expect(instance.notifications).to.be(expectedValueLiteral);
      });

      it('should have the property calendarView (base name: "calendarView")', function() {
        // TODO: update the code to test the property calendarView
        expect(instance).to.have.property('calendarView');
        // expect(instance.calendarView).to.be(expectedValueLiteral);
      });

    });
  });

}));
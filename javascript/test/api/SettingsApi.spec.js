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

  beforeEach(function() {
    instance = new EasyappointmentsApi.SettingsApi();
  });

  describe('(package)', function() {
    describe('SettingsApi', function() {
      describe('settingsGet', function() {
        it('should call settingsGet successfully', function(done) {
          // TODO: uncomment, update parameter values for settingsGet call and complete the assertions
          /*
          var opts = {};

          instance.settingsGet(opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EasyappointmentsApi.SettingCollection);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('settingsSettingNameGet', function() {
        it('should call settingsSettingNameGet successfully', function(done) {
          // TODO: uncomment, update parameter values for settingsSettingNameGet call and complete the assertions
          /*

          instance.settingsSettingNameGet(settingName, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EasyappointmentsApi.SettingRecord);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('settingsSettingNamePut', function() {
        it('should call settingsSettingNamePut successfully', function(done) {
          // TODO: uncomment, update parameter values for settingsSettingNamePut call and complete the assertions
          /*

          instance.settingsSettingNamePut(body, settingName, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EasyappointmentsApi.SettingRecord);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));

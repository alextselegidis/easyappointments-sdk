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
    instance = new EasyappointmentsApi.CategoriesApi();
  });

  describe('(package)', function() {
    describe('CategoriesApi', function() {
      describe('categoriesCategoryIdDelete', function() {
        it('should call categoriesCategoryIdDelete successfully', function(done) {
          // TODO: uncomment, update parameter values for categoriesCategoryIdDelete call
          /*

          instance.categoriesCategoryIdDelete(categoryId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('categoriesCategoryIdGet', function() {
        it('should call categoriesCategoryIdGet successfully', function(done) {
          // TODO: uncomment, update parameter values for categoriesCategoryIdGet call and complete the assertions
          /*

          instance.categoriesCategoryIdGet(categoryId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EasyappointmentsApi.CategoryRecord);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('categoriesCategoryIdPut', function() {
        it('should call categoriesCategoryIdPut successfully', function(done) {
          // TODO: uncomment, update parameter values for categoriesCategoryIdPut call and complete the assertions
          /*

          instance.categoriesCategoryIdPut(body, categoryId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EasyappointmentsApi.CategoryRecord);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('categoriesGet', function() {
        it('should call categoriesGet successfully', function(done) {
          // TODO: uncomment, update parameter values for categoriesGet call and complete the assertions
          /*
          var opts = {};

          instance.categoriesGet(opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EasyappointmentsApi.CategoryCollection);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('categoriesPost', function() {
        it('should call categoriesPost successfully', function(done) {
          // TODO: uncomment, update parameter values for categoriesPost call and complete the assertions
          /*

          instance.categoriesPost(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EasyappointmentsApi.CategoryRecord);

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
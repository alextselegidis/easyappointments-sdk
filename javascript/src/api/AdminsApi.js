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
import {ApiClient} from "../ApiClient";
import {AdminCollection} from '../model/AdminCollection';
import {AdminPayload} from '../model/AdminPayload';
import {AdminRecord} from '../model/AdminRecord';
import {ErrorResponse} from '../model/ErrorResponse';

/**
* Admins service.
* @module api/AdminsApi
* @version 1.0.0
*/
export class AdminsApi {

    /**
    * Constructs a new AdminsApi. 
    * @alias module:api/AdminsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the adminsAdminIdDelete operation.
     * @callback moduleapi/AdminsApi~adminsAdminIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete an admin
     * @param {Number} adminId 
     * @param {module:api/AdminsApi~adminsAdminIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    adminsAdminIdDelete(adminId, callback) {
      
      let postBody = null;
      // verify the required parameter 'adminId' is set
      if (adminId === undefined || adminId === null) {
        throw new Error("Missing the required parameter 'adminId' when calling adminsAdminIdDelete");
      }

      let pathParams = {
        'adminId': adminId
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['BasicAuth', 'BearerToken'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = null;

      return this.apiClient.callApi(
        '/admins/{adminId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the adminsAdminIdGet operation.
     * @callback moduleapi/AdminsApi~adminsAdminIdGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AdminRecord{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get an admin
     * @param {Number} adminId 
     * @param {module:api/AdminsApi~adminsAdminIdGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    adminsAdminIdGet(adminId, callback) {
      
      let postBody = null;
      // verify the required parameter 'adminId' is set
      if (adminId === undefined || adminId === null) {
        throw new Error("Missing the required parameter 'adminId' when calling adminsAdminIdGet");
      }

      let pathParams = {
        'adminId': adminId
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['BasicAuth', 'BearerToken'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AdminRecord;

      return this.apiClient.callApi(
        '/admins/{adminId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the adminsAdminIdPut operation.
     * @callback moduleapi/AdminsApi~adminsAdminIdPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AdminRecord{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update an admin
     * @param {module:model/AdminPayload} body 
     * @param {Number} adminId 
     * @param {module:api/AdminsApi~adminsAdminIdPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    adminsAdminIdPut(body, adminId, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling adminsAdminIdPut");
      }
      // verify the required parameter 'adminId' is set
      if (adminId === undefined || adminId === null) {
        throw new Error("Missing the required parameter 'adminId' when calling adminsAdminIdPut");
      }

      let pathParams = {
        'adminId': adminId
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['BasicAuth', 'BearerToken'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = AdminRecord;

      return this.apiClient.callApi(
        '/admins/{adminId}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the adminsGet operation.
     * @callback moduleapi/AdminsApi~adminsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AdminCollection{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all admins
     * @param {Object} opts Optional parameters
     * @param {Number} opts.page 
     * @param {Number} opts.length 
     * @param {String} opts.sort 
     * @param {String} opts.q 
     * @param {String} opts.fields 
     * @param {String} opts._with 
     * @param {module:api/AdminsApi~adminsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    adminsGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        'page': opts['page'],'length': opts['length'],'sort': opts['sort'],'q': opts['q'],'fields': opts['fields'],'with': opts['_with']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['BasicAuth', 'BearerToken'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AdminCollection;

      return this.apiClient.callApi(
        '/admins', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the adminsPost operation.
     * @callback moduleapi/AdminsApi~adminsPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AdminRecord{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create an admin
     * @param {module:model/AdminPayload} body 
     * @param {module:api/AdminsApi~adminsPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    adminsPost(body, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling adminsPost");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['BasicAuth', 'BearerToken'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = AdminRecord;

      return this.apiClient.callApi(
        '/admins', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
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
import {Availabilities} from '../model/Availabilities';
import {ErrorResponse} from '../model/ErrorResponse';

/**
* Availabilities service.
* @module api/AvailabilitiesApi
* @version 1.0.0
*/
export class AvailabilitiesApi {

    /**
    * Constructs a new AvailabilitiesApi. 
    * @alias module:api/AvailabilitiesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the availabilitiesGet operation.
     * @callback moduleapi/AvailabilitiesApi~availabilitiesGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Availabilities{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets availability
     * @param {Object} opts Optional parameters
     * @param {Number} opts.providerId 
     * @param {Number} opts.serviceId 
     * @param {String} opts._date 
     * @param {module:api/AvailabilitiesApi~availabilitiesGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    availabilitiesGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        'providerId': opts['providerId'],'serviceId': opts['serviceId'],'date': opts['_date']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['BasicAuth', 'BearerToken'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Availabilities;

      return this.apiClient.callApi(
        '/availabilities', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
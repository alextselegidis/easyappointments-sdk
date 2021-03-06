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
import {ApiClient} from '../ApiClient';
import {AdminRecord} from './AdminRecord';

/**
 * The AdminCollection model module.
 * @module model/AdminCollection
 * @version 1.0.0
 */
export class AdminCollection extends Array {
  /**
   * Constructs a new <code>AdminCollection</code>.
   * @alias module:model/AdminCollection
   * @class
   * @extends Array
   */
  constructor() {
    super();
  }

  /**
   * Constructs a <code>AdminCollection</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdminCollection} obj Optional instance to populate.
   * @return {module:model/AdminCollection} The populated <code>AdminCollection</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdminCollection();
      ApiClient.constructFromObject(data, obj, 'AdminRecord');
    }
    return obj;
  }
}

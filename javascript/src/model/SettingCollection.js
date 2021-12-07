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
import {SettingRecord} from './SettingRecord';

/**
 * The SettingCollection model module.
 * @module model/SettingCollection
 * @version 1.0.0
 */
export class SettingCollection extends Array {
  /**
   * Constructs a new <code>SettingCollection</code>.
   * @alias module:model/SettingCollection
   * @class
   * @extends Array
   */
  constructor() {
    super();
  }

  /**
   * Constructs a <code>SettingCollection</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SettingCollection} obj Optional instance to populate.
   * @return {module:model/SettingCollection} The populated <code>SettingCollection</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SettingCollection();
      ApiClient.constructFromObject(data, obj, 'SettingRecord');
    }
    return obj;
  }
}

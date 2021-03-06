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

/**
 * The SettingPayload model module.
 * @module model/SettingPayload
 * @version 1.0.0
 */
export class SettingPayload {
  /**
   * Constructs a new <code>SettingPayload</code>.
   * @alias module:model/SettingPayload
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SettingPayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SettingPayload} obj Optional instance to populate.
   * @return {module:model/SettingPayload} The populated <code>SettingPayload</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SettingPayload();
      if (data.hasOwnProperty('value'))
        obj.value = ApiClient.convertToType(data['value'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} value
 */
SettingPayload.prototype.value = undefined;


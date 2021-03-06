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
import {AdminRecordSettings} from './AdminRecordSettings';

/**
 * The AdminRecord model module.
 * @module model/AdminRecord
 * @version 1.0.0
 */
export class AdminRecord {
  /**
   * Constructs a new <code>AdminRecord</code>.
   * @alias module:model/AdminRecord
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdminRecord</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdminRecord} obj Optional instance to populate.
   * @return {module:model/AdminRecord} The populated <code>AdminRecord</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdminRecord();
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
      if (data.hasOwnProperty('firstName'))
        obj.firstName = ApiClient.convertToType(data['firstName'], 'String');
      if (data.hasOwnProperty('lastName'))
        obj.lastName = ApiClient.convertToType(data['lastName'], 'String');
      if (data.hasOwnProperty('email'))
        obj.email = ApiClient.convertToType(data['email'], 'String');
      if (data.hasOwnProperty('mobile'))
        obj.mobile = ApiClient.convertToType(data['mobile'], 'String');
      if (data.hasOwnProperty('phone'))
        obj.phone = ApiClient.convertToType(data['phone'], 'String');
      if (data.hasOwnProperty('address'))
        obj.address = ApiClient.convertToType(data['address'], 'String');
      if (data.hasOwnProperty('city'))
        obj.city = ApiClient.convertToType(data['city'], 'String');
      if (data.hasOwnProperty('zip'))
        obj.zip = ApiClient.convertToType(data['zip'], 'String');
      if (data.hasOwnProperty('notes'))
        obj.notes = ApiClient.convertToType(data['notes'], 'String');
      if (data.hasOwnProperty('timezone'))
        obj.timezone = ApiClient.convertToType(data['timezone'], 'String');
      if (data.hasOwnProperty('settings'))
        obj.settings = AdminRecordSettings.constructFromObject(data['settings']);
    }
    return obj;
  }
}

/**
 * @member {Number} id
 */
AdminRecord.prototype.id = undefined;

/**
 * @member {String} firstName
 */
AdminRecord.prototype.firstName = undefined;

/**
 * @member {String} lastName
 */
AdminRecord.prototype.lastName = undefined;

/**
 * @member {String} email
 */
AdminRecord.prototype.email = undefined;

/**
 * @member {String} mobile
 */
AdminRecord.prototype.mobile = undefined;

/**
 * @member {String} phone
 */
AdminRecord.prototype.phone = undefined;

/**
 * @member {String} address
 */
AdminRecord.prototype.address = undefined;

/**
 * @member {String} city
 */
AdminRecord.prototype.city = undefined;

/**
 * @member {String} zip
 */
AdminRecord.prototype.zip = undefined;

/**
 * @member {String} notes
 */
AdminRecord.prototype.notes = undefined;

/**
 * @member {String} timezone
 */
AdminRecord.prototype.timezone = undefined;

/**
 * @member {module:model/AdminRecordSettings} settings
 */
AdminRecord.prototype.settings = undefined;


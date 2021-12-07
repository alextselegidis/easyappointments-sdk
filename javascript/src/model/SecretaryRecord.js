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
 * The SecretaryRecord model module.
 * @module model/SecretaryRecord
 * @version 1.0.0
 */
export class SecretaryRecord {
  /**
   * Constructs a new <code>SecretaryRecord</code>.
   * @alias module:model/SecretaryRecord
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SecretaryRecord</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SecretaryRecord} obj Optional instance to populate.
   * @return {module:model/SecretaryRecord} The populated <code>SecretaryRecord</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SecretaryRecord();
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
      if (data.hasOwnProperty('language'))
        obj.language = ApiClient.convertToType(data['language'], 'String');
      if (data.hasOwnProperty('providers'))
        obj.providers = ApiClient.convertToType(data['providers'], ['Number']);
      if (data.hasOwnProperty('settings'))
        obj.settings = AdminRecordSettings.constructFromObject(data['settings']);
    }
    return obj;
  }
}

/**
 * @member {Number} id
 */
SecretaryRecord.prototype.id = undefined;

/**
 * @member {String} firstName
 */
SecretaryRecord.prototype.firstName = undefined;

/**
 * @member {String} lastName
 */
SecretaryRecord.prototype.lastName = undefined;

/**
 * @member {String} email
 */
SecretaryRecord.prototype.email = undefined;

/**
 * @member {String} mobile
 */
SecretaryRecord.prototype.mobile = undefined;

/**
 * @member {String} phone
 */
SecretaryRecord.prototype.phone = undefined;

/**
 * @member {String} address
 */
SecretaryRecord.prototype.address = undefined;

/**
 * @member {String} city
 */
SecretaryRecord.prototype.city = undefined;

/**
 * @member {String} zip
 */
SecretaryRecord.prototype.zip = undefined;

/**
 * @member {String} notes
 */
SecretaryRecord.prototype.notes = undefined;

/**
 * @member {String} timezone
 */
SecretaryRecord.prototype.timezone = undefined;

/**
 * @member {String} language
 */
SecretaryRecord.prototype.language = undefined;

/**
 * @member {Array.<Number>} providers
 */
SecretaryRecord.prototype.providers = undefined;

/**
 * @member {module:model/AdminRecordSettings} settings
 */
SecretaryRecord.prototype.settings = undefined;


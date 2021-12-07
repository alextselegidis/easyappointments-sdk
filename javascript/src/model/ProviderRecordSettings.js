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
 * The ProviderRecordSettings model module.
 * @module model/ProviderRecordSettings
 * @version 1.0.0
 */
export class ProviderRecordSettings {
  /**
   * Constructs a new <code>ProviderRecordSettings</code>.
   * @alias module:model/ProviderRecordSettings
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ProviderRecordSettings</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ProviderRecordSettings} obj Optional instance to populate.
   * @return {module:model/ProviderRecordSettings} The populated <code>ProviderRecordSettings</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ProviderRecordSettings();
      if (data.hasOwnProperty('username'))
        obj.username = ApiClient.convertToType(data['username'], 'String');
      if (data.hasOwnProperty('password'))
        obj.password = ApiClient.convertToType(data['password'], 'String');
      if (data.hasOwnProperty('notifications'))
        obj.notifications = ApiClient.convertToType(data['notifications'], 'Boolean');
      if (data.hasOwnProperty('calendarView'))
        obj.calendarView = ApiClient.convertToType(data['calendarView'], 'String');
      if (data.hasOwnProperty('googleSync'))
        obj.googleSync = ApiClient.convertToType(data['googleSync'], 'Boolean');
      if (data.hasOwnProperty('googleCalendar'))
        obj.googleCalendar = ApiClient.convertToType(data['googleCalendar'], 'String');
      if (data.hasOwnProperty('googleToken'))
        obj.googleToken = ApiClient.convertToType(data['googleToken'], 'String');
      if (data.hasOwnProperty('syncFutureDays'))
        obj.syncFutureDays = ApiClient.convertToType(data['syncFutureDays'], 'String');
      if (data.hasOwnProperty('syncPastDays'))
        obj.syncPastDays = ApiClient.convertToType(data['syncPastDays'], 'String');
      if (data.hasOwnProperty('workingPlan'))
        obj.workingPlan = ApiClient.convertToType(data['workingPlan'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} username
 */
ProviderRecordSettings.prototype.username = undefined;

/**
 * @member {String} password
 */
ProviderRecordSettings.prototype.password = undefined;

/**
 * @member {Boolean} notifications
 */
ProviderRecordSettings.prototype.notifications = undefined;

/**
 * @member {String} calendarView
 */
ProviderRecordSettings.prototype.calendarView = undefined;

/**
 * @member {Boolean} googleSync
 */
ProviderRecordSettings.prototype.googleSync = undefined;

/**
 * @member {String} googleCalendar
 */
ProviderRecordSettings.prototype.googleCalendar = undefined;

/**
 * @member {String} googleToken
 */
ProviderRecordSettings.prototype.googleToken = undefined;

/**
 * @member {String} syncFutureDays
 */
ProviderRecordSettings.prototype.syncFutureDays = undefined;

/**
 * @member {String} syncPastDays
 */
ProviderRecordSettings.prototype.syncPastDays = undefined;

/**
 * @member {String} workingPlan
 */
ProviderRecordSettings.prototype.workingPlan = undefined;


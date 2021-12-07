/*
 * Easy!Appointments API
 * These are the OpenAPI specs that describe the REST API of Easy!Appointments.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@easyappointments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.SettingCollection;
import io.swagger.client.model.SettingPayload;
import io.swagger.client.model.SettingRecord;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SettingsApi
 */
@Ignore
public class SettingsApiTest {

    private final SettingsApi api = new SettingsApi();

    /**
     * Get all settings
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void settingsGetTest() throws Exception {
        Integer page = null;
        Integer length = null;
        String sort = null;
        String q = null;
        String fields = null;
        String with = null;
        SettingCollection response = api.settingsGet(page, length, sort, q, fields, with);

        // TODO: test validations
    }
    /**
     * Get a setting
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void settingsSettingNameGetTest() throws Exception {
        String settingName = null;
        SettingRecord response = api.settingsSettingNameGet(settingName);

        // TODO: test validations
    }
    /**
     * Update a setting
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void settingsSettingNamePutTest() throws Exception {
        SettingPayload body = null;
        String settingName = null;
        SettingRecord response = api.settingsSettingNamePut(body, settingName);

        // TODO: test validations
    }
}

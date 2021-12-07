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

import io.swagger.client.model.Availabilities;
import io.swagger.client.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AvailabilitiesApi
 */
@Ignore
public class AvailabilitiesApiTest {

    private final AvailabilitiesApi api = new AvailabilitiesApi();

    /**
     * Gets availability
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void availabilitiesGetTest() throws Exception {
        Integer providerId = null;
        Integer serviceId = null;
        String date = null;
        Availabilities response = api.availabilitiesGet(providerId, serviceId, date);

        // TODO: test validations
    }
}
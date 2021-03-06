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

import io.swagger.client.model.AppointmentCollection;
import io.swagger.client.model.AppointmentPayload;
import io.swagger.client.model.AppointmentRecord;
import io.swagger.client.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AppointmentsApi
 */
@Ignore
public class AppointmentsApiTest {

    private final AppointmentsApi api = new AppointmentsApi();

    /**
     * Delete an appointment
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void appointmentsAppointmentIdDeleteTest() throws Exception {
        Integer appointmentId = null;
        api.appointmentsAppointmentIdDelete(appointmentId);

        // TODO: test validations
    }
    /**
     * Get an appointment
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void appointmentsAppointmentIdGetTest() throws Exception {
        Integer appointmentId = null;
        AppointmentRecord response = api.appointmentsAppointmentIdGet(appointmentId);

        // TODO: test validations
    }
    /**
     * Update an appointment
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void appointmentsAppointmentIdPutTest() throws Exception {
        AppointmentPayload body = null;
        Integer appointmentId = null;
        AppointmentRecord response = api.appointmentsAppointmentIdPut(body, appointmentId);

        // TODO: test validations
    }
    /**
     * Get all appointments
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void appointmentsGetTest() throws Exception {
        Integer page = null;
        Integer length = null;
        String sort = null;
        String q = null;
        String fields = null;
        String with = null;
        String aggregates = null;
        AppointmentCollection response = api.appointmentsGet(page, length, sort, q, fields, with, aggregates);

        // TODO: test validations
    }
    /**
     * Create an appointment
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void appointmentsPostTest() throws Exception {
        AppointmentPayload body = null;
        AppointmentRecord response = api.appointmentsPost(body);

        // TODO: test validations
    }
}

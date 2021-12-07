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

import io.swagger.client.model.CategoryCollection;
import io.swagger.client.model.CategoryPayload;
import io.swagger.client.model.CategoryRecord;
import io.swagger.client.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CategoriesApi
 */
@Ignore
public class CategoriesApiTest {

    private final CategoriesApi api = new CategoriesApi();

    /**
     * Delete a category
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void categoriesCategoryIdDeleteTest() throws Exception {
        Integer categoryId = null;
        api.categoriesCategoryIdDelete(categoryId);

        // TODO: test validations
    }
    /**
     * Get a category
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void categoriesCategoryIdGetTest() throws Exception {
        Integer categoryId = null;
        CategoryRecord response = api.categoriesCategoryIdGet(categoryId);

        // TODO: test validations
    }
    /**
     * Update a category
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void categoriesCategoryIdPutTest() throws Exception {
        CategoryPayload body = null;
        Integer categoryId = null;
        CategoryRecord response = api.categoriesCategoryIdPut(body, categoryId);

        // TODO: test validations
    }
    /**
     * Get all categories
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void categoriesGetTest() throws Exception {
        Integer page = null;
        Integer length = null;
        String sort = null;
        String q = null;
        String fields = null;
        String with = null;
        CategoryCollection response = api.categoriesGet(page, length, sort, q, fields, with);

        // TODO: test validations
    }
    /**
     * Create a category
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void categoriesPostTest() throws Exception {
        CategoryPayload body = null;
        CategoryRecord response = api.categoriesPost(body);

        // TODO: test validations
    }
}
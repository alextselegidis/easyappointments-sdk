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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AppointmentCollection;
import io.swagger.client.model.AppointmentPayload;
import io.swagger.client.model.AppointmentRecord;
import io.swagger.client.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppointmentsApi {
    private ApiClient apiClient;

    public AppointmentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AppointmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for appointmentsAppointmentIdDelete
     * @param appointmentId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call appointmentsAppointmentIdDeleteCall(Integer appointmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/appointments/{appointmentId}"
            .replaceAll("\\{" + "appointmentId" + "\\}", apiClient.escapeString(appointmentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerToken" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call appointmentsAppointmentIdDeleteValidateBeforeCall(Integer appointmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'appointmentId' is set
        if (appointmentId == null) {
            throw new ApiException("Missing the required parameter 'appointmentId' when calling appointmentsAppointmentIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = appointmentsAppointmentIdDeleteCall(appointmentId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete an appointment
     * 
     * @param appointmentId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void appointmentsAppointmentIdDelete(Integer appointmentId) throws ApiException {
        appointmentsAppointmentIdDeleteWithHttpInfo(appointmentId);
    }

    /**
     * Delete an appointment
     * 
     * @param appointmentId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> appointmentsAppointmentIdDeleteWithHttpInfo(Integer appointmentId) throws ApiException {
        com.squareup.okhttp.Call call = appointmentsAppointmentIdDeleteValidateBeforeCall(appointmentId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete an appointment (asynchronously)
     * 
     * @param appointmentId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call appointmentsAppointmentIdDeleteAsync(Integer appointmentId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = appointmentsAppointmentIdDeleteValidateBeforeCall(appointmentId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for appointmentsAppointmentIdGet
     * @param appointmentId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call appointmentsAppointmentIdGetCall(Integer appointmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/appointments/{appointmentId}"
            .replaceAll("\\{" + "appointmentId" + "\\}", apiClient.escapeString(appointmentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call appointmentsAppointmentIdGetValidateBeforeCall(Integer appointmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'appointmentId' is set
        if (appointmentId == null) {
            throw new ApiException("Missing the required parameter 'appointmentId' when calling appointmentsAppointmentIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = appointmentsAppointmentIdGetCall(appointmentId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get an appointment
     * 
     * @param appointmentId  (required)
     * @return AppointmentRecord
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AppointmentRecord appointmentsAppointmentIdGet(Integer appointmentId) throws ApiException {
        ApiResponse<AppointmentRecord> resp = appointmentsAppointmentIdGetWithHttpInfo(appointmentId);
        return resp.getData();
    }

    /**
     * Get an appointment
     * 
     * @param appointmentId  (required)
     * @return ApiResponse&lt;AppointmentRecord&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AppointmentRecord> appointmentsAppointmentIdGetWithHttpInfo(Integer appointmentId) throws ApiException {
        com.squareup.okhttp.Call call = appointmentsAppointmentIdGetValidateBeforeCall(appointmentId, null, null);
        Type localVarReturnType = new TypeToken<AppointmentRecord>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an appointment (asynchronously)
     * 
     * @param appointmentId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call appointmentsAppointmentIdGetAsync(Integer appointmentId, final ApiCallback<AppointmentRecord> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = appointmentsAppointmentIdGetValidateBeforeCall(appointmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AppointmentRecord>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for appointmentsAppointmentIdPut
     * @param body  (required)
     * @param appointmentId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call appointmentsAppointmentIdPutCall(AppointmentPayload body, Integer appointmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/appointments/{appointmentId}"
            .replaceAll("\\{" + "appointmentId" + "\\}", apiClient.escapeString(appointmentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerToken" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call appointmentsAppointmentIdPutValidateBeforeCall(AppointmentPayload body, Integer appointmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling appointmentsAppointmentIdPut(Async)");
        }
        // verify the required parameter 'appointmentId' is set
        if (appointmentId == null) {
            throw new ApiException("Missing the required parameter 'appointmentId' when calling appointmentsAppointmentIdPut(Async)");
        }
        
        com.squareup.okhttp.Call call = appointmentsAppointmentIdPutCall(body, appointmentId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update an appointment
     * 
     * @param body  (required)
     * @param appointmentId  (required)
     * @return AppointmentRecord
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AppointmentRecord appointmentsAppointmentIdPut(AppointmentPayload body, Integer appointmentId) throws ApiException {
        ApiResponse<AppointmentRecord> resp = appointmentsAppointmentIdPutWithHttpInfo(body, appointmentId);
        return resp.getData();
    }

    /**
     * Update an appointment
     * 
     * @param body  (required)
     * @param appointmentId  (required)
     * @return ApiResponse&lt;AppointmentRecord&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AppointmentRecord> appointmentsAppointmentIdPutWithHttpInfo(AppointmentPayload body, Integer appointmentId) throws ApiException {
        com.squareup.okhttp.Call call = appointmentsAppointmentIdPutValidateBeforeCall(body, appointmentId, null, null);
        Type localVarReturnType = new TypeToken<AppointmentRecord>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an appointment (asynchronously)
     * 
     * @param body  (required)
     * @param appointmentId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call appointmentsAppointmentIdPutAsync(AppointmentPayload body, Integer appointmentId, final ApiCallback<AppointmentRecord> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = appointmentsAppointmentIdPutValidateBeforeCall(body, appointmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AppointmentRecord>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for appointmentsGet
     * @param page  (optional)
     * @param length  (optional)
     * @param sort  (optional)
     * @param q  (optional)
     * @param fields  (optional)
     * @param with  (optional)
     * @param aggregates  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call appointmentsGetCall(Integer page, Integer length, String sort, String q, String fields, String with, String aggregates, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/appointments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (length != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("length", length));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
        if (with != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("with", with));
        if (aggregates != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("aggregates", aggregates));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call appointmentsGetValidateBeforeCall(Integer page, Integer length, String sort, String q, String fields, String with, String aggregates, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = appointmentsGetCall(page, length, sort, q, fields, with, aggregates, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all appointments
     * 
     * @param page  (optional)
     * @param length  (optional)
     * @param sort  (optional)
     * @param q  (optional)
     * @param fields  (optional)
     * @param with  (optional)
     * @param aggregates  (optional)
     * @return AppointmentCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AppointmentCollection appointmentsGet(Integer page, Integer length, String sort, String q, String fields, String with, String aggregates) throws ApiException {
        ApiResponse<AppointmentCollection> resp = appointmentsGetWithHttpInfo(page, length, sort, q, fields, with, aggregates);
        return resp.getData();
    }

    /**
     * Get all appointments
     * 
     * @param page  (optional)
     * @param length  (optional)
     * @param sort  (optional)
     * @param q  (optional)
     * @param fields  (optional)
     * @param with  (optional)
     * @param aggregates  (optional)
     * @return ApiResponse&lt;AppointmentCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AppointmentCollection> appointmentsGetWithHttpInfo(Integer page, Integer length, String sort, String q, String fields, String with, String aggregates) throws ApiException {
        com.squareup.okhttp.Call call = appointmentsGetValidateBeforeCall(page, length, sort, q, fields, with, aggregates, null, null);
        Type localVarReturnType = new TypeToken<AppointmentCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all appointments (asynchronously)
     * 
     * @param page  (optional)
     * @param length  (optional)
     * @param sort  (optional)
     * @param q  (optional)
     * @param fields  (optional)
     * @param with  (optional)
     * @param aggregates  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call appointmentsGetAsync(Integer page, Integer length, String sort, String q, String fields, String with, String aggregates, final ApiCallback<AppointmentCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = appointmentsGetValidateBeforeCall(page, length, sort, q, fields, with, aggregates, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AppointmentCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for appointmentsPost
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call appointmentsPostCall(AppointmentPayload body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/appointments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "BearerToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call appointmentsPostValidateBeforeCall(AppointmentPayload body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling appointmentsPost(Async)");
        }
        
        com.squareup.okhttp.Call call = appointmentsPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create an appointment
     * 
     * @param body  (required)
     * @return AppointmentRecord
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AppointmentRecord appointmentsPost(AppointmentPayload body) throws ApiException {
        ApiResponse<AppointmentRecord> resp = appointmentsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create an appointment
     * 
     * @param body  (required)
     * @return ApiResponse&lt;AppointmentRecord&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AppointmentRecord> appointmentsPostWithHttpInfo(AppointmentPayload body) throws ApiException {
        com.squareup.okhttp.Call call = appointmentsPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<AppointmentRecord>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create an appointment (asynchronously)
     * 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call appointmentsPostAsync(AppointmentPayload body, final ApiCallback<AppointmentRecord> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = appointmentsPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AppointmentRecord>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
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


import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.SecretaryCollection;
import io.swagger.client.model.SecretaryPayload;
import io.swagger.client.model.SecretaryRecord;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecretariesApi {
    private ApiClient apiClient;

    public SecretariesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecretariesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for secretariesGet
     * @param page  (optional)
     * @param length  (optional)
     * @param sort  (optional)
     * @param q  (optional)
     * @param fields  (optional)
     * @param with  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secretariesGetCall(Integer page, Integer length, String sort, String q, String fields, String with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/secretaries";

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
    private com.squareup.okhttp.Call secretariesGetValidateBeforeCall(Integer page, Integer length, String sort, String q, String fields, String with, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = secretariesGetCall(page, length, sort, q, fields, with, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all secretaries
     * 
     * @param page  (optional)
     * @param length  (optional)
     * @param sort  (optional)
     * @param q  (optional)
     * @param fields  (optional)
     * @param with  (optional)
     * @return SecretaryCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecretaryCollection secretariesGet(Integer page, Integer length, String sort, String q, String fields, String with) throws ApiException {
        ApiResponse<SecretaryCollection> resp = secretariesGetWithHttpInfo(page, length, sort, q, fields, with);
        return resp.getData();
    }

    /**
     * Get all secretaries
     * 
     * @param page  (optional)
     * @param length  (optional)
     * @param sort  (optional)
     * @param q  (optional)
     * @param fields  (optional)
     * @param with  (optional)
     * @return ApiResponse&lt;SecretaryCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecretaryCollection> secretariesGetWithHttpInfo(Integer page, Integer length, String sort, String q, String fields, String with) throws ApiException {
        com.squareup.okhttp.Call call = secretariesGetValidateBeforeCall(page, length, sort, q, fields, with, null, null);
        Type localVarReturnType = new TypeToken<SecretaryCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all secretaries (asynchronously)
     * 
     * @param page  (optional)
     * @param length  (optional)
     * @param sort  (optional)
     * @param q  (optional)
     * @param fields  (optional)
     * @param with  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secretariesGetAsync(Integer page, Integer length, String sort, String q, String fields, String with, final ApiCallback<SecretaryCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secretariesGetValidateBeforeCall(page, length, sort, q, fields, with, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecretaryCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secretariesPost
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secretariesPostCall(SecretaryPayload body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/secretaries";

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
    private com.squareup.okhttp.Call secretariesPostValidateBeforeCall(SecretaryPayload body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling secretariesPost(Async)");
        }
        
        com.squareup.okhttp.Call call = secretariesPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a secretary
     * 
     * @param body  (required)
     * @return SecretaryRecord
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecretaryRecord secretariesPost(SecretaryPayload body) throws ApiException {
        ApiResponse<SecretaryRecord> resp = secretariesPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create a secretary
     * 
     * @param body  (required)
     * @return ApiResponse&lt;SecretaryRecord&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecretaryRecord> secretariesPostWithHttpInfo(SecretaryPayload body) throws ApiException {
        com.squareup.okhttp.Call call = secretariesPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SecretaryRecord>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a secretary (asynchronously)
     * 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secretariesPostAsync(SecretaryPayload body, final ApiCallback<SecretaryRecord> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secretariesPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecretaryRecord>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secretariesSecretaryIdDelete
     * @param secretaryId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secretariesSecretaryIdDeleteCall(Integer secretaryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/secretaries/{secretaryId}"
            .replaceAll("\\{" + "secretaryId" + "\\}", apiClient.escapeString(secretaryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call secretariesSecretaryIdDeleteValidateBeforeCall(Integer secretaryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'secretaryId' is set
        if (secretaryId == null) {
            throw new ApiException("Missing the required parameter 'secretaryId' when calling secretariesSecretaryIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = secretariesSecretaryIdDeleteCall(secretaryId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a secretary
     * 
     * @param secretaryId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void secretariesSecretaryIdDelete(Integer secretaryId) throws ApiException {
        secretariesSecretaryIdDeleteWithHttpInfo(secretaryId);
    }

    /**
     * Delete a secretary
     * 
     * @param secretaryId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> secretariesSecretaryIdDeleteWithHttpInfo(Integer secretaryId) throws ApiException {
        com.squareup.okhttp.Call call = secretariesSecretaryIdDeleteValidateBeforeCall(secretaryId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a secretary (asynchronously)
     * 
     * @param secretaryId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secretariesSecretaryIdDeleteAsync(Integer secretaryId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secretariesSecretaryIdDeleteValidateBeforeCall(secretaryId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for secretariesSecretaryIdGet
     * @param secretaryId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secretariesSecretaryIdGetCall(Integer secretaryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/secretaries/{secretaryId}"
            .replaceAll("\\{" + "secretaryId" + "\\}", apiClient.escapeString(secretaryId.toString()));

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
    private com.squareup.okhttp.Call secretariesSecretaryIdGetValidateBeforeCall(Integer secretaryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'secretaryId' is set
        if (secretaryId == null) {
            throw new ApiException("Missing the required parameter 'secretaryId' when calling secretariesSecretaryIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = secretariesSecretaryIdGetCall(secretaryId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a secretary
     * 
     * @param secretaryId  (required)
     * @return SecretaryRecord
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecretaryRecord secretariesSecretaryIdGet(Integer secretaryId) throws ApiException {
        ApiResponse<SecretaryRecord> resp = secretariesSecretaryIdGetWithHttpInfo(secretaryId);
        return resp.getData();
    }

    /**
     * Get a secretary
     * 
     * @param secretaryId  (required)
     * @return ApiResponse&lt;SecretaryRecord&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecretaryRecord> secretariesSecretaryIdGetWithHttpInfo(Integer secretaryId) throws ApiException {
        com.squareup.okhttp.Call call = secretariesSecretaryIdGetValidateBeforeCall(secretaryId, null, null);
        Type localVarReturnType = new TypeToken<SecretaryRecord>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a secretary (asynchronously)
     * 
     * @param secretaryId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secretariesSecretaryIdGetAsync(Integer secretaryId, final ApiCallback<SecretaryRecord> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secretariesSecretaryIdGetValidateBeforeCall(secretaryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecretaryRecord>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secretariesSecretaryIdPut
     * @param body  (required)
     * @param secretaryId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secretariesSecretaryIdPutCall(SecretaryPayload body, Integer secretaryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/secretaries/{secretaryId}"
            .replaceAll("\\{" + "secretaryId" + "\\}", apiClient.escapeString(secretaryId.toString()));

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
    private com.squareup.okhttp.Call secretariesSecretaryIdPutValidateBeforeCall(SecretaryPayload body, Integer secretaryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling secretariesSecretaryIdPut(Async)");
        }
        // verify the required parameter 'secretaryId' is set
        if (secretaryId == null) {
            throw new ApiException("Missing the required parameter 'secretaryId' when calling secretariesSecretaryIdPut(Async)");
        }
        
        com.squareup.okhttp.Call call = secretariesSecretaryIdPutCall(body, secretaryId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a secretary
     * 
     * @param body  (required)
     * @param secretaryId  (required)
     * @return SecretaryRecord
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecretaryRecord secretariesSecretaryIdPut(SecretaryPayload body, Integer secretaryId) throws ApiException {
        ApiResponse<SecretaryRecord> resp = secretariesSecretaryIdPutWithHttpInfo(body, secretaryId);
        return resp.getData();
    }

    /**
     * Update a secretary
     * 
     * @param body  (required)
     * @param secretaryId  (required)
     * @return ApiResponse&lt;SecretaryRecord&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecretaryRecord> secretariesSecretaryIdPutWithHttpInfo(SecretaryPayload body, Integer secretaryId) throws ApiException {
        com.squareup.okhttp.Call call = secretariesSecretaryIdPutValidateBeforeCall(body, secretaryId, null, null);
        Type localVarReturnType = new TypeToken<SecretaryRecord>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a secretary (asynchronously)
     * 
     * @param body  (required)
     * @param secretaryId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secretariesSecretaryIdPutAsync(SecretaryPayload body, Integer secretaryId, final ApiCallback<SecretaryRecord> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secretariesSecretaryIdPutValidateBeforeCall(body, secretaryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecretaryRecord>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

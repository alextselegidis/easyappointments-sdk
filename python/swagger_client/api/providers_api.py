# coding: utf-8

"""
    Easy!Appointments API

    These are the OpenAPI specs that describe the REST API of Easy!Appointments.  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@easyappointments.org
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class ProvidersApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def providers_get(self, **kwargs):  # noqa: E501
        """Get all providers  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.providers_get(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int page:
        :param int length:
        :param str sort:
        :param str q:
        :param str fields:
        :param str _with:
        :return: ProviderCollection
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.providers_get_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.providers_get_with_http_info(**kwargs)  # noqa: E501
            return data

    def providers_get_with_http_info(self, **kwargs):  # noqa: E501
        """Get all providers  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.providers_get_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int page:
        :param int length:
        :param str sort:
        :param str q:
        :param str fields:
        :param str _with:
        :return: ProviderCollection
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['page', 'length', 'sort', 'q', 'fields', '_with']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method providers_get" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'length' in params:
            query_params.append(('length', params['length']))  # noqa: E501
        if 'sort' in params:
            query_params.append(('sort', params['sort']))  # noqa: E501
        if 'q' in params:
            query_params.append(('q', params['q']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('fields', params['fields']))  # noqa: E501
        if '_with' in params:
            query_params.append(('with', params['_with']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['BasicAuth', 'BearerToken']  # noqa: E501

        return self.api_client.call_api(
            '/providers', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ProviderCollection',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def providers_post(self, body, **kwargs):  # noqa: E501
        """Create a provider  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.providers_post(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ProviderPayload body: (required)
        :return: ProviderRecord
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.providers_post_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.providers_post_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def providers_post_with_http_info(self, body, **kwargs):  # noqa: E501
        """Create a provider  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.providers_post_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ProviderPayload body: (required)
        :return: ProviderRecord
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method providers_post" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `providers_post`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['BasicAuth', 'BearerToken']  # noqa: E501

        return self.api_client.call_api(
            '/providers', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ProviderRecord',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def providers_provider_id_delete(self, provider_id, **kwargs):  # noqa: E501
        """Delete a provider  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.providers_provider_id_delete(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int provider_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.providers_provider_id_delete_with_http_info(provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.providers_provider_id_delete_with_http_info(provider_id, **kwargs)  # noqa: E501
            return data

    def providers_provider_id_delete_with_http_info(self, provider_id, **kwargs):  # noqa: E501
        """Delete a provider  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.providers_provider_id_delete_with_http_info(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int provider_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method providers_provider_id_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `providers_provider_id_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'provider_id' in params:
            path_params['providerId'] = params['provider_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['BasicAuth', 'BearerToken']  # noqa: E501

        return self.api_client.call_api(
            '/providers/{providerId}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def providers_provider_id_get(self, provider_id, **kwargs):  # noqa: E501
        """Get a provider  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.providers_provider_id_get(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int provider_id: (required)
        :return: ProviderRecord
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.providers_provider_id_get_with_http_info(provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.providers_provider_id_get_with_http_info(provider_id, **kwargs)  # noqa: E501
            return data

    def providers_provider_id_get_with_http_info(self, provider_id, **kwargs):  # noqa: E501
        """Get a provider  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.providers_provider_id_get_with_http_info(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int provider_id: (required)
        :return: ProviderRecord
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method providers_provider_id_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `providers_provider_id_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'provider_id' in params:
            path_params['providerId'] = params['provider_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['BasicAuth', 'BearerToken']  # noqa: E501

        return self.api_client.call_api(
            '/providers/{providerId}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ProviderRecord',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def providers_provider_id_put(self, body, provider_id, **kwargs):  # noqa: E501
        """Update a provider  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.providers_provider_id_put(body, provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ProviderPayload body: (required)
        :param int provider_id: (required)
        :return: ProviderRecord
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.providers_provider_id_put_with_http_info(body, provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.providers_provider_id_put_with_http_info(body, provider_id, **kwargs)  # noqa: E501
            return data

    def providers_provider_id_put_with_http_info(self, body, provider_id, **kwargs):  # noqa: E501
        """Update a provider  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.providers_provider_id_put_with_http_info(body, provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ProviderPayload body: (required)
        :param int provider_id: (required)
        :return: ProviderRecord
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method providers_provider_id_put" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `providers_provider_id_put`")  # noqa: E501
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `providers_provider_id_put`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'provider_id' in params:
            path_params['providerId'] = params['provider_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['BasicAuth', 'BearerToken']  # noqa: E501

        return self.api_client.call_api(
            '/providers/{providerId}', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ProviderRecord',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

# coding: utf-8

"""
    Easy!Appointments API

    These are the OpenAPI specs that describe the REST API of Easy!Appointments.  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@easyappointments.org
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.secretaries_api import SecretariesApi  # noqa: E501
from swagger_client.rest import ApiException


class TestSecretariesApi(unittest.TestCase):
    """SecretariesApi unit test stubs"""

    def setUp(self):
        self.api = SecretariesApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_secretaries_get(self):
        """Test case for secretaries_get

        Get all secretaries  # noqa: E501
        """
        pass

    def test_secretaries_post(self):
        """Test case for secretaries_post

        Create a secretary  # noqa: E501
        """
        pass

    def test_secretaries_secretary_id_delete(self):
        """Test case for secretaries_secretary_id_delete

        Delete a secretary  # noqa: E501
        """
        pass

    def test_secretaries_secretary_id_get(self):
        """Test case for secretaries_secretary_id_get

        Get a secretary  # noqa: E501
        """
        pass

    def test_secretaries_secretary_id_put(self):
        """Test case for secretaries_secretary_id_put

        Update a secretary  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()

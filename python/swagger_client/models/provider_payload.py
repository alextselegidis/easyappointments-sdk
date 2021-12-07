# coding: utf-8

"""
    Easy!Appointments API

    These are the OpenAPI specs that describe the REST API of Easy!Appointments.  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@easyappointments.org
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class ProviderPayload(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'first_name': 'str',
        'last_name': 'str',
        'email': 'str',
        'mobile': 'str',
        'phone': 'str',
        'address': 'str',
        'city': 'str',
        'zip': 'str',
        'notes': 'str',
        'timezone': 'str',
        'language': 'str',
        'services': 'list[int]',
        'settings': 'ProviderPayloadSettings'
    }

    attribute_map = {
        'first_name': 'firstName',
        'last_name': 'lastName',
        'email': 'email',
        'mobile': 'mobile',
        'phone': 'phone',
        'address': 'address',
        'city': 'city',
        'zip': 'zip',
        'notes': 'notes',
        'timezone': 'timezone',
        'language': 'language',
        'services': 'services',
        'settings': 'settings'
    }

    def __init__(self, first_name=None, last_name=None, email=None, mobile=None, phone=None, address=None, city=None, zip=None, notes=None, timezone=None, language=None, services=None, settings=None):  # noqa: E501
        """ProviderPayload - a model defined in Swagger"""  # noqa: E501
        self._first_name = None
        self._last_name = None
        self._email = None
        self._mobile = None
        self._phone = None
        self._address = None
        self._city = None
        self._zip = None
        self._notes = None
        self._timezone = None
        self._language = None
        self._services = None
        self._settings = None
        self.discriminator = None
        if first_name is not None:
            self.first_name = first_name
        if last_name is not None:
            self.last_name = last_name
        if email is not None:
            self.email = email
        if mobile is not None:
            self.mobile = mobile
        if phone is not None:
            self.phone = phone
        if address is not None:
            self.address = address
        if city is not None:
            self.city = city
        if zip is not None:
            self.zip = zip
        if notes is not None:
            self.notes = notes
        if timezone is not None:
            self.timezone = timezone
        if language is not None:
            self.language = language
        if services is not None:
            self.services = services
        if settings is not None:
            self.settings = settings

    @property
    def first_name(self):
        """Gets the first_name of this ProviderPayload.  # noqa: E501


        :return: The first_name of this ProviderPayload.  # noqa: E501
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """Sets the first_name of this ProviderPayload.


        :param first_name: The first_name of this ProviderPayload.  # noqa: E501
        :type: str
        """

        self._first_name = first_name

    @property
    def last_name(self):
        """Gets the last_name of this ProviderPayload.  # noqa: E501


        :return: The last_name of this ProviderPayload.  # noqa: E501
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        """Sets the last_name of this ProviderPayload.


        :param last_name: The last_name of this ProviderPayload.  # noqa: E501
        :type: str
        """

        self._last_name = last_name

    @property
    def email(self):
        """Gets the email of this ProviderPayload.  # noqa: E501


        :return: The email of this ProviderPayload.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this ProviderPayload.


        :param email: The email of this ProviderPayload.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def mobile(self):
        """Gets the mobile of this ProviderPayload.  # noqa: E501


        :return: The mobile of this ProviderPayload.  # noqa: E501
        :rtype: str
        """
        return self._mobile

    @mobile.setter
    def mobile(self, mobile):
        """Sets the mobile of this ProviderPayload.


        :param mobile: The mobile of this ProviderPayload.  # noqa: E501
        :type: str
        """

        self._mobile = mobile

    @property
    def phone(self):
        """Gets the phone of this ProviderPayload.  # noqa: E501


        :return: The phone of this ProviderPayload.  # noqa: E501
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone):
        """Sets the phone of this ProviderPayload.


        :param phone: The phone of this ProviderPayload.  # noqa: E501
        :type: str
        """

        self._phone = phone

    @property
    def address(self):
        """Gets the address of this ProviderPayload.  # noqa: E501


        :return: The address of this ProviderPayload.  # noqa: E501
        :rtype: str
        """
        return self._address

    @address.setter
    def address(self, address):
        """Sets the address of this ProviderPayload.


        :param address: The address of this ProviderPayload.  # noqa: E501
        :type: str
        """

        self._address = address

    @property
    def city(self):
        """Gets the city of this ProviderPayload.  # noqa: E501


        :return: The city of this ProviderPayload.  # noqa: E501
        :rtype: str
        """
        return self._city

    @city.setter
    def city(self, city):
        """Sets the city of this ProviderPayload.


        :param city: The city of this ProviderPayload.  # noqa: E501
        :type: str
        """

        self._city = city

    @property
    def zip(self):
        """Gets the zip of this ProviderPayload.  # noqa: E501


        :return: The zip of this ProviderPayload.  # noqa: E501
        :rtype: str
        """
        return self._zip

    @zip.setter
    def zip(self, zip):
        """Sets the zip of this ProviderPayload.


        :param zip: The zip of this ProviderPayload.  # noqa: E501
        :type: str
        """

        self._zip = zip

    @property
    def notes(self):
        """Gets the notes of this ProviderPayload.  # noqa: E501


        :return: The notes of this ProviderPayload.  # noqa: E501
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this ProviderPayload.


        :param notes: The notes of this ProviderPayload.  # noqa: E501
        :type: str
        """

        self._notes = notes

    @property
    def timezone(self):
        """Gets the timezone of this ProviderPayload.  # noqa: E501


        :return: The timezone of this ProviderPayload.  # noqa: E501
        :rtype: str
        """
        return self._timezone

    @timezone.setter
    def timezone(self, timezone):
        """Sets the timezone of this ProviderPayload.


        :param timezone: The timezone of this ProviderPayload.  # noqa: E501
        :type: str
        """

        self._timezone = timezone

    @property
    def language(self):
        """Gets the language of this ProviderPayload.  # noqa: E501


        :return: The language of this ProviderPayload.  # noqa: E501
        :rtype: str
        """
        return self._language

    @language.setter
    def language(self, language):
        """Sets the language of this ProviderPayload.


        :param language: The language of this ProviderPayload.  # noqa: E501
        :type: str
        """

        self._language = language

    @property
    def services(self):
        """Gets the services of this ProviderPayload.  # noqa: E501


        :return: The services of this ProviderPayload.  # noqa: E501
        :rtype: list[int]
        """
        return self._services

    @services.setter
    def services(self, services):
        """Sets the services of this ProviderPayload.


        :param services: The services of this ProviderPayload.  # noqa: E501
        :type: list[int]
        """

        self._services = services

    @property
    def settings(self):
        """Gets the settings of this ProviderPayload.  # noqa: E501


        :return: The settings of this ProviderPayload.  # noqa: E501
        :rtype: ProviderPayloadSettings
        """
        return self._settings

    @settings.setter
    def settings(self, settings):
        """Sets the settings of this ProviderPayload.


        :param settings: The settings of this ProviderPayload.  # noqa: E501
        :type: ProviderPayloadSettings
        """

        self._settings = settings

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(ProviderPayload, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ProviderPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
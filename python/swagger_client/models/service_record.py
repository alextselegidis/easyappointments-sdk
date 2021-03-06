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

class ServiceRecord(object):
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
        'id': 'int',
        'name': 'str',
        'duration': 'int',
        'price': 'float',
        'currency': 'str',
        'location': 'str',
        'description': 'str',
        'availabilities_type': 'str',
        'attendants_number': 'int',
        'category_id': 'int'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'duration': 'duration',
        'price': 'price',
        'currency': 'currency',
        'location': 'location',
        'description': 'description',
        'availabilities_type': 'availabilitiesType',
        'attendants_number': 'attendantsNumber',
        'category_id': 'categoryId'
    }

    def __init__(self, id=None, name=None, duration=None, price=None, currency=None, location=None, description=None, availabilities_type=None, attendants_number=None, category_id=None):  # noqa: E501
        """ServiceRecord - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._name = None
        self._duration = None
        self._price = None
        self._currency = None
        self._location = None
        self._description = None
        self._availabilities_type = None
        self._attendants_number = None
        self._category_id = None
        self.discriminator = None
        if id is not None:
            self.id = id
        if name is not None:
            self.name = name
        if duration is not None:
            self.duration = duration
        if price is not None:
            self.price = price
        if currency is not None:
            self.currency = currency
        if location is not None:
            self.location = location
        if description is not None:
            self.description = description
        if availabilities_type is not None:
            self.availabilities_type = availabilities_type
        if attendants_number is not None:
            self.attendants_number = attendants_number
        if category_id is not None:
            self.category_id = category_id

    @property
    def id(self):
        """Gets the id of this ServiceRecord.  # noqa: E501


        :return: The id of this ServiceRecord.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ServiceRecord.


        :param id: The id of this ServiceRecord.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this ServiceRecord.  # noqa: E501


        :return: The name of this ServiceRecord.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ServiceRecord.


        :param name: The name of this ServiceRecord.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def duration(self):
        """Gets the duration of this ServiceRecord.  # noqa: E501


        :return: The duration of this ServiceRecord.  # noqa: E501
        :rtype: int
        """
        return self._duration

    @duration.setter
    def duration(self, duration):
        """Sets the duration of this ServiceRecord.


        :param duration: The duration of this ServiceRecord.  # noqa: E501
        :type: int
        """

        self._duration = duration

    @property
    def price(self):
        """Gets the price of this ServiceRecord.  # noqa: E501


        :return: The price of this ServiceRecord.  # noqa: E501
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this ServiceRecord.


        :param price: The price of this ServiceRecord.  # noqa: E501
        :type: float
        """

        self._price = price

    @property
    def currency(self):
        """Gets the currency of this ServiceRecord.  # noqa: E501


        :return: The currency of this ServiceRecord.  # noqa: E501
        :rtype: str
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """Sets the currency of this ServiceRecord.


        :param currency: The currency of this ServiceRecord.  # noqa: E501
        :type: str
        """

        self._currency = currency

    @property
    def location(self):
        """Gets the location of this ServiceRecord.  # noqa: E501


        :return: The location of this ServiceRecord.  # noqa: E501
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location):
        """Sets the location of this ServiceRecord.


        :param location: The location of this ServiceRecord.  # noqa: E501
        :type: str
        """

        self._location = location

    @property
    def description(self):
        """Gets the description of this ServiceRecord.  # noqa: E501


        :return: The description of this ServiceRecord.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this ServiceRecord.


        :param description: The description of this ServiceRecord.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def availabilities_type(self):
        """Gets the availabilities_type of this ServiceRecord.  # noqa: E501


        :return: The availabilities_type of this ServiceRecord.  # noqa: E501
        :rtype: str
        """
        return self._availabilities_type

    @availabilities_type.setter
    def availabilities_type(self, availabilities_type):
        """Sets the availabilities_type of this ServiceRecord.


        :param availabilities_type: The availabilities_type of this ServiceRecord.  # noqa: E501
        :type: str
        """

        self._availabilities_type = availabilities_type

    @property
    def attendants_number(self):
        """Gets the attendants_number of this ServiceRecord.  # noqa: E501


        :return: The attendants_number of this ServiceRecord.  # noqa: E501
        :rtype: int
        """
        return self._attendants_number

    @attendants_number.setter
    def attendants_number(self, attendants_number):
        """Sets the attendants_number of this ServiceRecord.


        :param attendants_number: The attendants_number of this ServiceRecord.  # noqa: E501
        :type: int
        """

        self._attendants_number = attendants_number

    @property
    def category_id(self):
        """Gets the category_id of this ServiceRecord.  # noqa: E501


        :return: The category_id of this ServiceRecord.  # noqa: E501
        :rtype: int
        """
        return self._category_id

    @category_id.setter
    def category_id(self, category_id):
        """Sets the category_id of this ServiceRecord.


        :param category_id: The category_id of this ServiceRecord.  # noqa: E501
        :type: int
        """

        self._category_id = category_id

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
        if issubclass(ServiceRecord, dict):
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
        if not isinstance(other, ServiceRecord):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

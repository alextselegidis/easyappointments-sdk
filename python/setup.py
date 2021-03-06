# coding: utf-8

"""
    Easy!Appointments API

    These are the OpenAPI specs that describe the REST API of Easy!Appointments.  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@easyappointments.org
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from setuptools import setup, find_packages  # noqa: H301

NAME = "swagger-client"
VERSION = "1.0.0"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["urllib3 >= 1.15", "six >= 1.10", "certifi", "python-dateutil"]

setup(
    name=NAME,
    version=VERSION,
    description="Easy!Appointments API",
    author_email="info@easyappointments.org",
    url="",
    keywords=["Swagger", "Easy!Appointments API"],
    install_requires=REQUIRES,
    packages=find_packages(),
    include_package_data=True,
    long_description="""\
    These are the OpenAPI specs that describe the REST API of Easy!Appointments.  # noqa: E501
    """
)

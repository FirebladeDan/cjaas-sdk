# coding: utf-8

"""
    Azure Functions OpenAPI Extension

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class CreateApp(object):
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
        'secretkey': 'str',
        'namespace': 'str',
        'expiration': 'datetime'
    }

    attribute_map = {
        'secretkey': 'secretkey',
        'namespace': 'namespace',
        'expiration': 'expiration'
    }

    def __init__(self, secretkey=None, namespace=None, expiration=None):  # noqa: E501
        """CreateApp - a model defined in Swagger"""  # noqa: E501
        self._secretkey = None
        self._namespace = None
        self._expiration = None
        self.discriminator = None
        if secretkey is not None:
            self.secretkey = secretkey
        if namespace is not None:
            self.namespace = namespace
        if expiration is not None:
            self.expiration = expiration

    @property
    def secretkey(self):
        """Gets the secretkey of this CreateApp.  # noqa: E501


        :return: The secretkey of this CreateApp.  # noqa: E501
        :rtype: str
        """
        return self._secretkey

    @secretkey.setter
    def secretkey(self, secretkey):
        """Sets the secretkey of this CreateApp.


        :param secretkey: The secretkey of this CreateApp.  # noqa: E501
        :type: str
        """

        self._secretkey = secretkey

    @property
    def namespace(self):
        """Gets the namespace of this CreateApp.  # noqa: E501


        :return: The namespace of this CreateApp.  # noqa: E501
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """Sets the namespace of this CreateApp.


        :param namespace: The namespace of this CreateApp.  # noqa: E501
        :type: str
        """

        self._namespace = namespace

    @property
    def expiration(self):
        """Gets the expiration of this CreateApp.  # noqa: E501


        :return: The expiration of this CreateApp.  # noqa: E501
        :rtype: datetime
        """
        return self._expiration

    @expiration.setter
    def expiration(self, expiration):
        """Sets the expiration of this CreateApp.


        :param expiration: The expiration of this CreateApp.  # noqa: E501
        :type: datetime
        """

        self._expiration = expiration

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
        if issubclass(CreateApp, dict):
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
        if not isinstance(other, CreateApp):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

# swagger-java-client

Easy!Appointments API
- API version: 1.0.0
  - Build date: 2021-12-06T17:26:30.696Z[GMT]

These are the OpenAPI specs that describe the REST API of Easy!Appointments.

  For more information, please visit [https://easyappointments.org](https://easyappointments.org)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdminsApi;

import java.io.File;
import java.util.*;

public class AdminsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");


        AdminsApi apiInstance = new AdminsApi();
        Integer adminId = 56; // Integer | 
        try {
            apiInstance.adminsAdminIdDelete(adminId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminsApi#adminsAdminIdDelete");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdminsApi;

import java.io.File;
import java.util.*;

public class AdminsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");


        AdminsApi apiInstance = new AdminsApi();
        Integer adminId = 56; // Integer | 
        try {
            AdminRecord result = apiInstance.adminsAdminIdGet(adminId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminsApi#adminsAdminIdGet");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdminsApi;

import java.io.File;
import java.util.*;

public class AdminsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");


        AdminsApi apiInstance = new AdminsApi();
        AdminPayload body = new AdminPayload(); // AdminPayload | 
        Integer adminId = 56; // Integer | 
        try {
            AdminRecord result = apiInstance.adminsAdminIdPut(body, adminId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminsApi#adminsAdminIdPut");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdminsApi;

import java.io.File;
import java.util.*;

public class AdminsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");


        AdminsApi apiInstance = new AdminsApi();
        Integer page = 56; // Integer | 
        Integer length = 56; // Integer | 
        String sort = "sort_example"; // String | 
        String q = "q_example"; // String | 
        String fields = "fields_example"; // String | 
        String with = "with_example"; // String | 
        try {
            AdminCollection result = apiInstance.adminsGet(page, length, sort, q, fields, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminsApi#adminsGet");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdminsApi;

import java.io.File;
import java.util.*;

public class AdminsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");


        AdminsApi apiInstance = new AdminsApi();
        AdminPayload body = new AdminPayload(); // AdminPayload | 
        try {
            AdminRecord result = apiInstance.adminsPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminsApi#adminsPost");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://demo.easyappointments.org/index.php/api/v1/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminsApi* | [**adminsAdminIdDelete**](docs/AdminsApi.md#adminsAdminIdDelete) | **DELETE** /admins/{adminId} | Delete an admin
*AdminsApi* | [**adminsAdminIdGet**](docs/AdminsApi.md#adminsAdminIdGet) | **GET** /admins/{adminId} | Get an admin
*AdminsApi* | [**adminsAdminIdPut**](docs/AdminsApi.md#adminsAdminIdPut) | **PUT** /admins/{adminId} | Update an admin
*AdminsApi* | [**adminsGet**](docs/AdminsApi.md#adminsGet) | **GET** /admins | Get all admins
*AdminsApi* | [**adminsPost**](docs/AdminsApi.md#adminsPost) | **POST** /admins | Create an admin
*AppointmentsApi* | [**appointmentsAppointmentIdDelete**](docs/AppointmentsApi.md#appointmentsAppointmentIdDelete) | **DELETE** /appointments/{appointmentId} | Delete an appointment
*AppointmentsApi* | [**appointmentsAppointmentIdGet**](docs/AppointmentsApi.md#appointmentsAppointmentIdGet) | **GET** /appointments/{appointmentId} | Get an appointment
*AppointmentsApi* | [**appointmentsAppointmentIdPut**](docs/AppointmentsApi.md#appointmentsAppointmentIdPut) | **PUT** /appointments/{appointmentId} | Update an appointment
*AppointmentsApi* | [**appointmentsGet**](docs/AppointmentsApi.md#appointmentsGet) | **GET** /appointments | Get all appointments
*AppointmentsApi* | [**appointmentsPost**](docs/AppointmentsApi.md#appointmentsPost) | **POST** /appointments | Create an appointment
*AvailabilitiesApi* | [**availabilitiesGet**](docs/AvailabilitiesApi.md#availabilitiesGet) | **GET** /availabilities | Gets availability
*CategoriesApi* | [**categoriesCategoryIdDelete**](docs/CategoriesApi.md#categoriesCategoryIdDelete) | **DELETE** /categories/{categoryId} | Delete a category
*CategoriesApi* | [**categoriesCategoryIdGet**](docs/CategoriesApi.md#categoriesCategoryIdGet) | **GET** /categories/{categoryId} | Get a category
*CategoriesApi* | [**categoriesCategoryIdPut**](docs/CategoriesApi.md#categoriesCategoryIdPut) | **PUT** /categories/{categoryId} | Update a category
*CategoriesApi* | [**categoriesGet**](docs/CategoriesApi.md#categoriesGet) | **GET** /categories | Get all categories
*CategoriesApi* | [**categoriesPost**](docs/CategoriesApi.md#categoriesPost) | **POST** /categories | Create a category
*CustomersApi* | [**customersCustomerIdDelete**](docs/CustomersApi.md#customersCustomerIdDelete) | **DELETE** /customers/{customerId} | Delete a customer
*CustomersApi* | [**customersCustomerIdGet**](docs/CustomersApi.md#customersCustomerIdGet) | **GET** /customers/{customerId} | Get a customer
*CustomersApi* | [**customersCustomerIdPut**](docs/CustomersApi.md#customersCustomerIdPut) | **PUT** /customers/{customerId} | Update a customer
*CustomersApi* | [**customersGet**](docs/CustomersApi.md#customersGet) | **GET** /customers | Get all customers
*CustomersApi* | [**customersPost**](docs/CustomersApi.md#customersPost) | **POST** /customers | Create a customer
*ProvidersApi* | [**providersGet**](docs/ProvidersApi.md#providersGet) | **GET** /providers | Get all providers
*ProvidersApi* | [**providersPost**](docs/ProvidersApi.md#providersPost) | **POST** /providers | Create a provider
*ProvidersApi* | [**providersProviderIdDelete**](docs/ProvidersApi.md#providersProviderIdDelete) | **DELETE** /providers/{providerId} | Delete a provider
*ProvidersApi* | [**providersProviderIdGet**](docs/ProvidersApi.md#providersProviderIdGet) | **GET** /providers/{providerId} | Get a provider
*ProvidersApi* | [**providersProviderIdPut**](docs/ProvidersApi.md#providersProviderIdPut) | **PUT** /providers/{providerId} | Update a provider
*SecretariesApi* | [**secretariesGet**](docs/SecretariesApi.md#secretariesGet) | **GET** /secretaries | Get all secretaries
*SecretariesApi* | [**secretariesPost**](docs/SecretariesApi.md#secretariesPost) | **POST** /secretaries | Create a secretary
*SecretariesApi* | [**secretariesSecretaryIdDelete**](docs/SecretariesApi.md#secretariesSecretaryIdDelete) | **DELETE** /secretaries/{secretaryId} | Delete a secretary
*SecretariesApi* | [**secretariesSecretaryIdGet**](docs/SecretariesApi.md#secretariesSecretaryIdGet) | **GET** /secretaries/{secretaryId} | Get a secretary
*SecretariesApi* | [**secretariesSecretaryIdPut**](docs/SecretariesApi.md#secretariesSecretaryIdPut) | **PUT** /secretaries/{secretaryId} | Update a secretary
*ServicesApi* | [**servicesGet**](docs/ServicesApi.md#servicesGet) | **GET** /services | Get all services
*ServicesApi* | [**servicesPost**](docs/ServicesApi.md#servicesPost) | **POST** /services | Create a service
*ServicesApi* | [**servicesServiceIdDelete**](docs/ServicesApi.md#servicesServiceIdDelete) | **DELETE** /services/{serviceId} | Delete a service
*ServicesApi* | [**servicesServiceIdGet**](docs/ServicesApi.md#servicesServiceIdGet) | **GET** /services/{serviceId} | Get a service
*ServicesApi* | [**servicesServiceIdPut**](docs/ServicesApi.md#servicesServiceIdPut) | **PUT** /services/{serviceId} | Update a service
*SettingsApi* | [**settingsGet**](docs/SettingsApi.md#settingsGet) | **GET** /settings | Get all settings
*SettingsApi* | [**settingsSettingNameGet**](docs/SettingsApi.md#settingsSettingNameGet) | **GET** /settings/{settingName} | Get a setting
*SettingsApi* | [**settingsSettingNamePut**](docs/SettingsApi.md#settingsSettingNamePut) | **PUT** /settings/{settingName} | Update a setting
*UnavailabilitiesApi* | [**unavailabilitiesGet**](docs/UnavailabilitiesApi.md#unavailabilitiesGet) | **GET** /unavailabilities | Get all unavailabilities
*UnavailabilitiesApi* | [**unavailabilitiesPost**](docs/UnavailabilitiesApi.md#unavailabilitiesPost) | **POST** /unavailabilities | Create an unavailability
*UnavailabilitiesApi* | [**unavailabilitiesUnavailabilityIdDelete**](docs/UnavailabilitiesApi.md#unavailabilitiesUnavailabilityIdDelete) | **DELETE** /unavailabilities/{unavailabilityId} | Delete an unavailability
*UnavailabilitiesApi* | [**unavailabilitiesUnavailabilityIdGet**](docs/UnavailabilitiesApi.md#unavailabilitiesUnavailabilityIdGet) | **GET** /unavailabilities/{unavailabilityId} | Get an unavailability
*UnavailabilitiesApi* | [**unavailabilitiesUnavailabilityIdPut**](docs/UnavailabilitiesApi.md#unavailabilitiesUnavailabilityIdPut) | **PUT** /unavailabilities/{unavailabilityId} | Update an unavailability

## Documentation for Models

 - [AdminCollection](docs/AdminCollection.md)
 - [AdminPayload](docs/AdminPayload.md)
 - [AdminRecord](docs/AdminRecord.md)
 - [AdminRecordSettings](docs/AdminRecordSettings.md)
 - [AppointmentCollection](docs/AppointmentCollection.md)
 - [AppointmentPayload](docs/AppointmentPayload.md)
 - [AppointmentRecord](docs/AppointmentRecord.md)
 - [Availabilities](docs/Availabilities.md)
 - [CategoryCollection](docs/CategoryCollection.md)
 - [CategoryPayload](docs/CategoryPayload.md)
 - [CategoryRecord](docs/CategoryRecord.md)
 - [CustomerCollection](docs/CustomerCollection.md)
 - [CustomerPayload](docs/CustomerPayload.md)
 - [CustomerRecord](docs/CustomerRecord.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ProviderCollection](docs/ProviderCollection.md)
 - [ProviderPayload](docs/ProviderPayload.md)
 - [ProviderPayloadSettings](docs/ProviderPayloadSettings.md)
 - [ProviderRecord](docs/ProviderRecord.md)
 - [ProviderRecordSettings](docs/ProviderRecordSettings.md)
 - [SecretaryCollection](docs/SecretaryCollection.md)
 - [SecretaryPayload](docs/SecretaryPayload.md)
 - [SecretaryRecord](docs/SecretaryRecord.md)
 - [ServiceCollection](docs/ServiceCollection.md)
 - [ServicePayload](docs/ServicePayload.md)
 - [ServiceRecord](docs/ServiceRecord.md)
 - [SettingCollection](docs/SettingCollection.md)
 - [SettingPayload](docs/SettingPayload.md)
 - [SettingRecord](docs/SettingRecord.md)
 - [UnavailabilityCollection](docs/UnavailabilityCollection.md)
 - [UnavailabilityPayload](docs/UnavailabilityPayload.md)
 - [UnavailabilityRecord](docs/UnavailabilityRecord.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### BasicAuth

- **Type**: HTTP basic authentication

### BearerToken



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@easyappointments.org
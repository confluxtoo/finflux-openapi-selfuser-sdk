# co.finflux.openapi.self - Kotlin client library for Finflux-Self

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://develop.finflux.io/fineract-provider/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SelfUserDetailsApi* | [**fetchAuthenticatedUserData**](docs/SelfUserDetailsApi.md#fetchauthenticateduserdata) | **GET** v1/self/userdetails | Retrieve Self User Details
*SignupOtpApi* | [**generateOTPForLogin**](docs/SignupOtpApi.md#generateotpforlogin) | **POST** v1/auth/loginself | Generates OTP and sends OTP to the customer
*SignupOtpApi* | [**generateOTPForSignup**](docs/SignupOtpApi.md#generateotpforsignup) | **POST** v1/auth/signupself | Creates user and customer and also generates OTP


<a name="documentation-for-models"></a>
## Documentation for Models

 - [co.finflux.openapi.self.ApiErrorMessageArg](docs/ApiErrorMessageArg.md)
 - [co.finflux.openapi.self.ApiGlobalErrorResponse](docs/ApiGlobalErrorResponse.md)
 - [co.finflux.openapi.self.ApiParameterError](docs/ApiParameterError.md)
 - [co.finflux.openapi.self.AuthenticatedOauthUserData](docs/AuthenticatedOauthUserData.md)
 - [co.finflux.openapi.self.SignUpOTPResponsePayload](docs/SignUpOTPResponsePayload.md)
 - [co.finflux.openapi.self.SignUpRequestPayload](docs/SignUpRequestPayload.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="accessToken"></a>
### accessToken

- **Type**: HTTP basic authentication


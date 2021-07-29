# SignupOtpApi

All URIs are relative to *https://develop.finflux.io/fineract-provider/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateOTPForLogin**](SignupOtpApi.md#generateOTPForLogin) | **POST** v1/auth/loginself | Generates OTP and sends OTP to the customer
[**generateOTPForSignup**](SignupOtpApi.md#generateOTPForSignup) | **POST** v1/auth/signupself | Creates user and customer and also generates OTP



Generates OTP and sends OTP to the customer

### Example
```kotlin
// Import classes:
//import co.finflux.openapi.self.*
//import co.finflux.openapi.self.infrastructure.*
//import co.finflux.openapi.self.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SignupOtpApi::class.java)
val mobileNumber : kotlin.String = mobileNumber_example // kotlin.String | 

val result : SignUpOTPResponsePayload = webService.generateOTPForLogin(mobileNumber)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mobileNumber** | **kotlin.String**|  | [optional]

### Return type

[**SignUpOTPResponsePayload**](SignUpOTPResponsePayload.md)

### Authorization


Configure accessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Creates user and customer and also generates OTP

### Example
```kotlin
// Import classes:
//import co.finflux.openapi.self.*
//import co.finflux.openapi.self.infrastructure.*
//import co.finflux.openapi.self.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SignupOtpApi::class.java)
val signUpRequestPayload : SignUpRequestPayload =  // SignUpRequestPayload | 

val result : SignUpOTPResponsePayload = webService.generateOTPForSignup(signUpRequestPayload)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signUpRequestPayload** | [**SignUpRequestPayload**](SignUpRequestPayload.md)|  | [optional]

### Return type

[**SignUpOTPResponsePayload**](SignUpOTPResponsePayload.md)

### Authorization


Configure accessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


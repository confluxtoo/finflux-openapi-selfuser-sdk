# SelfUserDetailsApi

All URIs are relative to *https://develop.finflux.io/fineract-provider/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAuthenticatedUserData**](SelfUserDetailsApi.md#fetchAuthenticatedUserData) | **GET** v1/self/userdetails | Retrieve Self User Details



Retrieve Self User Details

### Example
```kotlin
// Import classes:
//import co.finflux.openapi.self.*
//import co.finflux.openapi.self.infrastructure.*
//import co.finflux.openapi.self.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SelfUserDetailsApi::class.java)
val accessToken : kotlin.String = accessToken_example // kotlin.String | 

val result : kotlin.collections.List<AuthenticatedOauthUserData> = webService.fetchAuthenticatedUserData(accessToken)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.collections.List&lt;AuthenticatedOauthUserData&gt;**](AuthenticatedOauthUserData.md)

### Authorization


Configure accessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


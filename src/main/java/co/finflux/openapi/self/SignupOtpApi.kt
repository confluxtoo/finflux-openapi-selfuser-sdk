package co.finflux.openapi.self

import co.finflux.openapi.self.infrastructure.CollectionFormats.*
import retrofit2.http.*
import okhttp3.RequestBody
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Completable;

import co.finflux.openapi.self.ApiGlobalErrorResponse
import co.finflux.openapi.self.SignUpOTPResponsePayload
import co.finflux.openapi.self.SignUpRequestPayload

interface SignupOtpApi {
    /**
     * Generates OTP and sends OTP to the customer
     * 
     * Responses:
     *  - 200: Generates OTP and sends OTP to the customer
     *  - 400: Error response
     * 
     * @param mobileNumber  (optional)
     * @return [Call]<[SignUpOTPResponsePayload]>
     */
    @POST("v1/auth/loginself")
    fun generateOTPForLogin(@Query("mobileNumber") mobileNumber: kotlin.String? = null): Single<SignUpOTPResponsePayload>

    /**
     * Creates user and customer and also generates OTP
     * 
     * Responses:
     *  - 200: Creates user and customer with the request details provided and also sends an OTP to the customer
     *  - 400: Error response
     * 
     * @param signUpRequestPayload  (optional)
     * @return [Call]<[SignUpOTPResponsePayload]>
     */
    @POST("v1/auth/signupself")
    fun generateOTPForSignup(@Body signUpRequestPayload: SignUpRequestPayload? = null): Single<SignUpOTPResponsePayload>

}

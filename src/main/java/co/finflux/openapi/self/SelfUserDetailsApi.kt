package co.finflux.openapi.self

import co.finflux.openapi.self.infrastructure.CollectionFormats.*
import retrofit2.http.*
import okhttp3.RequestBody
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Completable;

import co.finflux.openapi.self.AuthenticatedOauthUserData

interface SelfUserDetailsApi {
    /**
     * Retrieve Self User Details
     * 
     * Responses:
     *  - 200: Retrieve Self User Details
     * 
     * @param accessToken  (optional)
     * @return [Call]<[kotlin.collections.List<AuthenticatedOauthUserData>]>
     */
    @GET("v1/self/userdetails")
    fun fetchAuthenticatedUserData(@Query("access_token") accessToken: kotlin.String? = null): Single<kotlin.collections.List<AuthenticatedOauthUserData>>

}

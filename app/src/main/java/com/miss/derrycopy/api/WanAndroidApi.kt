package com.miss.derrycopy.api

import com.miss.derrycopy.entity.LoginRegisterResponse
import com.miss.derrycopy.entity.LoginRegisterResponseWrapper
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface WanAndroidApi {

    /**
     * 登录API
     * username=Derry-vip&password=123456
     */

    @POST("/user/login")
    @FormUrlEncoded
    fun loginAction(
        @Field("username") username: String,
        @Field("password") password: String
    )
            : Observable<LoginRegisterResponseWrapper<LoginRegisterResponse>>


    @POST("/user/register")
    @FormUrlEncoded
    fun registerAction(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("repassword") repassword: String
    )
            : Observable<LoginRegisterResponseWrapper<LoginRegisterResponse>>


}
package com.miss.derrycopy.modules.login

import android.content.Context
import android.util.Log
import com.miss.derrycopy.api.WanAndroidApi
import com.miss.derrycopy.entity.LoginRegisterResponse
import com.miss.derrycopy.entity.LoginRegisterResponseWrapper
import com.miss.derrycopy.modules.login.inter.LoginModule
import com.miss.derrycopy.modules.login.inter.LoginPresenter
import com.miss.derrycopy.net.APIClient
import com.miss.derrycopy.net.APIResponse
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class LoginModelImpl : LoginModule {

    val TAG: String = "LoginModelImpl"

    override fun login(
        context: Context,
        username: String,
        password: String,
        onLoginListener: LoginPresenter.OnLoginListener
    ) {
        APIClient.instance.instanceRetrofit(WanAndroidApi::class.java)
            .loginAction(username, password)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : APIResponse<LoginRegisterResponse>(context){
                override fun success(data: LoginRegisterResponse?) {
                    Log.e(TAG, "success: $data" )
                    onLoginListener.loginSuccess(data)
                }

                override fun fail(errMsg: String?) {
                    Log.e(TAG, "fail: $errMsg")
                    onLoginListener.loginFail(errMsg)
                }

            })
    }
}
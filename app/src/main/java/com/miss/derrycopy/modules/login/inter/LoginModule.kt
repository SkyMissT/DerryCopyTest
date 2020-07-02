package com.miss.derrycopy.modules.login.inter

import android.content.Context

interface LoginModule {

    //  登陆
    fun login(
        context: Context,
        username: String,
        password: String,
        onLoginListener: LoginPresenter.OnLoginListener
    )

}
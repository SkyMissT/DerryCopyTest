package com.miss.derrycopy.modules.login.inter

import android.content.Context
import com.miss.derrycopy.base.IBasePresenter
import com.miss.derrycopy.entity.LoginRegisterResponse

interface LoginPresenter : IBasePresenter {

    fun loginAction(context: Context, username: String, password: String)

    //  监听回调
    interface OnLoginListener{
        fun loginSuccess(data: LoginRegisterResponse)
        fun loginFail(errMsg: String)
    }

}
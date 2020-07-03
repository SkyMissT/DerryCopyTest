package com.miss.derrycopy.modules.login.inter

import com.miss.derrycopy.entity.LoginRegisterResponse

interface LoginView {

    fun loginSuccess(data: LoginRegisterResponse?)

    fun loginFail(errorMsg: String?)



}
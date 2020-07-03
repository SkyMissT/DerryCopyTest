package com.miss.derrycopy.modules.login

import android.content.Context
import com.miss.derrycopy.entity.LoginRegisterResponse
import com.miss.derrycopy.modules.login.inter.LoginPresenter
import com.miss.derrycopy.modules.login.inter.LoginView

class LoginPresenterImpl(var loginView: LoginView?) : LoginPresenter,
    LoginPresenter.OnLoginListener {

    private val loginModel = LoginModelImpl()


    /**
     *      调用model中的网络请求
     */
    override fun loginAction(context: Context, username: String, password: String) {

        loginModel.login(context, username, password,this)

    }

    override fun unAttachView() {
        loginView = null
    }

    override fun loginSuccess(data: LoginRegisterResponse?) {
        /**
         *      登陆成功，返回数据，更新UI
         */
        loginView?.loginSuccess(data)
    }

    override fun loginFail(errMsg: String?) {
        /**
         *      登陆失败，更新UI
         */
        loginView?.loginFail(errMsg)
    }
}
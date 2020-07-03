package com.miss.derrycopy.modules.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.miss.derrycopy.MainActivity
import com.miss.derrycopy.R
import com.miss.derrycopy.base.BaseActivity
import com.miss.derrycopy.entity.LoginRegisterResponse
import com.miss.derrycopy.modules.login.inter.LoginPresenter
import com.miss.derrycopy.modules.login.inter.LoginView
import kotlinx.android.synthetic.main.activity_user_login.*

class LoginActivity : BaseActivity<LoginPresenter>(),LoginView{



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)

        hideActionBar()

        user_login_bt.setOnClickListener(onClickListener)

    }

    private val onClickListener= View.OnClickListener{
        when(it.id){
            R.id.user_login_bt -> {
                val username = user_phone_et.text.toString()
                val password = user_password_et.text.toString()
                Log.e("TAG", "username:$username --- password:$password")
                presenter.loginAction(this@LoginActivity, username, password)

            }
        }
    }


    override fun loginSuccess(data: LoginRegisterResponse?) {
        Toast.makeText(this,"登录成功😀",Toast.LENGTH_SHORT).show()
        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun loginFail(errorMsg: String?) {
        Toast.makeText(this@LoginActivity, "登录失败 ~ 呜呜呜", Toast.LENGTH_SHORT).show()
    }

    override fun createP(): LoginPresenter = LoginPresenterImpl(this)


    override fun recycle() {
        presenter.unAttachView()
    }
}
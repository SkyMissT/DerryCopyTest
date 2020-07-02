package com.miss.derrycopy.net

import android.content.Context
import com.miss.derrycopy.entity.LoginRegisterResponseWrapper
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

abstract class APIResponse<T>(val context: Context) : Observer<LoginRegisterResponseWrapper<T>>{

    private var isShow: Boolean = true

    /**
     *      默认false
     */
    constructor(context: Context, isShow: Boolean = false) : this(context) {
        this.isShow = isShow
    }

    abstract fun success(data: T ?)

    abstract fun fail(errMsg: String?)

    // todo +++++++++++++++++++++++++++++++++  RxJava 相关的函数

    //  起点分发
    override fun onSubscribe(d: Disposable) {
        if (isShow) {
            //  todo 弹出加载框
        }
    }

    //  上游流下的数据
    override fun onNext(t: LoginRegisterResponseWrapper<T>) {
        if (t.data == null) {
            fail("登陆失败${t.errorMsg}")
        }else{
            success(t.data)
        }
    }

    override fun onError(e: Throwable) {
        fail(e.message)
        // 取消加载
    }

    override fun onComplete() {
        // 取消加载
    }


}
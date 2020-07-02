package com.miss.derrycopy.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

/**
 *  所有fragment的父类
 */
abstract class BaseFragment<P> : Fragment() where P : IBasePresenter {

    lateinit var p: P
    private lateinit var mActivity: AppCompatActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)

        /**
         *      类型转换
         *      java
         *      mActivity = (AppCompatActivity) context
         */

        mActivity = context as AppCompatActivity

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        p = getPresenter()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        createOk()
    }

    override fun onDestroy() {
        super.onDestroy()
        recycle()
    }

    abstract fun getPresenter() : P

    abstract fun createOk()

    abstract fun recycle()


    /**
     *      展示--暴露给孩子
     */
    fun showActionBar(){
        mActivity?.supportActionBar?.show()
    }

    /**
     *      隐藏--暴露给孩子
     */
    fun hideActionBar(){
        mActivity?.supportActionBar?.hide()
    }





}

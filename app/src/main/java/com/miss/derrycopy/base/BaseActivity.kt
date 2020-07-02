package com.miss.derrycopy.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<P> : AppCompatActivity() where P : IBasePresenter {

    lateinit var presenter: P


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createP()
    }

    abstract fun createP(): P

    abstract fun recycle()

    override fun onDestroy() {
        super.onDestroy()
        recycle()
    }

    fun showActionBar(){
        supportActionBar?.show()
    }

}
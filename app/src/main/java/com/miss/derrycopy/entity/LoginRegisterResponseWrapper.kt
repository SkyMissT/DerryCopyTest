package com.miss.derrycopy.entity

/**
 *   Created by Vola on 2020/7/1.
 */
data class LoginRegisterResponseWrapper<T>(
    val data: T,
    val errorMsg: String,
    val errorCode: Int
)
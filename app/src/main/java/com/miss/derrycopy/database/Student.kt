package com.miss.derrycopy.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Student() {

    //  主键--自增
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @ColumnInfo
    lateinit var name:String

    //  不写的话是默认，写的优先级更高
    @ColumnInfo(name = "age")
    var age: Int = 0

    constructor(name: String, age: Int):this(){
        this.name = name
        this.age = age
    }

}
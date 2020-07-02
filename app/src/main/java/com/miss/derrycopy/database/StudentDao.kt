package com.miss.derrycopy.database

import androidx.room.*

@Dao
interface StudentDao {


    // vararg 可变参数
    //  void a （Student... stu）  ===  vararg students: Student
    @Insert
    fun insertStudents(vararg students: Student)


    @Update
    fun updateStudents(vararg students: Student)

    @Delete
    fun deleteStudents(vararg students: Student)

    //  删除全部
    @Query("DELETE FROM student")
    fun deleteAllStudents()

    //  查询全部
    @Query("SELECT * FROM student ORDER BY id DESC")
    fun queryAllStudents(): List<Student>


}
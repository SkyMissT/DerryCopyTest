package com.miss.derrycopy.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Student::class], version = 1)
abstract class StudentDatabase : RoomDatabase() {

    abstract fun getStudentDao(): StudentDao

    companion object {

        private var INSTANCE: StudentDatabase? = null

        fun getDatabase(context: Context): StudentDatabase? {

            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context, StudentDatabase::class.java, "students")
                    .allowMainThreadQueries()
                    .build()
            }

            return INSTANCE

        }

        fun getDateBase(): StudentDatabase? = INSTANCE


    }

}
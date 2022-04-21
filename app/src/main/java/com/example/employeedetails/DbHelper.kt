package com.example.employeedetails

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DbHelper(context: Context): SQLiteOpenHelper(context,"EMPLOYEETDB",null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE LOGIN(USERID TEXT, PASSWORD TEXT)")
        db?.execSQL("CREATE TABLE MANAGERINFO(USERID TEXT,NAME TEXT, DESIGNATION TEXT, COURSE TEXT, SUBJECT TEXT, MOBILE TEXT, EMAIL TEXT)")
        db?.execSQL("CREATE TABLE EMPLOYEEINFO(USERID TEXT,RNO TEXT,NAME TEXT)")

    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}
package com.learning.learningapp2022.ganeshhegde.roomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="subscriber_data_table")
data class Subscriber(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="sub_id")
    val id : Int,

    @ColumnInfo(name="sub_name")
    val name : String,

    @ColumnInfo(name="sub_email")
    val email:String



)

package com.learning.learningapp2022.ganeshhegde.roomdb.employee

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


//subscriber table with ID as the primary key
@Entity(tableName ="employee_info")
data class Employee(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="emp_id")
    val id : Int,

    @ColumnInfo(name="emp_name")
    val name : String,

    @ColumnInfo(name="emp_email")
    val email:String,

    //we rename emp_salary to emp_ctc


    @ColumnInfo(name="emp_ctc", defaultValue = 0.0.toString())
    val salary:Double

)

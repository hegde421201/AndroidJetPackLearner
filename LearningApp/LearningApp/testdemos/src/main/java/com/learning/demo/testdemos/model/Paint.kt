package com.learning.demo.testdemos.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "paintings")
data class Paint(

    var name:String,
    var painterName:String,
    var year:Int,
    var imageUrl:String,
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null
)




package com.learning.learningapp2022.ganeshhegde.retrofit.kotlin

import com.google.gson.annotations.SerializedName

data class AlbumsItem(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("userId")
    val userId: Int
)
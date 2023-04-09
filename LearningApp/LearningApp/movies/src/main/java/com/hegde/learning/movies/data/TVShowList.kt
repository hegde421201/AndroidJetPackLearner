package com.hegde.learning.movies.data


import com.google.gson.annotations.SerializedName

data class TVShowList(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val TVShows: List<TVShow>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)
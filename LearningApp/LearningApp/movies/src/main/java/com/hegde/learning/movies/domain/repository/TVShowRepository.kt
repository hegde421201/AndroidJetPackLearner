package com.hegde.learning.movies.domain.repository

import com.hegde.learning.movies.data.model.tvshow.TVShow

interface TVShowRepository {
    suspend fun getTVShow():List<TVShow>?
    suspend fun updateTVShow():List<TVShow>?
}


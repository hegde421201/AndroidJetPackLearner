package com.hegde.learning.movies.domain

import com.hegde.learning.movies.data.model.tvshow.TVShow

class GetTVShowUseCase(private val tvShowRepository: TVShowRepository) {
    suspend fun execute():List<TVShow> ? = tvShowRepository.getTVShow()
}


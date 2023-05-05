package com.hegde.learning.movies.domain.usecase

import com.hegde.learning.movies.data.model.tvshow.TVShow
import com.hegde.learning.movies.domain.repository.TVShowRepository

class UpdateTVShowUseCase(private val tvShowRepository: TVShowRepository) {
    suspend fun execute():List<TVShow>? = tvShowRepository.updateTVShow()
}


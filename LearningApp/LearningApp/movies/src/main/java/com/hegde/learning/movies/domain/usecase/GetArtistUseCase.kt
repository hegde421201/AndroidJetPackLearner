package com.hegde.learning.movies.domain.usecase

import com.hegde.learning.movies.data.model.artist.Artist
import com.hegde.learning.movies.domain.repository.ArtistRepository

class GetArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.getArtists()
}


package com.hegde.learning.movies.domain

import com.hegde.learning.movies.data.model.artist.Artist


class UpdateArtistUseCase(private val artistRepository: ArtistRepository) {

    suspend fun execute():List<Artist> ? = artistRepository.updateArtists()
}

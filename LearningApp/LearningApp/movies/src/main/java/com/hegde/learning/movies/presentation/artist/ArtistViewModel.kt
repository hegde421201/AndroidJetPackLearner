package com.hegde.learning.movies.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.hegde.learning.movies.domain.usecase.GetArtistUseCase
import com.hegde.learning.movies.domain.usecase.GetTVShowUseCase
import com.hegde.learning.movies.domain.usecase.UpdateArtistUseCase
import com.hegde.learning.movies.domain.usecase.UpdateTVShowUseCase

class ArtistViewModel(
    private val getArtistUseCase: GetArtistUseCase,
    private val updateArtistUseCase: UpdateArtistUseCase
) : ViewModel() {

    fun getArtists() = liveData {
        val artistList = getArtistUseCase.execute()
        emit(artistList)
    }

    fun updateArtists() = liveData {

        val artistList = updateArtistUseCase.execute()
        emit(artistList)

    }

}
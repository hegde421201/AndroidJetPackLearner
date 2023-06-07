package com.hegde.learning.movies.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hegde.learning.movies.domain.usecase.GetArtistUseCase
import com.hegde.learning.movies.domain.usecase.GetTVShowUseCase
import com.hegde.learning.movies.domain.usecase.UpdateArtistUseCase
import com.hegde.learning.movies.domain.usecase.UpdateTVShowUseCase

class ArtistViewModelFactory(
    private val getArtistUseCase: GetArtistUseCase,
    private val updateArtistUseCase: UpdateArtistUseCase
) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ArtistViewModel(getArtistUseCase,updateArtistUseCase) as T
    }
}
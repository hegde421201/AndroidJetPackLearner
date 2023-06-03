package com.hegde.learning.movies.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hegde.learning.movies.domain.usecase.GetTVShowUseCase
import com.hegde.learning.movies.domain.usecase.UpdateTVShowUseCase

class TvShowViewModelFactory(
    private val getTVShowUseCase: GetTVShowUseCase,
    private val updateTVShowUseCase: UpdateTVShowUseCase
) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModel(getTVShowUseCase,updateTVShowUseCase) as T
    }
}
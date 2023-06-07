package com.hegde.learning.movies.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.hegde.learning.movies.domain.usecase.GetTVShowUseCase
import com.hegde.learning.movies.domain.usecase.UpdateTVShowUseCase

class TvShowViewModel(
    private val getTVShowUseCase: GetTVShowUseCase,
    private val updateTVShowUseCase: UpdateTVShowUseCase
) : ViewModel() {

    fun getTVshows() = liveData {
        val tvshowList = getTVShowUseCase.execute()
        emit(tvshowList)
    }

    fun updateTVshows() = liveData {

        val tvshowList = updateTVShowUseCase.execute()
        emit(tvshowList)

    }

}
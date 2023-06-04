package com.hegde.learning.movies.presentation.di.artist

import com.hegde.learning.movies.domain.usecase.GetArtistUseCase
import com.hegde.learning.movies.domain.usecase.UpdateArtistUseCase
import com.hegde.learning.movies.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistUseCase: GetArtistUseCase,
        updateArtistUseCase: UpdateArtistUseCase
    ):ArtistViewModelFactory{
        return ArtistViewModelFactory(getArtistUseCase,updateArtistUseCase)
    }



}
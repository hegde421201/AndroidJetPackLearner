package com.hegde.learning.movies.presentation.di.core

import com.hegde.learning.movies.presentation.di.artist.ArtistSubComponent
import com.hegde.learning.movies.presentation.di.movie.MovieSubComponent
import com.hegde.learning.movies.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,
    CacheDataModule::class,
    NetModule::class,
    DataBaseModule::class,
    LocalDataModule::class,
    RepositoryModule::class,
    RemoteDataModule::class,
    UseCaseModule::class])
interface AppComponent {

    fun movieSubComponent():MovieSubComponent.Factory
    fun artistSubComponent():ArtistSubComponent.Factory
    fun tvshowSubComponent():TvShowSubComponent.Factory

}
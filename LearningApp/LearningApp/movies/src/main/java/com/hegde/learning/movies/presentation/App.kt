package com.hegde.learning.movies.presentation

import android.app.Application
import com.hegde.learning.movies.BuildConfig
import com.hegde.learning.movies.presentation.di.Injector
import com.hegde.learning.movies.presentation.di.artist.ArtistSubComponent
import com.hegde.learning.movies.presentation.di.core.*
import com.hegde.learning.movies.presentation.di.movie.MovieSubComponent
import com.hegde.learning.movies.presentation.di.tvshow.TvShowSubComponent


class App : Application(),Injector{

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .localDataModule(LocalDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
            return appComponent.movieSubComponent().create()

    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
            return appComponent.tvshowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }
}
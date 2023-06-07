package com.hegde.learning.movies.presentation.di.core

import android.content.Context
import com.hegde.learning.movies.presentation.di.artist.ArtistSubComponent
import com.hegde.learning.movies.presentation.di.movie.MovieSubComponent
import com.hegde.learning.movies.presentation.di.tvshow.TvShowSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MovieSubComponent::class,TvShowSubComponent::class,ArtistSubComponent::class])
class AppModule(private val context: Context) {

@Provides
@Singleton
fun provideApplicationContext():Context{
    return context.applicationContext
}




}


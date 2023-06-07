package com.hegde.learning.movies.presentation.di.artist

import com.hegde.learning.movies.presentation.artist.ArtistActivity
import dagger.Subcomponent

@ArtistScope
@Subcomponent(modules = [ArtistModule::class])
interface ArtistSubComponent {
    fun inject(artistActivity: ArtistActivity)


    @Subcomponent.Factory
    interface Factory{
        fun create():ArtistSubComponent
    }
}
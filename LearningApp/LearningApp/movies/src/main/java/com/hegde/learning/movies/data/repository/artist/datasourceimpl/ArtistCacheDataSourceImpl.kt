package com.hegde.learning.movies.data.repository.artist.datasourceimpl

import com.hegde.learning.movies.data.model.artist.Artist
import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistCacheDataSource
import com.hegde.learning.movies.data.repository.movie.datasource.MovieCacheDataSource

class ArtistCacheDataSourceImpl : ArtistCacheDataSource {

    private var artistList = ArrayList<Artist>()

    override suspend fun saveArtistToCache(artist: List<Artist>) {
        artistList.clear()
        artistList = ArrayList(artist)
    }

    override suspend fun getArtistFromCache(): List<Artist> {
        return artistList
    }


}
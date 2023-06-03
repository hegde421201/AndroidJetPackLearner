package com.hegde.learning.movies.data.repository.artist

import android.util.Log
import com.hegde.learning.movies.data.model.artist.Artist
import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistCacheDataSource
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistLocalDataSource
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistRemoteDataSource
import com.hegde.learning.movies.domain.repository.ArtistRepository


class ArtistRepositoryImpl(
    private val artistRemoteDataSource: ArtistRemoteDataSource,
    private val artistLocalDataSource: ArtistLocalDataSource,
    private val artistCacheDataSource: ArtistCacheDataSource
) : ArtistRepository {
    override suspend fun getArtists(): List<Artist>? {

        return getArtistsFromCache()
    }

    override suspend fun updateArtists(): List<Artist>? {

        val newList  = getArtistsFromAPI()

        artistLocalDataSource.clearAll()

        artistLocalDataSource.saveArtistsToDB(newList)

       artistCacheDataSource.saveArtistToCache(newList)

        return newList
    }

    suspend fun getArtistsFromAPI():List<Artist>{

        lateinit var artistList:List<Artist>

        try {
                    val response = artistRemoteDataSource.getArtists()
                    val body = response.body()

                    body?.let {
                        artistList = body.artists
                    }

            }catch (exception:Exception){
                    Log.i("Artist",exception.message.toString())
                }

        return artistList
    }

    suspend fun getArtistsFromDB():List<Artist>{

        lateinit var artistList:List<Artist>

        try {
            artistList = artistLocalDataSource.getArtistsFromDB()

        }catch (exception:Exception){
            Log.i("Artist",exception.message.toString())
        }

        if(artistList.isNotEmpty()){
            return artistList
        }
        else {
            artistList = getArtistsFromAPI()
            artistLocalDataSource.saveArtistsToDB(artistList)
        }

        return artistList
    }

    suspend fun getArtistsFromCache():List<Artist>{
        lateinit var artistList:List<Artist>

        try {
            artistList = artistCacheDataSource.getArtistFromCache()

        }catch (exception:Exception){
            Log.i("Mytag",exception.message.toString())
        }

        if(artistList.isNotEmpty()){
            return artistList
        }
        else {
            artistList = getArtistsFromDB()
            artistCacheDataSource.saveArtistToCache(artistList)
        }

        return artistList
    }
}
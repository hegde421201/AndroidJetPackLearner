package com.hegde.learning.movies.data.repository.tvshow.datasourceimpl

import com.hegde.learning.movies.data.db.ArtistDao
import com.hegde.learning.movies.data.db.MovieDao
import com.hegde.learning.movies.data.db.TVShowDao
import com.hegde.learning.movies.data.model.artist.Artist
import com.hegde.learning.movies.data.model.movie.Movie
import com.hegde.learning.movies.data.model.tvshow.TVShow
import com.hegde.learning.movies.data.repository.artist.datasource.ArtistLocalDataSource
import com.hegde.learning.movies.data.repository.movie.datasource.MovieLocalDataSource
import com.hegde.learning.movies.data.repository.tvshow.datasource.TvShowLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvShowLocalDataSourceImpl(private val tvShowDao: TVShowDao): TvShowLocalDataSource {
    override suspend fun getTvShowsFromDB(): List<TVShow> = tvShowDao.getTVShows()


    override suspend fun saveTvShowsToDB(tvShow: List<TVShow>) {
        //background thread
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.saveTVShows(tvShow)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.deleteAllTVShows()
        }
    }
}
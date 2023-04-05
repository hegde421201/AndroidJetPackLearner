package com.learning.learningapp2022.ganeshhegde.retrofit.kotlin

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData

import com.learning.learningapp2022.ganeshhegde.R
import retrofit2.Response

class RetrofitActivity : AppCompatActivity() {

   private lateinit var retrofitService : AlbumService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)



         retrofitService = RetrofitInstance
            .getRetrofitInstance()
            .create(AlbumService::class.java)

       getRequestPathParams()
       getRequestQueryParams()


    }

    private fun getRequestQueryParams() {
        val responseLiveData:LiveData<Response<Albums>> = liveData {
            // val response = retrofitService.getAlbums()
            val response = retrofitService.getSortedAlbums(3)
            emit(response)
        }

        responseLiveData.observe(this, Observer {
            val albumsList:MutableListIterator<AlbumsItem>? = it.body()?.listIterator()

            val text_view = findViewById<TextView>(R.id.retro_text)

            albumsList?.let {
                while (albumsList.hasNext()){
                    val albumsItem = albumsList.next()
                    //Log.i("RETROFITTAG",albumsItem.title)

                    val result = "\n" + "Album title : ${albumsItem.title}" +"\n"+
                            " " + "Album ID : ${albumsItem.id}" +"\n"+
                            " " + "User ID : ${albumsItem.userId}" +"\n\n\n"

                    text_view.append(result)
                }
            }
        })
    }

    private fun getRequestPathParams() {
        //path parameter example
        val pathResponse : LiveData<Response<AlbumsItem>> = liveData {
            val response = retrofitService.getAlbum(4)
            emit(response)
        }

        pathResponse.observe(this,Observer{
            val title:String? = it.body()?.title
            Toast.makeText(applicationContext,title,Toast.LENGTH_LONG).show()
        })
    }


}
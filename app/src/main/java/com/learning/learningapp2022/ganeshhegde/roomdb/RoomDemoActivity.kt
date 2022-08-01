package com.learning.learningapp2022.ganeshhegde.roomdb

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.RoomSubscribersBinding

class RoomDemoActivity : AppCompatActivity() {

    private lateinit var rBinding:RoomSubscribersBinding
    private lateinit var subscribeViewModel: SubscribeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rBinding = DataBindingUtil.setContentView(this,R.layout.room_subscribers)

        val dao = SubscriberDatabase.getInstance(application).subscriberDao
        val repository = SubscriberRepository(dao)

        val factory = SubscriberViewModelFactory(repository)
        subscribeViewModel = ViewModelProvider(this,factory).get(SubscribeViewModel::class.java)
        rBinding.subViewModel = subscribeViewModel

        rBinding.lifecycleOwner = this

        initRecyclerView()
    }

    private fun displaySubscriberList(){
        subscribeViewModel.subscribers.observe(this, Observer {
            Log.i("TAGS",it.toString())
            rBinding.recyclerSubscriber.adapter = RecyclerAdapterView(it) { selectItem: Subscriber ->
                listItemClicked(selectItem)
            }
        })

    }
    
    private fun listItemClicked(subscriber:Subscriber){
        Toast.makeText(this,"clicked ${subscriber.name}",Toast.LENGTH_SHORT).show()
    }

    private fun initRecyclerView(){
        rBinding.recyclerSubscriber.layoutManager = LinearLayoutManager(this)
        displaySubscriberList()
    }
}
package com.learning.learningapp2022.ganeshhegde.roomdb

//repository class in the MVVM architecture
// -- with the dao interface as the constructor parameter. We call the dao interface methods using repository
class SubscriberRepository(private val dao:SubscribeDAO) {

    //this is from livedata
    val subscribers = dao.getAllSubscribers()

    suspend fun insert(subscriber : Subscriber){
        dao.insertSubscriber(subscriber)
    }

    suspend fun delete(subscriber:Subscriber){
        dao.deleteSubscriber(subscriber)
    }

    suspend fun update(subscriber:Subscriber){
        dao.updateSubscriber(subscriber)
    }

    suspend fun deleteAll(){
        dao.deleteAll()
    }
}

//In MVVM architecture --- the repository class will act as a mediator between the various data sources (remote web data sources and local database)
//and the viewmodel class. The data source can also be a cache.
package com.learning.learningapp2022.ganeshhegde.roomdb

class SubscriberRepository(private val dao:SubscribeDAO) {

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


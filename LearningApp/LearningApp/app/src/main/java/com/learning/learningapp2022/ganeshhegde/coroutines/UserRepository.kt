package com.learning.learningapp2022.ganeshhegde.coroutines

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers() : List<User>{
        delay(5000) //to mimic long-running task
        val users = listOf(User(1,"Hegde"),User(2,"Sameer"),User(3,"Bharat"),User(4,"Unnati")
        ,User(5,"Zak"))

        return users
    }
}
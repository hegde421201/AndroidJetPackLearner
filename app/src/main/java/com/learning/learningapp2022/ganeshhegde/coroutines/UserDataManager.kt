package com.learning.learningapp2022.ganeshhegde.coroutines

import kotlinx.coroutines.*

class UserDataManager {

    var count2 = 0
    lateinit var deferred : Deferred<Int>
    suspend fun getUserTotalCount():Int{
     
        var count = 20

        CoroutineScope(Dispatchers.IO).launch{
            delay(1000)
            count++
        }

       val defeered = CoroutineScope(Dispatchers.IO).async{
            delay(10000)
            return@async 3000
        }

        return count + defeered.await()
    }

    suspend fun getUser2():Int{

        coroutineScope {

            launch(Dispatchers.IO){
                delay(10000)
                count2 = 99
            }

            deferred = async(Dispatchers.IO){
                delay(4000)
                return@async 990
            }
        }

        return count2 + deferred.await()
    }
}
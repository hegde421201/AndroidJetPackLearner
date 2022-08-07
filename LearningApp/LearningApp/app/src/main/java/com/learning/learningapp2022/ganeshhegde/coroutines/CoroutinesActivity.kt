package com.learning.learningapp2022.ganeshhegde.coroutines

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.learning.learningapp2022.ganeshhegde.R
import com.learning.learningapp2022.ganeshhegde.databinding.CoroutinesBinding
import kotlinx.coroutines.*
//import kotlinx.coroutines.test.withTestContext

class CoroutinesActivity : AppCompatActivity() {

    private lateinit var cBinding: CoroutinesBinding
    private lateinit var cViewModel : CoroutinesViewModel

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cBinding = DataBindingUtil.setContentView(this, R.layout.coroutines)

        cViewModel = ViewModelProvider(this).get(CoroutinesViewModel::class.java)
        cViewModel.getUserData()
        cViewModel.users.observe(this, Observer {
            u -> u.forEach {
                Log.i("Name","Name is ${it.name}")
        }
        })

        cBinding.apply {

            btnCount.setOnClickListener{
                txtCounts.text = (++count).toString()
            }

            btnDownload.setOnClickListener {

                /*
               CoroutineScope -- it is ana interface
               Dispatchers.IO --- coroutine will run in a backgound thread from a shared pool of on-demand created threads
                * */
                /*CoroutineScope(Dispatchers.IO).launch {
                   //downLoadData()
                    Log.i("START","STARTED..")
                    val stock1 = getStock1()
                    val stock2 = getStock2()
                    val total = stock1 + stock2
                    Log.i("TOTAL","Total is $total")
                }*/

                CoroutineScope(Dispatchers.Main).launch {
                  //  downLoadData2()
                 // asyncawait()

                    /*
                    Log.i("START ASYNC","STARTED..AWAIT")
                    val stock1 = async{getStock1()}
        val stock2 = async{getStock2()}
        val total = stock1.await() + stock2.await()
        Log.i("TOTAL","Total is $total")
                    * */

                    //txtMessage.text=UserDataManager().getUserTotalCount().toString()
                    txtMessage.text=UserDataManager().getUser2().toString()
                }
            }
        }

    }

    private fun asyncawait() {

    }

    private suspend fun getStock1():Int{

        delay(10000)
        Log.i("Cbind1","stock 1 ")
        return 45
    }

    private suspend fun getStock2():Int{

        delay(8000)
        Log.i("Cbind1","stock 2 ")
        return 450
    }


    private suspend fun downLoadData() {
        for(k in 1..508880){
        withContext(Dispatchers.Main){



                //Log.i("Coroutines","Downloading user $k in ${Thread.currentThread().name}")
                cBinding.txtMessage.text = "Downloading user $k in ${Thread.currentThread().name}"
            }
        }


    }

    private fun downLoadData2() {
        for(k in 1..5){
            Log.i("Coroutines","Downloading user $k in ${Thread.currentThread().name}")
        }
    }

}
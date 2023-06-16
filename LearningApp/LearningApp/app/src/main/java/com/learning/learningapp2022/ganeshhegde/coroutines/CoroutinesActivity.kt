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

//Coroutines are software components that creates sub routines for cooperative multitasking.
// They were first used in 1958 for assembly programming
//In kotlin coroutines can be called as a sequence of well managed sub tasks.
//We can execute many coroutines in a single thread.

class CoroutinesActivity : AppCompatActivity() {

    private lateinit var cBinding: CoroutinesBinding
    private lateinit var cViewModel : CoroutinesViewModel

    private var count = 0 //when the button is clicked counter increments by 1

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

               // downLoadData2()

                /*
               CoroutineScope -- it is an interface
               Dispatchers.IO --- coroutine will run in a background thread from a shared pool of on-demand created threads
                * */
                /*CoroutineScope(Dispatchers.IO).launch {
                   //downLoadData()
                    Log.i("START","STARTED..")
                    val stock1 = getStock1()
                    val stock2 = getStock2()
                    val total = stock1 + stock2
                    Log.i("TOTAL","Total is $total")
                }*/

                //this is an interface ---- this helps us to keep track of coroutines ----
                // Dispatchers.IO ---- this is the context ---- here the coroutine will run in a background thread from a shared pool of on-demand
                //created threads.
                //Dispatchers.Main ----In this context the coroutine will run on the Main(UI) thread
                //Dispatchers.Default ---- The coroutine will be used to process CPU intensive tasks ---- sorting a large list
                //Dispatchers.Unconfined --- The coroutine will run on the current thread, but if it is suspended and resumed it will run on suspending
                //function's thread --- this is not recommended for android development






                CoroutineScope(Dispatchers.Main).launch {
                   // downLoadData2()

                 //   downLoadData()
                 // asyncawait()

                    /*
                    Log.i("START ASYNC","STARTED..AWAIT")
                    val stock1 = async{getStock1()}
        val stock2 = async{getStock2()}
        val total = stock1.await() + stock2.await()
        Log.i("TOTAL","Total is $total")
                    * */

                    //unstructured concurrency
                  //  txtMessage.text=UserDataManager().getUserTotalCount().toString()

                    //structured concurrency
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
        for(k in 1..100000){
            Log.i("Coroutines","Downloading user $k in ${Thread.currentThread().name}")
        }
    }

    //launch coroutine --- launch coroutine builder launches a new coroutine without blocking the current thread
    //It returns an instance of Job, which can be referenced to the coroutine
    //we use this builder for coroutines that does not have any result as the return value

    //async coroutine --- async coroutine builder launches a new coroutine without blocking the current thread
    //it returns an instance of Deferred<T>. We need to invoke await() to get the value
    // we use this builder for coroutines that does  have a result as the return value

    //produce coroutine --- produce builder is for coroutines which produces a stream of elements
    //returns an instance of receive channel

    //runblocking builder --- in android the coroutine we create using this thread will block the thread while the coroutine is executing
    //returns the result T

    //structured concurrency --- introduced in kotlin to avoid leaks and make coroutines more productive. It guarantees
    //to complete the work started by all the coroutines within the child scope before the return of the suspending function
    //we can keep track of tasks we started and also cancel them when needed in structured concurrency

    //in kotlin coroutines, whenever a coroutine is suspended, the current stack frame of the function is copied, and saved in the memory
    //when the function resumes after completing its task, the stack frame is copied back from where it was saved and starts running again.

    //examples of suspending functions ---- withContext,withTimeout,withTimeoutOrNull,join,delay,await,supervisorScope,coroutineScope
    //a suspending function, can be invoked from a coroutine block or from an another suspending function only

    /*

     Functions marked with the suspend keyword are transformed at compile time to be made asynchronous under the hood, even though they appear synchronous in the source code.
    A suspending function doesn't block a thread,
but only suspends the coroutine itself. (one thread can have more coroutines)
The thread is returned to the pool while the coroutine is waiting,
and when the waiting is done, the coroutine resumes on a free thread in the pool.
    * */

}
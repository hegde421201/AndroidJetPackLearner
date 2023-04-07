package com.learning.learningapp2022.ganeshhegde.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.work.*
import com.learning.learningapp2022.ganeshhegde.R
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class WorkManagerActivity : AppCompatActivity() {

    companion object {
        const val KEY_COUNT_VALUE = "key_count"
    }

    private lateinit var textview : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_manager)

        val button = findViewById<Button>(R.id.button_work)
        textview = findViewById(R.id.textView_worker)

        button.setOnClickListener{
            //setOneTimeWorkRequest()
            setPeriodicWorkRequest()
        }
    }

    private fun setPeriodicWorkRequest() {

        val periodicWorkRequest = PeriodicWorkRequest.Builder(DownloadWorker::class.java,900000,TimeUnit.MILLISECONDS).build()

        WorkManager.getInstance(applicationContext).enqueue(periodicWorkRequest)


    }

    private fun setOneTimeWorkRequest() {

        val workManager = WorkManager.getInstance(applicationContext)

        //data object----added later to the request
        val data = Data.Builder().putInt(KEY_COUNT_VALUE,8000).build()

        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .setRequiresCharging(true).build()

        val uploadWorker = OneTimeWorkRequest.Builder(UploadWorker::class.java).setConstraints(constraints).setInputData(data)
            .build()

        val filterRequest = OneTimeWorkRequest.Builder(FilterWorker::class.java).build()
        val compressRequest = OneTimeWorkRequest.Builder(CompressWorker::class.java).build()
        val downloadRequest = OneTimeWorkRequest.Builder(DownloadWorker::class.java).build()

        val parallelWorks = mutableListOf<OneTimeWorkRequest>()
        parallelWorks.add(downloadRequest)
        parallelWorks.add(filterRequest)


        //workManager.enqueue(uploadWorker)


        workManager.beginWith(parallelWorks).then(compressRequest).then(uploadWorker).enqueue()

        workManager.getWorkInfoByIdLiveData(uploadWorker.id).observe(this, Observer {
            textview.text = it.state.name
            if(it.state.isFinished){ //after the work is finished then only we get the data from the worker object
                val data = it.outputData
                val message = data.getString(UploadWorker.KEY_WORKER)
                Toast.makeText(applicationContext,message,Toast.LENGTH_LONG).show()
            }
        })

    }
}

//We use workmanager to run deferrable tasks
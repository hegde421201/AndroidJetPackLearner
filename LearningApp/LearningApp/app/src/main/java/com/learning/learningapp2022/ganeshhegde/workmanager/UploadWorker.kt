package com.learning.learningapp2022.ganeshhegde.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.text.SimpleDateFormat
import java.util.*

class UploadWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {

    companion object{
        const val KEY_WORKER = "key_worker"
    }


    override fun doWork(): Result {

        try{

            val count = inputData.getInt(WorkManagerActivity.KEY_COUNT_VALUE,0)

            for(i in 0 until count+1){
                Log.i("MY UPLOAD WORKER","Uploading $i")
            }

            //get return data from task finished time to the calling Activity
            val time = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
            val currentDate = time.format(Date())

            val outputData = Data.Builder().putString(KEY_WORKER,currentDate).build()

            //send the completion time as a result back to the main activity
            return Result.success(outputData)
        }catch(e:Exception)
        {
            return Result.failure()
        }
    }
}
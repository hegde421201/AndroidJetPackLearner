package com.learning.learningapp2022.ganeshhegde.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.text.SimpleDateFormat
import java.util.*


class DownloadWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {


    override fun doWork(): Result {

        try {

            for (i in 0 until 8000) {
                Log.i("DOWNLOAD WORKER", "download $i")
            }

            //get return data from task finished time to the calling Activity
            val time = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
            val currentDate = time.format(Date())
            Log.i("MY PERIODIC CHECKS","Completed $currentDate")

            return Result.success()

        } catch (e: Exception) {
            return Result.failure()
        }
    }
}
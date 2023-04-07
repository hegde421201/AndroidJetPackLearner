package com.learning.learningapp2022.ganeshhegde.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.text.SimpleDateFormat
import java.util.*

class FilterWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {


    override fun doWork(): Result {

        try {

            for (i in 0 until 8000) {
                Log.i("FILTER WORKER", "filter $i")
            }

            return Result.success()

        } catch (e: Exception) {
            return Result.failure()
        }
}
}
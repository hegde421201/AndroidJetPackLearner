package com.learning.learningapp2022.ganeshhegde.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class CompressWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {


    override fun doWork(): Result {

        try {

            for (i in 0 until 8000) {
                Log.i("COMPRESS WORKER", "compress $i")
            }

            return Result.success()

        } catch (e: Exception) {
            return Result.failure()
        }
    }
}
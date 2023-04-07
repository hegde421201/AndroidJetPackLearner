package com.learning.learningapp2022.ganeshhegde.notifications

import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.RemoteInput
import com.learning.learningapp2022.ganeshhegde.R
import okhttp3.internal.notify

class SecondActivity : AppCompatActivity() {

    val KEY_REPLY = "reply_key"
    private lateinit var result_text : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

         result_text = findViewById(R.id.text_result)

        receiveInput()
    }

    private fun receiveInput(){
        val intent = this.intent
        val remoteInput = RemoteInput.getResultsFromIntent(intent)

        remoteInput?.let {
            val inputString = remoteInput.getCharSequence(KEY_REPLY).toString()
            result_text.text = inputString

          val channelID = "com.learning.learningapp2022.ganeshhegde.notifications.channel1"
          val notificationID = 45

          val repliedNotification = NotificationCompat.Builder(this,channelID)
              .setSmallIcon(android.R.drawable.ic_dialog_info)
              .setContentText("Your reply received")
              .build()

         val notificationManager : NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
         notificationManager.notify(notificationID,repliedNotification)
        }
    }
}
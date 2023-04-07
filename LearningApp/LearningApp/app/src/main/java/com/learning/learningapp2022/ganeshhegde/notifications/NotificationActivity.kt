package com.learning.learningapp2022.ganeshhegde.notifications

import android.app.*
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.RemoteInput
import com.learning.learningapp2022.ganeshhegde.R

//set the minSDK to 26 for notification features
class NotificationActivity : AppCompatActivity() {

    //step 1: create notification channel -- define the ID
    private val channelID = "com.learning.learningapp2022.ganeshhegde.notifications.channel1"

    //step 2 --- define the notification manager instance required to create both the notification channel and the notification instance
    private var notificationManager : NotificationManager? = null

    private val KEY_REPLY = "reply_key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        createNotificationChannel(channelID,"DemoChannel","This is a demo application")

        val button = findViewById<Button>(R.id.button_notify)

        button.setOnClickListener{
                displayNotification()
        }
    }

    private fun displayNotification() {

        val notificationID = 45

        val tapIntent = Intent(this,SecondActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent : PendingIntent = PendingIntent.getActivity(this,0,tapIntent,PendingIntent.FLAG_UPDATE_CURRENT)

        //reply action
        val remoteInput: RemoteInput = RemoteInput.Builder(KEY_REPLY).run {
            setLabel("Insert your name here")
            build()
        }

        val replyAction : NotificationCompat.Action = NotificationCompat.Action
            .Builder(0,"REPLY",pendingIntent).addRemoteInput(remoteInput).build()

        val detailsIntent = Intent(this,DetailsActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntentD : PendingIntent = PendingIntent.getActivity(this,0,detailsIntent,PendingIntent.FLAG_UPDATE_CURRENT)

        val settingsIntent = Intent(this,SettingsActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntentS : PendingIntent = PendingIntent.getActivity(this,0,settingsIntent,PendingIntent.FLAG_UPDATE_CURRENT)

        val actionDetails = NotificationCompat.Action.Builder(0,"Details",pendingIntentD).build()
        val actionSettings = NotificationCompat.Action.Builder(0,"Settings",pendingIntentS).build()

        //title,icon,message --- NotificationCompat creates the notification object
        val notification = NotificationCompat.Builder(this@NotificationActivity,channelID)
                .setContentTitle("Demo title").setContentText("This is a demo notification").setSmallIcon(android.R.drawable.ic_dialog_info)
            .setAutoCancel(true)
            //.setContentIntent(pendingIntent)
            .addAction(replyAction)
            .addAction(actionDetails)
            .addAction(actionSettings)
            .setPriority(NotificationCompat.PRIORITY_HIGH).build()

        notificationManager?.notify(notificationID,notification)
    }

    private fun createNotificationChannel(id:String,name:String,channelDescription:String){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val importance = NotificationManager.IMPORTANCE_HIGH

            //a notification channel has ID,name and importance level
            val channel = NotificationChannel(id,name,importance).apply {
                description = channelDescription
            }

            //create the channel
            notificationManager?.createNotificationChannel(channel)
        }

    }
}
package com.widyawacana.stuncare.ui.presentation

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.annotation.RequiresApi
import com.widyawacana.stuncare.utils.NotificationKeys.RMNDR_NOTI_CHNNL_ID
import com.widyawacana.stuncare.utils.NotificationKeys.RMNDR_NOTI_CHNNL_NAME
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class StuncareApplication: Application() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate() {
        super.onCreate()
        val notificationChannel = NotificationChannel(
            RMNDR_NOTI_CHNNL_ID,
            RMNDR_NOTI_CHNNL_NAME,
            NotificationManager.IMPORTANCE_HIGH
        )

        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(notificationChannel)
    }
}
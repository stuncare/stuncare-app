package com.widyawacana.stuncare.data.local.alarmmanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.widyawacana.nontonskuy.data.dataalarmmanager.ReminderNotification
import com.widyawacana.stuncare.utils.NotificationKeys.RMNDR_NOTI_TITLE_KEY


class ReminderReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val scheduleNotificationService = context?.let { ReminderNotification(it) }
        val title: String = intent?.getStringExtra(RMNDR_NOTI_TITLE_KEY) ?: return
        scheduleNotificationService?.sendReminderNotification(title)
    }
}
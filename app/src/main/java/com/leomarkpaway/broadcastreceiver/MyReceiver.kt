package com.leomarkpaway.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.leomarkpaway.broadcastreceiver.enums.IntentAction

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            IntentAction.CUSTOM.id -> {
                Log.d("onReceive", "custom")
            }
        }
    }
}
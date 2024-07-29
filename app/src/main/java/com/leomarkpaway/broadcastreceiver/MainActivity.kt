package com.leomarkpaway.broadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var myReceiver: MyReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myReceiver = MyReceiver()
        val filter = IntentFilter().apply {
            addAction("com.example.ACTION_CUSTOM")
        }
        registerReceiver(myReceiver, filter)

        val intent = Intent("com.example.ACTION_CUSTOM")
        sendBroadcast(intent)

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(myReceiver)
    }

}
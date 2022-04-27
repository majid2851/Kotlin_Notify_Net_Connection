package com.example.kotlin_notify_net_connection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch {
            if (NetworkHelper.isNetworkConnected(this@MainActivity)==true)
            {
                Log.i("mag2851","connected")
            }else Log.i("mag2851","disconnected")

        }


    }
}
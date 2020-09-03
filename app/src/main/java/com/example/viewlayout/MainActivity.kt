package com.example.viewlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Activity", "MainActivity: onCreate")
    }


    override fun onStart() {
        super.onStart()
        Log.e("Activity", "MainActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity", "MainActivity: onResume")
    }

    override fun onSaveInstanceState(){
        super.onSaveInstanceState(onState,onPersistentState)
    }
}
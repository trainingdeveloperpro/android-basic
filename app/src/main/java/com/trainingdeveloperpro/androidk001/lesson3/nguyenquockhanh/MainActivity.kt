package com.trainingdeveloperpro.androidk001.lesson3.nguyenquockhanh

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private val TAG : String = "MyActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        if (Build.VERSION.SDK_INT >= 21) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            getWindow().statusBarColor = ContextCompat.getColor(this, R.color.colorMain)
        }
        Log.v(TAG, "App created")
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG, "App starting")
    }

    override fun onResume() {
        super.onResume()
        Log.v(TAG, "App resuming")
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG, "App paused")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(TAG, "App restarted")
    }

    override fun onStop() {
        super.onStop()
        Log.v(TAG, "App stopping")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "App destroyed")
    }

    fun signIn(view:View){
        val intent = Intent(this, signUp::class.java)
        startActivity(intent)
    }

}

package com.github.studyandroid.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @Override
    override fun onStart() {
        super.onStart()
    }

    @Override
    override fun onResume() {
        super.onResume()
    }

    @Override
    override fun onPause() {
        super.onPause()
    }

    @Override
    override fun onStop() {
        super.onStop()
    }

    @Override
    override fun onDestroy() {
        super.onDestroy()
    }
}

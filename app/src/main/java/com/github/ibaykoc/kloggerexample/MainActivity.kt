package com.github.ibaykoc.kloggerexample

import android.os.Bundle
import com.github.ibaykoc.klogger.LoggedAppCompatActivity
import com.github.ibaykoc.klogger.extension.log

class MainActivity : LoggedAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log("Log from KLogger")
    }
}

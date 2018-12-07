package com.github.ibaykoc.klogger

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.ibaykoc.klogger.KLog

abstract class LoggedAppCompatActivity : AppCompatActivity() {

    private val stackLevelUp = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        KLog.log(this::class, "♻ onCreate", stackLevelUp)
        super.onCreate(savedInstanceState)
    }

    override fun onPause() {
        KLog.log(this::class, "♻ onPause", stackLevelUp)
        super.onPause()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        KLog.log(this::class, "♻ onConfigurationChanged", stackLevelUp)
        super.onConfigurationChanged(newConfig)
    }

    override fun onResume() {
        KLog.log(this::class, "♻ onResume", stackLevelUp)
        super.onResume()
    }

    override fun onDestroy() {
        KLog.log(this::class, "♻ onDestroy", stackLevelUp)
        super.onDestroy()
    }
}
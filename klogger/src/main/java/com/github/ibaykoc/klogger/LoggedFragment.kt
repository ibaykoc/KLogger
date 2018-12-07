package com.github.ibaykoc.klogger

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.ibaykoc.klogger.KLog

abstract class LoggedFragment : Fragment() {
    private val stackLevelUp = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        KLog.log(this::class, "♻ onCreate", stackLevelUp)
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        KLog.log(this::class, "♻ onAttach", stackLevelUp)
        super.onAttach(context)
    }

    override fun onStart() {
        KLog.log(this::class, "♻ onStart", stackLevelUp)
        super.onStart()
    }

    override fun onPause() {
        KLog.log(this::class, "♻ onPause", stackLevelUp)
        super.onPause()
    }

    override fun onResume() {
        KLog.log(this::class, "♻ onResume", stackLevelUp)
        super.onResume()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        KLog.log(this::class, "♻ onConfigurationChanged", stackLevelUp)
        super.onConfigurationChanged(newConfig)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        KLog.log(this::class, "♻ onViewCreated", stackLevelUp)
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        KLog.log(this::class, "♻ onDestroy", stackLevelUp)
        super.onDestroy()
    }
}
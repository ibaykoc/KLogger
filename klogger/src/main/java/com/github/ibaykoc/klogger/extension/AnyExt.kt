package com.github.ibaykoc.klogger.extension

import com.github.ibaykoc.klogger.KLog

fun Any.log(message: String) {
    KLog.log(this::class, message, 6)
}
package com.github.ibaykoc.klogger

import kotlin.reflect.KClass

class KLog {

    companion object {
        private const val defaultStackLevelUp = 6

        var includeLineLocation = true
        fun error(clazz: KClass<*>, message: String, stackLevelUp: Int = defaultStackLevelUp) {
            if (BuildConfig.DEBUG)
                System.out.println("KLOG:E [${clazz.simpleName}${if (includeLineLocation) ", ${getFileLocation(stackLevelUp)}" else ""}]: $message")
        }

        fun error(tag: String, message: String, stackLevelUp: Int = defaultStackLevelUp) {
            if (BuildConfig.DEBUG)
                System.out.println("KLOG:E [$tag${if (includeLineLocation) ", ${getFileLocation(stackLevelUp)}" else ""}]: $message")
        }

        fun log(clazz: KClass<*>, message: String, stackLevelUp: Int = defaultStackLevelUp) {
            if (BuildConfig.DEBUG)
                System.out.println("KLOG:D [${clazz.simpleName}${if (includeLineLocation) ", ${getFileLocation(stackLevelUp)}" else ""}]: $message")
        }

        fun log(tag: String, message: String, stackLevelUp: Int = defaultStackLevelUp) {
            if (BuildConfig.DEBUG)
                System.out.println("KLOG:D [$tag${if (includeLineLocation) ", ${getFileLocation(stackLevelUp)}" else ""}]: $message")
        }

        private fun getFileLocation(stackLevelUp: Int): String = "(${getFileName(stackLevelUp)}:${getLineNumber(stackLevelUp)})"
        private fun getLineNumber(stackLevelUp: Int): Int = Thread.currentThread().stackTrace[stackLevelUp].lineNumber
        private fun getFileName(stackLevelUp: Int): String = Thread.currentThread().stackTrace[stackLevelUp].fileName
    }

}
package com.github.studyandroid.app.application

/**
 * Copyright (c) 2019 GitHub, Inc.
 * Description: Crash handler
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
class CrashHandler private constructor() : Thread.UncaughtExceptionHandler {
    companion object {
        val instance = CrashHandlerHolder.holder
    }

    private object CrashHandlerHolder {
        val holder: CrashHandler = CrashHandler()
    }

    override fun uncaughtException(t: Thread, e: Throwable) {
        e.printStackTrace()
        android.os.Process.killProcess(android.os.Process.myPid())
    }
}
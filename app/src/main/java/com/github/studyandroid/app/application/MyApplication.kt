package com.github.studyandroid.app.application

import android.app.Application

/**
 * Copyright (c) 2019 GitHub, Inc.
 * Description: Application
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrashHandler.instance
    }
}
package com.github.studyandroid.app.application

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

/**
 * Copyright (c) 2019 GitHub, Inc.
 * Description: Application
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
class MyApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        CrashHandler.instance
    }
}
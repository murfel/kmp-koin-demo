package org.example.project

import android.app.Application
import di.initKoin

class DemoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}
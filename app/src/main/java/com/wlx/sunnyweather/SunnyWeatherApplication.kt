package com.wlx.sunnyweather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        @SuppressWarnings("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "CShe3bU0rBj8VRV5"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
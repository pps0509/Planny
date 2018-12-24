package com.planny

import android.app.Application
import android.content.Context
import android.util.Log


class Planny : Application () {

    companion object {
        val tag = "Planny"
        var ctx: Context? = null
    }

    override fun onCreate() {

        super.onCreate()
        ctx = applicationContext
        Log.v(tag, "[ ON CREATE ]")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.w(tag, "[ ON LOW MEMORY ]")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.d(tag, "[ ON TRIM MEMORY ]: $level")
    }


}

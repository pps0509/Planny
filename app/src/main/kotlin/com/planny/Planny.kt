package com.planny

import android.app.Application
import android.content.Context


class Planny : Application () {

    companion object {
        var ctx: Context? = null
    }

    override fun onCreate() {

        super.onCreate()
        ctx = applicationContext
    }
}

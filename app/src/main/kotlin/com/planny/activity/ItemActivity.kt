package com.planny.activity

import android.os.Bundle
import android.util.Log
import com.planny.R
import com.planny.model.MODE

abstract class ItemActivity : BaseActivity() {

    protected var mode = MODE.VIEW

    override fun getActivityTitle() = R.string.app_name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val modeToSet = intent.getIntExtra(MODE.EXTRAS_KEY, MODE.VIEW.mode)
        mode = MODE.getByValue(modeToSet)
        Log.v(tag, "Mode [ $mode ]")
    }

}



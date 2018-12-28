package com.planny.activity

import android.os.Bundle
import android.util.Log
import com.planny.R
import com.planny.model.MODE

class TODOActivity : ItemActivity() {

    override val tag = "ToDo activity"
    override fun getLayout() = R.layout.activity_todo
    //override fun getActivityTitle() = R.string.app_name

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val modeToSet = intent.getIntExtra(MODE.EXTRAS_KEY, MODE.VIEW.mode)
        mode = MODE.getByValue(modeToSet)
        Log.v(tag, "Mode [ $mode ]")
    }
    */

}


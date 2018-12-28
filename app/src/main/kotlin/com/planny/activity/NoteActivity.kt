package com.planny.activity

import android.os.Bundle
import android.util.Log
import com.planny.R
import com.planny.model.MODE


//TODO: I made these notes, TODO activity classes non-abstract. and the app started working fine. why?? find out !!

class NoteActivity : ItemActivity() {

    override val tag = "Note activity"
    override fun getLayout() = R.layout.activity_note
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



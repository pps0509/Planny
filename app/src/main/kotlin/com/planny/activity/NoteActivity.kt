package com.planny.activity

import android.os.Bundle
import android.util.Log
import com.planny.R
import com.planny.model.MODE


//TODO: I made these notes, TODO activity classes non-abstract. and the app started working fine. why?? find out !!

class NoteActivity : ItemActivity() {

    override val tag = "Note activity"
    override fun getLayout() = R.layout.activity_note

}



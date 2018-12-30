package com.planny.activity

import com.planny.R



//TODO: I made these notes, TODO activity classes non-abstract. and the app started working fine. why?? find out !!

class NoteActivity : ItemActivity() {

    override val tag = "Note activity"
    override fun getLayout() = R.layout.activity_note

}



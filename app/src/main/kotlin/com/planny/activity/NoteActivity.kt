package com.planny.activity

import com.planny.R

abstract class NoteActivity : ItemActivity() {

    override val tag = "Note activity"
    override fun getLayout() = R.layout.activity_note

}



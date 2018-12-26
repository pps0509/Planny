package com.planny.activity

import com.planny.R

abstract class TODOActivity : ItemActivity() {

    override val tag = "ToDo activity"
    override fun getLayout() = R.layout.activity_todo

}


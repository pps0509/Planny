package com.planny.activity

import android.os.Bundle
import android.util.Log
import com.planny.R
import com.planny.model.MODE

class TODOActivity : ItemActivity() {

    override val tag = "ToDo activity"
    override fun getLayout() = R.layout.activity_todo

}


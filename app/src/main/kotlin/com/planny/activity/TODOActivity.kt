package com.planny.activity


import android.os.Bundle
import com.planny.R
import kotlinx.android.synthetic.main.activity_todo.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class TODOActivity : ItemActivity() {

    companion object {
        val EXTRA_DATE = "EXTRA_DATE"
        val EXTRA_TIME = "EXTRA_TIME"
        var strTesting = "hghghghg"

    }

    override val tag = "ToDo activity"
    override fun getLayout() = R.layout.activity_todo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val data  = intent.extras
        /*
        data?.let {
            val date = data.getString(EXTRA_DATE, "")
            val time = data.getString(EXTRA_TIME, "")
            pick_date.text = date
            pick_time.text = time

        }
        */
        //val str = data?.getString(strTesting)



        val date = Date(System.currentTimeMillis())
        val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())

        val dateStr = dateFormat.format(date)
        val timeStr = timeFormat.format(date)

        pick_date.text = dateStr
        pick_time.text = timeStr
    }

}


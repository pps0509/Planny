package com.planny.fragment

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.planny.R
import com.planny.activity.NoteActivity
import com.planny.activity.TODOActivity
import com.planny.model.MODE
import java.text.SimpleDateFormat
import java.util.*

class ItemsFragment : BaseFragment () {

    //private val TODO_REQUEST : Int = 0
    //private val NOTE_REQUEST : Int = 1
    override val logTag = "Items fragment"
    override fun getLayout(): Int {
        return R.layout.fragment_items
    }

    override fun onCreateView(
        inflater: LayoutInflater,   //I removed ? and it works fine. why is that? TODO
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(getLayout(), container, false)
        val btn = view?.findViewById<FloatingActionButton>(R.id.new_item)
        btn?.setOnClickListener {
            val items = arrayOf(
                getString(R.string.todos),
                getString(R.string.notes)
            )
            val builder = AlertDialog.Builder(this@ItemsFragment.context)
                .setTitle(R.string.choose_a_type)
                .setItems(
                    items
                ) { _, which -> when (which) {
                    0 -> {
                        openCreateTodo()
                    }
                    1 -> {
                        openCreateNote()
                    }
                    else -> Log.e(logTag, "Unknown option selected [ $which ]")
                }
                }
            builder.show()
        }
        return view
    }



    private fun openCreateNote() {
        val intent = Intent(context, NoteActivity::class.java)
        val data = Bundle()
        data.putInt(MODE.EXTRAS_KEY, MODE.CREATE.mode)
        intent.putExtras(data)
        //startActivityForResult(intent, NOTE_REQUEST)
        startActivity(intent)
    }

    private fun openCreateTodo() {

        //val date = Date(System.currentTimeMillis())
        //val dateFormat = SimpleDateFormat("MMM dd YYYY", Locale.ENGLISH)
        //val timeFormat = SimpleDateFormat("MM:HH", Locale.ENGLISH)


        val intent = Intent(context, TODOActivity::class.java)
        val data = Bundle()
        data.putInt(MODE.EXTRAS_KEY, MODE.CREATE.mode)
        //data.putString(TODOActivity.EXTRA_DATE, dateFormat.format(date))
        //data.putString(TODOActivity.EXTRA_TIME, timeFormat.format(date))

        //data.putString(TODOActivity.EXTRA_DATE, testStr)
        //data.putString(TODOActivity.EXTRA_TIME, testStr)

        //startActivityForResult(intent, TODO_REQUEST)

        //data.putString(TODOActivity.strTesting, testStr)


        startActivity(intent)
    }

    /*
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            TODO_REQUEST -> {
                if(resultCode == Activity.RESULT_OK) {
                    Log.i(logTag, "We created new TODO.")
                } else {
                    Log.w(logTag, "We didn't create new TODO")
                }
            }
            NOTE_REQUEST -> {
                if(resultCode == Activity.RESULT_OK) {
                    Log.i(logTag, "We created new note")
                } else {
                   Log.w(logTag, "We didn't create new note")
                }
            }
        }
    }
    */
}


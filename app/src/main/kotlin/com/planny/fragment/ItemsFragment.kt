package com.planny.fragment

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

class ItemsFragment : BaseFragment () {

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
                    items,
                    { _, which -> when (which) {
                            0 -> {
                                openCreateTodo()
                            }
                            1 -> {
                                openCreateNote()
                            }
                            else -> Log.e(logTag, "Unknown option selected [ $which ]")
                        }
                    }
                )
            builder.show()
        }
        return view
    }


    private fun openCreateNote() {
        val intent = Intent(context, NoteActivity::class.java)
        intent.putExtra(MODE.EXTRAS_KEY, MODE.CREATE.mode)
        startActivity(intent)
    }

    private fun openCreateTodo() {
        val intent = Intent(context, TODOActivity::class.java)
        intent.putExtra(MODE.EXTRAS_KEY, MODE.CREATE.mode)
        startActivity(intent)
    }
}


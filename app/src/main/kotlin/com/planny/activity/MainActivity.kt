package com.planny.activity

import android.os.Bundle
import com.planny.R
import com.planny.fragment.ItemsFragment
import com.planny.fragment.ManualFragment
import kotlinx.android.synthetic.main.activity_header.*

class MainActivity : BaseActivity() {


    override val tag = "Main activity"
    override fun getLayout() = R.layout.activity_main
    override fun getActivityTitle() = R.string.app_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragment = ItemsFragment()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, fragment)
            .commit()

        filter_menu.setText("H")
        filter_menu.setOnClickListener {
            val userManualFrg = ManualFragment()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, userManualFrg)
                .addToBackStack("User Manual")
                .commit()
        }
    }

}






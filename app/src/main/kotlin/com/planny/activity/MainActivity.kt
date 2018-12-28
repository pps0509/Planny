package com.planny.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.planny.R
import com.planny.fragment.ItemsFragment
import com.planny.fragment.ManualFragment
import kotlinx.android.synthetic.main.activity_header.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override val tag = "Main activity"
    override fun getLayout() = R.layout.activity_main
    override fun getActivityTitle() = R.string.app_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pager.adapter = ViewPagerAdapter(supportFragmentManager)


    }

    private class ViewPagerAdapter(manager: FragmentManager) : FragmentStatePagerAdapter(manager) {

        override fun getItem(position: Int): Fragment {

            return ItemsFragment()
        }

        override fun getCount(): Int {
            return 5
        }
    }
}



/*        supportFragmentManager
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
        }*/


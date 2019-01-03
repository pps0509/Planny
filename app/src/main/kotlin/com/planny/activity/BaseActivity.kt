package com.planny.activity

import android.content.pm.PackageManager
import com.planny.R
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.ActivityCompat.requestPermissions
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*



abstract class BaseActivity : AppCompatActivity() {

    protected abstract val tag: String
    protected abstract fun getLayout(): Int
    protected abstract fun getActivityTitle() : Int

    companion object {
        val REQUEST_GPS = 0
    }

    private fun requestGpsPermission() {
        requestPermissions(
            this@BaseActivity,
            arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION ),
            REQUEST_GPS )
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {

        if(requestCode == REQUEST_GPS) {
            for(grantResult in grantResults){
                if(grantResult == PackageManager.PERMISSION_GRANTED) {
                    Log.i(tag, String.format(Locale.ENGLISH, " PERMISSION GRANTED [ %d ] Request Code : $requestCode"))
                }
                else {
                    Log.e(tag, String.format(Locale.ENGLISH, "PERMISSION DENIED [ %d ] Request Code: $requestCode"))
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        setSupportActionBar(toolbar)

        Log.v(tag, "[ ON CREATE ]")

        requestGpsPermission ()
    }



    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        Log.v(tag, "[ ON POST CREATE ]")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(tag, "[ ON RESTART ]")
    }

    override fun onStart() {
        super.onStart()
        Log.v(tag, "[ ON START ]")
    }

    override fun onResume() {
        super.onResume()
        Log.v(tag, "[ ON RESUME ]")

    }

    override fun onPostResume() {
        super.onPostResume()
        Log.v(tag, "[ ON POST RESUME ]")
    }

    override fun onPause() {
        super.onPause()
        Log.v(tag, "[ ON PAUSE ]")
    }

    override fun onStop() {
        super.onStop()
        Log.v(tag, "[ ON STOP ]")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(tag, "[ ON DESTROY ]")
    }
 }
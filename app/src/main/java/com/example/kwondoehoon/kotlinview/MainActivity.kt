package com.example.kwondoehoon.kotlinview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





















        findViewById<View>(R.id.TextView1).setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

        findViewById<View>(R.id.TextView2).setOnLongClickListener {
            it.clipToOutline
        }



        findViewById<View>(R.id.TextView2).setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

            }
        }















    }
}

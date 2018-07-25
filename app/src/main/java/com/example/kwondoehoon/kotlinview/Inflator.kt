package com.example.kwondoehoon.kotlinview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast


class Inflater_Layout(val container:LinearLayout,val context: Context){

    val inflater:LayoutInflater

    init{
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        createView()
    }

    fun createView(){

        addListener((inflater.inflate(R.layout.sub_layout, container, true)))
    }

    fun addListener(parent: View){
        parent.findViewById<Button>(R.id.Button1).setOnClickListener {
            Toast.makeText(context,"부분화며늘릭",Toast.LENGTH_LONG).show()
        }
    }






}
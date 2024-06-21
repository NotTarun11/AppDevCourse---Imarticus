package com.examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.rubiconsurge.firstkotlin.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var data = intent.extras?.getString("mykey")
        Log.i("homeactivity",data.toString())
        //put the data either in a log or on the textview
        var homeTextView: TextView = findViewById(R.id.tvHome)
        homeTextView.setText(data)
    }
}
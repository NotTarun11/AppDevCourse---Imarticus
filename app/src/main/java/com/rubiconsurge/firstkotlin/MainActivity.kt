package com.rubiconsurge.firstkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val DialButton = findViewById<Button>(R.id.dialbutton)
        val AlarmButton = findViewById<Button>(R.id.alarmbutton)

        DialButton.setOnClickListener{
            val intent = Intent(this,DialActivity::class.java)
            startActivity(intent)
        }
        AlarmButton.setOnClickListener{
            val intent = Intent(this,AlarmActivity::class.java)
            startActivity(intent)
        }
    }

}
package com.rubiconsurge.firstkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class DialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dial)

        val phone = findViewById<EditText>(R.id.phoneNum)
        val dialButton = findViewById<Button>(R.id.dialer)

        dialButton.setOnClickListener{
            val u = Uri.parse("tel:" + phone.text.toString())
            val intent = Intent(Intent.ACTION_DIAL, u)
            startActivity(intent)
        }
    }
}
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
        val inputField = findViewById<EditText>(R.id.Name)
        val password = findViewById<EditText>(R.id.password)
        val submitButton = findViewById<Button>(R.id.button1)
        var enteredName = ""
        var pass = ""
        submitButton.setOnClickListener {
            enteredName = inputField.text.toString()
            pass = password.text.toString()
            if (enteredName == ""){
                Toast.makeText(this@MainActivity,"Please, Enter your name",Toast.LENGTH_SHORT).show()
            }
            else {
                if (pass == "1234") {
                    val intent = Intent(this, SecondScreen::class.java)
                    intent.putExtra("USER",enteredName)
                    startActivity(intent)
                }
                else {
                    Toast.makeText(this@MainActivity,"Incorrect Password",Toast.LENGTH_SHORT).show()
                    password.text.clear()
                }
            }
        }


    }
}
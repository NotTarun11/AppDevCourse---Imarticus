package com.rubiconsurge.firstkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val items = mutableListOf<Item>()
        items.add(Item("bro1","bro1@gmail.com",R.drawable.a))
        items.add(Item("bro2","bro2@gmail.com",R.drawable.b))
        items.add(Item("bro3","bro3@gmail.com",R.drawable.c))
        items.add(Item("bro4","bro4@gmail.com",R.drawable.d))
        items.add(Item("bro5","bro5@gmail.com",R.drawable.e))
        items.add(Item("bro6","bro6@gmail.com",R.drawable.f))
        items.add(Item("bro7","bro7@gmail.com",R.drawable.g))
        items.add(Item("bro8","bro8@gmail.com",R.drawable.h))

        items.add(Item("bro1","bro1@gmail.com",R.drawable.a))
        items.add(Item("bro2","bro2@gmail.com",R.drawable.b))
        items.add(Item("bro3","bro3@gmail.com",R.drawable.c))
        items.add(Item("bro4","bro4@gmail.com",R.drawable.d))
        items.add(Item("bro5","bro5@gmail.com",R.drawable.e))
        items.add(Item("bro6","bro6@gmail.com",R.drawable.f))
        items.add(Item("bro7","bro7@gmail.com",R.drawable.g))
        items.add(Item("bro8","bro8@gmail.com",R.drawable.h))



        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(applicationContext)
        recycler.adapter = Adapter(applicationContext,items)
    }

}
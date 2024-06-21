package com.examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rubiconsurge.firstkotlin.R
import com.examples.MarsApi
import com.examples.MarsApiService
import com.rubiconsurge.firstkotlin.R.*
import com.rubiconsurge.firstkotlin.R.id.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity(){
    var TAG = HomeActivity::class.java.simpleName    //"HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }


    private fun getMarsPhotos() {
        GlobalScope.launch {

            var listMarsPhotos =   MarsApi.retrofitService.getPhotos()
            var tvHome: TextView = findViewById(R.id.tvHome)
            tvHome.setText(listMarsPhotos.get(1).imgSrc)
            Log.i("homeactiviy",listMarsPhotos.size.toString())
        }
    }

    fun getJson(view: View) {
        getMarsPhotos()
    }

}
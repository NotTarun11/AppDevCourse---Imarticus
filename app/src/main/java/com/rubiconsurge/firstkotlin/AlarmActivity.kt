package com.rubiconsurge.firstkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText

class AlarmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)

        val msg = findViewById<EditText>(R.id.alarmMsg)
        val hours = findViewById<EditText>(R.id.alarmHour)
        val mins = findViewById<EditText>(R.id.alarmMin)
        val setButton = findViewById<Button>(R.id.alarmCreate)

        setButton.setOnClickListener{
            val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                putExtra(AlarmClock.EXTRA_MESSAGE, msg.text.toString())
                putExtra(AlarmClock.EXTRA_HOUR, hours.text.toString().toInt())
                putExtra(AlarmClock.EXTRA_MINUTES, mins.text.toString().toInt())
            }
            startActivity(intent)
        }
    }
}
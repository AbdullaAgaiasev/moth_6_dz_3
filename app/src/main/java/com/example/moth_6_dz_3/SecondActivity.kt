package com.example.moth_6_dz_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var receiver: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        receiver = findViewById(R.id.received_value_id)
        // create the get Intent object
        val intent = intent
        // receive the value by getStringExtra() method and
        // key must be same which is send by first activity
        val str = intent.getStringExtra(MESSAGE_KEY)
        // display the string into textView
        receiver.text = str

    }

    companion object {
        const val MESSAGE_KEY = "message_key"
    }
}
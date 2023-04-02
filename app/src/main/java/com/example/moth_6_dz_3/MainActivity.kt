package com.example.moth_6_dz_3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.moth_6_dz_3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var viewModel: MainViewModel? = null

    private lateinit var sendButton: Button
    private lateinit var sendText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sendButton = findViewById(R.id.btn_history)
        sendText = findViewById(R.id.tv_zero)

        // add the OnClickListener in sender button after clicked this button following Instruction will run
        sendButton.setOnClickListener {
            // get the value which input by user in EditText and convert it to string
            val str = sendText.text.toString()
            // Create the Intent object of this class Context() to Second_activity class
            val intent = Intent(applicationContext, SecondActivity::class.java)
            // now by putExtra method put the value in key, value pair key is
            // message_key by this key we will receive the value, and put the string
            intent.putExtra("message_key", str)
            // start the Intent
            startActivity(intent)
        }

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        viewModel?.counter?.observe(this) {
            binding.tvZero.text = it.toString()
        }

        binding.btnPlus.setOnClickListener {
            viewModel?.onIncrementClick()
        }
        binding.btnMinus.setOnClickListener {
            viewModel?.onDecrementClick()
        }
    }
}
package com.example.birthdaycardaad

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingTextView: TextView = findViewById(R.id.greetingTextView)
        val messageTextView: TextView = findViewById(R.id.messageTextView)
        val changeMessageButton: Button = findViewById(R.id.changeMessageButton)


        val initialMessage = "Wishing you all the best on your special day!"
        messageTextView.text = initialMessage

        changeMessageButton.setOnClickListener {
            messageTextView.text = "Hope your birthday is as special as you are!"
        }
    }
}
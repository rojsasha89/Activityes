package com.tradewin.fifthlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textFromActivity = findViewById<TextView>(R.id.textFromActivity)
        val textFromActivity1 = findViewById<TextView>(R.id.textFromActivity1)

        textFromActivity.text = intent.getStringExtra("inputtedText")
        textFromActivity1.text = intent.getStringExtra("inputtedText1")
    }
}
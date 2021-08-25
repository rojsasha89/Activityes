package com.tradewin.fifthlesson


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonHide = findViewById<Button>(R.id.btnHide)
        val editText = findViewById<EditText>(R.id.email)
        val editText1 = findViewById<EditText>(R.id.email1)
        val imgUser = findViewById<ShapeableImageView>(R.id.imgUser)

        buttonHide.setOnClickListener {
            val text = editText.text.toString()
            val text1 = editText1.text.toString()
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("inputtedText", text)
            intent.putExtra("inputtedText1", text1)



            startActivity(intent)
        }
    }
}
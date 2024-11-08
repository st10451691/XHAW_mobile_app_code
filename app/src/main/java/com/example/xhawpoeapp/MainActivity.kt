package com.example.xhawpoeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageLogo =findViewById<ImageView>(R.id.imageView)
        val imageMiddle =findViewById<ImageView>(R.id.imageView2)
        val textTitle =findViewById<TextView>(R.id.textView)
        val textSlogan =findViewById<TextView>(R.id.textView2)
        val textAbout =findViewById<TextView>(R.id.textView4)
        val buttonToday = findViewById<Button>(R.id.button)

        buttonToday?.setOnClickListener {
            val intent = Intent (this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}
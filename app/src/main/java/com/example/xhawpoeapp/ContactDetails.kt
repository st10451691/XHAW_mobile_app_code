package com.example.xhawpoeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ContactDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        val imageLogo =findViewById<ImageView>(R.id.imageView6)
        val textTitle =findViewById<TextView>(R.id.textView8)
        val textNumber =findViewById<TextView>(R.id.textView9)
        val textAddress =findViewById<TextView>(R.id.textView10)
        val textLocation =findViewById<TextView>(R.id.textView11)
    }
}
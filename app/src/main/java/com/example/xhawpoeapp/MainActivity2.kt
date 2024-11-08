package com.example.xhawpoeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imageLogo =findViewById<ImageView>(R.id.imageView3)
        val textHeading =findViewById<TextView>(R.id.textView3)
        val textBody =findViewById<TextView>(R.id.textView6)
        val buttonMonth =findViewById<Button>(R.id.button2)
        val buttonWeek =findViewById<Button>(R.id.button3)

        buttonMonth?.setOnClickListener {
            val intent = Intent (this,MonthCourses::class.java)
            startActivity(intent)

            buttonWeek?.setOnClickListener {
                Intent(this, WeekCourses::class.java)
                    startActivity(intent)
                }

            }

        }
    }

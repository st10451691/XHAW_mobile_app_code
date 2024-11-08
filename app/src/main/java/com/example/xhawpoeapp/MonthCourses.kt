package com.example.xhawpoeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MonthCourses : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month_courses)

        val imageLogo =findViewById<ImageView>(R.id.imageView4)
        val textTitle =findViewById<TextView>(R.id.textView5)
        val buttonFirstAid =findViewById<Button>(R.id.button6)
        val buttonSewing =findViewById<Button>(R.id.button7)
        val buttonLandscaping =findViewById<Button>(R.id.button8)
        val buttonLifeSkills =findViewById<Button>(R.id.button9)






    }
}
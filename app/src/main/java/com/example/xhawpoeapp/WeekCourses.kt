package com.example.xhawpoeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class WeekCourses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week_courses)

        val imageLogo =findViewById<ImageView>(R.id.imageView5)
        val textTitle =findViewById<TextView>(R.id.textView7)
        val buttonChildMinding =findViewById<Button>(R.id.button4)
        val buttonCooking =findViewById<Button>(R.id.button5)
        val buttonGardenMaintenance =findViewById<Button>(R.id.button10)
    }
}
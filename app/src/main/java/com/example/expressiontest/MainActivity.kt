package com.example.expressiontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myText: TextView = findViewById(R.id.textView)

        val name = "Umesh"
        val yearofBirth: Int = 1999
        var currentYear: Int = 2023
        var age:Int = currentYear - yearofBirth

        myText.text = "$name was born on $yearofBirth." + "Now Age of $name is $age"

    }
}
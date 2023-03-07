package com.example.mycalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var mainbttn1: Button? = null
    private var inputText1: EditText? = null
    private var viewResult1: TextView? = null
    private var pi = 3.14


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainbttn1 = findViewById(R.id.bttn1)
        inputText1 = findViewById(R.id.etInput1)
        viewResult1 = findViewById(R.id.tvResult1)
        mainbttn1?.setOnClickListener {
            val R0 = inputText1?.text.toString()
            val R = R0.toDouble()
            val S = R * R * pi
            viewResult1?.text = "S=$S"
        }
    }
}
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
    private var mainbttn2: Button? = null
    private var inputText2: EditText? = null
    private var viewResult2: TextView? = null
    private var mainbttn3: Button? = null
    private var inputText3: EditText? = null
    private var inputText4: EditText? = null
    private var viewResult3: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainbttn1 = findViewById(R.id.bttn1)
        inputText1 = findViewById(R.id.etInput1)
        viewResult1 = findViewById(R.id.tvResult1)

        mainbttn2 = findViewById(R.id.bttn2)
        inputText2 = findViewById(R.id.etInput2)
        viewResult2 = findViewById(R.id.tvResult2)

        mainbttn3 = findViewById(R.id.bttn3)
        inputText3 = findViewById(R.id.etInput3)
        inputText4 = findViewById(R.id.etInput4)
        viewResult3 = findViewById(R.id.tvResult3)

        mainbttn1?.setOnClickListener {
            val R0 = inputText1?.text.toString()
            val R = R0.toDouble()
            val S = R * R * pi
            viewResult1?.text = "S=$S"
        }

        mainbttn2?.setOnClickListener {
            val a0 = inputText2?.text.toString()
            val a = a0.toDouble()
            val S = a * a
            viewResult2?.text = "S=$S"
        }

        mainbttn3?.setOnClickListener {
            val a0 = inputText3?.text.toString()
            val b0 = inputText4?.text.toString()
            val a = a0.toDouble()
            val b = b0.toDouble()
            val S = a * b
            viewResult3?.text = "S=$S"
        }
    }
}
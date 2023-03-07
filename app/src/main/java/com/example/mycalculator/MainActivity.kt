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

    private var mainbttn4: Button? = null
    private var inputText5: EditText? = null
    private var inputText6: EditText? = null
    private var viewResult4: TextView? = null

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

        mainbttn4 = findViewById(R.id.bttn4)
        inputText5 = findViewById(R.id.etInput5)
        inputText6 = findViewById(R.id.etInput6)
        viewResult4 = findViewById(R.id.tvResult4)

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

        mainbttn4?.setOnClickListener {
            val a0 = inputText5?.text.toString()
            val h0 = inputText6?.text.toString()
            val a = a0.toDouble()
            val h = h0.toDouble()
            val S = 0.5 * a * h
            viewResult4?.text = "S=$S"
        }
    }
}
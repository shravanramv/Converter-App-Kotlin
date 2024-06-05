package com.example.converterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import java.math.RoundingMode
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val inputEditText = findViewById<EditText>(R.id.inputEditText)
        val submitButton = findViewById<Button>(R.id.button2)
        val convertButton = findViewById<Button>(R.id.button)
        val textview4 = findViewById<TextView>(R.id.textView4)

        convertButton.setOnClickListener {
            val name = inputEditText.text.toString().trim()
             if (name.isNotEmpty() && name.isDigitsOnly()){
                val celcius = name.toDouble()
                val fahrenheit = (celcius * 9/5) + 32
//                celcius.BigDecimal(celcius).setScale(2, RoundingMode.HALF_EVEN).toDouble()
                textview4.text = String.format("Result: %.2f'F ", fahrenheit)
            }
            else{
                Toast.makeText(this, "Please enter a correct value!", Toast.LENGTH_SHORT).show()
            }
        }

        submitButton.setOnClickListener {
            val name = inputEditText.text.toString().trim()
            if (name.isNotEmpty() && name.isDigitsOnly()){
                val fahrenheit = name.toDouble()
                val celcius = (fahrenheit - 32) * 5/9
//                celcius.BigDecimal(celcius).setScale(2, RoundingMode.HALF_EVEN).toDouble()
                textview4.text = String.format("Result: %.2f'C ", celcius)
            }
            else{
                Toast.makeText(this, "Please enter a correct value!", Toast.LENGTH_SHORT).show()
            }
        }
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}
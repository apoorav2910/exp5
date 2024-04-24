package com.example.exp5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var rbtn1 : RadioButton
    lateinit var rbtn2 : RadioButton
    lateinit var rbtn3 : RadioButton
    lateinit var rbtn4 : RadioButton
    lateinit var btn : Button
    lateinit var textbox : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rbtn1 = findViewById(R.id.r_btn1)
        rbtn2 = findViewById(R.id.r_btn2)
        rbtn3 = findViewById(R.id.r_btn3)
        rbtn4 = findViewById(R.id.r_btn4)
        btn = findViewById(R.id.btn)
        textbox = findViewById(R.id.textbox)

        btn.setOnClickListener(){
            check()
        }
    }

    fun check() {
        var select : String = "None"
        if (rbtn1.isChecked){
            select = "JAVA"
            var new = textbox.append(select)
            textbox.text = "Your Selection: $select"
        }
        if (rbtn2.isChecked){
            select = "Kotlin"
            var new = textbox.append(select)
            textbox.text = "Your Selection: $select"
        }
        if (rbtn3.isChecked){
            select = "C++"
            var new = textbox.append(select)
            textbox.text = "Your Selection: $select"
        }
        if (rbtn4.isChecked){
            select = "Python"
            var new = textbox.append(select)
            textbox.text = "Your Selection: $select"
        }

        Toast.makeText(this, "$select has been selected by you", Toast.LENGTH_SHORT).show()

    }


}
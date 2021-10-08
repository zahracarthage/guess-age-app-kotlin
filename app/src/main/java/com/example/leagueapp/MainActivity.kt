package com.example.leagueapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Method one using listener

       /* val btn_guess: Button = findViewById(R.id.guess_btn)
        btn_guess.setOnClickListener()
        {
            val d: EditText = findViewById(R.id.Age)
            val dob: Int = Integer.parseInt(d.text.toString())

            val currentyear = Calendar.getInstance().get(Calendar.YEAR)

            val myAge = currentyear - dob

            val SA: TextView = findViewById(R.id.ShowAge)

            SA.text = "your age is $myAge"

        }

        */
    }
    //Method 2 : using onClick events

    fun guess(view: View) {

        val d: EditText = findViewById(R.id.Age)
        val dob: Int = Integer.parseInt(d.text.toString())

        val currentyear = Calendar.getInstance().get(Calendar.YEAR)

        val myAge = currentyear - dob

        val SA: TextView = findViewById(R.id.ShowAge)

        SA.text = "your age is $myAge"
    }
}
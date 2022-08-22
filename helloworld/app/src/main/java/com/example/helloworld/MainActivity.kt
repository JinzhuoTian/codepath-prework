package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Show the layout file:activity_main
        setContentView(R.layout.activity_main)
        //Get a reference to button
        findViewById<Button>(R.id.button2).setOnClickListener {
            // Handle button tap
            //change the color of the text
            Log.i("Chloe", "Tapped on button")
            // Get a reference to the text view
            //Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))


        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Chloe", "Takpped on button")
            //change the text
            findViewById<TextView>(R.id.textView).setText(getResources().(R.string.text2))
            }
        }

    }
}
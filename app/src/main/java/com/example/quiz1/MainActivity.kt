package com.example.quiz1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)

        btn1.setOnClickListener {
            Intent(this,Activity1::class.java).also{
                startActivity(it)
            }
        }

        btn2.setOnClickListener {
            Intent(this,Activity2::class.java).also{
                startActivity(it)
            }
        }

        btn3.setOnClickListener {
            Intent(this,Activity3::class.java).also{
                startActivity(it)
            }
        }

        btn4.setOnClickListener {
            Intent(this,Activity4::class.java).also{
                startActivity(it)
            }
        }

        btn1.setOnClickListener {
            Intent(this,Activity1::class.java).also{
                startActivity(it)
            }
        }
    }
}

package com.example.classcaonepractical

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var b: Button
    lateinit var days: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        b = findViewById(R.id.btn)
        days = findViewById(R.id.nos)

        b.setOnClickListener {
            val dayCount = days.text.toString().toInt()
            val res = if (dayCount > 5) {
                dayCount * 5
            } else {
                0
            }
            Toast.makeText(this, "Fine is $res", Toast.LENGTH_LONG).show()
        }
    }
}

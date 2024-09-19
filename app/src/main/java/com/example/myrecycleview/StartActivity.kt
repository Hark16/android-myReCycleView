package com.example.myrecycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val et1 = findViewById<EditText>(R.id.et1)
        val btn1 = findViewById<Button>(R.id.btn1)

        btn1.setOnClickListener {
            val number = et1.text.toString().toIntOrNull() ?: 0
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("NUMBER", number)
            startActivity(intent)


        }
    }
}

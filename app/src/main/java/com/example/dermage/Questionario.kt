package com.example.dermage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Questionario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.questionario)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this@Questionario, Sugestao::class.java)
            startActivity(intent)
        }
    }
}
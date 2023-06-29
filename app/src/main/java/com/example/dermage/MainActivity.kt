package com.example.dermage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var dados: Dados
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        var nome = findViewById<EditText>(R.id.editTextText)
        var email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        dados = DadosHolder.getCounter()
        button.setOnClickListener{
            val nomeText = nome.text.toString().trim()
            val emailText = email.text.toString().trim()
            if (!TextUtils.isEmpty(nomeText)){
                dados.setNome(nomeText)
                dados.setEmail(emailText)
                val intent = Intent(this@MainActivity, Questionario::class.java)
                startActivity(intent)
            }
        }
    }

}
package com.example.dermage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Sugestao : AppCompatActivity() {
    private lateinit var dados: Dados
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sugestao)

        fun sendEmail() {
            dados = DadosHolder.getCounter()
            val recipientEmail = dados.getEmail()
            val subject = "Skincare do" + dados.getNome()
            val message = "Limpeza: Comece lavando o rosto com um limpador suave e adequado ao seu tipo de pele. Massageie suavemente em movimentos circulares e enxague com água morna. Isso removerá as impurezas e o acúmulo de oleosidade da pele." +
                    "Tonificação: Use um tônico facial para equilibrar o pH da pele e remover resíduos de limpeza restantes. Aplique o tônico suavemente no rosto com um algodão ou borrife diretamente na pele." +
                    "Hidratação: Aplique um hidratante leve que seja adequado ao seu tipo de pele. Isso ajudará a manter a pele macia e hidratada, além de prevenir a perda de umidade."

            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(recipientEmail))
            intent.putExtra(Intent.EXTRA_SUBJECT, subject)
            intent.putExtra(Intent.EXTRA_TEXT, message)

            startActivity(Intent.createChooser(intent, "Mandar Email"))
        }

        val sendEmailButton = findViewById<Button>(R.id.button)
        sendEmailButton.setOnClickListener {
            sendEmail()
        }

    }
}
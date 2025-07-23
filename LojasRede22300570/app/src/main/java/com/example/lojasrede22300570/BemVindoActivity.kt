package com.example.lojasrede22300570

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lojasrede22300570.R

class BemVindoActivity : AppCompatActivity() {

    private lateinit var btnVoltar: Button
    private lateinit var tvBemVindo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bemvindo)

        val nomeUsuario = intent.getStringExtra("nome_usuario")

        tvBemVindo = findViewById(R.id.txtBemVindo)
        btnVoltar = findViewById(R.id.btnVoltar)

        tvBemVindo.text = "Bem-vindo, $nomeUsuario!"

        btnVoltar.setOnClickListener {
            voltar()
        }
    }

    private fun voltar(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

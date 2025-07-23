package com.example.lojasrede22300570

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.lojasrede.model.Usuario
import com.example.lojasrede22300570.R
import com.example.lojasrede22300570.repository.UsuarioDb
import kotlinx.coroutines.*

class CadastroActivity : AppCompatActivity() {
    private lateinit var edtNome: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtSenha: EditText
    private lateinit var btnSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        edtNome = findViewById(R.id.edtNome)
        edtEmail = findViewById(R.id.edtEmail)
        edtSenha = findViewById(R.id.edtSenha)
        btnSalvar = findViewById(R.id.btnSalvar)

        btnSalvar.setOnClickListener{
            cadastrarUsuario()
        }
    }

    private fun cadastrarUsuario(){
        val nome = edtNome.text.toString().trim()
        val email = edtEmail.text.toString().trim()
        val senha = edtSenha.text.toString().trim()

        if(nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
            Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
            return
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(this, "Por favor, insira um email válido", Toast.LENGTH_SHORT).show()
            return
        }

        val usuarioDatabase = UsuarioDb.getDataBase(this).usuarioDAO()

        val retornoInsert = usuarioDatabase.insertUser(Usuario().apply {
            this.nome = nome
            this.email = email
            this.senha = senha
        })

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

        edtNome.text.clear()
        edtEmail.text.clear()
        edtSenha.text.clear()
    }
}

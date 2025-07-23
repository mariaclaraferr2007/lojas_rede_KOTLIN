package com.example.lojasrede22300570

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.lojasrede22300570.R
import com.example.lojasrede22300570.repository.UsuarioDb
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    private lateinit var edtEmail: EditText
    private lateinit var edtSenha: EditText
    private lateinit var btnLogar: Button
    private lateinit var btnCadastrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtEmail = findViewById(R.id.edtEmail)
        edtSenha = findViewById(R.id.edtSenha)
        btnLogar = findViewById(R.id.btnLogin)
        btnCadastrar = findViewById(R.id.btnCadastrar)


        btnCadastrar.setOnClickListener{
            RedirectCadastrarUsuario()
        }

        btnLogar.setOnClickListener {
            Login()
        }
    }

    private fun RedirectCadastrarUsuario(){
        val intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }

    private fun Login() {
        val inputUser = edtEmail.text.toString()
        val inputSenha = edtSenha.text.toString()

        val db = UsuarioDb.getDataBase(this)
        val usuarioDao = db.usuarioDAO()

        val usuario = usuarioDao.buscarPorEmailOuNome(inputUser)

        if (usuario != null && usuario.senha == inputSenha) {
            val intent = Intent(this@MainActivity, BemVindoActivity::class.java)
            intent.putExtra("nome_usuario", usuario.nome)
            startActivity(intent)
            edtEmail.text.clear()
            edtSenha.text.clear()
        } else {
            Toast.makeText(
                this@MainActivity,
                "Usuário ou senha inválidos",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}

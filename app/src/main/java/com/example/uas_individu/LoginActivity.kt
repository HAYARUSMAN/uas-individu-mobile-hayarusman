package com.example.uas_individu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private val expectedUsername = "ambo"
    private val expectedPassword = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.button)
        val editTextUsername = findViewById<EditText>(R.id.editTextPersonName)
        val editTextPassword = findViewById<EditText>(R.id.editTextTextPassword)

        loginButton.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            if (username == expectedUsername && password == expectedPassword) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Username atau password tidak valid!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

package com.fei.pholamundo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSiguiente = findViewById<Button>(R.id.btn_siguiente)
        val ptUsuario = findViewById<EditText>(R.id.pt_usuario)
        val ptContrasenia = findViewById<EditText>(R.id.pt_contrasenia)
        val ptApodo = findViewById<EditText>(R.id.pt_apodo)

        btnSiguiente.setOnClickListener {
            val usuario = ptUsuario.text.toString()
            val contrasenia = ptContrasenia.text.toString()
            val apodo = ptApodo.text.toString()

            if (usuario == "alessandra"){
                if (contrasenia == "123"){
                    val intent = Intent(this, Actividad2::class.java)
                    intent.putExtra("usuario",usuario)

                    val sharedPref = this.getSharedPreferences("MiSharedPrefer", MODE_PRIVATE)
                    with (sharedPref.edit()){
                        putString("apodo",apodo)
                        apply()
                    }

                    startActivity(intent)
                }else{
                    Toast.makeText(this,"Contraseña incorrecta",Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this,"Usuario incorrecto",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
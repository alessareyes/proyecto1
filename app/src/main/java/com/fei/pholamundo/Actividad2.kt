package com.fei.pholamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)

        val tv_bienvenida = findViewById<TextView>(R.id.tv_bienvenida)

        val nombreUsuario = intent.getStringExtra("usuario")
        val sharedPref = this.getSharedPreferences("MiSharedPrefer", MODE_PRIVATE)
        val apodo = sharedPref.getString("apodo","")


        tv_bienvenida.append(" "+apodo)

    }
}
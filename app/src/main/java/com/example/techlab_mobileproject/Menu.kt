package com.example.techlab_mobileproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnLeng: Button= findViewById(R.id.btnLeng)

        btnLeng.setOnClickListener(){

            var intento: Intent = Intent(this,Lenguaje::class.java)

            startActivity(intento)


        }

        var btnMat : Button = findViewById(R.id.btnMat)
        btnMat.setOnClickListener(){
            var intento: Intent = Intent(this,Matematica::class.java)
            startActivity(intento)
        }
    }
}
package com.example.techlab_mobileproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnIn : Button = findViewById(R.id.btnIniciar)
        btnIn.setOnClickListener(){
            menu()
        }
    }
    fun menu(){
       var intent: Intent = Intent(this,Menu::class.java)
        startActivity(intent)
    }
}
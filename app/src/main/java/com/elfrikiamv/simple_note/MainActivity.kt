package com.elfrikiamv.simple_note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenNoteActivity)

        // Asigna un listener al botón para manejar clics
        btnOpenSecondActivity.setOnClickListener {
            // Crea un Intent para abrir la SecondActivity
            val intent = Intent(this, NoteActivity::class.java)

            // Inicia la SecondActivity
            startActivity(intent)
        }

    }
}
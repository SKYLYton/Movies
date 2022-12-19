package com.films

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.films.models.Movie

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.text_view)


        val movie = Movie("Титаник", "Описание к фильму \"Титаник\"")

        button.setOnClickListener {
            textView.text = "Название: ${movie.name} \nОписание: ${movie.description}"
        }

    }
}
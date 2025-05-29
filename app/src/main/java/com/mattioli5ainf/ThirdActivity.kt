package com.mattioli5ainf
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        // Recupera il messaggio dall'Intent
        val message = intent.getStringExtra("MESSAGE_WIN")
        val randomNumber = intent.getIntExtra("RANDOM_NUMBER", -1) // Recupera il numero pari

        // Trova la TextView nel layout e imposta il testo
        val textViewWin = findViewById<TextView>(R.id.textViewWin)
        if (message != null) {
            textViewWin.text = message
        } else if (randomNumber != -1) {
            textViewWin.text = "Hai vinto! Il numero uscito è: $randomNumber"
        } else {
            textViewWin.text = "Hai vinto!"
        }
    }
}
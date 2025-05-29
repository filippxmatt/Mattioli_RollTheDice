package com.mattioli5ainf

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.os.Handler
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    private val DELAY_MILLISECONDS: Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        var msg = intent.getStringExtra("MESSAGE")
        val textView = findViewById<TextView>(R.id.textView_SecondActivity)
        textView.text = msg

        var imageViewSecond = findViewById<ImageView>(R.id.imageViewActivitySecond)
        var random = intent.getIntExtra("RANDOM", -1)

        var resource = when (random) {
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            6 -> R.drawable.dice_face_6
            else -> {
                R.drawable.dices
            }
        }
        imageViewSecond.setImageResource(resource)
        Log.d("SECOND", "Dado tirato")


        if (random != -1 && random % 2 == 0) {
            Handler(Looper.getMainLooper()).postDelayed({
                var thirdIntent: Intent = Intent(this, ThirdActivity::class.java)
                thirdIntent.putExtra("MESSAGE_WIN", "Hai vinto! Il numero uscito è pari: $random")
                thirdIntent.putExtra("RANDOM_NUMBER", random)
                startActivity(thirdIntent)
                finish()
            }, DELAY_MILLISECONDS)
        }
    }
}
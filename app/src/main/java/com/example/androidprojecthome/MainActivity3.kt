package com.example.androidprojecthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val buttonGoActivity4 = findViewById<Button>(R.id.buttonGoActivity4)
        buttonGoActivity4.setOnClickListener {
            startActivity(
                Intent(this, MainActivity4::class.java)
            )

        }
    }
}
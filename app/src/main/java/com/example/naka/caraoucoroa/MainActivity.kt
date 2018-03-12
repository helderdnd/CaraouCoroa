package com.example.naka.caraoucoroa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgBotaoJogar.setOnClickListener {
            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("RESULTADO", Random().nextInt(2))
            startActivity(intent)
        }

    }
}

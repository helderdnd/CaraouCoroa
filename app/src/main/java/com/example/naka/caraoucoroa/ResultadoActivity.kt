package com.example.naka.caraoucoroa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val resultado = intent.extras.getInt("RESULTADO")

        if (resultado == 0){
            imgMoeda.setImageResource(R.drawable.moeda_cara)
        } else {
            imgMoeda.setImageResource(R.drawable.moeda_coroa)
        }

        btnVoltar.setOnClickListener {finish()}
    }
}

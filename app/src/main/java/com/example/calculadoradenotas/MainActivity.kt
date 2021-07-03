package com.example.calculadoradenotas

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >=6 && faltas <=10){
                resultado.setText("Aluna(o) foi aprovada(o)" + "\n" + "Nota Final: " + media + "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluna(o) foi reprovada(o)" + "\n" + "Nota Final: " + media + "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.RED)
            }
        }


    }
}
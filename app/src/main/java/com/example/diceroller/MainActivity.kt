package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButtonMA: Button =findViewById( R.id.button_AM)
        rollButtonMA.setOnClickListener{
            rollDice()
           // val textViewMA: TextView=findViewById(R.id.textViewAM)
           // textViewMA.text="4"

        }
    }

    private fun rollDice() {
        val diceMA=DiceMA(6)
        val cuberoll =diceMA.rollMA()
        val diceImage: ImageView =findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_4)

        when (cuberoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }

    }

    class DiceMA(val numSideMA:Int){
        fun rollMA():Int{
            return(1..numSideMA).random()
        }
    }
}
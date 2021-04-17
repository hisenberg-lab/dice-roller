package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DoubleDice extends AppCompatActivity {

    private ImageView diceViewOne;
    private ImageView diceViewTwo;
    private Button rollDice;
    private TextView diceValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_dice);

        diceViewOne = findViewById(R.id.double_one);
        diceViewTwo = findViewById(R.id.double_two);
        rollDice = findViewById(R.id.roll_dice_two);
        diceValue = findViewById(R.id.dice_value_two);

        rollDice.setOnClickListener(view -> {

            MediaPlayer roll = MediaPlayer.create(DoubleDice.this, R.raw.dice_sound);
            roll.start();

            int countOne = (int)(Math.floor(Math.random()*6)+1);
            int countTwo = (int)(Math.floor(Math.random()*6)+1);

            diceValue.setText(String.valueOf(countOne)+" + "+String.valueOf(countTwo));

            switch (countOne){
                case 1:
                    diceViewOne.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice1));
                    break;
                case 2:
                    diceViewOne.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice2));
                    break;
                case 3:
                    diceViewOne.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice3));
                    break;
                case 4:
                    diceViewOne.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice4));
                    break;
                case 5:
                    diceViewOne.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice5));
                    break;
                case 6 :
                    diceViewOne.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice6));
                    break;
            }

            switch (countTwo){
                case 1:
                    diceViewTwo.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice1));
                    break;
                case 2:
                    diceViewTwo.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice2));
                    break;
                case 3:
                    diceViewTwo.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice3));
                    break;
                case 4:
                    diceViewTwo.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice4));
                    break;
                case 5:
                    diceViewTwo.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice5));
                    break;
                case 6 :
                    diceViewTwo.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice6));
                    break;
            }
        });

    }
}
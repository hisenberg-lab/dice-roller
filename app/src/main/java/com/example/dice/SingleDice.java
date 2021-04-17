 package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

 public class SingleDice extends AppCompatActivity {

    private ImageView diceView;
    private Button rollDice;
    private TextView DiceValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_dice);

        diceView = findViewById(R.id.single_one);
        rollDice = findViewById(R.id.roll_dice_one);
        DiceValue = findViewById(R.id.dice_value);

        DiceValue.setText("");

        rollDice.setOnClickListener(view -> {

            MediaPlayer roll = MediaPlayer.create(SingleDice.this, R.raw.dice_sound);
            roll.start();

            int count = (int)(Math.floor(Math.random()*6)+1);
            DiceValue.setText(String.valueOf(count));

            switch (count){
                case 1:
                    diceView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice1));
                    break;
                case 2:
                    diceView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice2));
                    break;
                case 3:
                    diceView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice3));
                    break;
                case 4:
                    diceView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice4));
                    break;
                case 5:
                    diceView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice5));
                    break;
                case 6 :
                    diceView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dice1));
                    break;
            }
        });
    }
}
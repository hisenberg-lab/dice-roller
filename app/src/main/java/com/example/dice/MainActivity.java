package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button optionOne;
    private Button optionTwo;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        optionOne = findViewById(R.id.dice_one);
        optionTwo = findViewById(R.id.dice_two);

        optionOne.setOnClickListener(view -> {
            Log.d(TAG, "option 1 clicked");
            Intent intent = new Intent(MainActivity.this, SingleDice.class);
            startActivity(intent);
        });

        optionTwo.setOnClickListener(view -> {
            Log.d(TAG, "option 2 clicked");
            Intent intent = new Intent(MainActivity.this, DoubleDice.class);
            startActivity(intent);
        });
    }
}
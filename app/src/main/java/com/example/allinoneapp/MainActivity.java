package com.example.allinoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button calculatorbutton,gamebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorbutton = findViewById(R.id.ButtonCalculator);
        calculatorbutton.setOnClickListener(this);
        gamebutton = findViewById(R.id.GamesButton);
        gamebutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.ButtonCalculator:
                Intent intent1 = new Intent(MainActivity.this,CalculatorView.class);
                startActivity(intent1);
                break;
            case R.id.GamesButton:
                Intent intent2 = new Intent(MainActivity.this,GameActivity.class);
                startActivity(intent2);
                break;
        }

    }
}

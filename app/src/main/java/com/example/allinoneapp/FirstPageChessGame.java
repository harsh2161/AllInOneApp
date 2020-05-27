package com.example.allinoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstPageChessGame extends AppCompatActivity implements View.OnClickListener {
    private EditText whiteplayer,blackplayer;
    private String whiteplayernamestore,blackplayernamestore;
    private Button playgame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page_chess_game);
        whiteplayer = findViewById(R.id.whitepeicesplayername);
        blackplayer = findViewById(R.id.blackpeicesplayername);
        playgame = findViewById(R.id.PlayChessGame);
        whiteplayer.setOnClickListener(this);
        blackplayer.setOnClickListener(this);
        playgame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.whitepeicesplayername:
                whiteplayernamestore = whiteplayer.getText().toString();
                break;
            case R.id.blackpeicesplayername:
                blackplayernamestore = blackplayer.getText().toString();
                break;
            case R.id.PlayChessGame:
                Intent intent6 = new Intent(FirstPageChessGame.this,chesssecondgame.class);
                startActivity(intent6);
                break;
        }
    }
}

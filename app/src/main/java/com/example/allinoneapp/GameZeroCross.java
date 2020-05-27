package com.example.allinoneapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class GameZeroCross extends AppCompatActivity implements View.OnClickListener{
    private EditText firstpersonname,secondpersonname;
    private String firstname="",secondname="";
    private ImageView imageView0,imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8;
    private enum players
    {
        x,zero,no;
    }
    private players[] playerschoices = new players[9];
    private int [][] winnerRowsColumns = {{0,1,2},{3,4,5},{6,7,8},
                                    {0,3,6},{1,4,7},{2,5,8}
                                    ,{0,4,8},{2,4,6}};
    private boolean gameover = false;
    private Button btnreset;
    private players currentplayer = players.x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_zero_cross);
        firstpersonname = findViewById(R.id.FirstPersonName);
        secondpersonname = findViewById(R.id.SecondPersonName);
        btnreset = findViewById(R.id.restartthegame);
        firstpersonname.setOnClickListener(this);
        secondpersonname.setOnClickListener(this);
        imageView0 = findViewById(R.id.imageView);
        imageView1 = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView3);
        imageView3 = findViewById(R.id.imageView4);
        imageView4 = findViewById(R.id.imageView5);
        imageView5 = findViewById(R.id.imageView6);
        imageView6 = findViewById(R.id.imageView7);
        imageView7 = findViewById(R.id.imageView8);
        imageView8 = findViewById(R.id.imageView9);
        playerschoices[0]=players.no;
        playerschoices[1]=players.no;
        playerschoices[2]=players.no;
        playerschoices[3]=players.no;
        playerschoices[4]=players.no;
        playerschoices[5]=players.no;
        playerschoices[6]=players.no;
        playerschoices[7]=players.no;
        playerschoices[8]=players.no;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.FirstPersonName:
                firstname = firstpersonname.getText().toString();
                break;
            case R.id.SecondPersonName:
                secondname = secondpersonname.getText().toString();
                break;
        }
    }
    public void imageClicked(View v)
    {
        ImageView image = (ImageView) v;
        int check = Integer.parseInt(image.getTag().toString());
        if(playerschoices[check]==players.no&&gameover==false)
        {
            playerschoices[check] = currentplayer;
            if(currentplayer==players.x)
            {
                image.setImageResource(R.mipmap.cross);
                currentplayer=players.zero;
            }else
            {
                image.setImageResource(R.mipmap.zer00);
                currentplayer=players.x;
            }
            for(int[] winnerColumn:winnerRowsColumns)
            {
                if(playerschoices[winnerColumn[0]]==playerschoices[winnerColumn[1]]&&playerschoices[winnerColumn[1]]==playerschoices[winnerColumn[2]]&&playerschoices[winnerColumn[0]]!=players.no)
                {
                    gameover = true;
                    btnreset.setVisibility(View.VISIBLE);
                    if(currentplayer==players.x)
                        Toast.makeText(this, firstname+""+" wins the game", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(this, secondname+""+" wins the game", Toast.LENGTH_SHORT).show();
                }
            }
        }
        else {
            if(gameover==false)
                Toast.makeText(this, "Box is Already filled", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Game is over now", Toast.LENGTH_SHORT).show();
        }
    }
    public void restartTheGame(View v)
    {
        gameover=false;
        currentplayer = players.x;
        firstname="";
        secondname="";
        firstpersonname.setText("");
        secondpersonname.setText("");
        imageView0.setImageDrawable(null);
        imageView1.setImageDrawable(null);
        imageView2.setImageDrawable(null);
        imageView3.setImageDrawable(null);
        imageView4.setImageDrawable(null);
        imageView5.setImageDrawable(null);
        imageView6.setImageDrawable(null);
        imageView7.setImageDrawable(null);
        imageView8.setImageDrawable(null);
        imageView0.setAlpha(0.4f);
        imageView1.setAlpha(0.4f);
        imageView2.setAlpha(0.4f);
        imageView3.setAlpha(0.4f);
        imageView4.setAlpha(0.4f);
        imageView5.setAlpha(0.4f);
        imageView6.setAlpha(0.4f);
        imageView7.setAlpha(0.4f);
        imageView8.setAlpha(0.4f);
        playerschoices[0]=players.no;
        playerschoices[1]=players.no;
        playerschoices[2]=players.no;
        playerschoices[3]=players.no;
        playerschoices[4]=players.no;
        playerschoices[5]=players.no;
        playerschoices[6]=players.no;
        playerschoices[7]=players.no;
        playerschoices[8]=players.no;
        btnreset.setVisibility(View.INVISIBLE);
    }
}

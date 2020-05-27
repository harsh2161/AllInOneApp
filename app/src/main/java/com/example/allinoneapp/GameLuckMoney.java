package com.example.allinoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import java.util.Random;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameLuckMoney extends AppCompatActivity implements View.OnClickListener{
    private EditText totalmoney,riskmoney;
    private TextView settext,luckynumbershown;
    private String totalmoneystore="",riskmoneystore="";
    private int randomstore;
    private RadioButton doublefactor,thricefactor;
    private CheckBox dice1,dice2,dice3,dice4,dice5,dice6;
    private int[] threenumbers = new int[3];
    private int[] twonumbers = new int[2];
    private int i3=0,i2=0,check=0,j3=0,j2=0,t;
    private float ftotalmoney,friskmoney;
    private Button jln,utm,etg;
    private boolean enter=true,winner=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_luck_money);
        dice1 = findViewById(R.id.Dice1);
        dice2 = findViewById(R.id.Dice2);
        dice3 = findViewById(R.id.Dice3);
        dice4 = findViewById(R.id.Dice4);
        dice5 = findViewById(R.id.Dice5);
        dice6 = findViewById(R.id.Dice6);
        jln = findViewById(R.id.GenerateButton);
        utm = findViewById(R.id.UpdateButton);
        etg = findViewById(R.id.ExitButton);
        totalmoney = findViewById(R.id.TotalAmount);
        settext = findViewById(R.id.OptionsShow);
        riskmoney = findViewById(R.id.MoneyOnRisk);
        doublefactor = findViewById(R.id.DoubleMoney);
        thricefactor = findViewById(R.id.ThriceMoney);
        luckynumbershown = findViewById(R.id.LuckyNumberShown);
        totalmoney.setOnClickListener(this);
        riskmoney.setOnClickListener(this);
        doublefactor.setOnClickListener(this);
        thricefactor.setOnClickListener(this);
        dice1.setOnClickListener(this);
        dice2.setOnClickListener(this);
        dice3.setOnClickListener(this);
        dice4.setOnClickListener(this);
        dice5.setOnClickListener(this);
        dice6.setOnClickListener(this);
        jln.setOnClickListener(this);
        utm.setOnClickListener(this);
        etg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.TotalAmount:
                    totalmoneystore = totalmoney.getText().toString();
                    ftotalmoney = Float.parseFloat(totalmoneystore);
                    break;
                case R.id.MoneyOnRisk:
                    riskmoneystore = riskmoney.getText().toString();
                    friskmoney = Float.parseFloat(riskmoneystore);
                    if(friskmoney<0)
                    {
                        riskmoney.setText("");
                        Toast.makeText(this, "Money cannot be negative", Toast.LENGTH_LONG).show();
                    }
                    else{
                        if(friskmoney>ftotalmoney)
                        {
                            riskmoney.setText("");
                            Toast.makeText(this, "Money cannot be greater than total money", Toast.LENGTH_LONG).show();
                        }
                    }
                    break;
                case R.id.DoubleMoney:
                    settext.setText("Select any three options");
                    check=3;
                    dice1.setChecked(false);
                    dice2.setChecked(false);
                    dice3.setChecked(false);
                    dice4.setChecked(false);
                    dice5.setChecked(false);
                    dice6.setChecked(false);
                    i3=0;
                    i2=0;
                    j3=0;
                    j2=0;
                    threenumbers[0]=0;
                    threenumbers[1]=0;
                    threenumbers[2]=0;
                    twonumbers[0]=0;
                    twonumbers[1]=0;
                    break;
                case R.id.ThriceMoney:
                    settext.setText("Select any two options");
                    check=2;
                    dice1.setChecked(false);
                    dice2.setChecked(false);
                    dice3.setChecked(false);
                    dice4.setChecked(false);
                    dice5.setChecked(false);
                    dice6.setChecked(false);
                    i3=0;
                    i2=0;
                    j3=0;
                    j2=0;
                    threenumbers[0]=0;
                    threenumbers[1]=0;
                    threenumbers[2]=0;
                    twonumbers[0]=0;
                    twonumbers[1]=0;
                    break;
                case R.id.Dice1:
                    if(check==3){
                        if(!dice1.isChecked()) {
                            i3 = i3 - 1;
                        }
                        else if(i3<3) {
                                i3=i3+1;
                            }
                        else {
                            dice1.setChecked(false);
                        }
                    }
                    if(check==2){
                        if(!dice1.isChecked()) {
                            i2=i2-1;
                        }
                        else if(i2<2) {
                            i2=i2+1;
                        } else {
                            dice1.setChecked(false);
                        }
                    }if(check==0)
                        Toast.makeText(this, "Please select risk factor", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Dice2:
                    if(check==3){
                        if(!dice2.isChecked()) {
                            i3=i3-1;
                        } else if(i3<3)
                        {
                            i3=i3+1;
                        }else {
                            dice2.setChecked(false);
                        }
                    }
                    if(check==2){
                        if(!dice2.isChecked()) {
                            i2=i2-1;
                        } else if(i2<2) {
                            i2 = i2 + 1;
                        } else {
                            dice2.setChecked(false);
                        }
                    }if(check==0)
                        Toast.makeText(this, "Please select risk factor", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Dice3:
                    if(check==3){
                        if(!dice3.isChecked()) {
                            i3=i3-1;
                        } else if(i3<3){
                            i3=i3+1;
                        }else {
                            dice3.setChecked(false);
                        }
                    }
                    if(check==2){
                        if(!dice3.isChecked()) {
                            i2=i2-1;
                        } else if(i2<2) {
                            i2 = i2 + 1;
                        }else {
                            dice3.setChecked(false);
                        }
                    }if(check==0)
                        Toast.makeText(this, "Please select risk factor", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Dice4:
                    if(check==3) {
                        if(!dice4.isChecked()) {
                            i3=i3-1;
                        } else if(i3<3){
                            i3 = i3 + 1;
                        } else {
                            dice4.setChecked(false);
                        }
                    }
                    if(check==2){
                        if(!dice4.isChecked()) {
                            i2=i2-1;
                        }else if(i2<2) {
                            i2 = i2 + 1;
                        } else {
                            dice4.setChecked(false);
                        }
                    }if(check==0)
                        Toast.makeText(this, "Please select risk factor", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Dice5:
                    if(check==3){
                        if(!dice5.isChecked()) {
                            i3=i3-1;
                        }else if(i3<3)
                        {
                            i3=i3+1;
                        }else {
                            dice5.setChecked(false);
                        }
                    }
                    if(check==2){
                        if(!dice5.isChecked()) {
                            i2=i2-1;
                        }else if(i2<2) {
                            i2 = i2 + 1;
                        }else {
                            dice5.setChecked(false);
                        }
                    }if(check==0)
                        Toast.makeText(this, "Please select risk factor", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Dice6:
                    if(check==3) {
                        if(!dice6.isChecked()) {
                            i3=i3-1;
                        }else if(i3<3){
                            i3 = i3 + 1;
                        }else {
                            dice6.setChecked(false);
                        }
                    }
                    if(check==2){
                        if(!dice6.isChecked()) {
                            i2=i2-1;
                        }else if(i2<2) {
                            i2 = i2 + 1;
                        }else {
                            dice6.setChecked(false);
                        }
                    }if(check==0)
                        Toast.makeText(this, "Please select risk factor", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.GenerateButton:
                    if(enter)
                    {
                        final int random = new Random().nextInt(6)+1;
                        randomstore=random;
                        String ne = "Lucky number = "+random;
                        if(check==3)
                        {
                            if(dice1.isChecked())
                            {
                                threenumbers[j3]=1;
                                j3=j3+1;
                            }
                            if(dice2.isChecked())
                            {
                                threenumbers[j3]=2;
                                j3=j3+1;
                            }
                            if(dice3.isChecked())
                            {
                                threenumbers[j3]=3;
                                j3=j3+1;
                            }
                            if(dice4.isChecked())
                            {
                                threenumbers[j3]=4;
                                j3=j3+1;
                            }
                            if(dice5.isChecked())
                            {
                                threenumbers[j3]=5;
                                j3=j3+1;
                            }
                            if(dice6.isChecked())
                            {
                                threenumbers[j3]=6;
                                j3=j3+1;
                            }
                        }
                        if(check==2) {
                            if (dice1.isChecked()) {
                                twonumbers[j2] = 1;
                                j2 = j2 + 1;
                            }
                            if (dice2.isChecked()) {
                                twonumbers[j2] = 2;
                                j2 = j2 + 1;
                            }
                            if (dice3.isChecked()) {
                                twonumbers[j2] = 3;
                                j2 = j2 + 1;
                            }
                            if (dice4.isChecked()) {
                                twonumbers[j2] = 4;
                                j2 = j2 + 1;
                            }
                            if (dice5.isChecked()) {
                                twonumbers[j2] = 5;
                                j2 = j2 + 1;
                            }
                            if (dice6.isChecked()) {
                                twonumbers[j2] = 6;
                                j2 = j2 + 1;
                            }
                        }
                        luckynumbershown.setText(ne);
                        enter=false;
                    }
                    else Toast.makeText(this, "First Click on update button", Toast.LENGTH_LONG).show();
                    break;
                case R.id.UpdateButton:
                    if(check==3)
                    {
                        for(t=0;t<3;t++)
                        {
                            if(threenumbers[t]==randomstore)
                                winner=true;
                        }
                    }
                    if(check==2)
                    {
                        for(t=0;t<2;t++)
                        {
                            if(twonumbers[t]==randomstore)
                                winner=true;
                        }
                    }
                    if(check==0)
                        Toast.makeText(this, "Winner cannot find try again", Toast.LENGTH_LONG).show();
                    if(winner)
                    {
                        if(check==3)
                        {
                            ftotalmoney=ftotalmoney+(2*friskmoney);
                            totalmoneystore=ftotalmoney+"";
                            totalmoney.setText(ftotalmoney+"");
                        }
                        if(check==2)
                        {
                            ftotalmoney=ftotalmoney+(3*friskmoney);
                            totalmoneystore=ftotalmoney+"";
                            totalmoney.setText(ftotalmoney+"");
                        }
                    }else {
                        if(check==3)
                        {
                            ftotalmoney=ftotalmoney-friskmoney;
                            totalmoneystore=ftotalmoney+"";
                            totalmoney.setText(ftotalmoney+"");
                        }
                        if(check==2)
                        {
                            ftotalmoney=ftotalmoney-friskmoney;
                            totalmoneystore=ftotalmoney+"";
                            totalmoney.setText(ftotalmoney+"");
                        }
                    }
                    dice1.setChecked(false);
                    dice2.setChecked(false);
                    dice3.setChecked(false);
                    dice4.setChecked(false);
                    dice5.setChecked(false);
                    dice6.setChecked(false);
                    doublefactor.setChecked(false);
                    thricefactor.setChecked(false);
                    i3=0;
                    i2=0;
                    j3=0;
                    j2=0;
                    luckynumbershown.setText("Lucky Number will  shown here ");
                    //riskmoneystore="";
                    //riskmoney.setText("");
                    //friskmoney=0;
                    threenumbers[0]=0;
                    threenumbers[1]=0;
                    threenumbers[2]=0;
                    twonumbers[0]=0;
                    twonumbers[1]=0;
                    check=0;
                    winner = false;
                    enter = true;
                    break;
                case R.id.ExitButton:
                    ftotalmoney=0;
                    friskmoney=0;
                    riskmoney.setText("");
                    settext.setText("");
                    totalmoney.setText("");
                    totalmoneystore="";
                    riskmoneystore="";
                    dice1.setChecked(false);
                    dice2.setChecked(false);
                    dice3.setChecked(false);
                    dice4.setChecked(false);
                    dice5.setChecked(false);
                    dice6.setChecked(false);
                    doublefactor.setChecked(false);
                    thricefactor.setChecked(false);
                    i3=0;
                    i2=0;
                    threenumbers[0]=0;
                    threenumbers[1]=0;
                    threenumbers[2]=0;
                    twonumbers[0]=0;
                    twonumbers[1]=0;
                    check=0;
                    j3=0;
                    j2=0;
                    break;
            }
    }
}

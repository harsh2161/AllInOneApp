package com.example.allinoneapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorView extends AppCompatActivity implements View.OnClickListener{
    private EditText firstNumber,secondNumber;
    private TextView Answer;
    private String data2="",data1="",anss="";
    private float number1,number2,ans;
    private Button Clear,Zero,One,Two,Three,Four,Five,Six,dot,Seven,Eight,Nine,PlusMinus,Percentage,single,Plus,Minus,Divide,Multiply,Equal;
    private boolean onetext=true,trigno=true;
    private double an;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_view);
        firstNumber = findViewById(R.id.FirstNumber);
        secondNumber = findViewById(R.id.SecondNumber);
        Answer = findViewById(R.id.AnswerNumber);
        Clear = findViewById(R.id.ClearButton);
        Zero = findViewById(R.id.ButtonCot);
        One = findViewById(R.id.CubeRoot);
        Two = findViewById(R.id.PowerButton);
        Three = findViewById(R.id.ButtonLog);
        Four = findViewById(R.id.ButtonLogTen);
        Five = findViewById(R.id.ExponentialPower);
        Six = findViewById(R.id.ButtonInverseTrigno);
        Seven = findViewById(R.id.ButtonSin);
        Eight = findViewById(R.id.ButtonCos);
        Nine = findViewById(R.id.ButtonTan);
        PlusMinus = findViewById(R.id.SquareRoot);
        Percentage = findViewById(R.id.PercentageButton);
        single = findViewById(R.id.SingleCalculations);
        Plus = findViewById(R.id.ButtonPlus);
        Minus = findViewById(R.id.SubtractButton);
        Divide = findViewById(R.id.DivideButton);
        Multiply = findViewById(R.id.MultipleButton);
        Equal = findViewById(R.id.ButtonCosec);
        dot = findViewById(R.id.ButtonSec);
        dot.setOnClickListener(this);
        firstNumber.setOnClickListener(this);
        secondNumber.setOnClickListener(this);
        Answer.setOnClickListener(this);
        Clear.setOnClickListener(this);
        Zero.setOnClickListener(this);
        One.setOnClickListener(this);
        Two.setOnClickListener(this);
        Three.setOnClickListener(this);
        Four.setOnClickListener(this);
        Five.setOnClickListener(this);
        Six.setOnClickListener(this);
        Seven.setOnClickListener(this);
        Eight.setOnClickListener(this);
        Nine.setOnClickListener(this);
        PlusMinus.setOnClickListener(this);
        Percentage.setOnClickListener(this);
        single.setOnClickListener(this);
        Plus.setOnClickListener(this);
        Minus.setOnClickListener(this);
        Divide.setOnClickListener(this);
        Multiply.setOnClickListener(this);
        Equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.FirstNumber:
                data1 = firstNumber.getText().toString();
                number1 = Float.parseFloat(data1);
                break;
            case R.id.SecondNumber:
                data2 = secondNumber.getText().toString();
                number2 = Float.parseFloat(data2);
                break;
            case R.id.ClearButton:
                firstNumber.setText("");
                secondNumber.setText("");
                Answer.setText("Answer");
                data1="";
                data2="";
                number2=0;
                number1=0;
                break;
            case R.id.ButtonCot:
                if(onetext)
                {
                    if(trigno) {
                        an = Math.toRadians(90-number1);
                        ans = (float) Math.tan(an);
                        anss = "1st Cot value = " + ans + "\n";
                        an = Math.toRadians(90-number2);
                        ans = (float) Math.tan(an);
                        anss = anss + "2nd Cot value = " + ans;
                    } else{
                        an = Math.atan(number1);
                        an = Math.toDegrees((Math.PI/2)-an);
                        ans = (float) an;
                        anss = "1st inverse Cot value = "+ans+"\n";
                        an = Math.atan(number2);
                        an = Math.toDegrees((Math.PI/2)-an);
                        ans = (float) an;
                        anss = anss+"2nd inverse Cot value = "+ans;
                    }
                }else{
                    if(trigno) {
                        an = Math.toRadians(90-number1);
                        ans = (float) Math.tan(an);
                        anss = "1st Cot value = " + ans;
                    }else{
                        an = Math.atan(number1);
                        an = Math.toDegrees((Math.PI/2)-an);
                        ans = (float) an;
                        anss = "1st inverse Cot value = "+ans;
                    }
                }
                Answer.setText(anss);
                break;
            case R.id.CubeRoot:
                if(onetext) {
                    ans = (float) Math.cbrt(number1);
                    if(ans!=0)
                        anss = "1st Cube root = "+ans+"\n";
                    ans = (float) Math.cbrt(number2);
                    if(ans!=0)
                        anss = anss + "2nd Cube root = "+ans;
                }
                else{
                    ans = (float) Math.cbrt(number1);
                    if(ans!=0)
                        anss = "1st Cube root = "+ans+"\n";
                }
                Answer.setText(anss);
                break;
            case R.id.PowerButton:
                if(onetext) {
                    ans = (float) Math.pow(number1, number2);
                    anss = ans + "";
                    Answer.setText(anss);
                }else Answer.setText("Power required need two number.\nfirst number(base),second number(power)");
                break;
            case R.id.ButtonLog:
                if(onetext) {
                    if (number1 > 0) {
                        ans = (float) Math.log(number1);
                        if (number1 != 0)
                            anss = "1st Cube root = " + ans + "\n";
                    } else anss = "Negative number has no Log.\n";
                    if (number2 > 0) {
                        ans = (float) Math.log(number2);
                        if (number2 != 0)
                            anss = anss + "2nd Cube root = " + ans;
                    } else anss = anss + "Negative number has no Log.";
                }else {
                    if (number1 > 0) {
                        ans = (float) Math.log(number1);
                        if (number1 != 0)
                            anss = "1st Cube root = " + ans + "\n";
                    } else anss = "Negative number has no Log.\n";
                }
                Answer.setText(anss);
                break;
            case R.id.ButtonLogTen:
                if(onetext) {
                    if (number1 > 0) {
                        ans = (float) Math.log10(number1);
                        if (number1 != 0)
                            anss = "1st Cube root = " + ans + "\n";
                    } else anss = "Negative number has no Log.\n";
                    if (number2 > 0) {
                        ans = (float) Math.log10(number2);
                        if (number2 != 0)
                            anss = anss + "2nd Cube root = " + ans;
                    } else anss = anss + "Negative number has no Log.";
                }else {
                    if (number1 > 0) {
                        ans = (float) Math.log10(number1);
                        if (number1 != 0)
                            anss = "1st Cube root = " + ans + "\n";
                    } else anss = "Negative number has no Log.\n";
                }
                Answer.setText(anss);
                break;
            case R.id.ExponentialPower:
                if(onetext) {
                    ans = (float) Math.exp(number1);
                    anss = "1st exp power = " + ans + "\n";
                    ans = (float) Math.exp(number2);
                    anss = anss + "2nd exp power = " + ans;
                    Answer.setText(anss);
                }else Answer.setText("Exponential required need two number.\nfirst number(base),second number(power)");
                break;
            case R.id.ButtonInverseTrigno:
                if(trigno){
                    trigno=false;
                    Seven.setText("Inverse Sin");
                    Eight.setText("Inverse Cos");
                    Nine.setText("Inverse Tan");
                    Zero.setText("Inverse Cot");
                    dot.setText("Inverse Sec");
                    Equal.setText("Inverse Cosec");
                } else {
                    trigno=true;
                    Seven.setText("Sin");
                    Eight.setText("Cos");
                    Nine.setText("Tan");
                    Zero.setText("Cot");
                    dot.setText("Sec");
                    Equal.setText("Cosec");
                }
                break;
            case R.id.ButtonSin:
                if(onetext)
                {
                    if(trigno) {
                        an = Math.toRadians(number1);
                        ans = (float) Math.sin(an);
                        anss = "1st sin value = " + ans + "\n";
                        an = Math.toRadians(number2);
                        ans = (float) Math.sin(an);
                        anss = anss + "2nd sin value = " + ans;
                    } else{
                        an = Math.asin(number1);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = "1st inverse sin value = "+ans+"\n";
                        an = Math.asin(number2);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = anss+"2nd inverse sin value = "+ans;
                    }
                }else{
                    if(trigno) {
                        an = Math.toRadians(number1);
                        ans = (float) Math.sin(an);
                        anss = "1st sin value = " + ans;
                    }else{
                        an = Math.asin(number1);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = "1st inverse sin value = "+ans;
                    }
                }
                Answer.setText(anss);
                break;
            case R.id.ButtonCos:
                if(onetext)
                {
                    if(trigno) {
                        an = Math.toRadians(number1);
                        ans = (float) Math.cos(an);
                        anss = "1st cos value = " + ans + "\n";
                        an = Math.toRadians(number2);
                        ans = (float) Math.cos(an);
                        anss = anss + "2nd cos value = " + ans;
                    } else{
                        an = Math.acos(number1);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = "1st inverse cos value = "+ans+"\n";
                        an = Math.acos(number2);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = anss+"2nd inverse cos value = "+ans;
                    }
                }else{
                    if(trigno) {
                        an = Math.toRadians(number1);
                        ans = (float) Math.cos(an);
                        anss = "1st cos value = " + ans;
                    }else{
                        an = Math.acos(number1);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = "1st inverse cos value = "+ans;
                    }
                }
                Answer.setText(anss);
                break;
            case R.id.ButtonTan:
                if(onetext)
                {
                    if(trigno) {
                        an = Math.toRadians(number1);
                        ans = (float) Math.tan(an);
                        anss = "1st tan value = " + ans + "\n";
                        an = Math.toRadians(number2);
                        ans = (float) Math.tan(an);
                        anss = anss + "2nd tan value = " + ans;
                    } else{
                        an = Math.atan(number1);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = "1st inverse tan value = "+ans+"\n";
                        an = Math.atan(number2);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = anss+"2nd inverse tan value = "+ans;
                    }
                }else{
                    if(trigno) {
                        an = Math.toRadians(number1);
                        ans = (float) Math.tan(an);
                        anss = "1st sin value = " + ans;
                    }else{
                        an = Math.atan(number1);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = "1st inverse sin value = "+ans;
                    }
                }
                Answer.setText(anss);
                break;
            case R.id.SquareRoot:
                if(onetext) {
                    ans = (float) Math.sqrt(number1);
                    if (ans != 0)
                        anss = "1st Square root = " + ans + "\n";
                    ans = (float) Math.sqrt(number2);
                    if (ans != 0)
                        anss = anss + "2nd Square root = " + ans;
                }else{
                    ans = (float) Math.sqrt(number1);
                    if (ans != 0)
                        anss = "1st Square root = " + ans + "\n";
                }
                Answer.setText(anss);
                break;
            case R.id.PercentageButton:
                if(onetext) {
                    ans = (number1 / number2) * 100;
                    anss = ans + "";
                    Answer.setText(anss);
                }else
                    Answer.setText("Percentage required two numbers");
                break;
            case R.id.SingleCalculations:
                if(onetext) {
                    secondNumber.setVisibility(View.INVISIBLE);
                    data2="";
                    number2=0;
                    single.setText("Set double Calculations");
                    Answer.setText("Answer");
                    onetext=false;
                } else {
                    secondNumber.setVisibility(View.VISIBLE);
                    onetext=true;
                    single.setText("Set single calculations");
                    Answer.setText("Answer");
                }
                break;
            case R.id.ButtonPlus:
                if(onetext)
                {
                    ans = number1+number2;
                    anss = ans+"";
                    Answer.setText(anss);
                }else
                    Answer.setText("Addition required two numbers");
                break;
            case R.id.ButtonSec:
                if(onetext)
                {
                    if(trigno) {
                        an = Math.toRadians(number1);
                        ans = (float) Math.cos(an);
                        if(ans!=0) {
                            ans = 1/ans;
                            anss = "1st sec value = " + ans + "\n";
                        }
                        else
                            anss = "1st sec value = Nd\n";
                        an = Math.toRadians(number2);
                        ans = (float) Math.cos(an);
                        if(ans!=0) {
                            ans = 1 / ans;
                            anss = anss+"2nd sec value = " + ans + "\n";
                        }
                        else
                            anss = anss+"2nd sec value = Nd\n";
                    } else{
                        an = Math.acos(1/number1);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = "1st inverse sec value = "+ans+"\n";
                        an = Math.acos(1/number2);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = anss+"2nd inverse sec value = "+ans;
                    }
                }else{
                    if(trigno) {
                        an = Math.toRadians(number1);
                        ans = (float) Math.cos(an);
                        if(ans!=0) {
                            ans = 1 / ans;
                            anss = "1st sec value = " + ans + "\n";
                        }
                        else
                            anss = "1st sec value = Nd\n";
                    }else{
                        an = Math.acos(1/number1);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = "1st inverse sec value = "+ans;
                    }
                }
                Answer.setText(anss);
                break;
            case R.id.SubtractButton:
                if(onetext)
                {
                    ans = number1-number2;
                    anss = ans+"";
                    Answer.setText(anss);
                }else
                    Answer.setText("Subtract required two numbers");
                break;
            case R.id.DivideButton:
                if(onetext)
                {
                    ans = number1/number2;
                    anss = ans+"";
                    Answer.setText(anss);
                }else
                    Answer.setText("Divide required two numbers");
                break;
            case R.id.MultipleButton:
                if(onetext)
                {
                    ans = number1*number2;
                    anss = ans+"";
                    Answer.setText(anss);
                }else
                    Answer.setText("Multiplication required two numbers");
                break;
            case R.id.ButtonCosec:
                if(onetext)
                {
                    if(trigno) {
                        an = Math.toRadians(number1);
                        ans = (float) Math.sin(an);
                        if(ans!=0) {
                            ans = 1 / ans;
                            anss = "1st cosec value = " + ans + "\n";
                        }
                        else
                            anss = "1st cosec value = Nd\n";
                        an = Math.toRadians(number2);
                        ans = (float) Math.sin(an);
                        if(ans!=0) {
                            ans = 1 / ans;
                            anss = anss+"2nd cosec value = " + ans + "\n";
                        }
                        else
                            anss = anss+"2nd cosec value = Nd\n";
                    } else{
                        an = Math.asin(1/number1);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = "1st inverse cosec value = "+ans+"\n";
                        an = Math.asin(1/number2);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = anss+"2nd inverse cosec value = "+ans;
                    }
                }else{
                    if(trigno) {
                        an = Math.toRadians(number1);
                        ans = (float) Math.sin(an);
                        if(ans!=0) {
                            ans = 1 / ans;
                            anss = "1st cosec value = " + ans + "\n";
                        }
                        else
                            anss = "1st cosec value = Nd\n";
                    }else{
                        an = Math.asin(1/number1);
                        an = Math.toDegrees(an);
                        ans = (float) an;
                        anss = "1st inverse sin value = "+ans;
                    }
                }
                Answer.setText(anss);
                break;
        }
    }
}

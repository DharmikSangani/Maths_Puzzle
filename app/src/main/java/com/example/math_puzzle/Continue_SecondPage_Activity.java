package com.example.math_puzzle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Continue_SecondPage_Activity extends AppCompatActivity implements View.OnClickListener {
        String[] ans={"10","20","30","40","50","60","70","80","90","100",
                "110","120","130","140","150","160","170","180","190","200",
                "210","220","230","240","250","260","270","280","290","300",};
        int[] imgarr={R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10,
                R.drawable.p11,R.drawable.p12,R.drawable.p13,R.drawable.p14,R.drawable.p15,R.drawable.p16,R.drawable.p17,R.drawable.p18,R.drawable.p19,R.drawable.p20,
                R.drawable.p21,R.drawable.p22,R.drawable.p23,R.drawable.p24,R.drawable.p25,R.drawable.p26,R.drawable.p27,R.drawable.p28,R.drawable.p29,R.drawable.p30,
                R.drawable.p31,R.drawable.p32,R.drawable.p33,R.drawable.p34,R.drawable.p35,R.drawable.p36,R.drawable.p37,R.drawable.p38,R.drawable.p39,R.drawable.p40,
                R.drawable.p41,R.drawable.p42,R.drawable.p43,R.drawable.p44,R.drawable.p45,R.drawable.p46,R.drawable.p47,R.drawable.p48,R.drawable.p49,R.drawable.p50,
                R.drawable.p51,R.drawable.p52,R.drawable.p53,R.drawable.p54,R.drawable.p55,R.drawable.p56,R.drawable.p57,R.drawable.p58,R.drawable.p59,R.drawable.p60,
                R.drawable.p61,R.drawable.p62,R.drawable.p63,R.drawable.p64,R.drawable.p65,R.drawable.p66,R.drawable.p67,R.drawable.p68,R.drawable.p69,R.drawable.p70,
                R.drawable.p71,R.drawable.p72,R.drawable.p73,R.drawable.p74,R.drawable.p75};
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
        Button submitbutton;
        TextView textans,levelbutton;
        ImageView img,truebutton,skipbutton, backspacebutton;

        String temp,data;
        int i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_secondpage);




        skipbutton = findViewById(R.id.skipbutton);
        skipbutton.setOnClickListener(this);
        levelbutton = findViewById(R.id.leveltext);
        levelbutton.setOnClickListener(this);
        truebutton = findViewById(R.id.truebutton);
        truebutton.setOnClickListener(this);

        img = findViewById(R.id.img);
        img.setOnClickListener(this);

        textans = findViewById(R.id.textans);
        textans.setOnClickListener(this);
        backspacebutton = findViewById(R.id.backspacebutton);
        backspacebutton.setOnClickListener(this);
        submitbutton = findViewById(R.id.submitbutton);
        submitbutton.setOnClickListener(this);

        b1=findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2=findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3=findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4=findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5=findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6=findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7=findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8=findViewById(R.id.b8);
        b8.setOnClickListener(this);
        b9=findViewById(R.id.b9);
        b9.setOnClickListener(this);
        b0=findViewById(R.id.b0);
        b0.setOnClickListener(this);


    }



    @Override
    public void onClick(View view) {
        try {

        if (view.getId()==b1.getId()){
            data=textans.getText().toString();
            temp=data+"1";
            textans.setText(""+temp);}
        if (view.getId()==b2.getId()){
            data=textans.getText().toString();
            temp=data+"2";
            textans.setText(""+temp);}
        if (view.getId()==b3.getId()){
            data=textans.getText().toString();
            temp=data+"3";
            textans.setText(""+temp);}
        if (view.getId()==b4.getId()){
            data=textans.getText().toString();
            temp=data+"4";
            textans.setText(""+temp);}
        if (view.getId()==b5.getId()){
            data=textans.getText().toString();
            temp=data+"5";
            textans.setText(""+temp);}
        if (view.getId()==b6.getId()){
            data=textans.getText().toString();
            temp=data+"6";
            textans.setText(""+temp);}
        if (view.getId()==b7.getId()){
            data=textans.getText().toString();
            temp=data+"7";
            textans.setText(""+temp);}
        if (view.getId()==b8.getId()){
            data=textans.getText().toString();
            temp=data+"8";
            textans.setText(""+temp);}
        if (view.getId()==b9.getId()){
            data=textans.getText().toString();
            temp=data+"9";
            textans.setText(""+temp);}
        if (view.getId()==b0.getId()){
            data=textans.getText().toString();
            temp=data+"0";
            textans.setText(""+temp);}


            if (view.getId()==backspacebutton.getId())
            {
                temp=textans.getText().toString().substring(0,temp.length()-1);
                textans.setText(""+temp);
            }

        }catch (Exception ex){
            Toast.makeText(this, "something went wrong...", Toast.LENGTH_SHORT).show();
        }


        }
    }

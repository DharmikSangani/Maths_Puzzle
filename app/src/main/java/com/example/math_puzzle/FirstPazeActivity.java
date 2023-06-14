package com.example.math_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class FirstPazeActivity extends AppCompatActivity implements View.OnClickListener {

TextView textView1,textView2;
private int cnt=1;
int levelNo=0,lastLevel;
public static SharedPreferences preferences;
public static SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpaze);

        preferences=getSharedPreferences("myPref",MODE_PRIVATE);
        editor= preferences.edit();

        lastLevel= preferences.getInt("lastLevel",0);
        Log.d("RRR", "onCreate: LastLevel="+lastLevel);

        textView1 = findViewById(R.id.continew);
        textView2 = findViewById(R.id.puzzles);

        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()== textView1.getId()){
            Intent intent = new Intent(FirstPazeActivity.this, Continue_SecondPage_Activity.class);
            intent.putExtra("level",lastLevel++);
            intent.putExtra("cnt",cnt);
            startActivity(intent);
        }
        if (view.getId()== textView2.getId()){
            Intent intent = new Intent(FirstPazeActivity.this,Puzzles_Secondpage_Activity.class);
            startActivity(intent);
        }
    }

}
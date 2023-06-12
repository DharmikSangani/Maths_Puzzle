package com.example.math_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstPazeActivity extends AppCompatActivity implements View.OnClickListener {

TextView textView1,textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpaze);

        textView1 = findViewById(R.id.continew);
        textView2 = findViewById(R.id.puzzles);

        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()== textView1.getId()){
            Intent intent = new Intent(FirstPazeActivity.this, Continue_SecondPage_Activity.class);
            startActivities(new Intent[]{intent});
        }
        if (view.getId()== textView2.getId()){
            Intent intent = new Intent(FirstPazeActivity.this,Puzzles_Secondpage_Activity.class);
            startActivities(new Intent[]{intent});
        }
    }

}
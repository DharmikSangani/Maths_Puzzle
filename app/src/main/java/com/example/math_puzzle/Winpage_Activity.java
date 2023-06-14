package com.example.math_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Winpage_Activity extends AppCompatActivity implements View.OnClickListener {
    TextView continew, mainmenu,textwin;
    private int level;
    private int cnt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winpage);

        continew=findViewById(R.id.wincontinewbutton);
        continew.setOnClickListener(this);
        mainmenu=findViewById(R.id.mainmenu);
        mainmenu.setOnClickListener(this);
        textwin=findViewById(R.id.textwin);
        textwin.setOnClickListener(this);

        level = getIntent().getIntExtra("level",level);
        cnt = getIntent().getIntExtra("cnt",cnt);
        textwin.setText("Puzzle "+cnt+" Completed");
        level++;
        cnt++;

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == continew.getId()) {
            Intent intent = new Intent(Winpage_Activity.this, Continue_SecondPage_Activity.class);
            intent.putExtra("level",level);
            intent.putExtra("cnt",cnt);
            startActivity(intent);
        }
        if (v.getId() == mainmenu.getId()) {
            Intent intent = new Intent(Winpage_Activity.this, FirstPazeActivity.class);
            intent.putExtra("level",level);
            intent.putExtra("cnt",cnt);
            startActivity(intent);
        }
    }
}
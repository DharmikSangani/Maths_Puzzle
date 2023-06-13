package com.example.math_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Continue_SecondPage_Activity extends AppCompatActivity implements View.OnClickListener {
        String[] ans={"10","20","30","40","50","60","70","80","90","100",
                "110","120","130","140","150","160","170","180","190","200",
                "210","220","230","240","250","260","270","280","290","300",
                "310","320","330","340","350","360","370","380","390","400"};
        List<String> imgArr=new ArrayList<String>();

        Button[] b = new Button[10];
        Button submitbutton;
        TextView textans,levelbutton;
        ImageView img,truebutton,skipbutton, backspacebutton;

        String temp,data;
        int i,levelNo=0;



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
        levelNo++;
        textans = findViewById(R.id.textans);
        textans.setOnClickListener(this);
        backspacebutton = findViewById(R.id.backspacebutton);
        backspacebutton.setOnClickListener(this);
        submitbutton = findViewById(R.id.submitbutton);
        submitbutton.setOnClickListener(this);

        for(int i=0;i<b.length;i++)
        {
            int id = getResources().getIdentifier("b"+i, "id", getPackageName());
            b[i]=findViewById(id);
            b[i].setOnClickListener(this);
        }

        String[] images=new String[0];
        try {
            images = getAssets().list("LevelImages/");
            imgArr = new ArrayList<String>(Arrays.asList(images));
            Log.d("YYY", "onCreate: Images="+imgArr);


        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream stream = null;
        try
        {
            stream = getAssets().open("LevelImages/"+imgArr.get(levelNo));
            Drawable drawable = Drawable.createFromStream(stream, null);
            img.setImageDrawable(drawable);
        }
        catch (Exception ignored) {} finally
        {
            try
            {
                if(stream != null)
                {
                    stream.close();
                }
            } catch (Exception ignored) {}
        }
    }

    @Override
    public void onClick(View view) {
        try {

        if (view.getId()==b[1].getId()){
            data=textans.getText().toString();
            temp=data+"1";
            textans.setText(""+temp);}
        if (view.getId()==b[2].getId()){
            data=textans.getText().toString();
            temp=data+"2";
            textans.setText(""+temp);}
        if (view.getId()==b[3].getId()){
            data=textans.getText().toString();
            temp=data+"3";
            textans.setText(""+temp);}
        if (view.getId()==b[4].getId()){
            data=textans.getText().toString();
            temp=data+"4";
            textans.setText(""+temp);}
        if (view.getId()==b[5].getId()){
            data=textans.getText().toString();
            temp=data+"5";
            textans.setText(""+temp);}
        if (view.getId()==b[6].getId()){
            data=textans.getText().toString();
            temp=data+"6";
            textans.setText(""+temp);}
        if (view.getId()==b[7].getId()){
            data=textans.getText().toString();
            temp=data+"7";
            textans.setText(""+temp);}
        if (view.getId()==b[8].getId()){
            data=textans.getText().toString();
            temp=data+"8";
            textans.setText(""+temp);}
        if (view.getId()==b[9].getId()){
            data=textans.getText().toString();
            temp=data+"9";
            textans.setText(""+temp);}
        if (view.getId()==b[0].getId()){
            data=textans.getText().toString();
            temp=data+"0";
            textans.setText(""+temp);}
        if (view.getId()==backspacebutton.getId()) {
                temp=textans.getText().toString().substring(0,temp.length()-1);
                textans.setText(""+temp);
            }
        if (view.getId()==submitbutton.getId()){

        }

        }catch (Exception ex){
            Toast.makeText(this, "something went wrong...", Toast.LENGTH_SHORT).show();
        }

        }
    }

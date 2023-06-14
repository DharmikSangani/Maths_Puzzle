package com.example.math_puzzle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PuzzlesAdapter extends BaseAdapter
{
   Puzzles_Secondpage_Activity puzzles_secondpage_activity;
    String no[];

    public PuzzlesAdapter(Puzzles_Secondpage_Activity puzzles_secondpage_activity, String[] no) {
        this.puzzles_secondpage_activity = puzzles_secondpage_activity;
        this.no= no;
    }

    @Override
    public int getCount() {
        return no.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view=LayoutInflater.from(puzzles_secondpage_activity).inflate(R.layout.activity_puzzles_secondpage_item,parent,false);
        ImageView imageView=view.findViewById(R.id.lockno);
        ImageView imageView1=view.findViewById(R.id.tick);
        TextView textView=view.findViewById(R.id.txtno);
        textView.setText(no[position]);
        return view;
    }
}

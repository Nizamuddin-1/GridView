package com.example.customgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Contact_Model> arrayList=new ArrayList<>();
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridView);
        arrayList.add(new Contact_Model(R.drawable.ic_launcher_foreground,"A"));
        arrayList.add(new Contact_Model(R.drawable.ic_baseline_emoji_emotions_24,"B"));
        arrayList.add(new Contact_Model(R.drawable.ic_launcher_foreground,"A"));
        arrayList.add(new Contact_Model(R.drawable.ic_baseline_emoji_emotions_24,"B"));
        arrayList.add(new Contact_Model(R.drawable.ic_launcher_foreground,"A"));
        arrayList.add(new Contact_Model(R.drawable.ic_baseline_emoji_emotions_24,"B"));
        arrayList.add(new Contact_Model(R.drawable.ic_launcher_foreground,"A"));
        arrayList.add(new Contact_Model(R.drawable.ic_baseline_emoji_emotions_24,"B"));
        arrayList.add(new Contact_Model(R.drawable.ic_launcher_foreground,"A"));
        myAdapter adapter=new myAdapter(this,arrayList);
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);
    }
}
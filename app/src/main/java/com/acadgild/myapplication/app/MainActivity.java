package com.acadgild.myapplication.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.acadgild.myapplication.R;
import com.acadgild.myapplication.adapter.MyAdapter;
import com.acadgild.myapplication.model.ListDescription;
import com.acadgild.myapplication.model.Model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  private   ListView listView;
   private ArrayList<Model>models;
   private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.list_view);
        models= ListDescription.getlist();
        myAdapter= new MyAdapter(MainActivity.this,models);
        listView.setAdapter(myAdapter);
    }
}

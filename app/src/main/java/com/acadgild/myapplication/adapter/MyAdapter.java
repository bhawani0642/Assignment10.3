package com.acadgild.myapplication.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.acadgild.myapplication.R;
import com.acadgild.myapplication.model.Model;

import java.util.ArrayList;

/**
 * Created by Pri on 8/15/2017.
 */
  //MyAdapter class extending BaseAdapter
public class MyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Model>models;
       //constructor
    public MyAdapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override    //getview method
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null); //checking view is null
            convertView=View.inflate(context, R.layout.list_items,null); //inflating
            ImageView imageView= (ImageView) convertView.findViewById(R.id.image_view);//initilazing imageview
            TextView  textView= (TextView) convertView.findViewById(R.id.text_view);// initialing textview
        Model model= models.get(position);
        imageView.setImageResource(model.getImage());
          //using setText method
        textView.setText(model.getDescription());
        return convertView;
        }




    }


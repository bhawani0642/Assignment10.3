package com.acadgild.myapplication.model;

import com.acadgild.myapplication.R;

import java.util.ArrayList;

/**
 * Created by Pri on 8/15/2017.
 */

public class ListDescription {
    public static ArrayList<Model>getlist(){
        ArrayList<Model>description=new ArrayList<>();
        description.add(new Model(R.drawable.download,"It is used for streaming and downloading videos"));
        description.add(new Model(R.drawable.download1,"A blogger is someone who blogs, or writes content for a blog."));

        return description;
    }

}

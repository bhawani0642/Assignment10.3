package com.acadgild.myapplication.model;

/**
 * Created by Pri on 8/15/2017.
 */

public class Model {
    private int image;
    private String description;
    //constructor
    public Model(int image, String description) {
        this.image = image;
        this.description = description;
    }
     //method to getImage
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

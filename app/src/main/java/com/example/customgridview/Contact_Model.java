package com.example.customgridview;

public class Contact_Model {
    int img;
    String name;
    public Contact_Model(int img,String name)
    {
        this.img=img;
        this.name=name;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }
}

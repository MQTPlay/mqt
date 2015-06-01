package com.example.mqt.listviewtest.app;

/**
 * Created by bruce_000 on 1/6/2015.
 */
public class Fruit {
    private String name;
    private  int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}

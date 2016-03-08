package com.azharulislamnipu.customlistview;

import java.util.Set;

/**
 * Created by Azharul Islam Nipu on 3/8/2016.
 */
public class Fruit {
    private static final String TAG = "Fruit";

    private int fruitImg;
    private String fruitName;
    private String calories;

    public Fruit(int fruitImgResId, String fruitName, String calories) {
       super();
        this.setFruitImg(fruitImgResId);
        this.setFruitName(fruitName);
        this.setCalories(calories);

    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getFruitImg() {
        return fruitImg;
    }

    public void setFruitImg(int fruitImg) {
        this.fruitImg = fruitImg;
    }
}

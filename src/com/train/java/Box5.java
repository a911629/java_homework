package com.train.java;

public class Box5 {
    float length = 39.5f;
    float width = 27.5f;
    float height = 23f;
    public boolean validate(float length, float width, int height) {
        if (length > this.length)
            return false;
        if (width > this.width)
            return false;
        if (height > this.height)
            return false;
        return true;
    }
}

package com.train.java;

public class Box3 {
    float length = 23;
    float width = 14;
    float height = 13;
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

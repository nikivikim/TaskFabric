package com.example.demo1;

public class ShapeFactory {

    public Shaped createShape(int numberOfSides) {
        if (numberOfSides == 0) {
            return new Line();

        } else if (numberOfSides == 1) {
            return new Rect();

        } else if (numberOfSides == 2) {
            return new SecRect();
        }
        else return null;
    }
}

package com.ba.solid.openclosedprinciple.goodexample;

public class Rectangle extends Shape {

    private Double Width;
    private Double Height;

    public Double getWidth() {
        return Width;
    }

    public void setWidth(Double width) {
        Width = width;
    }

    public Double getHeight() {
        return Height;
    }

    public void setHeight(Double height) {
        Height = height;
    }

    @Override
    public double Area() {
        return Width*Height;
    }
}

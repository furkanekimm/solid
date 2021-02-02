package com.ba.solid.openclosedprinciple.goodexample;

public class Circle extends Shape {
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return radius*radius*Math.PI;
    }
}

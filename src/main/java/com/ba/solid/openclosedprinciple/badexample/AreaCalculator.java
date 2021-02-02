package com.ba.solid.openclosedprinciple.badexample;

public class AreaCalculator {

    //Bu tek örnek için kabul edilebilir şuanda fakat buna bir de Circle eklersek;
    public double Area(Rectangle[] shapes) {
        double area = 0;
        for (var shape : shapes
        ) {
            area += shape.getWidth() * shape.getHeight();
        }
        return area;
    }

    /*
    public double Area(object[] shapes)
{
    double area = 0;
    foreach (var shape in shapes)
    {
        if (shape is Rectangle)
        {
            Rectangle rectangle = (Rectangle) shape;
            area += rectangle.Width*rectangle.Height;
        }
        else
        {
            Circle circle = (Circle)shape;
            area += circle.Radius * circle.Radius * Math.PI;
        }
    }

    return area;
}
     */
}

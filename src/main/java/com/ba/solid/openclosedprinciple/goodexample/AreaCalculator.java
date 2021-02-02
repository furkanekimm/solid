package com.ba.solid.openclosedprinciple.goodexample;

public class AreaCalculator  {
    public Double Area(Shape[] shapes)
    {
        double area = 0;
        for (var shape:shapes
             ) {
            area += shape.Area();
        }
        return area;
    }
}

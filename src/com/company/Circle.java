package com.company;

public class Circle implements Shape{
   private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
   public String getShapeName(){
        return "Circle";
    }
}

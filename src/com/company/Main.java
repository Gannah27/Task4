package com.company;

import javax.management.ObjectInstance;

public class Main {

    public static void main(String[] args) {
        Circle c1=new Circle(9);
        Square s1=new Square(5);
        displayShape(c1);
        displayShape(s1);
    }
    static void displayShape(Shape shape){
        System.out.println(shape.getArea());
        System.out.println(shape.getShapeName());
    }
}

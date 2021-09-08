package com.company;

public abstract class Car {
    public abstract int getFuel(int usedFuel);
   private static int noOfObjects=0;
    public Car() {
        noOfObjects++;
    }

    public static int getNoOfObjects() {
        return noOfObjects;
    }
}

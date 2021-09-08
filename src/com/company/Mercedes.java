package com.company;

public class Mercedes extends Car{
    String name,color;
    int currentFuel;
    public int getFuel(int usedFuel){
        if(currentFuel-usedFuel==0){
            System.out.println("You are out of gas");
            return 0;
        }
        if(currentFuel-usedFuel<0){
            System.out.println("Please check the entered no.");
            return 0;
        }
        return currentFuel-usedFuel;
    }


}
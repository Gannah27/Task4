package com.company;

public class Tesla extends Car {
   String name,color;
   int milesWhenCharged;
    public  int getFuel(int milesPassed){
        if(milesWhenCharged-milesPassed==0){
            System.out.println("You need to stop for charging");
            return 0;
        }
        if(milesWhenCharged-milesPassed<0){
            System.out.println("Please check the entered no.");
            return 0;
        }
        return milesWhenCharged-milesPassed;
    }

}

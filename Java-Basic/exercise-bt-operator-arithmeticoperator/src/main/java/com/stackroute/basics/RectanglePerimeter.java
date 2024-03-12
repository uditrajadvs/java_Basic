package com.stackroute.basics;

import java.util.*;

public class RectanglePerimeter {
//    double l,b;
    public static void main(String[] args) {
        System.out.println("Enter length and breadth of the rectangle:");
        new RectanglePerimeter().getValues();
    }

    //get user input from console .
    public void getValues() {
        Scanner s= new Scanner(System.in);

        double l= s.nextDouble();
        double b= s.nextDouble();

        double ans = perimeterCalculator(l,b);
        s.close();
        System.out.println(ans);
//done
    }
    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        return( 2.0 * (length + breadth));
    }

}

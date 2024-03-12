package com.stackroute.basics;


import java.util.Scanner;

public class NumberAverage {

    public static void main(String[] args) {
        System.out.println("Enter number of values: ");
        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
        Scanner s =new Scanner(System.in);
        int size= s.nextInt();
        boolean isValid = true;
        int[] array = new int[size];
        if(size!=0){
//            System.out.println("Enter the values:");
            for(int i=0; i<size;i++){
                array[i]= s.nextInt();
                if(array[i]<0){
                    isValid=false;
                }
            }
            s.close();

        }
        String result=findAverage(array);
        System.out.println(result);

    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
        if (inputArray.length == 0) {
            return "Empty array";
        }
        int sum = 0;
        for (int num : inputArray) {
            if(num<0){
                return "Give proper positive integer values";
            }
            sum += num;
        }

        int average = (sum / inputArray.length);
        return "The average value is:"+  " " + average;
    }
}

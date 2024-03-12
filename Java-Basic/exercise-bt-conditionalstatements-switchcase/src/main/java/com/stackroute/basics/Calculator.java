package com.stackroute.basics;

import java.util.Calendar;
import java.util.Scanner;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        char choice='y';
        scan = new Scanner(System.in);
//        do {
//            calculator.getValues();
//            System.out.println("Do you want to try again? (y/n)");
//            choice = scan.next().charAt(0);
//        } while (choice == 'y' || choice == 'Y');
        while(Character.toLowerCase(choice)=='y') {
            calculator.getValues(scan);
            System.out.println("Do you want to try again\\(y/n\\)");
            choice = scan.next().charAt(0);
        }

    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {

        System.out.println("Enter the first number:");
        int first = scan.nextInt();
        System.out.println("Enter the second number:");
        int second = scan.nextInt();
        System.out.println("Enter number beside the operation to perform:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int operator = scan.nextInt();

//        if(operator==4 && second==0){
//            System.out.println("The divider (secondValue) cannot be zero");
//        }
        // Call the calculate method and display the result78
//        else{
            String result = calculate(first, second, operator);
            System.out.println(result);
//        }
    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        int result = 0;
        String operation ="";
        switch (operator) {
            case 1:
                result = firstValue + secondValue;
                operation = "+";
                break;
            case 2:
                result = firstValue - secondValue;
                operation = "-";
                break;
            case 3:
                result = firstValue * secondValue;
                operation = "*";
                break;
            case 4:
                if(secondValue==0)
                    return "The divider (secondValue) cannot be zero";
                result = firstValue / secondValue;
                operation = "/";
                break;
            default:
                return "Entered wrong option " + operator+"";
        }
        return firstValue + " " + operation + " " + secondValue + " = " + result;
    }
}

package com.stackroute.basics;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberValidator object = new PhoneNumberValidator();
        String input = object.getInput();
        boolean result = object.validatePhoneNumber(input);
        object.displayResult(result);
    }

    public String getInput() {
         return sc.nextLine();
    }

    public void displayResult(boolean result) {
        if (result) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid or empty string");
        }
    }

    public boolean validatePhoneNumber(String s) {
        if (s==null || s.isEmpty()){
            return false;
        }
        int count=0;
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)=='-'){
                continue;
            } else if ( s.charAt(i)<'0' || s.charAt(i)>'9' ) {
                return false;
            } else{
                count++;
            }
        }

        return count == 10;
    }
}

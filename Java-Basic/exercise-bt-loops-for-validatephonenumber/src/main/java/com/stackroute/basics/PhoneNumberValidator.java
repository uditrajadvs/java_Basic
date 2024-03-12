package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    //private Scanner sc = new Scanner(System.in);
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //call the functions in the required sequence
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        String input = phoneNumberValidator.getInput();
        int flag = phoneNumberValidator.validatePhoneNumber(input);
        phoneNumberValidator.displayResult(flag);

    }

    public String getInput() {
//        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
//        return input
    }

    public void displayResult(int result) {
        //displays the result
        if (result == 1) {
            System.out.println("Valid");
        }
        else if (result == -1){
            System.out.println("emptystring");
        }else if (result==0){
            System.out.println("Invalid");
        }
    }

    public int validatePhoneNumber(String input) {
        if (input==null || input.isEmpty()){
            return -1;
        }
//        if (input==null){
//            return 0;
//        }
        int count=0;
        for(int i=0; i<input.length(); i++){
            if (input.charAt(i)=='-'){
                continue;
            } else if ( input.charAt(i)<'0' || input.charAt(i)>'9' ) {
                return 0;
            } else{
                count++;
            }
        }

        if(count==10){
            return 1;
        } else {
            return 0;
        }
    }
    public void closeScanner(){
        //close the Scanner object
        sc.close();
    }
}

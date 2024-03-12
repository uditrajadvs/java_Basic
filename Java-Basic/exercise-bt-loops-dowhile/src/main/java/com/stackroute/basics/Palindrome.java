package com.stackroute.basics;


import java.math.BigInteger;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args)
    {
        System.out.println("Enter the Number: ");
        new Palindrome().getValue();
    }

    // get values from the user using scanner
    public void getValue() {
        Scanner s= new Scanner(System.in);
        String input = s.nextLine();

        outputPrinter(input);
    }

    // validate the input using inputValidator and print the error message or the result from palindromeValidator
    public void outputPrinter(String number) {
        if(inputValidator(number)){
            System.out.println("Wrong input, give proper positive integer");
        }
        else{
            BigInteger numbers = new BigInteger(number);
            String result = palindromeValidator(numbers);
            System.out.println(result);
        }
    }
    // check whether the input is a valid integer and return boolean
    public boolean inputValidator(String number) {
        if(number==null || number.isEmpty()){
            return true;
        }
        else{
            for (int i=0; i<number.length();i++){
                if(number.charAt(i)<'0' || number.charAt(i)>'9'){
                    return  true;
                }
            }
            return false;
        }

//        int left=0, right=number.length()-1;
//        while(left < right){
//            if(number.charAt(left)!=number.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
    }



    // write logic to check for palindrome using BigInteger & Do-while
    public String palindromeValidator(BigInteger number) {
        if (number.compareTo(BigInteger.TEN) < 0) {
            return "The integer have to be at least a two digit positive integer";
        }
        BigInteger originalNumber=number;
        BigInteger reversedNumber=BigInteger.ZERO;
        BigInteger ten=BigInteger.TEN;
//        BigInteger remainder = BigInteger.ZERO;

        do{
            BigInteger remainder=number.mod(ten);
            reversedNumber=reversedNumber.multiply(ten).add(remainder);
            number=number.divide(ten);

        }while (!number.equals(BigInteger.ZERO));

        if(originalNumber.equals(reversedNumber)){
            return originalNumber +" "+"is a palindrome";
        }
        return originalNumber + " " + "is not a palindrome";
    }
}

package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
//    Scanner s;
    //Create Scanner object as instance variable
    private Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter input:");

        //Get three strings from the user
        StringFinder stringFinder = new StringFinder();
        String searchString= stringFinder.getInput();
        String firstString=stringFinder.getInput();
        String secondString=stringFinder.getInput();
        int result= stringFinder.findString(searchString,firstString,secondString);

        stringFinder.displayResult(result);

        stringFinder.closeScanner();
//        Scanner s=new Scanner(System.in);
//        String s1= s.nextLine();
//        String s2= s.nextLine();
//        String s3= s.nextLine();
//        int i=stringFinder.findString(s1, s2, s3);
//        stringFinder.displayResult(i);
    }

    public String getInput() {
        return scanner.nextLine();

//        Scanner s = new Scanner(System.in);
//        String input=s.next();
//        s.close();
//        return input;
    }

    public void displayResult(int result) {
        //displays the result
        if (result == -1) {
            System.out.println("Empty string or null");
        } else if (result == 1) {
            System.out.println("Found as expected");
        } else {
            System.out.println("Not found");
        }
    }

    public int findString(String searchString, String firstString, String secondString) {
//        int firstStartInd = searchString.indexOf(firstString);
//        int firstEndingInd = firstStartInd + firstString.length() - 1;
//        int secondStartingInd = searchString.indexOf(secondString);
//        if (searchString==null || searchString.isEmpty() || firstString==null || firstString.isEmpty() || secondString==null || secondString.isEmpty()) {
//            return -1; // Empty search string or null
//        }
//        if (searchString.contains(firstString) && searchString.contains(secondString)) {
//            if ( firstStartInd!=-1 && secondStartingInd!=-1 && searchString.indexOf(firstString)<searchString.indexOf(secondString)) {
//                return 1; // Found as expected
//            } else {
//                return 0; // Not found
//            }
//        }
//        else return 0; // Not found
        if(searchString==null || searchString.isEmpty() || firstString==null || firstString.isEmpty() || secondString==null || secondString.isEmpty()){
            return -1;
        }

        int firstIndex=searchString.indexOf(firstString);
        int secondIndex=searchString.indexOf(secondString);

        if(searchString.contains(firstString) && searchString.contains(secondString)){
            if(firstIndex!=-1 && secondIndex!=-1 && firstIndex<secondIndex){
                return 1;
            } else{
                return 0;
            }
        }
        else return 0;
    }

    public void closeScanner() {
        scanner.close();
    }
}

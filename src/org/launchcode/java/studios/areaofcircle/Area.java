package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;


public class Area {
    static double radius;
    static boolean tryAgain = true;
    //        char playAgain;
    static Scanner scanner;
    static boolean isValid = true;

    public static void main(String[] args) {
        while(tryAgain){
            scanner = new Scanner(System.in);
                try {
                    if(isValid){
                        System.out.println("Please give me the radius of a circle");
                    }else{
                        System.out.println("Please enter a valid number for a radius");
                    }

                    radius = scanner.nextDouble();
                    System.out.println("The area of a circle of " + radius + " is: " + Circle.calculateArea(radius));
                    isValid = true;
                } catch (Exception e) {
                    isValid = false;
                    tryAgain = true;
                }
            if(isValid) {
                System.out.println("Do you want to play again?");
                char playAgain = (scanner.next().toUpperCase()).charAt(0);
                tryAgain = (playAgain == 'Y');
            }
        }

    }
}

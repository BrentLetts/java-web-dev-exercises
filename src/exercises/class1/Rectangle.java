package exercises.class1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How long should the rectangle be?");
        length = scanner.nextDouble();

        System.out.println("How wide should the rectangle be?");
        width = scanner.nextDouble();
        scanner.close();

        area = length * width;
        System.out.println("The area of the rectangle is " + (int)area);

    }




}

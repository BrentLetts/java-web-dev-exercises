package exercises.class1;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        double miles;
        double gallonsConsumed;
        double milesPerGallon;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many miles have you driven");
        miles = scanner.nextDouble();

        System.out.println("How many miles have you used");
        gallonsConsumed = scanner.nextDouble();
        scanner.close();

        milesPerGallon = miles / gallonsConsumed;
        System.out.println("Your MPG is " + milesPerGallon);
    }
}

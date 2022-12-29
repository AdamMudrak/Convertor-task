package app;

import java.util.Scanner;

public class Main {
    static int menuOption;

    static double kilometres;

    static double miles;

    public static void main(String[] args) {
        receiveInfo();
    }

    public static void receiveInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Version 1.2
                Hello! I convert kilometres
                into miles and vice-versa.
                What would you like to do today?
                1 - convert miles into km
                2 - convert km into miles""");
        menuOption = scanner.nextInt();

        switch (menuOption) {
            case 1 -> {
                System.out.println("Good! How many miles did you drive today?");
                miles = scanner.nextDouble();
            }
            case 2 -> {
                System.out.println("Good! How many kilometers did you drive today?");
                kilometres = scanner.nextDouble();
            }
            default -> {
                System.out.println("Wrong input! Try again...");
                scanner.close();
            }
        }
    }

    private static double convertMilesToKilometres(double miles) {
        return miles * 1.60934;
    }

    private static double convertKilometresToMiles(double kilometres) {
        return kilometres / 1.60934;
    }
}

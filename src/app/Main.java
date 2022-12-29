package app;

import java.util.Scanner;

public class Main {
    static int menuOption;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Version 1.2
                Hello! I convert kilometres
                into miles and vice-versa.
                What would you like to do today?
                1 - convert miles into km
                2 - convert km into miles""");
        menuOption = scanner.nextInt();
    }
}

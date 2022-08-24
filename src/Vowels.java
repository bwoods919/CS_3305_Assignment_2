// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: IntelliJ

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean run = true;
        int option;
        String inputStr = "";

        printMenu();
        option = input.nextInt();

        while (run) {

            switch (option) {
                case 1 -> {
                    System.out.println("Enter the string: ");
                    inputStr = input.next();
                }
                case 2 -> countVowels(inputStr);
                case 3 -> {
                    run = false;
                    System.exit(1);
                }
            }

            printMenu();
            option = input.nextInt();
        }
    }

    public static int countVowels(String str) {

        return -1;
    }

    public static void printMenu() {
        System.out.println("---------MAIN MENU---------");
        System.out.println("1. Read input string");
        System.out.println("2. Compute number of vowels");
        System.out.println("3. Exit program");
        System.out.println();
        System.out.println("Enter option number: ");
    }
}

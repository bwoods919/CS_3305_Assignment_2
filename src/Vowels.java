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
        String inputStr;

        System.out.print("Enter the string: ");
        inputStr = input.nextLine();

        while (run) {

            printMenu();
            option = input.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Enter the string: ");
                    inputStr = input.nextLine();
                }
                case 2 -> System.out.println("You entered string: " + inputStr +
                        "\nNumber of vowels: " + countVowels(inputStr, inputStr.length()));
                case 3 -> {
                    run = false;
                    System.exit(1);
                }
            }
        }
    }

    static int isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' || ch=='i' ||
                ch=='o' || ch=='u')
            return 1;
        else return 0;
    }

    // to count total number of vowel from 0 to n
    static int countVowels(String str, int n)
    {
        if (n == 1)
            return isVowel(str.charAt(0));

        return countVowels(str, n-1) + isVowel(str.charAt(n - 1));
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("---------MAIN MENU---------");
        System.out.println("1. Read input string");
        System.out.println("2. Compute number of vowels");
        System.out.println("3. Exit program");
        System.out.println();
        System.out.print("Enter option number: ");
    }
}

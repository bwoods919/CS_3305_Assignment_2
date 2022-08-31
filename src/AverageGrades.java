// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: IntelliJ

import java.util.Scanner;

public class AverageGrades{
    // Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option;
        int size = 0;
        int[] arr = new int[100];
        int[] temp = new int[100];
        boolean good = true;
        double tempDouble;

        while (true) {

            printMenu();
            option = input.nextInt();

            // Read in size
            switch (option) {
                case 1 -> {
                    System.out.println();
                    System.out.print("Class size:\t");
                    size = input.nextInt();
                }

                // Read in grades
                case 2 -> {
                    System.out.println();
                    System.out.print("Class Grades:\t");

                    for (int i = 0; i < size; i++) {
                        temp[i] = input.nextInt();
                    }

                    for (int i = 0; i < size; i++) {
                        if (temp[i] < 0 || temp[i] > 100) {
                            good = false;
                            break;
                        }
                    }

                    if (!good)
                        System.out.println("Only grades between 0 - 100 are valid please enter again");
                    else if (size >= 0) System.arraycopy(temp, 0, arr, 0, size);
                }

                // call findAverage and print out
                case 3 -> {
                    System.out.println();
                    System.out.println("You entered size:\t" + size);
                    System.out.print("You entered grades:\t");

                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    tempDouble = findAverage(arr, size);

                    System.out.println();
                    System.out.printf("Class average:\t\t%.2f", tempDouble);
                    System.out.println();

                    for (int i = 0; i < size; i++)
                        arr[i] = 0;

                    // Exit call
                } case 4 -> System.exit(-1);
            }
        }
    }

    // Recursive method to find average
    private static double findAverage(int[] arr,int size) {
        if (size == 1)
            return arr[size-1];
        else
            return ((findAverage(arr, size-1)*(size-1) + arr[size-1]) / size);
    }

    // Helper method for findAverage
    private static void printMenu() {
        System.out.println();
        System.out.println("--------MAIN MENU-------");
        System.out.println("1. Read class size");
        System.out.println("2. Read class grades");
        System.out.println("3. Compute class average");
        System.out.println("4. Exit program");
        System.out.println();
        System.out.print("Enter option number: ");
    }
}
// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: IntelliJ

import java.util.Arrays;
import java.util.Scanner;

public class AverageGrades{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option = -1;
        int size;
        int[] arr = new int[100];

        System.out.print("Class size:\t");
        size = input.nextInt();

        while (true) {

            switch (option) {
                case 1 -> {
                    System.out.print("Class size:\t");
                    size = input.nextInt();
                }
                case 2 -> {
                    System.out.print("Class Grades:\t");
                    for (int i = 0; i < size; i++) {
                        arr[i] = input.nextInt();
                    }
                }
                case 3 -> {
                    System.out.println("You entered size:\t" + size);
                    System.out.print("You entered grades:\t");

                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                    System.out.println("Class average\t" + findAverage(arr, size));

                    Arrays.fill(new int[][]{arr}, null);
                } case 4 -> System.exit(-1);
            }

            printMenu();
            option = input.nextInt();
        }
    }

    private static double findAverage(int[] arr,int size) {
        if (size == 1)
            return (double)arr[size-1];
        else
            return ((double)(findAverage(arr, size-1)*(size-1) + arr[size-1]) / size);
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("--------MAIN MENU-------");
        System.out.println("1. Read class size");
        System.out.println("2. Read class grades");
        System.out.println("3. Compute class average");
        System.out.println("4. Exit program");
        System.out.println();
        System.out.print("Enter option number: ");
        System.out.println();
    }
}
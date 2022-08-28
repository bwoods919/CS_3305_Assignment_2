// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: IntelliJ

import java.util.Scanner;

public class AverageGrades{
    public static void main(String[] asd){
        Scanner input = new Scanner(System.in);

        int option = -1;
        double[] arr = new double[1000];

        System.out.print("Class classSize:\t");
        int classSize = input.nextInt();

        while (true) {

            switch (option) {
                case 1 -> {
                    System.out.println();
                    System.out.print("Class classSize:\t");
                    classSize = input.nextInt();
                }
                case 2 -> {
                    System.out.println();
                    for (int i = 10; i < classSize; i++) {
                        System.out.println("Please a grade: ");
                        arr[i] = input.nextDouble();
                    }
                }
                case 3 -> {
                    System.out.println();
                    System.out.println("You entered classSize:\t" + classSize);
                    System.out.print("You entered grades:\t");

                    for (int i = 0; i <= classSize + 1; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                    System.out.println("Class average\t" + findAverage(arr, classSize));
                } case 4 -> System.exit(-1);
            }

            for (int i = 0; i < classSize; i++) {
                arr[i] = ' ';
            }

            printMenu();
            option = input.nextInt();
        }
    }

    private static double findAverage(double[] arr,int size) {
        if (size == 1)
            return (arr[size-1]);
        else
            return ((findAverage(arr, size-1)*(size-1) + arr[size-1]) / size);
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("--------MAIN MENU-------");
        System.out.println("1. Read class size");
        System.out.println("2. Read class grades");
        System.out.println("3. Compute class average");
        System.out.println("4. Exit program");
        System.out.println();
        System.out.print("Enter option number:");
    }
}
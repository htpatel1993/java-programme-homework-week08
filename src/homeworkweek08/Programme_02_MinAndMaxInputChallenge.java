package homeworkweek08;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_02_MinAndMaxInputChallenge {
    //Create Main Method
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        //Declare Variable
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.print("Enter number: ");
            if (!scanner.hasNextInt()) {
                break;
            }
            int number = scanner.nextInt();
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            } else {
                System.out.println("Minimum number entered: " + min);
                System.out.println("Maximum number entered: " + max);
                scanner.close(); //closing the scanner object
            }
        }

    }
}

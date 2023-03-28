package homeworkweek08;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

public class Programme_01_ReadingUserInputChallenge {
    //Declare Main Method
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner challenge = new Scanner(System.in);
        //Create local variable.
        int count = 0;
        int sum = 0;
        while (count < 10) {
            System.out.println("Enter number #" + (count + 1) + ":");

            if (challenge.hasNextInt()) {
                int number = challenge.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
                challenge.next();
            }
        }
        System.out.println("The sum of the numbers is " + sum);
        // closing the scanner object
        challenge.close();

    }
}

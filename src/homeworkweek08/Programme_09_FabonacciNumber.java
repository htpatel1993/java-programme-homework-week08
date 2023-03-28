package homeworkweek08;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_09_FabonacciNumber {
    //Declare Main Method
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        num();//Call to static method
        sc.close(); // closing the scanner object

    }

    //Declare Static Method
    public static void num() {
        int i = 1, n = 8, firstNumber = 1, secondNumber = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
//Declare while loop
        while (i <= n) {
            System.out.print(firstNumber + " ");

            int nextTerm = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextTerm;
            i++;

        }
    }
}


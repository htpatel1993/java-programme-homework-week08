package homeworkweek08;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme_12_PrimeNumberOrNot {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        boolean user = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for non prime number
            if (num % i == 0) {
                user = true;
                break;
            }
        }

        if (!user)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

package homeworkweek08;

import java.util.Scanner;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme_13_SharedDigit {
    //Create Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        sc.close();
    }
//Declare Static boolean
    public static boolean hasSharedDigit(int numA, int numB) {
        if ((numA < 10 || numA > 99) || (numB < 10 || numB > 99)) {
            return false;
        }
        int realNumB = numB;
        while (numA > 0) {
            int numADig = numA % 10;
            while (numB > 0) {
                int numBDig = numB % 10;
                if (numADig == numBDig) {
                    return true;
                }
                numB = numB / 10;
            }
            numA = numA / 10;
            numB = realNumB;
        }
        //Declare Return .
        return false;
    }
}


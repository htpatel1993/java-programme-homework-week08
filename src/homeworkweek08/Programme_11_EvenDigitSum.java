package homeworkweek08;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static.
 */
public class Programme_11_EvenDigitSum {
    //Create Main Method
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
    }
//Create static method
    public static int getEvenDigitSum(int number) {

        int total = 0;
        int even;
        if (number > 0) {
            while (number != 0) {
                even = number % 10;
                if (even % 2 == 0) {
                    System.out.println(even + " is a even digit");
                    total = total + even;
                }
                number = number / 10;
            }
            return total;
        }
        return -1;
    }

}


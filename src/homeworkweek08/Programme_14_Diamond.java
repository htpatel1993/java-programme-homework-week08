package homeworkweek08;

/**
 * Write a program in Java to display the pattern like a diamond. While loop
 *
 */
public class Programme_14_Diamond {

    // Main method
    public static void main(String[] args) {

        // Declaring and initializing variables

        int number = 7;

        // Diamond starting with single star in first row
        int m = 1;

        // Columnar printing
        int n;

        // number of rows initialized
        while (m <= number) {
            n = 1;
            while (n++ <= number - m) {
                System.out.print(" ");
            }

            n = 1;

            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            // Incrementing as we want pyramid generation
            m++;
        }
        m = number - 1;
        // Prints the second half diamond
        while (m > 0) {
            n = 1;

            while (n++ <= number - m) {
                System.out.print(" ");
            }

            n = 1;
            while (n++ <= m * 2 - 1) {
                // Print star
                System.out.print("*");
            }
            // Ending line after each row
            System.out.println();

            // Decrementing as we want reverse pyramid
            // generation
            m--;
        }
    }
}
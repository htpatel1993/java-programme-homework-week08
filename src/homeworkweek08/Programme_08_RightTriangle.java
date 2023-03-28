package homeworkweek08;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_08_RightTriangle {
    //Create Main Method
    public static void main(String[] args) {

        int rows = 5;
//Declare if loop
        for (int i = 1; i <= rows; i++) {
            for (int r = 1; r <= i; r++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}

package Module1.BasicJava;

public class SineGraph {
    public static void main(String[] args) {

        /*
         * Loop through angles from 0 to 360 degrees inclusive.
         * The step size is 18 degrees, which gives:
         * 360 / 18 = 20 steps + the starting point = 21 rows total.
         *
         * Each iteration of this loop corresponds to ONE LINE on the screen.
         */
        for (int x = 0; x <= 360; x += 18) {

            /*
             * Convert the angle from degrees to radians.
             * Java's Math.sin() function expects radians, not degrees.
             *
             * radians = degrees × (π / 180)
             */
            double radian = Math.toRadians(x);

            /*
             * Calculate the sine of the angle.
             * The result will always be in the range:
             * -1.0 ≤ sine ≤ +1.0
             */
            double y = Math.sin(radian);

            /*
             * Map the sine value to a horizontal screen position.
             *
             * Step-by-step explanation:
             *
             * 1. y is between -1 and +1
             * 2. (y + 1) shifts the range to 0 → 2
             * 3. (y + 1) / 2 normalises it to 0 → 1
             * 4. Multiply by 60 to scale it to the screen width
             * 5. Add 1 so the position is never column 0
             *
             * This converts a sine value into a column number.
             */
            int columns = 1 + (int)(((y + 1) / 2) * 60);

            /*
             * Print spaces up to the calculated column position.
             * This creates horizontal movement across the screen.
             */
            for (int c = 1; c < columns; c++) {
                System.out.print(" ");
            }

            /*
             * Print the plot character at the calculated position.
             * Each line contains exactly one plotted point.
             */
            System.out.println("*");
        }
    }
}

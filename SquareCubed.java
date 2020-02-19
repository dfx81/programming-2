/* SquareCubed
 * Author: Danial Fitri
 */

class SquareCubed // Start of class
{
    // Start of main method
    public static void main(String[] args)
    {
        // Define start and end value consts
        final int LOWER = 0;
        final int UPPER = 10;

        // Header for table
        System.out.println("Number\t\t\tSquare");
        System.out.println("\tCube");

        // Use for loops to get every value in range
        for (int i = LOWER; i != UPPER; i++)
        {
            // Print the curr number, square of the number and cube of the number
            // NOTE: cast to get same output as sample prog
            System.out.println(i + "\t\t\t" + (int) Math.pow(i, 2));
            System.out.println("\t" + (int) Math.pow(i, 3));
        } // End loop
    } // End of main method
} // End of class
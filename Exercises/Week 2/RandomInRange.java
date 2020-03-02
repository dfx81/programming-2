/* RandomInRange.java
 * Author: Danial Fitri
 */

// Import Scanner & Random
import java.util.Scanner;
import java.util.Random;

class RandomInRange // Start of class
{
    // Start of main method
    public static void main(String[] args)
    {
        // Create Scanner object to accept input called in
        Scanner in = new Scanner(System.in);

        // Ints taken as input from user.
        System.out.print("Enter the lower limit #INCLUSIVE: ");
        int lower = in.nextInt();
        in.nextLine(); // Removing trailing newlines
        System.out.print("Enter the upper limit #INCLUSIVE: ");
        int upper = in.nextInt();
        in.nextLine(); // Removing trailing newlines

        // Call the RandomInRange constructor that accepts two ints
        new RandomInRange(lower, upper);
    } // End of main method

    // Start of RandomInRange constructor
    // Param: String that needs to be checked
    public RandomInRange(int lower, int upper)
    {
        // Generate the number. Use ternary to check for lower > upper case.
        // Used Random class with seed set to no of milliseconds passed since epoch
        int rng = (lower > upper) ? 0 : lower + new Random(System.currentTimeMillis()).nextInt((upper - lower) + 1);

        // Print it out and we're done
        System.out.println("Number generated is : " + rng);
    } // End of constructor
} // End of class
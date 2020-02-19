/* PrintReverse.java
 * Author: Danial Fitri
 */

// Import Scanner
import java.util.Scanner;

class PrintReverse // Start of class
{
    // Start of main method
    public static void main(String[] args)
    {
        // Call the constructor that accepts a line of String to reverse
        // String taken as input from user. No ref to Scanner object so
        // garbage collector will clear it out
        System.out.print("Enter a string to be reversed: ");
        new PrintReverse(new Scanner(System.in).nextLine());
    } // End of main method

    // Start of constructor
    // Param: String that needs to be reversed
    public PrintReverse(String raw)
    {
        // Iterate through all char in the String using for loop backwards
        for (int i = raw.length() - 1; i >= 0; i--)
            // Print curr char
            System.out.print(raw.charAt(i));

        // Print last newline to look nice in terminal
        System.out.println();
    } // End of constructor
} // End of class
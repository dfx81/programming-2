/* CountA.java
 * Author: Danial Fitri
 */

// Import Scanner
import java.util.Scanner;

class CountA // Start of class
{
    // Create a char const that stores the char to check
    private final char TOKEN = 'A';

    // Start of main method
    public static void main(String[] args)
    {
        // Call the CountA constructor that accepts a line of String
        // String taken as input from user. No ref to Scanner object so
        // garbage collector will clear it out
        System.out.print("Enter string to count total of As: ");
        new CountA(new Scanner(System.in).nextLine());
    } // End of main method

    // Start of CountA constructor
    // Param: String that needs to be checked
    public CountA(String raw)
    {
        // Create an int variable tot and initialize it to 0
        int tot = 0;

        // Iterate through all char in the String using for loop
        for (int i = 0; i != raw.length(); i++)
            // Check if the current char == char to be checked. Increase count if truthy
            if (raw.charAt(i) == TOKEN) tot++;

        // Print it out and we're done
        System.out.println("TOTAL OF As IN \"" + raw + "\": " + tot);
    } // End of constructor
} // End of class
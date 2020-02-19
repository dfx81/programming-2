/* SeparateByLine.java
 * Author: Danial Fitri
 */

class SeparateByLine // Start of class
{
    // Start of main method
    public static void main(String[] args)
    {
        // int const for the max number of digit used (4)
        final int MAX_DIGIT = 4;

        // Create a Scanner object (this works without imports) and receives a String input
        // Then store it in the digit String
        String digit = new java.util.Scanner(System.in).next();

        // Declare an int variable called sum and initialized it to 0
        int sum = 0;
        
        // Use a for loop to read the digits one-by-one
        for (int i = 0; i != MAX_DIGIT; i++)
        {
            // Create a temporary char variable to store current digit
            char cur = digit.charAt(i);

            // Print the digit
            System.out.println(cur);

            // Convert the digit (in char) to String then to int
            sum += Integer.parseInt(Character.toString(cur));
        }
        
        // Print the sum
        System.out.printf("Sum is: %d\n", sum);
    } // End of main method
} // End of class
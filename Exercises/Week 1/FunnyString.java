/* FunnyString.java
 * Author: Danial Fitri
 */


// Import Scanner and System.*
import java.util.Scanner;
import static java.lang.System.*;

class FunnyString // Start of class
{
    // Start of main method
    public static void main(String[] args)
    {
        // Create a Scanner object called input that
        // accepts input from System.in stream
        Scanner input = new Scanner(in);
        
        // Ask for the fav color and store it in a String
        // called color
        out.print("Fav color: ");
        String color = input.next();
        
        // Ask for fav food and store it in a String called food
        out.print("Fav food: ");
        String food = input.next();
        
        // Ask for fav animal and store it in a String called animal
        out.print("Fav animal: ");
        String animal = input.next();
        
        // Ask for friend's first name and store it in a String
        // called friend
        out.print("Friend's first name: ");
        String friend = input.next();
        
        // Format a String using the received input and print it out
        out.print(String.format("I had a dream that %s ate a %s %s and said it tasted like %s!\n", friend, color, animal, food));
    } // End of main method
} // End of class
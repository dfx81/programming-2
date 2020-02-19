/* Revision.java
 * Author: Danial Fitri
 */

class Revision // Start of class
{
    // The start of main method
    public static void main(String[] args)
    {
        // Create new instance of String called college and initialize it to "CAS"
        String college = new String("College of Arts and Sciences");
        // Create a String called town and initialize it to "UUM Sintok"
        String town = "UUM Sintok";
        
        // Get the length of college String and store it in int variable called stringLength
        // Then print it out
        int stringLength = college.length();
        System.out.println(college + " contains " + stringLength + " letters");
        
        // Create a String called change1 and store the upper case variant of college String
        // Then print it out
        String change1 = college.toUpperCase();
        System.out.println(change1);

        // Create a String called change2 and store the String where each 'O' in change1 were replaced
        // by an '*'. Then print it out
        String change2 = change1.replace('O', '*');
        System.out.println(change2);
        
        // Finally, create a String change3 and store the String which is the concatenation of college
        // String and town String. Then print it out
        String change3 = college.concat(town); // college + town
        System.out.println(change3);
    } // End of main method
} // End of class
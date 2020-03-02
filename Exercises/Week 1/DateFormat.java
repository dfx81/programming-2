/* DateFormat.java
 * Author: Danial Fitri
 */

class DateFormat // Start of class
{
    // Start of main method
    public static void main(String[] args)
    {
        // Ask for current date (in dd/mm/yy) and store it in a String called date
        System.out.print("Enter date (dd/mm/yy): ");
        // Scanner created without imports (bad style, just for experimentation)
        String date = new java.util.Scanner(System.in).next();

        // Replace every '/' to '.' and store it in date String
        // Then print it out
        date = date.replace('/', '.');
        System.out.println("Date is : " + date);
    } // End of main method
} // End of class
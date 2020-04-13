import java.util.Scanner;

class TriangleDemo
{
    public static void main(String[] args)
    {
        // Create all the required objects
        Scanner in = new Scanner(System.in);
        Triangle triangle = new Triangle();

        // Get input from user
        System.out.print("Enter the height of the triangle (cm): ");
        double height = in.nextDouble();
        System.out.print("Enter the base of the triangle (cm)  : ");
        double base = in.nextDouble();

        // Define the triangle's properties
        triangle.set(height, base);

        // Output the result
        System.out.printf("The triangle's height is: %.2f cm\n", triangle.getHeight());
        System.out.printf("The triangle's base is  : %.2f cm\n", triangle.getBase());
        System.out.printf("The triangle's area is  : %.2f cm^2\n", triangle.getArea());
    }
}
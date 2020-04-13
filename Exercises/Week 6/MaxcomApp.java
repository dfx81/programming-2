import java.util.Scanner;

class MaxcomApp
{
    public static void main(String[] args)
    {
        int duration, category;
        Scanner read = new Scanner(System.in);

        double charge = 0.0;
        int respond;

        CallChargeCalculator ccc = new CallChargeCalculator();

        do
        {
            System.out.println("Enter the call duration (minutes) : ");
            duration = read.nextInt();
            System.out.println("Enter Rate Cattegory : 1. Daytime  2. Evening  3. Off-Peak");
            category = read.nextInt();
            charge = ccc.computeCharge(duration, category);
            System.out.printf("The amount you have to pay is = RM%.2f%n", charge);
            System.out.println("Continue? : 1. Yes   2. No");
            respond = read.nextInt();
            System.out.println();
        } while (respond != 2);

        System.out.println("Thank you! See you again.");
    }
}
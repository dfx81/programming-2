import java.util.Scanner;

class Employee
{
    int id;
    double grossPay;
    double stateTax;
    double federalTax;

    public void input()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your employee ID number: ");
        id = in.nextInt();
        System.out.print("Enter your Gross pay         : RM");
        grossPay = in.nextDouble();
        System.out.print("Enter your State tax         : RM");
        stateTax = in.nextDouble();
        System.out.print("Enter your Federal tax       : RM");
        federalTax = in.nextDouble();
    }
}
import java.util.Scanner;

class StaffIncomeReport
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Developer dev;
        Income income;
        
        String name;
        String id;
        String incomeType;
        
        double amount;
        double tax;
        
        System.out.print("Enter name          : ");
        name = in.nextLine();
        System.out.print("Enter id            : ");
        id = in.nextLine();
        System.out.print("Enter income type   : ");
        incomeType = in.nextLine();
        System.out.print("Enter income amount : RM");
        amount = in.nextDouble();
        System.out.print("Enter tax percentage: ");
        tax = in.nextDouble();
        
        income = new Income(incomeType, amount, tax);
        dev = new Developer(name, id, income);
        dev.displayStaffInfo();
        dev.displayIncomeInfo();
    }
}

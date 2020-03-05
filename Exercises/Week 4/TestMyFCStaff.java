import java.util.Scanner;

class MyFCStaff
{
    private String name, id;
    private int hours;
    private double sales, salary;
    
    public MyFCStaff(String name, String id, int hours, double sales)
    {
        this.name = name;
        this.id = id;
        this.hours = hours;
        this.sales = sales;
    }
    
    double calculateCommission()
    {
        double multx = 0;
        
        if (sales >= 150 && sales <= 300) multx = 0.05;
        else if (sales >= 301 && sales <= 500) multx = 0.1;
        else if (sales > 500) multx = 0.15;
        
        return sales * multx;
    }
    
    void calculateSalary()
    {
        salary = 8 * hours + calculateCommission();
    }
    
    void displaySalary()
    {
        String str = "";
        str += "Staff Name  : " + name + "\n";
        str += "StaffID     : " + id + "\n";
        str += "Hours Work  : " + hours + "\n";
        str += "Total Sale  : RM" + String.format("%.2f", sales) + "\n";
        str += "Total Salary: RM" + String.format("%.2f", salary) + "\n";
        
        System.out.print(str);
    }
    
    public String toString()
    {
        String str = "";
        str += "Staff Name  : " + name + "\n";
        str += "StaffID     : " + id + "\n";
        str += "Hours Work  : " + hours + "\n";
        str += "Total Sale  : RM" + String.format("%.2f", sales) + "\n";
        str += "Total Salary: RM" + String.format("%.2f", salary) + "\n";
        
        return str;
    }
}

class TestMyFCStaff
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = in.nextLine();
        System.out.print("Enter ID: ");
        String id = in.next();
        System.out.print("Enter hours worked: ");
        int hours = in.nextInt();
        System.out.print("Enter total sales: RM");
        double sales = in.nextDouble();
        
        MyFCStaff staff = new MyFCStaff(name, id, hours, sales);
        staff.calculateSalary();
        
        System.out.println("\nResult using display method:");
        staff.displaySalary();
        
        System.out.println("\n\nResult using toString:");
        System.out.print(staff);
    }
}
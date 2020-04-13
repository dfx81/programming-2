class PayrollDemo
{
    public static void main(String[] args)
    {
        // Create all objects
        Employee staff = new Employee();
        Payroll pay = new Payroll();

        // Get input
        staff.input();

        // Calc and display output
        pay.calculateNetPay(staff.grossPay, staff.stateTax, staff.federalTax);
        pay.printOutput();
    }
}
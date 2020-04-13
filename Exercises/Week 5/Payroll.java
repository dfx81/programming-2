class Payroll
{
    double netPay = 0;

    void calculateNetPay(double gross, double state, double feds)
    {
        netPay = gross - state - feds;
    }

    void printOutput()
    {
        System.out.printf("Net pay is : RM%.2f\n", netPay);
    }
}
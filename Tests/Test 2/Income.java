class Income
{
    private String incomeType;
    
    private double amount;
    private double tax;
    private double totalTax;
    
    public Income(String incomeType, double amount, double tax)
    {
        this.incomeType = incomeType;
        this.amount = amount;
        this.tax = tax;
        this.totalTax = (tax / 100) * amount;
    }
    
    public String getIncomeType(){return incomeType;}
    public double getAmount(){return amount;}
    public double getTax(){return tax;}
    public double getTotalTax(){return totalTax;}
}
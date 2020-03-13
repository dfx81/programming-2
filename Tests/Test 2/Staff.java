class Staff
{
    private String name;
    private String id;
    private Income income;
    
    public Staff(String name, String id, Income income)
    {
        this.name = name;
        this.id = id;
        this.income = income;
    }
    
    public String getName(){return name;}
    public String getId(){return id;}
    
    public double calculateNetIncome()
    {
        return income.getAmount() -
               income.getTotalTax();
    }
    
    public void displayStaffInfo()
    {
        System.out.println("\nNAME      : " + name);
        System.out.println(  "ID        : " + id);
    }
    
    public void displayIncomeInfo()
    {
        System.out.println("\nINCOME    : RM" + income.getAmount());
        System.out.println(  "TYPE      : " + income.getIncomeType());
        System.out.println(  "TAX       : " + income.getTax() + "%");
        System.out.println(  "TOTAL TAX : RM" + income.getTotalTax());
        System.out.println(  "NET INCOME: RM" + calculateNetIncome());
    }
}

# Question 1

- "3"
- Modified code:

    // Constructor
    public QuestionOne() {count = 1;}

    // Modified main
    QuestionOne q1;
    q1 = new QuestionOne();
    q1.increment();
    q1.increment();
    System.out.println(q1.getCount());

# Question 2

a)

|----
| Staff
|----
|`- String name`
|`- String staffID`
|`- double salary`
|`- int workingDay`
|----
|`+ void setStaffInfo(String nm, String id, int wDay)`
|`+ void calculateSalary()`
|`+ double getSalary()`
|`+ String getName()`
|`+ String getStaffID()`
|----

b)

    public static void main(String[] args)
    {
        System.out.print("Enter name: ");
        String name = console.nextLine();
        System.out.print("Enter ID: ");
        String id = console.next();
        System.out.print("Enter Work Days: ");
        int workDay = console.nextInt();

        Staff staff = new Staff();
        staff.setStaffInfo(name, id, workDay);
        staff.calculateSalary();

        System.out.println("\nName   : " + staff.getName());
        System.out.println("ID     : " + staff.getStaffID());
        System.out.println("Salary : " + staff.getSalary());
    }
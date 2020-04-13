class Average
{
    public static void main(String[] args)
    {
        Average avg = new Average();
        System.out.println(avg.average(1, 2));
        System.out.println(avg.average(1, 2, 3));
        System.out.println(avg.average(1, 2, 3, 4));
    }

    double average(int a, int b)
    {
        return (a + b) / 2.0;
    }

    double average(int a, int b, int c)
    {
        return (a + b + c) / 3.0;
    }

    double average(int a, int b, int c, int d)
    {
        return (a + b + c + d) / 4.0;
    }
}
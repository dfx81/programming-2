class Student
{
    private String matricNo;
    private double test1, test2, averageMark;

    public Student(String matric, double ts1, double ts2)
    {
        matricNo = matric;
        test1 = ts1;
        test2 = ts2;
    }

    public String getStudentInfo() {return "\t" + matricNo + "\t\t" + averageMark;}

    public void calculateAverage()
    {
        averageMark = (test1 + test2) / 2;
    }
}
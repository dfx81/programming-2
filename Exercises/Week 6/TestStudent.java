import java.util.Scanner;

class TestStudent
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        final int nStudent = 3;
        String matric;
        double test1, test2;

        Student[] studDegree = new Student[nStudent];

        for (int i = 0; i != nStudent; i++)
        {
            System.out.print("Matric No : ");
            matric = in.next();
            System.out.print("Test 1    : ");
            test1 = in.nextDouble();
            System.out.print("Test 2    : ");
            test2 = in.nextDouble();

            studDegree[i] = new Student(matric, test1, test2);
            studDegree[i].calculateAverage();
        }

        System.out.println("*********************");
        System.out.println(" STUDENT INFORMATION");
        System.out.println("*********************");

        System.out.println("Matric No\t\tAverage Mark");
        
        for (int i = 0; i != nStudent; i++)
        {
            System.out.println(studDegree[i].getStudentInfo());
        }
    }
}
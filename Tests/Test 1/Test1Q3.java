import java.util.Scanner;
import static java.lang.System.*;

class Test1Q3
{
    private Scanner input;
    private String str1;
    private String str2;
    
    public static void main(String[] args)
    {
        new Test1Q3().run();
    }
    
    public Test1Q3()
    {
        input = new Scanner(in);
    }
    
    public void run()
    {
        getInput();
        check();
    }
    
    private void getInput()
    {
        out.print("First String : ");
        str1 = input.nextLine();
        out.print("Second String: ");
        str2 = input.nextLine();
    }
    
    private void check()
    {
        String result = (str1.equals(str2)) ? "same" : "different";
        out.printf("%s and %s String has %s value\n", str1, str2, result);
    }
}
import java.util.Scanner;
import static java.lang.System.*;

class Test1Q1
{
    private String message;
    private Scanner input;
    
    public static void main(String[] args)
    {
        new Test1Q1().run();
    }
    
    public Test1Q1()
    {
        input = new Scanner(in);
    }
    
    public void run()
    {
        setMessage();
        printMessage();
    }
    
    private void setMessage()
    {
        out.print("Enter the message to be displayed: ");
        this.message = input.nextLine();
    }
    
    private void printMessage()
    {
        out.print("The message is: " + message);
    }
}
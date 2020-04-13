import java.util.Scanner;
import java.util.ArrayList;

class TestBook
{
    public static void main(String[] args)
    {
        String title;
        double price;

        // Keeps track of the highest priced book
        Book highest = new Book("default", 0);

        // A dynamic list to keep count of the books with Java in its title
        ArrayList <Book> javaBooks = new ArrayList <Book>(); // <-- This is a <Generic>. Replace with required Data Type

        // Get no of books and create Book Array
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of books: ");
        int n = in.nextInt();
        in.nextLine(); // Ignore trailing newlines

        Book[] myLibrary = new Book[n];

        // No need to loop multiple times
        for (int i = 0; i != n; i++)
        {
            // Get title and price
            System.out.print("Enter book " + (i + 1) + "'s title : ");
            title = in.nextLine();
            System.out.print("Enter book " + (i + 1) + "'s price : RM");
            price = in.nextDouble();
            in.nextLine(); // Ignore trailing newlines

            // Create and store new Book in Book Array
            myLibrary[i] = new Book(title, price);

            // Check for highest priced book and Java book
            if (price > highest.getPrice()) highest = myLibrary[i];
            if (title.contains("Java")) javaBooks.add(myLibrary[i]);
        }

        // Display the outputs
        System.out.printf("\nHighest priced book is %s at RM%.2f\n", highest.getTitle(), highest.getPrice());
        System.out.printf("\nThere's %d books with Java in its title\n\n", javaBooks.size());

        // Lists all books in the Book ArrayList
        for (int i = 0; i != javaBooks.size(); i++)
        {
            System.out.println(javaBooks.get(i).getTitle());
        }
    }
}
import java.util.*;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


class LibMS {
    LinkedList<String> Book = new LinkedList<>();
    LinkedList<String> Book_Author = new LinkedList<>();
    LinkedList<String> Issued_to = new LinkedList<>();
    LinkedList<String> Issued_On = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    int total_no_of_books = 0;

    public void addBooks() {
        System.out.print("How many books you want to add: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Book number " + i);
            System.out.print("Enter Book name: ");
            String inp1 = sc.nextLine();
            Book.add(inp1);


            System.out.print("Enter Book's Author name: ");
            String inp2 = sc.nextLine();
            Book.add(inp2);

            System.out.print("Enter issued to(if not then write null): ");
            String inp3 = sc.nextLine();
            Book.add(inp3);

            System.out.print("Enter issued on(if not then write null): ");
            String inp4 = sc.nextLine();
            Book.add(inp4);

            total_no_of_books++;

            System.out.println("\n");
        }
    }

    public void display() {
        System.out.println("Here is the list of the books available!\n");
        for (int i = 0; i < total_no_of_books; i++) {
            System.out.println("Sr. no. \tName \tAuthor \tIssued to \tIssued On");
            System.out.println(Book.get(i) + " \t" + Book_Author.get(i) + " \t" + Issued_to.get(i) + " \t" + Issued_On.get(i));
        }
    }

    public void issueBook() {
        System.out.print("Enter the name of the book you want to issue: ");
        String a = sc.nextLine();
        for (int i = 0; i < total_no_of_books; i++) {
            String b= (String) Book.get(i);
            if (b.toLowerCase()==a.toLowerCase()){
                String c = (String) Issued_to.get(i);
                if (c.toLowerCase()=="null"){
                    System.out.println("The book is available!");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("What is your name?");
                }
            }
        }
    }
}


public class CWH_104_exercise {
    public static void main(String[] args) {
        LibMS Library = new LibMS();
        Library.addBooks();
        Library.display();
        Library.issueBook();
    }
}

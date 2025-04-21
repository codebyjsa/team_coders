import java.util.Scanner;

class library{
    String[] books;
    int no_of_books;

    public library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }
    
    public void addBooks(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added successfully!");
    }

    public void showAvailableBooks(){
        for (String book : this.books) {
            if (this.books == null){
                continue;
            }
            System.out.println(book);
        }
    }

    public void issueBook(String book){
        for (int i = 0; i<no_of_books; i++){
            if (book==this.books[i]){
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(String book){
        addBooks(book);
    }
}

public class CWH_51_exercise4 {
    public static void main(String[] args) {

    }
}

package oopconcept;

interface IssueBook {
    void issueBook();
}

abstract class Library {
    abstract void showDetails();
}

class Book extends Library implements IssueBook {

    private String bookName;

    Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void issueBook() {
        System.out.println(bookName + " Issued Successfully");
    }

    void showDetails() {
        System.out.println("Book Name: " + bookName);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        Book b = new Book("Java Programming");

        b.showDetails();
        b.issueBook();
    }
}
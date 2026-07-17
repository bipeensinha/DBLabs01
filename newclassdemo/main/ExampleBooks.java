package main;
import library.Book;
public class ExampleBooks {
public static void main(String[] args) {
// Create a new instance of the Book class
Book b = new Book();
// Set the fields of the Book instance

b.title = "Thinking in Java";
b.author = "Bruce Eckel";
b.numberOfPages = 1129;


// Print the fields of the Book instance

System.out.println(b.title + " : " + b.author + " : " + b.numberOfPages);

}

}
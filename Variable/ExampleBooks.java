public class ExampleBooks {

public static void main(String[] args) {

// Create book objects

Book book1 = new Book("Harry Potter", "J.K. Rowling", 500);

Book book2 = new Book("Harry Potter", "J.K. Rowling", 500, "1234567890");


// Accessing the static variable using the class name (preferred way)

System.out.println("Total number of books: " + Book.getBookCount()); // Outputs: 2


// Accessing static method through an instance (not recommended, but valid)

System.out.println("Total number of books (accessed through book1): " + book1.getBookCount()); // Outputs: 2

}

}
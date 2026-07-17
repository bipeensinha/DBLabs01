class Book {

// Static variable (class variable)

static int bookCount = 0;


// Instance variables

String title;

String author;

int numberOfPages;

String ISBN;


// Constructor

Book(String title, String author, int numberOfPages) {

this.title = title;

this.author = author;

this.numberOfPages = numberOfPages;

this.ISBN = "unknown";

bookCount++; // Increment the static variable whenever a new Book object is created

}


// Another constructor with ISBN

Book(String title, String author, int numberOfPages, String ISBN) {

this.title = title;

this.author = author;

this.numberOfPages = numberOfPages;

this.ISBN = ISBN;

bookCount++; // Increment the static variable whenever a new Book object is created

}


// Static method to get the count of books

static int getBookCount() {

return bookCount;

}

}
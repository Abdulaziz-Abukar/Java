/*
1. Library Management System
Exercise:
Design a library management system with the following features:

Classes and Objects:

Create a superclass LibraryItem with properties title and author, and an abstract method displayInfo().
Create subclasses Book, Magazine, and DVD that extend LibraryItem and implement the displayInfo() method.
Add unique properties to each subclass, such as numberOfPages for Book, issueNumber for Magazine, and duration for DVD.
Control Flow and Loops:

Create a Library class that maintains a list of LibraryItem objects.
Implement methods to add items to the library, display all items, and find items by title.
Polymorphism:

Use polymorphism to handle different types of LibraryItem objects in the Library class.
Objective:

Instantiate objects of Book, Magazine, and DVD, add them to the Library, and demonstrate all functionalities.
 */

package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create and add items to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        Magazine magazine1 = new Magazine("National Geographic", "Various Authors", 202);
        DVD dvd1 = new DVD("Inception", "Christopher Nolan", 148);

        library.addItem(book1);
        library.addItem(magazine1);
        library.addItem(dvd1);

        // Display all items in the library
        System.out.println("Displaying all items in the library:");
        library.displayAllItems();

        // Find and display a specific item by title
        System.out.println("Searching for 'Inception':");
        LibraryItem foundItem = library.findItemByTitle("Inception");
        if (foundItem != null) {
            foundItem.displayInfo();
        } else {
            System.out.println("Item not found.");
        }
    }
}


package ComprehensiveLibrarySystem;

public class Student implements LibraryUser {
    String name;
    int age;
    int studentIdNumber;
    private int maxBooks = 3;

    public Student(String name, int age, int studentIdNumber) {
        this.name = name;
        this.age = age;
        this.studentIdNumber = studentIdNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getStudentIdNumber() {
        return this.studentIdNumber;
    }


    @Override
    public void borrowBook(Library library, String isbn) {
        if (library.getNumberOfBorrowedBooks(name) < maxBooks) {
            library.borrowBook(isbn, name);
        } else {
            System.out.println("Student: " + name + " has reached the maximum borrow limit");
        }
    }

    @Override
    public void returnBook(Library library, String isbn) {
        library.returnBook(isbn, name);
    }
}

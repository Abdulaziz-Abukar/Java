package ComprehensiveLibrarySystem;

public class Teacher implements LibraryUser {
    String name;
    int age;
    int professorIdNumber;
    private int maxBooks = 5;

    public Teacher(String name, int age, int professorIdNumber) {
        this.name = name;
        this.age = age;
        this.professorIdNumber = professorIdNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getProfessorIdNumber() {
        return this.professorIdNumber;
    }

    @Override
    public void borrowBook(Library library, String isbn) {
        if (library.getNumberOfBorrowedBooks(name) < maxBooks) {
            library.borrowBook(isbn, name);
        } else {
            System.out.println("Teacher " + name + " has reached the maximum borrow limit");
        }
    }

    @Override
    public void returnBook(Library library, String isbn) {
        library.returnBook(isbn, name);
    }
}

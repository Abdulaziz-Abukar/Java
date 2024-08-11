package Generics;

/*
Generics allow you to create classes, interfaces, and methods that operate on parameterized types.

Box<T> is a generic class with a type parameter T.

setContent() and getContent() methods operate on the generic type "T"
 */

class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, World!");
        System.out.println("String Box Content: " + stringBox.getContent());

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(42);
        System.out.println("Integer Box Content: " + integerBox.getContent());
    }
}


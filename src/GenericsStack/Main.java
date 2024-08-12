package GenericsStack;

public class Main {
    public static void main(String[] args) {

        GenericStack<Integer> integerStack = new GenericStack<>();
        integerStack.push(54);
        integerStack.push(10);
        integerStack.push(40);

        System.out.println("Integer Stack:");
        System.out.println("Top element: " + integerStack.peek());
        System.out.println("Popped Element: " + integerStack.pop());
        System.out.println("Is Stack empty?: " + integerStack.isEmpty());

        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Apples");
        stringStack.push("Grapes");
        stringStack.push("Oranges");

        System.out.println("\nString Stack:");
        System.out.println("Top element: " + stringStack.peek());
        System.out.println("Popped Element: " + stringStack.pop());
        System.out.println("Is Stack empty?: " + stringStack.isEmpty());

    }
}

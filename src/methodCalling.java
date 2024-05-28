public class methodCalling {

    // A simple Method.
    public static void printMessage() {
        System.out.println("Hello, Java methods!");
    }

    // Methods with Parameters.
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
    // Method with return values.
    public static int multiply(int a, int b) {
        return a * b;
    }

    // First version of the add method.
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded version of the add method with three parameters.
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        printMessage(); // A simple Method calling.

        printSum(5, 10); // Method with parameters calling.

        int result = multiply(5, 3); // method with return value calling.
        System.out.println("The result is: " + result);

        System.out.println(add(5, 6));  // Calls the first method.
        System.out.println(add(5, 10, 15)); // Calls the overloaded method.
    }
}

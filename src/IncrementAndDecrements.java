/*
This lesson will be practice for increments and decrement operators.
that also includes pre-increment, post-increment and pre-decrement and post-decrement.
 */

public class IncrementAndDecrements {
    public static void main(String[] args) {
        // pre-decrement operator.
        int a = 10; // before the operation 'a' is 10.
        int b = --a;    // after the operation, 'a' is now 9 and b is assigned the value of a so b is 9;
        System.out.println(a);
        System.out.println(b);

        // post-decrement operator.
        int c = 15; // before the operation, 'c' is 15
        int d = c--; // during the operation, 'd' is 15 because 'd' was assigned 'a' value before 'a' was decremented.
        // after the operation, 'c' is now 14 and 'd' is 15 because 'd' was assigned 'a' value before 'a' was decremented.
        System.out.println(c);
        System.out.println(d);

        // pre-increment operator.
        int e = 5;  // before the operation 'e' is 5.
        int f = ++e;    // after the operation, 'e' is now 6 and 'f' is assigned the value of 'e' so b is 6 as well.
        System.out.println(e);
        System.out.println(f);

        // post-increment operator
        int g = 2; // before the operation 'g' is 2.
        int h = g++; // during the operation 'h' is 2 because 'h' was assigned 'e' value before 'g' was incremented.
        // after the operation, 'g' is now 3 and 'h' is now '2' because 'h' was assigned 'g' value before 'g' was incremented.
        System.out.println(g);
        System.out.println(h);

        // Visual practice
        int i = 0;
        System.out.println("Using pre-increment:");
        while (i < 5) {
            System.out.println(++i); // Pre-increment: Prints 1, 2, 3, 4, 5
        }

        i = 0; // Resetting i for the next example
        System.out.println("Using post-increment:");
        while (i < 5) {
            System.out.println(i++); // Post-increment: Prints 0, 1, 2, 3, 4
        }
    }
}

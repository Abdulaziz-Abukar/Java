/*
this lesson will be practice for compound assignment operators.
that includes +=, -=, *=, /= and %=.
 */

public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        // += add and assign.
        int a = 5;
        a += 5; // this is equivalent to a = a + 5;
        // Now, 'a' is 15.
        System.out.println("a is: " + a);

        // -= subtract and assign.
        int b = 25;
        b -= 5; // Equivalent to b = b -5;
        // Now, b is 15;
        System.out.println("b is: " + b);

        // *= Multiply and assign.
        int c = 5;
        c *= 3; // Equivalent to c = c * 3;
        // Now, c is 15;
        System.out.println("c is: " + c);

        // /= divide and assign.
        int d = 15;
        d /= 3; // Equivalent to d = d / 3;
        // Now, d is 5;
        System.out.println("d is: " + d);
        // %= Modulus and assign.
        int e = 16;
        e %= 3; // Equivalent to e = e % 3;
        // Now, e is 1, because 16 divided by 3 leaves a remainder of 1.
        System.out.println("e is: " + e);



        // Practice questions.
        // Convert x = x + 1; into a compound assignment operator.
        int x = 0;
        x += 1;
        System.out.println("x is: " + x);

        // Convert y = y * 2; into a compound assignment operator.
        int y = 7;
        y *= 2;
        System.out.println("y is: " + y);

        // Convert z = z - (8 / 2); into a compound assignment operator.
        int z = 10;
        z -= (8 / 2);
        System.out.println("z is: " + z);

        // Convert w = w + (w * 0.1); into a compound assignment operator.
        int w = 3;
        w += (w * 0.1);
        System.out.println("w is: " + w);
    }
}

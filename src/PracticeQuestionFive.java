/*
This is my fifth practice question.
This one will be challenging.
Today I will create a program that solves quadratic equations.
In this lesson I will use variables, data types, and operators.
 */

public class PracticeQuestionFive { // declare member access as public.
    public static void main(String[] args) {    // entry point for Java programs.
        // Coefficients of the quadratic equation ax^2 + bx + c = 0
        double a = 1.0; // Example value
        double b = -5.0; // Example value
        double c = 6.0; // Example value

        // Calculating the discriminant (D)
        double D = b * b - 4 * a * c;

        // Calculating the roots of the equation based on the discriminant
        double root1, root2;
        if (D > 0) {
            // Two distinct real roots
            root1 = (-b + Math.sqrt(D)) / (2 * a);
            root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Root 1: " + root1 + " and Root 2: " + root2);
        } else if (D == 0) {
            // One real root (double root)
            root1 = -b / (2 * a);
            System.out.println("Root: " + root1);
        } else {
            // Roots are complex numbers, but we'll not handle this case as per the limitations
            System.out.println("The equation has complex roots.");
        }


    }
}

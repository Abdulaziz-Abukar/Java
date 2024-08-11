package Generics;

/*
Exercise 1: Pair Class
Objective:
Create a generic Pair class that holds two objects of the same type.

Requirements:

Implement a class Pair<T> with the following:
Two fields of type T: first and second.
A constructor that initializes both fields.
Getter methods getFirst() and getSecond().
A method swap() that swaps the two elements.
 */

class Pair<F, S> {
    private F first;
    private S second;

    Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    F getFirst() {
        return first;
    }

    S getSecond() {
        return second;
    }

    void SwapPairs() {
        F temp = first;
        first = (F) second;
        second = (S) temp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                "}";
    }

}
public class PairClass {
    public static void main(String[] args) {
        // create a pair with Integer and String
        Pair<Integer, String> pair = new Pair<>(1, "One");
        System.out.println("Original pair: " + pair);

        //Swap pair
        pair.SwapPairs();
        System.out.println("Swapped Pair: " + pair);

        // Create a pair with Double and Character
        Pair<Double, Character> pair2 = new Pair<>(2.5, 'A');
        System.out.println("Original pair: " + pair2);

        // Swap pair2
        pair2.SwapPairs();
        System.out.println("Swapped pair: " + pair2);

    }
}

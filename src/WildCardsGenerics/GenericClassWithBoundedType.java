package WildCardsGenerics;

/*
Exercise 1: Generic Class with Bounded Types
Create a generic class Pair that stores two objects of the same type. The class should have methods to set and get each object and a method to print the pair.
Ensure that the type parameter is bounded to classes that extend Number.

Objectives:

Create a generic class with bounded types.
Implement methods to operate on the generic type.
Use the Pair class with different numeric types.
 */
class Pair<T extends Number> {
    private T firstNum;
    private T secondNum;

    public Pair(T firstNum, T secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public T getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(T firstNum) {
        this.firstNum = firstNum;
    }

    public T getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(T secondNum) {
        this.secondNum = secondNum;
    }

    public void printPair() {
        System.out.println("First Num: " + firstNum + ", Second Num: " + secondNum);
    }
}
public class GenericClassWithBoundedType {
    public static void main(String[] args) {
        Pair<Integer> myIntPair = new Pair<>(5, 10);
        System.out.println(myIntPair.getFirstNum());
        System.out.println(myIntPair.getSecondNum());
        myIntPair.setFirstNum(2);
        myIntPair.setSecondNum(4);
        myIntPair.printPair();

        Pair<Double> myDoublePair = new Pair<>(5.5, 10.10);
        System.out.println(myDoublePair.getFirstNum());
        System.out.println(myDoublePair.getSecondNum());
        myDoublePair.setFirstNum(2.5);
        myDoublePair.setSecondNum(4.5);
        myDoublePair.printPair();
    }

}

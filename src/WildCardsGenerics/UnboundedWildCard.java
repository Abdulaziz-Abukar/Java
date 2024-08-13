package WildCardsGenerics;

import java.util.ArrayList;
import java.util.List;

/*
Exercise 3: Print List with Unbounded Wildcard
Write a method printList that takes a List<?> and prints all elements. The method should work with lists of any type,
and you should test it with different types of lists (e.g., List<String>, List<Integer>).

Objectives:

Use unbounded wildcards to handle lists of any type.
Iterate through the list and print each element.
Demonstrate the flexibility of using wildcards.
 */
public class UnboundedWildCard {

    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> myIntList = new ArrayList<>();
        myIntList.add(2);
        myIntList.add(4);
        myIntList.add(1);
        printList(myIntList);

        List<String> myStringList = new ArrayList<>();
        myStringList.add("Monkey");
        myStringList.add("Dog");
        myStringList.add("Cat");
        printList(myStringList);

        List<Double> myDoubleList = new ArrayList<>();
        myDoubleList.add(5.4);
        myDoubleList.add(1.1);
        myDoubleList.add(6.7);
        printList(myDoubleList);
    }
}

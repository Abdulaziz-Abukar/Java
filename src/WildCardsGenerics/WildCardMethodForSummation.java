package WildCardsGenerics;

import java.util.ArrayList;
import java.util.List;

public class WildCardMethodForSummation {
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;

        for (Number element : list) {
            sum += element.doubleValue();
        }

       return sum;
    }

    public static void main(String[] args) {
        List<Double> myDoubleList = new ArrayList<>();
        myDoubleList.add(5.5);
        myDoubleList.add(5.10);

        System.out.println(sumOfList(myDoubleList));

        List<Integer> myIntList = new ArrayList<>();
        myIntList.add(5);
        myIntList.add(2);
        myIntList.add(3);

        System.out.println(sumOfList(myIntList));
    }
}

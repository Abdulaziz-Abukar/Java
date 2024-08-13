package WildCardsGenerics;
import java.util.List;
import java.util.ArrayList;
public class WildCardExample {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(5);
        intList.add(6);
        intList.add(1, 3);

        printList(intList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Monkey");
        stringList.add("Dog");
        stringList.add("Mouse");
        stringList.add(1, "Cat");

        printList(stringList);
    }
}

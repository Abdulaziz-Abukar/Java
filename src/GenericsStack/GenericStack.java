package GenericsStack;
import java.util.List;
import java.util.ArrayList;

public class GenericStack<T> {
    private List<T> elements;


    public GenericStack() {
        this.elements = new ArrayList<>();
    }

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.get((elements.size() - 1));
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

}

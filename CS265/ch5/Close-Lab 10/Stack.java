import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<E> {
    private ArrayList<E> stack;

    public Stack() {
        stack = new ArrayList<E>();
    }

    public void push(E item) {
        stack.add(item);
    }

    public E pop() {
        if (!isEmpty()) {
            return stack.remove(size() - 1);
        }
        else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return (stack.size() == 0);
    }

    public E peek() {
        if (!isEmpty()) {
            return stack.get(size() - 1);
        }
        else {
            throw new EmptyStackException();
        }
    }

    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return "ListStack [stack=" + stack.toString() + "]";

    }
}
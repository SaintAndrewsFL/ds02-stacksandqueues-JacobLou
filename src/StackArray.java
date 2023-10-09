import java.util.ArrayList;

public class StackArray<T> {
    private ArrayList<T> items;

    public StackArray() {
        items = new ArrayList<>();
    }

    public T push(T item) {
        items.add(item);
        return item;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        int lastIndex = items.size() - 1;
        T removedItem = items.remove(lastIndex);
        return removedItem;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        int lastIndex = items.size() - 1;
        return items.get(lastIndex);
    }

    public void display() {
        for (T item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public int size() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}



/*
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */
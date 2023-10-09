import java.util.ArrayList;

public class QueueArray<T> {
    private ArrayList<T> items;

    public QueueArray() {
        items = new ArrayList<>();
    }

    public T enqueue(T item) {
        items.add(item);
        return item;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        return items.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return items.get(0);
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
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */

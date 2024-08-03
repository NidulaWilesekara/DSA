package DSA;
import java.util.ArrayList;

public class ArrayListQueue<T> {
    private ArrayList<T> queue;

    public ArrayListQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Dequeue from an empty queue");
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Peek from an empty queue");
        }
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue size: " + queue.size()); // Output: 3
        System.out.println("Front element: " + queue.peek()); // Output: 1

        System.out.println("Dequeue: " + queue.dequeue()); // Output: 1
        System.out.println("Queue size after dequeue: " + queue.size()); // Output: 2

        System.out.println("Dequeue: " + queue.dequeue()); // Output: 2
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 3

    }
}

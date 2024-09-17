package generic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GLinkedList<T> {
    private Node<T> head;
    private int size;
    private static Logger logger = LogManager.getLogger(GLinkedList.class);

    // Node class to represent each element in the LinkedList
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public GLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add a new element to the end of the LinkedList
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Remove an element from the LinkedList by value
    public void remove(T data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return;
        }

        Node<T> current = head;
        Node<T> previous = null;

        while (current != null && !current.data.equals(data)) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
            size--;
        }
    }

    // Get an element at a specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    // Get the size of the LinkedList
    public int size() {
        return size;
    }

    // Print the elements of the LinkedList
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            logger.info(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

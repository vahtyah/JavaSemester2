package src.lab_23.task_2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.Predicate;

public class LinkedQueue extends AbstractQueue {

    private Node tail;
    private Node head;

    public LinkedQueue() {
        tail = null;
        head = null;
    }

    protected Object get_(int i) {
        Node n = head;
        while (i-- != 0) {
            n = n.prev;
        }
        return n.value;
    }

    protected void enqueue_(Object elem) {
        tail = new Node(elem, null, tail);
        if (head == null) {
            head = tail;
        }
        if (tail.next != null) {
            tail.next.prev = tail;
        }
    }

    protected void push_(Object elem) {
        head = new Node(elem, head, null);
        if (tail == null) {
            tail = head;
        }
        if (head.prev != null) {
            head.prev.next = head;
        }
    }

    protected Object element_() {
        return head.value;
    }

    protected Object peek_() {
        return tail.value;
    }

    protected void dequeue_() {
        if (tail == head) {
            tail = null;
        }
        head = head.prev;
        if (head != null) {
            head.next = null;
        }
    }

    protected void remove_() {
        if (tail == head) {
            head = null;
        }
        tail = tail.next;
        if (tail != null) {
            tail.prev = null;
        }
    }

    public void display() {
       Node node = head;
       while (node!=tail.prev){
           System.out.print(node.value + " ");
           node = node.prev;
       }
    }

    private class Node {
        Object value;
        Node prev;
        Node next;

        Node(Object element, Node prev, Node next) {
            value = element;
            this.prev = prev;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.print("Queue: ");
        queue.display();
        queue.dequeue_();
        System.out.println("\nRemoved first element");
        System.out.print("Queue after deletion: ");
        queue.display();
    }
}

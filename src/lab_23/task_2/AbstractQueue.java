package src.lab_23.task_2;

public interface AbstractQueue<T> {
    boolean isFull();
    boolean isEmpty();
    void enQueue();
    T deQueue();

}

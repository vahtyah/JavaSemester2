package src.lab_26.task_1;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        hashtab<Integer, String> hashtable = new hashtab<>();
        hashtable.hashtabInit();
        hashtable.hashtabAdd(1,"Have");
        hashtable.hashtabAdd(2,"A");
        hashtable.hashtabAdd(3,"Good");
        hashtable.hashtabAdd(4,"Day");
        hashtable.hashtabAdd(5,"Хорошего");
        hashtable.hashtabAdd(6,"Дня");
        hashtable.hashtabAdd(7,"Ngay");
        hashtable.hashtabAdd(8,"Moi");
        hashtable.hashtabAdd(9,"Tot");
        hashtable.hashtabAdd(10,"Lanh");

        do {
            System.out.print("Enter the key you want to find: ");
            String value = hashtable.hashtabLookup(in.nextInt());
            if(value== null) System.out.println("The key not found!");
            else System.out.println("Value: " + value);
            System.out.print("Enter the key you want to delete: ");
            boolean proverka = hashtable.hashtabDelete(in.nextInt());
            if(!proverka) System.out.println("The key not found!");
            else System.out.println("Deleted!");
            System.out.print("Exit (Enter 0)?");
        } while(in.nextInt() != 0);

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(7);
        queue.add(5);
        queue.add(2);
        queue.add(1);
        queue.add(8);
        queue.add(6);
        queue.add(9);
        queue.add(0);
        queue.add(10);

        System.out.println("Queue Priority: " + queue);
    }
}

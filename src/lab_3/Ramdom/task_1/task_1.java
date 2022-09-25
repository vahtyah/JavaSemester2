package src.lab_3.task_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            if(i < 10) arr.add((int) (Math.random() * 10));
            else arr.add(ran.nextInt(10));
        }
        System.out.println("Array: " + arr);
        arr.sort(Comparator.naturalOrder());
        System.out.println("Array after sorting: "+ arr);
    }
}

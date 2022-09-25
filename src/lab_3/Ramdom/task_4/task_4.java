package src.lab_3.Ramdom.task_4;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n, k = 0;
        while (true){
            try{
                n = in.nextInt();
                break;
            }catch (Exception exception){
                System.out.print("Re-enter: ");
                in.nextLine();
            }
        }
        int[] arr = new int[n];
        System.out.print("Array: ");
        for (int i = 0; i < n; i++){
            arr[i] = (int)(Math.random()*(n+1));
            System.out.print(arr[i] + " ");
            if(arr[i] % 2 == 0) k++;
        }
        int[] arr_even = new int[k];
        System.out.print("\nEven number array: ");
        k = 0;
        for (int i = 0; i < n; i++)
            if(arr[i] % 2 == 0){
                arr_even[k] = arr[i];
                System.out.print(arr_even[k++] + " ");
            }
        in.close();
    }
}

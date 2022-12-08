package src.lab_3.Ramdom.task_3;

public class task_3 {
    public static boolean checkArr(int...arr){
        for(int i = 1; i < 4; i++)
            if(arr[i] < arr[i - 1])
                return false;
        return true;
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.print("Array: ");
        for(int i = 0; i < 4; i++){
            arr[i] = (int)(Math.random()*90)+10;
            System.out.print(arr[i] + " ");
        }
        if(checkArr(arr)) System.out.print("\nIncremental array.");
        else System.out.print("\nNot incremental array.");
    }
}

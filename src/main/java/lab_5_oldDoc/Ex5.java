import java.util.Scanner;

public class Ex5 {
    public static int recursion(int value){
        if(value == 0) return 0;
        return recursion(value / 10) + (value % 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = in.nextInt();
       System.out.print("Sum digit: "+recursion(value));
    }
}

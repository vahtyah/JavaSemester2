package src.lab_19.task_1;

import com.sun.net.httpserver.Authenticator;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) throws Error {
        Scanner in = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Enter name: ");
        String name = in.nextLine();
        System.out.println("Enter inn: ");
        try {
            int inn = in.nextInt();
            if(!client.getName().equals(name) || client.getInn() != inn)
                throw new Error("Wrong name or inn!");
            else System.out.println("Success!");
        }catch (Error error)
        {
            System.out.println(error);
        }
    }
}

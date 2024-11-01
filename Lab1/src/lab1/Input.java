package lab1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ID    : ");
        int id = in.nextInt();
        System.out.println("Enter Name  : ");
        String name = in.next();
        System.out.println("Enter Age   : ");
        int age = in.nextInt();
        System.out.println("=======Student's Data=======");
        System.out.println("ID      : "+id);
        System.out.println("Name    : "+name);
        System.out.println("Age     : "+age);
    }
    
}

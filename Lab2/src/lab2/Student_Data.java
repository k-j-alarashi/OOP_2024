package lab2;

import java.util.Locale;
import java.util.Scanner;

public class Student_Data {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ID   : ");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("Enter Name : ");
        String name = in.nextLine();
        System.out.println("Enter Age  : ");
        int age = in.nextInt();
        System.out.println("Enter Major:");
        String major = in.next();
        System.out.println("=========Student's Data=========");
//        System.out.println("ID          : "+id);
//        System.out.println("Name        : "+name);
//        System.out.println("Age         : "+age);
//        System.out.println("Major       : "+major);
        //using formatted print ...
        System.out.printf("ID : %d \nName : %s \nAge : %d \nMajor : %s ",id,name,age,major);
    }
}

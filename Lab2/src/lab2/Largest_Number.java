package lab2;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The First  Number : ");
        int x = input.nextInt();
        System.out.println("Enter The Second Number : ");
        int y = input.nextInt();
        if(x>y){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
    }
}

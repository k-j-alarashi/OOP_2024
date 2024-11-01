package lab2;

import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The First  Number : ");
        int x = input.nextInt();
        System.out.println("Enter The Second Number : ");
        int y = input.nextInt();
        System.out.println("Enter The Operation You Want : ");
        char ops = input.next().charAt(0);
        switch (ops) {
            case '+':
                System.out.println(x+" + "+y+" = "+(x+y));
                break;
            case '-':
                System.out.println(x+" - "+y+" = "+(x-y));
                break;
            case '*':
                System.out.println(x+" * "+y+" = "+(x*y));
                break;
            case '/':
                System.out.println(x+" / "+y+" = "+(x/y));
                break;
            default:
                throw new AssertionError();
        }
    }
}

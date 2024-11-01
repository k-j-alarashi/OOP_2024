package lab2;

import java.util.Scanner;

public class ShortHand_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int x = in.nextInt();
        
        String rs = (x%2==0) ? "even" : "odd";
        System.out.println("Result : "+rs);
    }
}

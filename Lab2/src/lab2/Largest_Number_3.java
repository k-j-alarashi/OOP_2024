/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Scanner;

public class Largest_Number_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The First  Number : ");
        int x = input.nextInt();
        System.out.println("Enter The Second Number : ");
        int y = input.nextInt();
        System.out.println("Enter The Third  Number : ");
        int z = input.nextInt();
        if(x>y && x>z){
            System.out.println(x);
        }
        else if(y>x && y>z){
            System.out.println(y);
        }
        else if(z>x && z>y){
            System.out.println(z);
        }
        else {
            System.out.println("equals");
        }
    }
}

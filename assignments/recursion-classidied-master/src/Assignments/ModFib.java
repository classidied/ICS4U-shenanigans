/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;
import java.util.Scanner;
/**
 *
 * @author claire
 */
public class ModFib {
    /**
     * Returns the index of a modified Fibonacci number
     * (value is the sum of the previous 3 integers)
     * @param n
     * @return a modified Fibonacci number
     */
    public static int modFibonacci(int n) {
        switch (n) {
            // returning appropriate values for base cases
            case 0:
                return 3;
            case 1:
                return 5;
            case 2:
                return 8;
            default:
                return modFibonacci(n - 1) + modFibonacci(n - 2) + modFibonacci(n - 3);
        }
    }
    // testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index:");
        int n = sc.nextInt();
        System.out.println("Term #" + n + " is " + modFibonacci(n));
    }
}

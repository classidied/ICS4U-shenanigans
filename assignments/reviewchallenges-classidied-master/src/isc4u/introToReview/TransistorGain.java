/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Description: calculate transistor gain from base current and collector current
 * Teacher:Mr. R-D
 * @author claire
 * Date: 9/18/2020
 */
package isc4u.introToReview;

import java.util.Scanner;

public class TransistorGain {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        double baseCurrent; 
        double collectorCurrent = 1;
        
        while (collectorCurrent != 0) {
            System.out.println("Enter the amount of base current (in Amperes):");
            baseCurrent = scan.nextDouble();
            System.out.println("Enter the amount of collector current (in Amperes):");
            collectorCurrent = scan.nextDouble();
            // calculation for transistor gain
            double beta = collectorCurrent / baseCurrent;
            System.out.println("The transistor current gain is " + beta);
        }
        
        scan.close();
    }
    
}

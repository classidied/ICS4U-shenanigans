/*
 * Copyright (c) 2020 claire.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    claire - initial API and implementation and/or initial documentation
 */
package isc4u.introToReview;
import java.util.Scanner;
/**
 * Description: 
 * Teacher: Mr. R-D
 * @author claire
 * Date: 9/28/2020
 */
public class NicholasLovesTobogganing {
    public static void main(String[] args) {
        // declaring scanner variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data separated by a single space:");
        // getting input, storing in array
        String[] inputs = sc.nextLine().split("\\s+");
        double[] data = new double[4]; // initializing int array
        // converting string values to int
        for (int i = 0; i < 4; i++) {
            data[i] = Double.parseDouble(inputs[i]);
        }
        // declaring variables
        double d = data[0]; // distance to top of hill in meters
        double c = data[1]; // distance Nick can climb on attempt 1
        double s = data[2]; // distance slides when falls
        double f = data[3]; // fatigue factor (percentage)
        double totalD = 0.0; // total distance to determine failure/success
        int attemptNum = 0; // counting number of attempts
        boolean success = false;
        boolean failure = false;
        // looping through calculations
        while (success == false && failure == false) {
            if (attemptNum == 0) {
                totalD += c; // initial climb   
            } else {
                totalD += (c - ((f/100.0)*c)); // successive climbs
            }
            totalD -= s; 
            attemptNum++;
            if (totalD < 0) {
                failure = true; 
            } else if (totalD > d) {
                success = true;
            }
        }
        // printing results
        if (failure == true) {
            System.out.println("FAILURE ON ATTEMPT " + attemptNum);
        } else if (success == true) {
            System.out.println("SUCCESS ON ATTEMPT " + attemptNum);
        }
        // closing scanner
        sc.close();
    }
}

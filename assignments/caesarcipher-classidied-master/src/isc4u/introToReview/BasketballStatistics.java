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
 * Description: finding best foul shot percentage
 * Teacher: Mr. R-D
 * @author claire
 * Date: 9/25/2020
 */
public class BasketballStatistics {
    public static void main(String [] args) {
        // declaring scanner, arrays 
        Scanner sc = new Scanner(System.in);
        String[] names = new String[4];
        int[] shotsTaken = new int[4];
        int[] shotsMade = new int[4];
        // getting info
        System.out.println("Enter 4 sets of data in this format:\n1. "
                + "player's name\n2. shots taken\n3. shots made");
        // feeding info into arrays
        int i = 0;
        while (sc.hasNextLine() && i < 4) {
            names[i] = sc.next();
            shotsTaken[i] = sc.nextInt();
            shotsMade[i] = sc.nextInt();
            i++;
        }
        // storing percentages in array for comparison
        double[] results = new double[4];
        // printing percentages
        for (int j = 0; j < 4; j++) {
            // converting ints to double
            double taken = new Double(shotsTaken[j]);
            double made = new Double(shotsMade[j]);
            // calculating percentages
            double quotient = Math.round(((made/taken)*100)*100.0)/100.0;
            results[j] = quotient;
            System.out.println(names[j] + "-" + quotient + "%");
        }
        // finding + printing best player
        double best = results[0];
        String bestPlayer = "";
        for (int x = 0; x < 4; x++) {
            if (results[x] > best) {
                best = results[x];
                bestPlayer = names[x];
            }
        }
        System.out.println(bestPlayer + " is the best player.");
        // closing scanner;
        sc.close();
    }
    
}

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
 * Description: taking in adjectives and nouns and outputting all the possible
 * similies Teacher: Mr. R-D
 *
 * @author claire Date: 9/28/2020
 */
public class SmileWithSimilies {

    public static void main(String[] args) {
        // declaring scanner variable
        Scanner sc = new Scanner(System.in);
        // asking for input
        System.out.println("Enter data in this order:\n"
                + "1. 1 <= x <= 5 adjectives\n2. 1 <= x <= 5 nouns\n"
                + "3. adjectives on separate lines\n4. nouns separate lines");
        // initializing variables
        String[] adjectives = new String[1];
        String[] nouns = new String[1];
        // getting input
        while (sc.hasNextLine()) {
            // setting array lengths
            adjectives = new String[sc.nextInt()];
            nouns = new String[sc.nextInt()];
            // feeding in adjectives into array
            for (int i = 0; i < adjectives.length; i++) {
                adjectives[i] = sc.next();
            }
            // feeding in nouns into array
            for (int i = 0; i < nouns.length; i++) {
                nouns[i] = sc.next();
            }
            break;
        }
        
        // outputting all combinations
        for (int i = 0; i < adjectives.length; i++) { // outer loop to count adjectives
            for (int j = 0; j < nouns.length; j++) { // inner loop to count nouns
                System.out.println(adjectives[i] + " as " + nouns[j]);
            }
        }

        sc.close();
    }
}

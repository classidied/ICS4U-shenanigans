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
 * Description: determine the frequency of each character in a string
 * Teacher: Mr. R-D
 * @author claire
 * Date: 9/18/2020
 */
public class ABCs {
    // method to determine frequency of letter in string
    public static void frequency (String input, char letter) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == letter) {
                counter++;
            }
        }
        System.out.print(letter + "-" + counter + ":");
    }
    public static void main(String[] args) {
        // declaring scanner
        Scanner sc = new Scanner(System.in);
        String input;
        
        System.out.println("Enter a string (less than 255 characters):");
        // getting input, changing to one case, removing whitespaces
        input = ((sc.nextLine()).replaceAll("\\s+", "")).toUpperCase();
        
        // ensuring input is not "stop" and is under 255 characters
        while (!(input.equals("STOP") || input.length() >= 255)) {
            
            // clearing next line
            System.out.println("");
            // setting alphabet array
            char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
            // looping through alphabet 
            for (int i = 0; i < 26; i++) {
                if (input.contains(Character.toString(alphabet[i]))) {
                    frequency(input, alphabet[i]);
                }
            }
            System.out.println(""); // formatting
            System.out.println("Enter a string (less than 255 characters):");
            // getting input, changing to one case, removing whitespaces
            input = ((sc.nextLine()).replaceAll("\\s+", "")).toUpperCase();
        }
        sc.close();
    }
    
}

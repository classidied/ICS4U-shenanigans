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
package isc4u;
import java.util.Scanner;
/**
 * Description: program to encode and decode caesar ciphers
 * Teacher: Mr. R-D
 * @author claire
 * Date: 9/29/2020
 */
public class CaesarCipher {
    /**
     * Desc: encoding with key method **shift forward
     * @param input
     * @param key
     * @return encoded string
     */
    public static String encode(String input, int key) {
        String encoded = "";
        // looping through characters in input
        for (int i = 0; i < input.length(); i++) {
            // validating if it's a letter
            if (Character.isLetter(input.charAt(i))) { 
                char temp = input.charAt(i);
                char newChar = (char)(temp + key);
                // limiting shift for upper case letters
                int k; // temporary variable to store shifted ascii value
                if (Character.isUpperCase(temp) && newChar > 90) {
                    k = (temp + key) - 26;
                    newChar = (char) (k); 
                } else if (Character.isLowerCase(temp) && newChar > 122){
                    k = (temp + key) - 26;
                    newChar = (char) (k);
                }
                encoded = encoded + newChar; // shifting the character
            } else {
                // for non letter char values
                encoded = encoded + input.charAt(i);
            }
        }
        return encoded; 
    }
    /**
     * Desc: decoding with key method **shift backwards
     * @param input
     * @param key
     * @return decoded string
     */
    public static String decode(String input, int key) {
        String decoded = "";
        for (int i = 0; i < input.length(); i++) {
            // validating if it's a letter
            if (Character.isLetter(input.charAt(i))) { 
                char temp = input.charAt(i); 
                // shifting the character back to orignal position
                char newChar = (char)(temp - key); 
                // ensuring shift is within range of letters
                int k; 
                if (Character.isUpperCase(temp) && (newChar > 'Z' || newChar < 'A')) { 
                    k = (temp - key) + 26; 
                    newChar = (char) (k); 
                } else if (Character.isLowerCase(temp) && (newChar > 'z' || newChar < 'a')) {
                    k = (temp - key) + 26;
                    newChar = (char) (k);
                } 
                // concatenating chars to string
                decoded = decoded + newChar;
            } else {
                // for non letter chars
                decoded = decoded + input.charAt(i);
            }
        }
        return decoded; 
    }
    /**
     * Desc: decoding without key 
     * @param input
     * @return brute forced list of strings
     */
    public static String[] breakCode(String input) {
        String[] codes = new String[26];
        // using brute force to get every possible shifted code
        for (int i = 0; i < 26; i++) {
            codes[i] = decode(input, (i+1));
        }
        return codes;
    }
    // main method
    public static void main(String[] args) {
        // declaring scanner
        Scanner sc = new Scanner(System.in);
        // initializing variables
        String input = "";
        int key = 0;
        // asking for input
        System.out.println("Enter 1 to encode, 2 to decode:");
        int choice = sc.nextInt();
        sc.nextLine(); // clearing scanner
        // getting input for encoding
        if (choice == 1) {
            System.out.println("Enter the string you want to encode:");
            input = sc.nextLine();
            System.out.println("Enter the key:");
            key = sc.nextInt();
            System.out.println("Encoded message:\n" + encode(input, key)); 
        // getting input for decoding
        } else if (choice == 2) {
            System.out.println("Enter the string you want to decode:");
            input = sc.nextLine();
            System.out.println("Enter the key (if unavailable, press n):"); 
            if (sc.hasNextInt()) {
                key = sc.nextInt();
            }
            if (key != 0) {
                System.out.println("Decoded message:\n" + decode(input, key));
            } else {
                for (int i = 0; i < 26; i++) {
                    System.out.println(breakCode(input)[i]);
                }
            }
        }
        sc.close();
    }
    
}

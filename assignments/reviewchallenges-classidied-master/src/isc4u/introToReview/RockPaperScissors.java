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
 * Description: determine a winner for rock paper scissors based on who gets the first two wins
 * Teacher: Mr. R-D
 * @author claire
 * Date: 9/18/2020
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        // declaring scanner
        Scanner sc = new Scanner (System.in);
        String input = "";
        // ensuring input meets requirements to proceed
        while (!(input.contentEquals("Q")) && input.length() <= 255) { 
            // getting input from user
            System.out.println("Enter the results separated by a single space (Enter Q to stop):");
            input = sc.nextLine();
            // ensuring any input with characters other than P, R, S, and whitespaces are rejected
            for (int i = 0; i < input.length(); i++) {
                if (!(input.charAt(i) == 'P' || input.charAt(i) == 'R' || input.charAt(i) == 'S' || input.charAt(i) == ' ')) {
                    System.out.println("Invalid input");
                    break;
                }
            }
            // separating string by space to isolate independent results
            String[] results = input.split("\\s+");
            int draws = 0;
            int player1Wins = 0;
            int player2Wins = 0;
            // looping through enough results to determine winner, number of draws
            for (String result : results) {
                switch (result) {
                    case "PP":
                    case "RR":
                    case "SS":
                        draws++;
                        break;
                    case "PR":
                    case "RS":
                    case "SP":
                        player1Wins++;
                        break;
                    default:
                        player2Wins++;
                        break;
                }
                // making sure the first person who gets 2 wins is the winner
                if (player1Wins == 2 || player2Wins == 2) {
                    break;
                }
            }
            // printing winner and number of draws 
            if (player1Wins == 2) {
                System.out.println("PLAYER ONE " + draws);
            } else if (player2Wins == 2) {
                System.out.println("PLAYER TWO " + draws);
            }
        }
        // closing scanner
        sc.close();
    }  
}

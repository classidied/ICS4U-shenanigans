/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardstuff;

/**
 *
 * @author claire
 */
public interface CardInterface {
    /**
     * Allows user to choose highest value in their game
     */
    public int highestValue(int n);
    /**
     * Allows user to choose the names of the suits
     */
    public String suits(String a, String b, String c, String d);
    /**
     * Allows user to choose the names of the non-numeric cards
     */
    public String names();
}

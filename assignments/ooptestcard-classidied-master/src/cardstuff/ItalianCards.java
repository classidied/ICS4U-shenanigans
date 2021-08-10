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
public class ItalianCards extends PlayingCard {
    
    public final static int SWORDS = SPADES;   // Codes for the 4 suits
    public final static int CUPS = HEARTS;
    public final static int CLUBS = DIAMONDS;
    public final static int COINS = CLUBS;
    
    public final static int KING = 10;
    public final static int KNAVE = KING - 2;    //   Cards 2 through 7 have their 
    public final static int KNIGHT = KING - 1;   //   numerical values for their codes.
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardstuff;

/**
 *
 * @author michael.roy-diclemen
 */
public interface Game {
       /**
    * Lets the user play one game.
    */
    public void play();
    
    /**
     * Returns an individualized description of the game
     */
    public String gameDescription();
    
}

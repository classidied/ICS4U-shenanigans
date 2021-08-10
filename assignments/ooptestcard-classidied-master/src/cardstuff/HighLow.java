/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardstuff;

import cardstuff.Deck;
import cardstuff.Game;
import cardstuff.PlayingCard;
import java.util.Scanner;

/**
 * This program lets the user play HighLow, a simple card game that is described
 * in the output statements at the beginning of the main() routine. After the
 * user plays several games, the user's average score is reported.
 */
public class HighLow implements Game {

    Deck deck = new Deck();  // Get a new deck of cards, and 
    //   store a reference to it in 
    //   the variable, deck.
    @Override 
    public String gameDescription() {

        return "This program lets you play the simple card game, HighLow.  A card is dealt from a deck of cards.  You have to predict whether the next card will be higher or lower.  Your score in the game is the number of correct predictions you make before you guess wrong.";
    }

    public static void main(String[] args) {
        //start the game
        HighLow h = new HighLow();
        System.out.println(h.gameDescription());
        h.play();   // Play the game 

    }  // end main()

    /**
     * Lets the user play one game of HighLow, and returns the user's score in
     * that game. The score is the number of correct guesses that the user
     * makes.
     */
    @Override
    public void play() {
        Scanner kbScan = new Scanner(System.in);

        // The current card, which the user sees.
        PlayingCard currentCard;

        // The next card in the deck.  The user tries
        //    to predict whether this is higher or lower
        //    than the current card.
        PlayingCard nextCard;

        // The user's guess.  'H' if the user predicts that
        //   the next card will be higher, 'L' if the user
        //   predicts that it will be lower.
        char guess;   

        // Shuffle the deck into a random order before
        //    starting the game.
        deck.shuffle();  

        //get the first card
        currentCard = (PlayingCard) deck.dealCard();
        System.out.println("The first card is the " + currentCard);

        /* Get the user's prediction, 'H' or 'L' (or 'h' or 'l'). */
        System.out.print("Will the next card be higher (H) or lower (L)?  ");
        do {
            guess = kbScan.nextLine().charAt(0);
            guess = Character.toUpperCase(guess);
            if (guess != 'H' && guess != 'L') {
                System.out.print("Please respond with H or L:  ");
            }
        } while (guess != 'H' && guess != 'L');

        /* Get the next card and show it to the user. */
        nextCard = deck.dealCard();
        System.out.println("The next card is " + nextCard);

        /* Check the user's prediction. */
        if (nextCard.getValue() == currentCard.getValue()) {
            System.out.println("The value is the same as the previous card.");
            System.out.println("You lose on ties.  Sorry!");

        } else if (nextCard.getValue() > currentCard.getValue()) {
            if (guess == 'H') {
                System.out.println("Your prediction was correct.");

            } else {
                System.out.println("Your prediction was incorrect.");
            }
        } else {  // nextCard is lower
            if (guess == 'L') {
                System.out.println("Your prediction was correct.");
            } else {
                System.out.println("Your prediction was incorrect.");
            }
        }

        System.out.println("The game is over.");

    }  // end play()

} // end class HighLow

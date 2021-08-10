/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_shapes;

/**
 *
 * @author claire
 */
public class Square extends Rectangle {
    Square () {
        super();
    }
    /**
     * Constructor for square
     * @param sl side length
     * @param tL top left point coordinate
     */
    Square (Point tL, double sl) {
        super(tL, sl, sl);
    }
    /**
     * Formatted square info
     * @return 
     */
    @Override
    public String toString() {
        return "Square: " + gettL() + ", with side length " + getLength();
    }
}

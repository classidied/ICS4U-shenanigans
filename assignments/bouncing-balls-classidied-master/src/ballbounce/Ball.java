/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ballbounce;
import java.util.Random;
import java.awt.*;
/**
 *
 * @author claire
 */
public class Ball {
    public int x; // x-coordinate of Ball
    public int y; // y-coordinate of Ball
    public int xdir, ydir; // initial directions ball is heading in
    Random temp = new Random();
    Color cBall;
    /**
     * Ball is defined by its x, y coordinates 
     */
    Ball () {
        // randomly generated color of ball
        cBall = new Color(temp.nextInt(256), temp.nextInt(256), temp.nextInt(256));
        // making initial random coordinates + directions
        x = temp.nextInt(360);
        y = temp.nextInt(260);
        xdir = temp.nextInt(5) + 1; 
        ydir = temp.nextInt(5) + 1;
    }
}
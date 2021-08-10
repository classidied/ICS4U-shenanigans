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
package OOP1;
import becker.robots.*;
/**
 * Description: making a robot pick up and put down objects
 * Teacher: Mr. R-D
 * @author claire
 * Date: 10/07/2020
 */
public class Ex3 {
    public static void main (String[] args) {
        City city = new City();
        Robot Dwight = new Robot(city, 3, 0, Direction.NORTH, 0);
        // making things
        Thing t1 = new Thing(city, 2, 1);
        Thing t2 = new Thing(city, 2, 3);
        Thing t3 = new Thing(city, 3, 4);
        // making walls
        Wall w1 = new Wall(city, 3, 1, Direction.WEST);
        Wall w2 = new Wall(city, 3, 1, Direction.NORTH);
        Wall w3 = new Wall(city, 3, 3, Direction.EAST);
        Wall w4 = new Wall(city, 3, 2, Direction.NORTH);
        Wall w5 = new Wall(city, 3, 2, Direction.SOUTH);
        Wall w6 = new Wall(city, 3, 3, Direction.NORTH);
        Wall w7 = new Wall(city, 3, 3, Direction.SOUTH);
        // moving robot
        Dwight.move();
        for (int i = 0; i < 3; i++) { // right turn
            Dwight.turnLeft();
        }
        Dwight.move();
        Dwight.pickThing();
        Dwight.move();
        Dwight.move();
        Dwight.pickThing();
        Dwight.move();
        for (int i = 0; i < 3; i++) { // right turn
            Dwight.turnLeft();
        }
        Dwight.move();
        Dwight.pickThing();
        Dwight.move();
        for (int i = 0; i < 3; i++) { // right turn
            Dwight.turnLeft();
        }
        Dwight.move();
        Dwight.move();
        Dwight.move();
        for (int i = 0; i < 3; i++) { // right turn
            Dwight.turnLeft();
        }
        Dwight.move();
        for (int i = 0; i < 3; i++) { // right turn
            Dwight.turnLeft();
        }
        Dwight.putThing();
        Dwight.move();
        Dwight.putThing();
        Dwight.move();
        
    }
    
}

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
import java.awt.Color;
/**
 * Description: mod of Robot3 to remove crash
 * Teacher: Mr. R-D
 * @author claire
 * Date: 10/07/2020
 */
public class Ex2 {
    public static void main(String[] args) {
        City waterloo = new City();
        Wall w1 = new Wall(waterloo, 3, 1, Direction.WEST);
        Wall w2 = new Wall(waterloo, 3, 1, Direction.SOUTH);
        Wall w3 = new Wall(waterloo, 4, 2, Direction.EAST);
        Thing t1 = new Thing(waterloo, 2, 3);
        Thing t2 = new Thing(waterloo, 6, 1);
        Robot bob = new Robot(waterloo, 2, 4, Direction.WEST, 0);
        bob.setColor(Color.blue);
        bob.setLabel("Bob");
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.pickThing();

        
    }
    
}

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
 * Description: making 2 robots and moving them to a meet point
 * Teacher: Mr. R-D
 * @author claire
 * Date: 10/07/2020
 */
public class Ex1 {
    public static void main(String[] args) {
        City city = new City();
        // creating the robots
        Robot red = new Robot(city, 3, 0, Direction.EAST, 0);
        Robot yellow = new Robot(city, 3, 6, Direction.WEST, 0);
        // making one robot yellow
        yellow.setColor(Color.yellow);
        // using a loop to move the robots
        for (int i = 0; i < 3; i++) {
            red.move();
            yellow.move();
        }
       
        
    }
}

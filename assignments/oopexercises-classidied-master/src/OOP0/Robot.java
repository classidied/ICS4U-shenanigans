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
package OOP0;
/**
 * Description: 
 * Teacher: Mr. R-D
 * @author claire
 * Date: 10/05/2020
 */
/*
OOP0 #1
a) non-static
b) static
c) non-static
d) non-static
#2
a) static
b) non-static
*/
public class Robot {
    String name, direction;
    int xPos = 0;
    int yPos = 0;
    // method to move robot
    public int move(int xspaces, int yspaces) {
        xPos += xspaces;
        yPos += yspaces;
        return xPos;
    }
    public static void main(String[] args) {
       Robot robot1 = new Robot();
       robot1.move(3, 2);
    }
    
}

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
package OOP2;
/**
 * Description: 
 * Teacher: Mr. R-D
 * @author claire
 * Date: 10/08/2020
 */
public class Fraction {
    int n;
    int d;
    public Fraction (int num, int den) {
        n = num;
        d = den;
    }
    // example 4
    public Fraction reduce (){
        Fraction reduced = new Fraction(n, d);
        int x;
        // finding smaller number
        if (n > d) {
            x = d;
        } else {
            x = n;
        }
        int gcd = 0;
        // looping through smaller number to get gcd
        for (int i = x; i > 0; i--) {
            if ((n%i == 0) && (d%i == 0)) {
                gcd = i;
                break;
            }
        }
        reduced.n = n/gcd;
        reduced.d = d/gcd;
        return reduced;
    }
    // example 5
    public Fraction minus(Fraction other) {
        Fraction difference = new Fraction (1, 1);
        difference.n = (difference.n * other.d) - (other.n * difference.d);
        difference.d *= other.d;
        return difference;
    }
    // example 6 overloading
    public Fraction minus(Fraction first, Fraction second) {
        Fraction difference = first.minus(second);
        return difference;
    }
    @Override
    public String toString() {
        return n + " / " + d;
    }
    
}

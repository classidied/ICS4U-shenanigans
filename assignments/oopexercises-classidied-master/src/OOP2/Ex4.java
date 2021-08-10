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
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, den;
        System.out.println("Enter the numerator:");
        num = sc.nextInt();
        System.out.println("Enter the denominator:");
        den = sc.nextInt();
        sc.close();
        // creating Fraction object
        Fraction f = new Fraction(num, den);
        System.out.println("Reduced fraction: " + f.reduce());
    }
    
    
}

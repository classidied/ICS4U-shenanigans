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
import java.util.Scanner;
/**
 * Description: 
 * Teacher: Mr. R-D
 * @author claire
 * Date: 10/14/2020
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = sc.nextInt();
        System.out.println("Enter the second number:");
        int second = sc.nextInt();
        Fraction f1 = new Fraction(first, 1);
        Fraction f2 = new Fraction(second, 1);
        System.out.println("The difference is " + f1.minus(f1, f2));
        sc.close();
    }
    
}

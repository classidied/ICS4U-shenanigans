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
public class Testing {
    public static void main(String[] args) {
        Point p = new Point(4, 0);
        Point p1 = new Point(0, 4);
        Point p2 = new Point(3, 12.6);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(8, 3);
        Line a = new Line (p, p2);
        System.out.println(p3.length());
        System.out.println(p.distance(p2));
        System.out.println(a);
        p.translate(2, 2);
        a.scale(2);
        p.rotate(-90);
        Rectangle rect = new Rectangle(p1, 5, 3);
        rect.translate(4, 5);
    }
}

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
public class Line implements Shape {
    private Point p1, p2;
    /**
     * Line constructor (takes 2 points)
     * @param a
     * @param b 
     */
    Line (Point a, Point b) {
        p1 = a;
        p2 = b;
    }
    // default constructor
    Line () {
        
    }
    /**
     * Scales line from p1 by a factor of num
     * @param num factor to be scaled by
     */
    @Override
    public void scale(double num) {
        Line a = new Line(p1, p2);
        // scaling the second point by the factor given; keeping the first point constant ensures proper scaling
        p2.setX(p2.getX()*num);
        p2.setY(p2.getY()*num);
    }
    /**
     * 
     * Using the translate methods from the point class
     * to translate a line
     * @param tx x value to translate
     * @param ty y value to translate
     */
    @Override
    public void translate(double tx, double ty) {
        Line a = new Line(p1, p2);
        System.out.println(p1 + " " + p2);
        // translating individual points and therefore the line itself
        p1.translate(tx, ty);
        p2.translate(tx, ty);
    }
    /**
     * Rotating a line about the origin using Point class rotate method
     * @param degrees 
     */
    @Override
    public void rotate(double degrees) {
        Line a = new Line(p1, p2);
        p1.rotate(degrees);
        p2.rotate(degrees);
    }
    /**
     * Lines do not have area
     * @return 0
     */
    @Override
    public double area() {
        return 0;
    }
    /**
     * Checks to see whether two lines are the same using equals method from Point
     * @param s
     * @return whether or not the two lines are equal (have the same points)
     */
    @Override
    public boolean equals(Shape s) {
        Line a = new Line(getP1(), getP2());
        // casting data type
        Line b = (Line) s;
        return (a.getP1().equals(b.getP1()) && a.getP2().equals(b.getP2())) || (a.getP1().equals(b.getP2()) && a.getP2().equals(b.getP1()));
    }
    /**
     * Formatting line information 
     * @return Line object in proper format
     */
    @Override
    public String toString() {
        Line a = new Line(getP1(), getP2());
        return "Line: Start " + getP1() + ", End " + getP2(); 
    } 
    /**
     * @return the p1
     */
    public Point getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * @return the p2
     */
    public Point getP2() {
        return p2;
    }

    /**
     * @param p2 the p2 to set
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }
    
}

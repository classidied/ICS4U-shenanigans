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
public class RightTriangle implements Shape {
    private Point p, pT, pR;
    private double a, b; // side lengths of triangle (not hypotenuse)
    /**
     * Constructor for a right triangle
     * @param p
     * @param a
     * @param b 
     */
    RightTriangle(Point p, double a, double b) {
        this.p = p; // being the point with the right angle
        this.a = a;
        this.b = b;
        // defining the two other points
        pT = new Point(p.getX(), p.getY() + b);
        pR = new Point(p.getX() + a, p.getY());
    }

    RightTriangle() {
        
    }
    /**
     * Scaling a triangle by a factor of num
     * @param num 
     */
    @Override
    public void scale(double num) {
        RightTriangle t = new RightTriangle(getP(), getA(), getB());
        t.getpT().setY(getpT().getY()*num);
        t.getpR().setX(getpR().getX()*num);
    }
    /**
     * Translates the triangle by adding tx, ty to each point
     * @param tx shift value for x
     * @param ty shift value for y
     */
    @Override
    public void translate(double tx, double ty) {
        RightTriangle t = new RightTriangle(getP(), getA(), getB());
        getP().translate(tx, ty);
        getpT().translate(tx, ty);
        getpR().translate(tx, ty);
    }
    /**
     * Rotating a triangle
     * @param degrees 
     */
    @Override
    public void rotate(double degrees) {
        RightTriangle t = new RightTriangle(getP(), getA(), getB());
        getP().rotate(degrees);
        getpT().rotate(degrees);
        getpR().rotate(degrees);
    }
    /**
     * Finding area of triangle
     * @return area of triangle
     */
    @Override
    public double area() {
        return 0.5*getA()*getB();
    }
    /**
     * Checks if a triangle is the same as another
     * @param s
     * @return true or false
     */
    @Override
    public boolean equals(Shape s) {
        RightTriangle t = new RightTriangle(getP(), getA(), getB());
        RightTriangle r = (RightTriangle) s;
        return t.getP().equals(r.getP()) && t.getA() == r.getA() && t.getB() == r.getB();
    }
    /**
     * Will print triangle info out nicely
     * @return formatted string of triangle information
     */
    @Override
    public String toString() {
        return "Right Triangle with " + getP() + " , and leg lengths of " + a + ", " + b;
    }

    /**
     * @return the p
     */
    public Point getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Point p) {
        this.p = p;
    }

    /**
     * @return the pT
     */
    public Point getpT() {
        return pT;
    }

    /**
     * @param pT the pT to set
     */
    public void setpT(Point pT) {
        this.pT = pT;
    }

    /**
     * @return the pR
     */
    public Point getpR() {
        return pR;
    }

    /**
     * @param pR the pR to set
     */
    public void setpR(Point pR) {
        this.pR = pR;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }
}

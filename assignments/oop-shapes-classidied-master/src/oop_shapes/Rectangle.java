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
public class Rectangle implements Shape {
    private double length, width;
    private Point tL, bL, tR, bR;
    
    /**
     * Rectangle constructor: takes top left point, length and width
     * @param tLeft
     * @param l
     * @param w 
     */
    Rectangle (Point tLeft, double l, double w) {
        tL = tLeft;
        length = l;
        width = w;
        // setting other points
        tR = new Point(tL.getX() + length, tL.getY());
        bR = new Point(tR.getX(), tL.getY() - width);
        bL = new Point(tL.getX(), bR.getY());
    }
    Rectangle () {
        
    }
    /**
     * Scales a rectangle by a factor of num
     * @param num 
     */
    @Override
    public void scale(double num) {
        // scaling top right point
        tR.setX(tR.getX()*num);
        tR.setY(tR.getY()*num);
        // scaling bottom right
        bR.setX(tR.getX());
        // scaling top left
        tL.setX(tR.getY());
    }
    /**
     * Translates a rectangle using Point's translate method
     * @param tx
     * @param ty 
     */
    @Override
    public void translate(double tx, double ty) {
        Rectangle r = new Rectangle(tL, length, width);
        r.tL.translate(tx, ty);
        r.tR.translate(tx, ty);
        r.bR.translate(tx, ty);
        r.bL.translate(tx, ty);
    }
    /**
     * Rotates a rectangle 
     * @param degrees 
     */
    @Override
    public void rotate(double degrees) {
        Rectangle r = new Rectangle(tL, length, width);
        r.tL.rotate(degrees);
        r.tR.rotate(degrees);
        r.bR.rotate(degrees);
        r.bL.rotate(degrees);
    }
    /**
     * Gets area of rectangle by accessing its length + width
     * @return area of rectangle
     */
    @Override
    public double area() {
        Rectangle r = new Rectangle(tL, length, width);
        return length*width;
    }
    /**
     * Checks whether a rectangle is the same as another 
     * @param s
     * @return 
     */
    @Override
    public boolean equals(Shape s) {
        Rectangle r = new Rectangle(tL, length, width);
        Rectangle t = (Rectangle) s;
        // checking whether each parameter is equal to the other
        return r.tL.equals(t.tL) && r.length == t.length && r.width == t.width;
    }
    /**
     * Formatting rectangle information
     * @return Rectangle with defined points
     */
    @Override
    public String toString() {
        return "Rectangle: " + tL + ", " + tR + ", " + bR + ", " + bL;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the tL
     */
    public Point gettL() {
        return tL;
    }

    /**
     * @param tL the tL to set
     */
    public void settL(Point tL) {
        this.tL = tL;
    }

    /**
     * @return the bR
     */
    public Point getbR() {
        return bR;
    }

    /**
     * @param bR the bR to set
     */
    public void setbR(Point bR) {
        this.bR = bR;
    }
    
}

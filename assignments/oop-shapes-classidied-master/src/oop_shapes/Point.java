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
public class Point implements Shape {
    // coordinate values for point
    private double x, y;
    
    /**
     * Defining each point with coordinates
     * @param x
     * @param y 
     */
    Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    // default constructor
    Point () {
        
    }
    /**
     * Method to add coordinate values of 2 points 
     * @param p New point
     */
    public void add(Point p) {
        // storing accessed point in p1
        Point p1 = new Point(getX(), getY());
        // modifying point values
        p1.x = p1.getX() + p.getX();
        p1.y = p1.getY() + p.getY();
    }
    /**
     * Finding the length from the point to the origin
     * @return length in decimal
     */
    public double length() {
        Point p1 = new Point(getX(), getY());
        double length = Math.sqrt(Math.pow(Math.abs(getX()), 2) + Math.pow(Math.abs(getY()), 2));
        return length;
    }
    /**
     * Finding the distance between two points
     * @param p second point 
     * @return the distance
     */
    public double distance(Point p) {
        Point p1 = new Point(getX(), getY());
        double xd = Math.abs(getX() - p.getX());
        double yd = Math.abs(getY() - p.getY());
        double distance = Math.sqrt(Math.pow(xd, 2) + Math.pow(yd, 2));
        return round(distance);
    }
    /**
     * You can't scale a point
     * @param num 
     */
    @Override
    public void scale(double num) {
        
    }
    /**
     * Translating a point given an x and y value
     * @param tx x-value to move point tx units
     * @param ty y-value to move point ty units
     */
    @Override
    public void translate(double tx, double ty) {
        Point translated = new Point(getX() + tx, getY() + ty); 
    }
    /**
     * Rotating a point about the origin
     * @param degrees 
     */
    @Override
    public void rotate(double degrees) {
        Point p = new Point(getX(), getY());
        // modifying p's coordinates to be rotated
        p.x = round(x*Math.cos(Math.toRadians(degrees)) - y*Math.sin(Math.toRadians(degrees)));
        p.y = round(x*Math.sin(Math.toRadians(degrees)) - y*Math.cos(Math.toRadians(degrees)));
    }
    /**
     * Points don't have area
     * @return 0
     */
    @Override
    public double area() {
        return 0;
    }
    /**
     * Checking whether two points have the same x, y coordinates
     * @param s another point
     * @return a boolean value indicating whether the points are the same
     */
    @Override
    public boolean equals(Shape s) {
        Point p1 = new Point(getX(), getY());
        // casting param s to be point
        Point p = (Point) s;
        return p1.getX() == p.getX() && p1.getY() == p.getY(); 
    }
    /**
     * Formatting point information 
     * @return Point object in proper format
     */
    @Override
    public String toString() {
        Point p = new Point(getX(), getY());
        return "Point: (" + getX() + ", " + getY() + ")"; 
    }    

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    /**
     * Rounds numbers for better format
     * @param n
     * @return number rounded to the nearest hundredth
     */
    public double round(double n) {
        return Math.round(n*100.0)/100.0;
    }
}

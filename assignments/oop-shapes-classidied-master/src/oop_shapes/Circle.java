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
public class Circle implements Shape {
    private Point center;
    private double radius;
    Circle () {
        
    }
    /**
     * Circle constructor
     * @param c center 
     * @param r radius 
     */
    Circle (Point c, double r) {
        center = c;
        radius = r;
    }
    /**
     * Scaling a circle by a factor of num
     * @param num 
     */
    @Override
    public void scale(double num) {
        Circle c = new Circle(getCenter(), getRadius());
        c.radius = radius*num;
    }
    /**
     * Translating a circle (moving center based on tx, ty)
     * @param tx shift by tx
     * @param ty shift by ty
     */
    @Override
    public void translate(double tx, double ty) {
        Circle c = new Circle(getCenter(), getRadius());
        c.getCenter().translate(tx, ty);
    }
    /**
     * Rotate a circle about the origin
     * @param degrees 
     */
    @Override
    public void rotate(double degrees) {
        Circle c = new Circle(getCenter(), getRadius());
        c.getCenter().rotate(degrees);
    }
    /**
     * Finding the area of a circle using pi(radius^2)
     * @return area of circle
     */
    @Override
    public double area() {
        Circle c = new Circle(getCenter(), getRadius());
        return Math.pow(c.getRadius(), 2)*3.14;
    }
    /**
     * Checks if 2 circles are the same
     * @param s
     * @return true/false
     */
    @Override
    public boolean equals(Shape s) {
        Circle c = new Circle(getCenter(), getRadius());
        Circle d = (Circle) s; // casting 
        return c.getRadius() == d.getRadius() && c.getCenter().equals(d.getCenter());
    }
    /**
     * Formatted circle info
     * @return circle information in string
     */
    @Override
    public String toString() {
        Circle c = new Circle(getCenter(), getRadius());
        return "Circle: center: " + c.getCenter() + ", radius: " + c.getRadius();
    }
    
    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}

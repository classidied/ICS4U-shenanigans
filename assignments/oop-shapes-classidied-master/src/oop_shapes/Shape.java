/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_shapes;

/**
 * Description: interface to define a shape
 * Teacher: Mr. R-D
 * @author claire
 * Date: 10/19/2020
 */
public interface Shape {
    /**
     * Scales a shape by a factor of num
     * @param num 
     */
    public void scale(double num);
    /**
     * Translates a shape 
     * @param tx
     * @param ty 
     */
    public void translate(double tx, double ty);
    /**
     * Rotates a shape by some number of degrees about the origin
     * @param degrees 
     */
    public void rotate(double degrees);
    /**
     * Finds and returns the area of a shape
     * @return area 
     */
    public double area();
    /**
     * Checks if an object is equal to another based on how it is defined
     * @param s
     * @return true or false
     */
    public boolean equals(Shape s); 
    /**
     * Converts given info about a shape into a readable description
     * @return a formatted, easy to understand description of the shape
     */
    public String toString();
    
}

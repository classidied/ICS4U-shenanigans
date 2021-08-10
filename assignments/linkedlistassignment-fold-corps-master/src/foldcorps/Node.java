/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foldcorps;

/**
 *
 * @author olivi
 */
public class Node {

    public Node next=null;
    public Patient data=null;
    public Node prev=null;
    
    /**
     * 
     * @param b new patient information
     */
    public Node(Patient b){
        //new patient information is being held in data
        data=b;
    }
    
    @Override
    public String toString(){
        //returns nodes in string format
        return "["+data+"]";
    }
    
}/*
  We are choosing to implement a singly linked list because it saves memory and
  we don't necessarily need to navigate in both directions to find a patient
  since we already have a get method.
*/

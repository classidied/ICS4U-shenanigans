/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foldcorps;

/**
 *
 * @author helia
 */
public class Patient implements Comparable <Patient>{
    private String firstName, lastName;
    public int priority;
    
    /**
     * Makes a patient given first name, last name and their priority
     * @param firstGiven is the given first name
     * @param lastGiven is the given last name
     * @param priorGiven is the given priority
     */
    public Patient (String firstGiven, String lastGiven, int priorGiven) {
        firstName= firstGiven;
        lastName= lastGiven;
        priority=priorGiven;
    }
    /**
     * Creates a patient without details. A Default patient
     */
    public Patient (){
        firstName="Michael";
        lastName="Roy-Diclemente";
        priority=1;
    }
    /**
     * Compares the priority of patients.
     * @param t grabs the information of another patient
     * @return the value of the difference between the two priorities
     */
    @Override
    public int compareTo(Patient t) {
        return priority-t.priority;
    }
    /**
     * Writes the patient details in comma delimited format
     * @return the details in comma delimited format
     */
    @Override
    public String toString(){
        return firstName+","+lastName+","+priority;
    }
}

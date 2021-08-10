/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingassignment;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author claire
 */
public class SortingAssignment {
    /**
     * Sorts a comparable list in ascending order
     * @param list 
     */
    public static void bubbleSort(Comparable[] list) {
        for (int j = 0; j < list.length; j++) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i].compareTo(list[i+1]) > 0) {
                    Comparable temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}

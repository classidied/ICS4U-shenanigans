/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingassignment;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Description: State milk production from 1970 to 2017
 * https://raw.githubusercontent.com/rfordatascience/tidytuesday/1a31712fb1cd08478ffa51ac1c15b100f26e5f8f/data/2019/2019-01-29/state_milk_production.csv
 * @author claire
 */
/*
If you were asked to sort using two pieces of information (say price first 
(which may have duplicates), and then by date) how would you change the sorting 
algorithm to do this? 
    If the comparison of the prices returned 0, compare the corresponding dates to determine the desired order. 
    If not, return the prices. 
*/
// note: milk_produced values are in scientific notation hence 619e6 = 6.19 * 10^6 = 6 190 000
public class StateMilkProduction implements Comparable<StateMilkProduction> {
    // initializing variables
    String region, state, year, milk_produced;
    String[] array;
    double value;
    /**
     * Constructor reads in ArrayList index, splits into array for access of values
     * @param info - one delimited string to be formatted into an array
     */
    public StateMilkProduction(String info) {
        // splitting info to read into the array
        array = info.split(",");
        region = array[0];
        state = array[1];
        year = array[2];
        milk_produced = array[3];
        value = Double.valueOf(milk_produced); // converting string to double for sorting
    }
    // main method
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // initializing files and scanner
        File original = new File("state_milk_production.txt");
        Scanner sc = new Scanner(original);
        File sorted = new File("[state_milk_production]sorted.txt");
        
        // creating ArrayList
        ArrayList<StateMilkProduction> info = new ArrayList<>();
        // skipping first line because it is only a description of the records
        sc.nextLine();
        
        // reading file into array
        while (sc.hasNextLine()) {
            // casting + adding data to ArrayList
            StateMilkProduction data = new StateMilkProduction (sc.nextLine());
            info.add(data);
        }
        // converting info arraylist to regular
        StateMilkProduction[] dataset = info.toArray(new StateMilkProduction[info.size()]);
        // sorting the states with the highest milk production in ascending order
        SortingAssignment.bubbleSort(dataset);
       
        // printing to file
        PrintWriter pw = new PrintWriter(new FileWriter(sorted, false)); // false to overwrite
        for (int i = 0; i < dataset.length; i++) {
            pw.println(dataset[i]);
        }
        pw.close(); // closing printwriter
    }
    /**
     * since data is already sorted by year + pattern of US regions, sort by milk produced (value)
     * @param t
     * @return 1, -1, or 0 to the bubble sort
     */
    @Override
    public int compareTo(StateMilkProduction t) {
        if (value > t.value) {
            return 1;
        } else if (value < t.value) {
            return -1;
        } else {
            return 0;
        }  
    }
    /**
     * toString method 
     * @return formatted array of information
     */
    @Override
    public String toString() {
        return array[0] + "," + array[1] + "," + array[2] + "," + array[3];
    }
    
}

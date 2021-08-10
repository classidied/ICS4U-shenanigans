/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claire
 */
public class SearchHelper {
    // int methods
    /**
     * Binary search algorithm for integer values
     * @param term
     * @param list
     * @return index of list where term is
     */
    public static int binarySearch (int term, int[] list) {
        int mid = 0; 
        int start = 0;
        int end = list.length;
        // finding index of array
        while (start <= end) {
            mid = (start + end)/2;
            if (list[mid] == term) {
                return mid;
            } else if (list[mid] > term) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return mid;
    }
    /**
     * Linear search 
     * @param term
     * @param list
     * @return index of list where term is
     */
    public static int seqSearch(int term, int[] list) {
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if (term == list[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
    // Comparable methods
    /**
     * Binary search for comparable types
     * @param term
     * @param list
     * @return index of array where term is
     */
    public static Comparable binarySearch (Comparable term, ArrayList<Comparable> list) {
        int mid = 0;
        int start = 0;
        int end = list.size() - 1;
        // finding index of array
        while (start <= end) {
            mid = (start + end) / 2;
            // if comparison = 0 they are the same term
            if (term.compareTo(list.get(mid)) == 0) {
                return mid;
            } else if (term.compareTo(list.get(mid)) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return "This term does not exist within the list.";
    }
    /**
     * Linear search for comparable types
     * @param term
     * @param list
     * @return index of array where term is 
     */
    public static Comparable seqSearch(Comparable term, ArrayList<Comparable> list) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (term.compareTo(list.get(i)) == 0) {
                index = i;
                break;
            }
        }
        return index;
    }
    
    // main method for testing
    public static void main(String[] args) throws Exception {
        // creating file and scanner for dictionary 
        File dict = new File("dictionary.txt");
        Scanner sc = new Scanner(dict);
        // setting test variables
        String a = "about";
        String b = "header";
        String c = "yours";
        
        // making ArrayList of words in dictionary file
        ArrayList<Comparable> dictionary = new ArrayList<>();
        // reading file into array
        while (sc.hasNextLine()) {
            dictionary.add(sc.nextLine());
        }
 
        // getting search times
        long start = System.currentTimeMillis(); // capturing start time
        // searching
        for (int i = 0; i < 10000; i++) {
            binarySearch(c, dictionary);
        }
        long end = System.currentTimeMillis(); // capturing time ended
        System.out.println(end - start);
        /*
        Amount of time needed to search "about":
        Binary:
            10 000x: 23ms
            100 000x: 65ms
            1 000 000x: 166ms
        Sequential:
            10 000x: 10ms
            100 000x: 49ms
            1 000 000x: 88ms
        */
        /*
        Amount of time needed to search "header":
        Binary:
            10 000x: 25ms
            100 000x: 43ms 
            1 000 000x: 171ms
        Sequential:
            10 000x: 185ms
            100 000x: 1560ms
            1 000 000x: 15288ms
        */
        /*
        Amount of time needed to search "yours":
        Binary:
            10 000x: 15ms
            100 000x: 52ms
            1 000 000x: 195ms
        Sequential:
            10 000x: 825ms
            100 000x: 6642ms
            1 000 000x: 38750ms
        */
    }
}

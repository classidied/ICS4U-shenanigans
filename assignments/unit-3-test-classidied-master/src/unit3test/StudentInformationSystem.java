/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3test;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MikeRD
 */
public class StudentInformationSystem {
    // initializing array of students
    static Student[] students = new Student[1000];
    // method to load list into file
    public static void loadList() {
        File registration;
        Scanner sc = null;
        try {
            registration = new File("registration.csv");
            sc = new Scanner(registration);
            for (int i = 0; i < 1000; i++) {
                // reading each line of info from file into array
                Student student = new Student (sc.next());
                students[i] = student;
                sc.nextLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("The file specified could not be found.");
        }
        // closing scanner
        sc.close();
    }
    // method to sort by course + display records seperated by tab ("\t")
    public static void sortAndDisplay() {
        // sorting records
        Arrays.sort(students); // dysfunctional :(
        // printing out records
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < students[i].array.length; i++) {
                System.out.println(students[i].array[j] + "\t");
            }
        }
    }
    // method to organize users by course code and section into files
    public static void courseList() {
        Scanner sc = new Scanner(System.in);
        // prompting user for info
        System.out.println("Enter a course code (TEJ2O, ICS2O, ICS3U, TEJ3M, ICS3C, ICS4U, TEJ4M, ICS4C):");
        String code = sc.nextLine();
        System.out.println("Enter a section number (1, 2, 3):");
        String section = sc.nextLine();
        // creating file
        File courseFile = new File(code + "-0" + section + ".csv");
        // linear search to find all students with course code and section
        for (int i = 0; i < 1000; i++) {
            if (code.equals(students[i].array[4]) && section.equals(students[i].array[5])) {
                PrintWriter pw = null;
                try {
                    // writing students with course code and section number to file
                    pw = new PrintWriter(courseFile);
                    pw.println(students[i]);
                } catch (FileNotFoundException ex) {
                    System.out.println("The file could not be found.");
                }
                // closing printwriter
                pw.close();
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

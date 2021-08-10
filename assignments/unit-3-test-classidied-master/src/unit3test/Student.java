/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3test;
import java.util.Arrays;
/**
 *
 * @author claire
 */
public class Student {
    // initializing variables
    String firstName, lastName, gender, phoneNum, course, mark, section;
    String[] array;
    /* organization of each record:
    gender, firstName, lastName, phoneNum, course, section, mark;
    */
    // student constructor
    public Student(String info) {
        // splitting info by delimiter
        array = info.split(",");
        gender = array[0];
        firstName = array[1];
        lastName = array[2];
        phoneNum = array[3];
        course = array[4];
        section = array[5];
        mark = array[6];
    }
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

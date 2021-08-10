/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peertutormangament;

/**
 * Tutee info class to store info
 * @author claire
 */
public class TuteeInfo {
    String fullName, studentNo, password;
    /**
     * Tutee object
     * @param name full name
     * @param stuNo
     * @param pw - to be entered manually by guidance, all passwords are currently set to 1
     */
    public TuteeInfo(String name, String stuNo, String pw) {
        this.fullName = name;
        this.studentNo = stuNo;
        this.password = pw;
    }
}

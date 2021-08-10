package peertutormangament;

/**
 *
 * @author olivi
 */
public class TutorInfo implements Comparable<TutorInfo>{
    String timeStamp, email, name, day, course1, course2, course3, period;
    String studentNum;
    boolean booked;
    
   
    /**
     * 
     * @param tSG (0)time stamp they registered at on the google form
     * @param eG (1)student email
     * @param n (2)full name
     * @param d (3)day of the week they're available
     * @param c1(4) first course they tutor
     * @param c2 (5)second course they tutor
     * @param c3 (6)third course they tutor
     * @param sNG (7)student number
     * @param b(8) whether or not they're booked
     * @param pG (9)what period they're available for tutoring(ex. before school)
     */
    public TutorInfo(String tSG, String eG,String n, String d, String c1,String c2, String c3, String sNG, boolean b, String pG){
        timeStamp=tSG;
        email= eG;
        name=n;
        day=d;
        course1=c1.toUpperCase();
        course2=c2.toUpperCase();
        course3=c3.toUpperCase();
        studentNum=sNG;
        booked=b;
        period=pG;
    }
    
    /**
     * 
     * @return String format of all tutor information
     */
    public String toString(){
        return timeStamp+","+email+","+name+","+day+","+course1+","+course2+","+course3+","+studentNum+","+booked+","+period;
    }

    /**
     * 
     * @param t representative variable for TutorInfo
     * @return current day in relation to another selected day
     */
    @Override
    public int compareTo(TutorInfo t) {
        return day.compareTo(t.day);
    }
}

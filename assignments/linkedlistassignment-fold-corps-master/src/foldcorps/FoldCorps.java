/*
/*
 * Linked List Assignment
 */
package foldcorps;

/**
 *
 * @author Olivia, Claire, Helia
 */
public class FoldCorps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
       
        Patient p1=new Patient("Olivia", "Chen", 1);
        Patient p2=new Patient("Claire", "Wang", 2);
        Patient p3=new Patient("Helia", "Seyedmazhari", 3);
        
        list.add(p1);
        list.add(p2);
        list.add(p2);
        System.out.println (list);
        System.out.println(list.getSize());
         Patient p4 = new Patient();
        list.add(p1, p1.priority);
        System.out.println(list+"\n");
        list.add(p2, p2.priority);
        System.out.println(list+"\n");
        list.add(p3, p3.priority);
        System.out.println(list+"\n");
        list.add(p4, 2.5);
        System.out.println(list+"\n");
        Patient p5= new Patient();
    //    System.out.println(list.getSize());
        /*
        System.out.println();
        System.out.println(list.get(2));
*/
    }
}

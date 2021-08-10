/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foldcorps;


/**
 *
 * @author claire
 */
public class LinkedList {
    // init variables
    public Node head, tail=null, e;
    
    /**
     * LinkedList constructor
     */
    public LinkedList() {
       head = null;
       tail = null;
    }
    // helia
    /**
     * Get the patient details at a given index
     * @param i the index which the user is looking to get the value of
     * @return the patient details at that index. If index not found, return null
     */
    public Patient get(int i) {
        Node temp = head;//a temp pointer to go through each node within the list
        if (i > getSize()|| i<0) {// if the given term does not exist, return empty
            return null;
        }
        else if (i==getSize()){//if the given term is the same value as the size of list, user is referencing to the last node, therefore return value of tail
            return tail.data;
        }
        else if (i==0){//if the given term is 0, user is referencing to the first node, therefore return head.
            return head.data;
        }
        else {//any middle nodes, go through a for loop until you reach the desired node
            for (int j=0;j<i;j++){
                temp=temp.next;
            }
        }
        return temp.data;//return the patient data
    }
     /**
     * A fancy method made because we had extra time
     * @param i the patient we are looking for
     * @return index of the patient within the list
     */
    public int get(Patient i) {
        Node temp = head;//a temp pointer to go through each node within the list
        for (int j = 1; j <= getSize(); j++) {
            if (i == temp.data) {//if the given Patient is the same patient as the pointer, return it's index
                return j;
            }
            temp = temp.next;
        }
        return -1;//return the patient data
    }
    /**
     * Gets the sizes of the linked list
     * @return the total number of nodes in the list
     */
    public int getSize() {
        Node temp = head;//a temp pointer to go through each node within the list
        int count = 0;//used to keep track of the number of nodes
        if (head == null) {//if the head is empty, that means the list is empty, therefore there is no size
            return 0;
        } else {
            while (temp != null) {//while haven't reached the end of the list, keep counting the number of nodes, moving up the nodes with each iteration until you reach tail
                count++;
                temp = temp.next;
            }
        }
        return count;
    }
    @Override
    public String toString() {
        Node temp = head;//a temp pointer to go through each node within the list
        String rep = "";//will contain and represent every node at once
        while (temp != null) {//while we haven't reached the end of the list, move up the nodes with each iteration, and add the data to the representation string
            rep += "["+temp.data + "]";
            if (temp.next!=null){
                rep+="\n";//fancy detail for the list representation
            }
            temp = temp.next;
        }
        return rep;
    }
    // olivia 
    /**
     * 
     * @param b inserts node d to the end of the linked list
     */
    public void add(Patient b) {
        //creating new node with patient information
        Node d=new Node(b);
        Node temp=head;
        //if the list is empty the new node being added is the head
        if(getSize() == 0) {
            //head becomes d
            head = d;
            //tail becomes d
            tail = d;
            return;
        }
        else{
            
            while(temp.next!=null){
                if(temp.next==tail){
                    //because we stop right before the end d can point to where we are
                    d.prev=temp;
                }
            }
        }
        //tail points to d
        tail.next = d;
        //tail is d
        tail = d;
    }

    /**
     * With extra time, in order to increase robustness this method takes in any
     * decimals for priority and converts them to whole integers
     * @param b patient information
     * @param i takes in double format(any decimals) of priority
     */
    public void add(Patient b, double i){
        //rounds the double number to int
        int j=(int) Math.round(i);
        //sends new priority number to other add method
        add(b, j);
    }
    
    /**
     * add at a specific point
     * @param b patient information
     * @param i position/priority where node should be added
     */
    public void add(Patient b, int i) {
        //creates a new node with patient information
        Node d=new Node(b);
        //node to be used for adding at specific points
        Node n=head;
       
        
        //if the list is empty
        if (getSize() == 0) {
            add(b);
        }
        //if the node is added at the head
        else if(i==1){
            //d.next points to the head
            d.next=head;
            //head becomes d
            head=d;
        }
        //if the position the user wants to add the node to doesn't exist the node is sent to the end
        else if(i>getSize()||i<1){
            while(n.next==tail){
                //connects d(which is going to become the end) backwards to the old tail
                d.prev=tail;
            }
            //tail points to d
            tail.next=d;
            //tail becomes d
            tail=d;
        }
        else {
            //counter to keep track of where we are in the linked list
            int count = 1;
            while (n.next != null) {
                //if where n is at in the linked list is where the new node needs to be
                if (count+1== i) {
                    //connect d to the next node
                    d.next = n.next;
                    //the node behind the node after n will be connected backwards with d.
                    n.next.prev=d;
                    //connect the current node to d
                    n.next = d;
                    //connects d backwards to n
                    d.prev=n;
                    //now d is between n and d.next so the previous of d is n, the previous of d.next is d
                   
                    break;
                }
                 //linearly searches through the linked list
                n = n.next;
                //increment so we can keep track of where we are in the linked list
                count++;
            }
        }    
    }
    // claire
    /**
     * Removing patient by index
     * @param i index
     */
    public void remove(int i) {
        // zero-indexing i
        i -= 1;
        // setting a temp variable
        Node a = head;
        // removing node at index i 
        if (i <= -1) { // if removing head
            
            head = a.next;
            a.prev=null;
        } else if (i >= getSize()) { // if removing unreachable index, remove end node
            // find second last element
            for (int j = 0; j < getSize() - 2; j++) {
                a = a.next;
            }
            // setting second last element as tail
            a.next = null;
            tail = a;
        } else {
            // linear search to find appropriate node from head
            for (int j = 0; j < i - 1; j++) {
                // finds the node before the node to be deleted
                a = a.next;
            }
            // linking node a to node i+1
            a.next = (a.next).next;
        }  
    }
    /**
     * Removing patient by content
     * @param p patient to find
     */
    public void remove(Patient p) {
        // casting patient to node
        Node d = new Node (p);
        Node a = head;
        // linear search for patient data
        for (int i = 0; i < getSize(); i++) {
            if (a.data == d.data) {
                // using remove method
                remove(i);
                break; // exiting
            }
            a = a.next;
        }
    }
    
    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }
    
}

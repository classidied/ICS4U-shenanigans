package peertutormangament;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Olivia
 */
public class DeletionFrame extends javax.swing.JFrame {
    AdminSearchFrame adminFrame;
    DefaultTableModel table;
    String userInput;
    
    /**
     * Creates new form AdminDeletionFrame
     */
    public DeletionFrame() {
        initComponents();
        //iniitiazlizing the table
        table = (DefaultTableModel) jTable1.getModel();
        setTitle("Admin Management");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        results = new java.awt.Label();
        deleteButton = new javax.swing.JButton();
        deletionConfirmationLabel = new javax.swing.JLabel();
        deletionConfirmationLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Student Number", "Email", "Subject 1", "Subject 2", "Subject 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 741, 284));

        results.setBackground(new java.awt.Color(255, 255, 255));
        results.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        getContentPane().add(results, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 740, -1));

        deleteButton.setBackground(new java.awt.Color(255, 51, 102));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete selected tutor");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 201, -1));

        deletionConfirmationLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletionConfirmationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deletionConfirmationLabel.setToolTipText("");
        getContentPane().add(deletionConfirmationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 610, 39));

        deletionConfirmationLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletionConfirmationLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deletionConfirmationLabel1.setToolTipText("");
        getContentPane().add(deletionConfirmationLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 412, 462, 39));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peertutormangament/back.png"))); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 353, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peertutormangament/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        UIManager UI=new UIManager();
        UI.put("OptionPane.background", Color.blue);
        //the student we're deleting is the one that's selected
        int student = -1;
        //student value is the number of the selected row so if a row is selected the value shouldn't be -1
        student = jTable1.getSelectedRow();
        //if there's no selected row show the error message
        if (student == -1) {
            soundEffect("error.wav");
            JOptionPane.showMessageDialog(null, "Please click on a row containing the tutor information to be deleted");
            return;
        }
        //confirmation of deleting tutor information
        if (JOptionPane.showConfirmDialog(null, "Delete: " + table.getValueAt(student, 0), "CONFIRM",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            table.removeRow(student);
            //outputs a confirmation message to ensure that everything was done.
            soundEffect("game over.wav");
            deletionConfirmationLabel.setText(userInput+" has been removed from the data base.");
        }else{
            //don't do anything if the user doesn't want to delete
            return;
        }
        Scanner s = null;
        try {
            //initializing scanner
            s = new Scanner(new File("tutor.csv"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminSearchFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //new string variable representing the current line the program is reading
        String line;
        //skips the first line of the file which is the header
        s.nextLine();
        //i keeps track of which record is being looked at
        int i=0;
        //while there's still a line to read
        while (s.hasNextLine()) {
            //read the line
            line=s.nextLine();
            try {
                //split the line by the comma delimiter
                String fields[]=line.split(",");
                //if the name or student number that were searched for earlier match the current line's name or student number
                if((fields[2].toUpperCase().equals(userInput)) || (fields[7].equals(userInput))){
                    //delete the content
                    deleteTutor(i);
                    break;
                }
            } catch (NoSuchElementException ex) {
                break;
            }catch(ArrayIndexOutOfBoundsException e){
                break;
            }
            //i increments to represent moving on to the next index
            i++;
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        adminFrame = new AdminSearchFrame();
        table.setRowCount(0);//clear the table
        //display the adminFrame again
        adminFrame.setVisible(true);
        //closes this frame when the other frame opens
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed
   
    /**
     * Plays sound effect
     * @param s name of the audio file to play
     */
    public void soundEffect(String s){
        InputStream sound;
        try {
            //finds the file with a name matching String s
            sound = new FileInputStream(new File(s));
            //intializes audiostream object to play audio
            AudioStream audio = new AudioStream(sound);
            //plays the audio
            AudioPlayer.player.start(audio);
        } catch (IOException e) {
            String msg = "A necessary file is missing.";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
    /**
     * Method to remove the tutor from the tutor.csv
     * @param i index of the arraylist that holds the record of the tutor that needs to be deleted
     */
    public void deleteTutor(int i) {
        //creates Scanner and PrintWriter objects
        Scanner s = null;
        PrintWriter pw = null;
        //arraylist tutors will hold the information of all the tutors 
        ArrayList<TutorInfo> tutors = new ArrayList<TutorInfo>();
        //create file object that printwriter will print to
        File tFile=new File("tutor.csv");
        try {
            s = new Scanner(tFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeletionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line = "";
        //skip the first line since it's the header
        s.nextLine();
        //while there's a line to read
        while (s.hasNextLine()) {
            try {
                //read the line
                line = s.nextLine();
                //split the entire record into fields
                String record[] = line.split(",");
                //convert the 8th field into a boolean
                boolean booked = Boolean.parseBoolean(record[8]);
                //printwriter isn't initialized to true in the second parameter because we'll need to delete everything in the file and then update the file
                pw = new PrintWriter(new FileWriter(tFile));
                //throw the information into a TutorInfo object so it can be added to the arraylist
                TutorInfo t = new TutorInfo(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7], booked, record[9]);
                tutors.add(t);
            //    System.out.println(t);
            } catch (NoSuchElementException ex) {// if no matching username was found, then print no User found
                break;
            } catch (NullPointerException ex) {
                continue;
           } catch (IOException ex) {
                Logger.getLogger(DeletionFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //removes the record that needs to be deleted from the arraylist
        tutors.remove(i);
        pw.close();
        try {
            //second parameter of printwriter is true now because we want to actually save this information
            pw = new PrintWriter(new FileWriter(tFile, true));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeletionFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DeletionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //makes sure that the header of the file is still there
         pw.println("Timestamp,Email Address,Your Full Name,The day you are available,first course you're willing to tutor,second course you're willing to tutor,third course you're willing to tutor,Your Student Number,Booked?,The period are you available");
            for(int j=0; j<tutors.size(); j++){
                //print out updated list
                pw.println(tutors.get(j));
            }
        pw.close();
    }
    /**
     * takes the userInput from AdminSearchFrame and throws it into the global variable here: userInput
     * @param s holds String from where it's called from
     */
   public void input(String s){
       //global string userInput equals string from parameters
       userInput=s;
   }
   /**
    * 
    * @param codeInput input to be displayed at the top of the deletion frame
    */
    public void showResult(String codeInput){
        //shows the name that was searched for, at the top of the table
       results.setText(codeInput);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeletionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel deletionConfirmationLabel;
    private javax.swing.JLabel deletionConfirmationLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label results;
    // End of variables declaration//GEN-END:variables
}

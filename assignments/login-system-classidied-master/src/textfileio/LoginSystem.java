/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfileio;
import javax.swing.*;
/**
 *
 * @author claire
 */
public class LoginSystem extends javax.swing.JFrame {
    private String username, password, fName, lName;
    // setting delimiter
    String delim = ", ";
    /**
     * Creates new form LoginSystem
     */
    public LoginSystem() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorMessage = new javax.swing.JDialog();
        loginPanel1 = new textfileio.LoginPanel();
        loginLabel = new javax.swing.JLabel();
        loginUserField = new javax.swing.JTextField();
        loginUserLabel = new javax.swing.JLabel();
        loginPassLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerUserLabel = new javax.swing.JLabel();
        registerUserField = new javax.swing.JTextField();
        registerPassLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        registerLabel = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        LnameLabel = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        lnameField = new javax.swing.JTextField();
        loginPassField = new javax.swing.JPasswordField();
        registerPassField = new javax.swing.JPasswordField();

        javax.swing.GroupLayout errorMessageLayout = new javax.swing.GroupLayout(errorMessage.getContentPane());
        errorMessage.getContentPane().setLayout(errorMessageLayout);
        errorMessageLayout.setHorizontalGroup(
            errorMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        errorMessageLayout.setVerticalGroup(
            errorMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        loginLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login");

        loginUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserFieldActionPerformed(evt);
            }
        });

        loginUserLabel.setText("Username:");

        loginPassLabel.setText("Password:");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerUserLabel.setText("Username:");

        registerUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUserFieldActionPerformed(evt);
            }
        });

        registerPassLabel.setText("Password:");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        registerLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabel.setText("Register");

        fNameLabel.setText("First Name:");

        LnameLabel.setText("Last Name:");

        fnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameFieldActionPerformed(evt);
            }
        });

        lnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameFieldActionPerformed(evt);
            }
        });

        loginPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPassFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanel1Layout = new javax.swing.GroupLayout(loginPanel1);
        loginPanel1.setLayout(loginPanel1Layout);
        loginPanel1Layout.setHorizontalGroup(
            loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanel1Layout.createSequentialGroup()
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginUserLabel)
                            .addComponent(loginPassLabel))
                        .addGap(18, 18, 18)
                        .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginUserField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginPassField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerUserLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LnameLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerPassLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerUserField, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(lnameField)
                    .addComponent(fnameField)
                    .addComponent(registerPassField))
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addGap(174, 174, 174))
            .addGroup(loginPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerLabel)
                .addGap(174, 174, 174))
        );
        loginPanel1Layout.setVerticalGroup(
            loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanel1Layout.createSequentialGroup()
                        .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LnameLabel)
                            .addComponent(loginUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginUserLabel))
                        .addGap(24, 24, 24)
                        .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginPassLabel)
                            .addComponent(loginPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(registerUserLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerPassLabel)
                    .addComponent(registerPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(registerButton))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserFieldActionPerformed
       
    }//GEN-LAST:event_loginUserFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        username = loginUserField.getText();
        password = loginPassField.getText();
        // checking if username exists
        boolean userExists = loginPanel1.exist(username);
        // if above is in order, check if password is correct 
        if (userExists == true) {
            boolean correctPass = loginPanel1.correctPw(username, password);
            if (correctPass == true) {
                System.out.println("You have been logged in.");
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("The username does not exist.");
        }
        // clear fields
        loginUserField.setText(null);
        loginPassField.setText(null);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUserFieldActionPerformed
       
    }//GEN-LAST:event_registerUserFieldActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here
        // creating user
        User user = new User(username, password, fName, lName);
        // setting variables
        username = registerUserField.getText();
        password = registerPassField.getText();
        fName = fnameField.getText();
        lName = lnameField.getText();
        if (username != null && password != null && fName != null && lName != null) {
            // checking if username has already been taken (ideal case: false)
            boolean userExists = loginPanel1.exist(username);
            // checking if password is strong (ideal case: true)
            boolean strong = loginPanel1.strongPw(password);
            // encrypting password if strong
            if (strong == true) {
                password = loginPanel1.encrypt(password);
            } else {
                System.out.println("Weak password, try again");
            }
            // adding to user array if above passes
            if (userExists == false && strong == true) {
                loginPanel1.userArray.add(fName + delim + lName + delim + username + delim + password); 
                // writing to file
                loginPanel1.write(loginPanel1.userArray.get(loginPanel1.userArray.size() - 1));
            }
        } else {
            // make error message
            System.out.println("One of the fields were not filled in properly.");
        }
        // clearing registration fields 
        registerUserField.setText(null);
        registerPassField.setText(null);
        fnameField.setText(null);
        lnameField.setText(null);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void fnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameFieldActionPerformed
        
    }//GEN-LAST:event_fnameFieldActionPerformed

    private void lnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameFieldActionPerformed
       
    }//GEN-LAST:event_lnameFieldActionPerformed

    private void loginPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPassFieldActionPerformed
       
    }//GEN-LAST:event_loginPassFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LnameLabel;
    private javax.swing.JDialog errorMessage;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fnameField;
    private javax.swing.JTextField lnameField;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private textfileio.LoginPanel loginPanel1;
    private javax.swing.JPasswordField loginPassField;
    private javax.swing.JLabel loginPassLabel;
    private javax.swing.JTextField loginUserField;
    private javax.swing.JLabel loginUserLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JPasswordField registerPassField;
    private javax.swing.JLabel registerPassLabel;
    private javax.swing.JTextField registerUserField;
    private javax.swing.JLabel registerUserLabel;
    // End of variables declaration//GEN-END:variables
}

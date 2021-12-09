/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;


import UI.Student.studentRegistrationJPanel;
import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.student.accomodation.PermanentDirectory;
import business.student.accomodation.TemporaryDirectory;
import business.complaintManagement.ComplaintManager;
import business.role.AdminRole;
import business.role.ComplaintManagerRole;
import business.student.registration.StudentDirectory;

import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prashantii_s
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;

    private DB4OUtil db4OUtil=DB4OUtil.getInstance();
    UserAccount userAccount;
    StudentDirectory studentHistory;
    
    JPanel userProcessContainer;
    
    public MainJFrame() {
        system=db4OUtil.retrieveSystem();
        initComponents();
        studentHistory = new StudentDirectory();
   

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ContainerPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        txtPasswordField = new javax.swing.JPasswordField();
        lblHello = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        ContainerPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(ContainerPanel);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Logout");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(btnRegister))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblHello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)))
                .addGap(17, 17, 17))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRegister, jButton1, jButton2});

        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(lblHello, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jButton1)
                .addGap(69, 69, 69)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(txtPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(77, 77, 77)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRegister, jButton1, jButton2, jLabel1, jLabel2, txtUsername});

        jSplitPane1.setLeftComponent(loginPanel);

        getContentPane().add(jSplitPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String userName = txtUsername.getText();
       char[] passwordEncoded = txtPasswordField.getPassword();
       String password = String.valueOf(passwordEncoded);

        userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
      
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }else{

            txtUsername.setText(null);
            txtPasswordField.setText(null);
            switchPanels(userAccount);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed


       // registrationJPanel StudentRegistatationPanel = new registrationJPanel(studentDirectory);
      //  jSplitPane1.setBottomComponent(StudentRegistatationPanel);
      studentRegistrationJPanel registrationPanel=new studentRegistrationJPanel(studentHistory, ContainerPanel,  userAccount, system);
         ContainerPanel.add(registrationPanel);
                        //  CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                         // layout.next(userProcessContainer);
        // jSplitPane1.setRightComponent(StudentRegistrationJPanel);

        

    }//GEN-LAST:event_btnRegisterActionPerformed
  private void switchPanels(UserAccount userAccount) {
        if (userAccount != null) {
            String hello = "";
            if ((  "class "+userAccount.getRole().toString()).equals(AdminRole.class.toString())){
                    hello =   "Hello " + userAccount.getAdmin().getName();
                    ContainerPanel.add("workArea", userAccount.getRole().createWorkArea(ContainerPanel, userAccount, system));
            }
            else if((  "class "+userAccount.getRole().toString()).equals(ComplaintManagerRole.class.toString())){
                     hello =   "Hello " + userAccount.getCm().getName();
                    ContainerPanel.add("workArea", userAccount.getRole().createWorkArea(ContainerPanel, userAccount, system));
            }          
            lblHello.setText(hello + " !");
            CardLayout layout = (CardLayout) ContainerPanel.getLayout();
            layout.next(ContainerPanel);
        }

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblHello;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField txtPasswordField;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

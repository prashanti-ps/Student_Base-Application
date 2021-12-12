/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import UI.Accomodation.postTemporaryAccomodationJPanel;
import business.EcoSystem;
import business.student.accomodation.PermanentDirectory;
import business.student.accomodation.TemporaryDirectory;
import business.student.registration.StudentDirectory;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Pratik
 */
public class adminDashboard extends javax.swing.JPanel {

    /**
     * Creates new form adminDashboard
     */
    PermanentDirectory permanentDirectory;
    TemporaryDirectory temporaryDirectory;
    JPanel userProcessContainer;
    JSplitPane jSplitPane1;
    EcoSystem ecosystem;
    UserAccount userAccount;
    StudentDirectory studentHistory;
    public adminDashboard(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.ecosystem=business;
        this.userAccount=account;
         this.userProcessContainer=userProcessContainer;
        //this.jSplitPane1= jSplitPane1;
        this.permanentDirectory=business.getPermanentDirectory();
        this.temporaryDirectory=business.getTemporaryDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageTemporaryAccomodation = new javax.swing.JButton();
        btnManagePermanentAccomodation = new javax.swing.JButton();
        btnManagePermanentAccomodation1 = new javax.swing.JButton();
        btnManagePermanentAccomodation2 = new javax.swing.JButton();
        btnManagePermanentAccomodation3 = new javax.swing.JButton();
        btnStudentRegistration = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(29, 34, 40));

        btnManageTemporaryAccomodation.setBackground(new java.awt.Color(251, 129, 34));
        btnManageTemporaryAccomodation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnManageTemporaryAccomodation.setForeground(new java.awt.Color(255, 255, 255));
        btnManageTemporaryAccomodation.setText(" Temporary ");
        btnManageTemporaryAccomodation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageTemporaryAccomodation.setBorderPainted(false);
        btnManageTemporaryAccomodation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTemporaryAccomodationActionPerformed(evt);
            }
        });

        btnManagePermanentAccomodation.setBackground(new java.awt.Color(251, 129, 34));
        btnManagePermanentAccomodation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnManagePermanentAccomodation.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePermanentAccomodation.setText(" Permanent ");
        btnManagePermanentAccomodation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManagePermanentAccomodation.setBorderPainted(false);
        btnManagePermanentAccomodation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePermanentAccomodationActionPerformed(evt);
            }
        });

        btnManagePermanentAccomodation1.setBackground(new java.awt.Color(251, 129, 34));
        btnManagePermanentAccomodation1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnManagePermanentAccomodation1.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePermanentAccomodation1.setText(" Complaint  ");
        btnManagePermanentAccomodation1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManagePermanentAccomodation1.setBorderPainted(false);
        btnManagePermanentAccomodation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePermanentAccomodation1ActionPerformed(evt);
            }
        });

        btnManagePermanentAccomodation2.setBackground(new java.awt.Color(251, 129, 34));
        btnManagePermanentAccomodation2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnManagePermanentAccomodation2.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePermanentAccomodation2.setText(" Selling");
        btnManagePermanentAccomodation2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManagePermanentAccomodation2.setBorderPainted(false);
        btnManagePermanentAccomodation2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePermanentAccomodation2ActionPerformed(evt);
            }
        });

        btnManagePermanentAccomodation3.setBackground(new java.awt.Color(251, 129, 34));
        btnManagePermanentAccomodation3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnManagePermanentAccomodation3.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePermanentAccomodation3.setText(" Buying");
        btnManagePermanentAccomodation3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManagePermanentAccomodation3.setBorderPainted(false);
        btnManagePermanentAccomodation3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePermanentAccomodation3ActionPerformed(evt);
            }
        });

        btnStudentRegistration.setBackground(new java.awt.Color(251, 129, 34));
        btnStudentRegistration.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnStudentRegistration.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentRegistration.setText(" Students");
        btnStudentRegistration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnStudentRegistration.setBorderPainted(false);
        btnStudentRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentRegistrationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Dashboard");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Accomodation");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Complaint Management");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buying Management");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Selling Management");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Student Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStudentRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnManageTemporaryAccomodation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManagePermanentAccomodation, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnManagePermanentAccomodation1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnManagePermanentAccomodation3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnManagePermanentAccomodation2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnManageTemporaryAccomodation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManagePermanentAccomodation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btnManagePermanentAccomodation1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnManagePermanentAccomodation3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btnManagePermanentAccomodation2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btnStudentRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(531, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageTemporaryAccomodationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTemporaryAccomodationActionPerformed

        manageTemporaryAccomodation manageTemporaryAccomodationPanel=new manageTemporaryAccomodation( userProcessContainer,  userAccount,  ecosystem);
         userProcessContainer.add("manageTemporaryAccomodationPanel", manageTemporaryAccomodationPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
      
    }//GEN-LAST:event_btnManageTemporaryAccomodationActionPerformed

    private void btnManagePermanentAccomodationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePermanentAccomodationActionPerformed
        managePermanentAccomodation managePermanentAccomodationPanel=new managePermanentAccomodation( userProcessContainer,  userAccount,  ecosystem);
         userProcessContainer.add("managePermanentAccomodationPanel", managePermanentAccomodationPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePermanentAccomodationActionPerformed

    private void btnManagePermanentAccomodation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePermanentAccomodation1ActionPerformed
        manageComplaintManagement managecomplaintManagement=new manageComplaintManagement( userProcessContainer,  userAccount,  ecosystem);
         userProcessContainer.add("managecomplaintManagement", managecomplaintManagement);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePermanentAccomodation1ActionPerformed

    private void btnManagePermanentAccomodation2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePermanentAccomodation2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManagePermanentAccomodation2ActionPerformed

    private void btnManagePermanentAccomodation3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePermanentAccomodation3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManagePermanentAccomodation3ActionPerformed

    private void btnStudentRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentRegistrationActionPerformed
        manageStudentRegistration ManageStudentRegistration=new manageStudentRegistration( userProcessContainer,  userAccount,  ecosystem);
         userProcessContainer.add("ManageStudentRegistration", ManageStudentRegistration);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnStudentRegistrationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManagePermanentAccomodation;
    private javax.swing.JButton btnManagePermanentAccomodation1;
    private javax.swing.JButton btnManagePermanentAccomodation2;
    private javax.swing.JButton btnManagePermanentAccomodation3;
    private javax.swing.JButton btnManageTemporaryAccomodation;
    private javax.swing.JButton btnStudentRegistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

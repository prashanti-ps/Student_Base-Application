/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Purchase;

import UI.Student.StudentDashboard;
import business.EcoSystem;
import business.Purchase.Purchase;
import business.Purchase.PurchaseDirectory;
import business.student.accomodation.Permanent;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mayurimore
 */
public class FindPurchaseProducts extends javax.swing.JPanel {

    /**
     * Creates new form FindPurchaseProducts
     */
    JSplitPane jSplitPane1;
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    PurchaseDirectory purchaseDirectory ;
    public FindPurchaseProducts(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.purchaseDirectory = ecosystem.getPurchaseDirectory();
        
        btnConnectHost.setEnabled(false);
        btnReport.setEnabled(false);
        populateTable();
        clearFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        btnConnectHost = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        comboCategory = new javax.swing.JComboBox<>();
        comboCondition = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtContactEmail = new javax.swing.JTextField();
        lblUploadImage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAddress = new javax.swing.JTextArea();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaComment = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(29, 31, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buy Products");

        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Address", "price", "Quantity", "Condition", "Category", "Comment", "Availibility", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblProductList);

        btnConnectHost.setBackground(new java.awt.Color(251, 129, 34));
        btnConnectHost.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConnectHost.setForeground(new java.awt.Color(255, 255, 255));
        btnConnectHost.setText("Connect to Host");
        btnConnectHost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConnectHost.setBorderPainted(false);
        btnConnectHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectHostActionPerformed(evt);
            }
        });

        btnReport.setBackground(new java.awt.Color(251, 129, 34));
        btnReport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setText("Report");
        btnReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReport.setBorderPainted(false);
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Taken" }));

        comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronics", "Furniture", "Home Decor", "Mattresses" }));

        comboCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New", "upto 3 months old", "upto 6 months old", "older than 6 months" }));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity :");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Comment :");

        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
        });

        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Status");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("category :");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Price :");

        txtContactEmail.setEditable(false);

        lblUploadImage.setText("upload Image");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Condition :");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product Name :");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Image");

        txtAreaAddress.setColumns(20);
        txtAreaAddress.setRows(5);
        jScrollPane2.setViewportView(txtAreaAddress);

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact Email :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Add Comment:");

        txtAreaComment.setColumns(20);
        txtAreaComment.setRows(5);
        jScrollPane3.setViewportView(txtAreaComment);

        btnBack.setBackground(new java.awt.Color(251, 129, 34));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(251, 129, 34));
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblImage.setText("jLabel12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(342, 342, 342)
                                .addComponent(lblUploadImage))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtProductName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtContactEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboCondition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(113, 113, 113)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel11)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(97, 97, 97)
                                            .addComponent(jLabel13))))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(txtComment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnConnectHost, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(btnView))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(comboCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContactEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConnectHost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addComponent(lblUploadImage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectHostActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblProductList.getSelectedRow();

        //fieldsEnableDisable(true);
        DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
        Purchase p = (Purchase) model.getValueAt(selectedRowIndex, 0);
        Map<String, ArrayList<Purchase>> latestDirectory = purchaseDirectory.getPurchaseDirectory();
        ArrayList<Purchase> perArr = latestDirectory.get(p.getContact());
        for (Purchase obj : perArr) {
            if (obj.equals(p)) {
                String str = obj.getBuyRequests();
                if (str==null) {
                    str = userAccount.getStudent().getEmailAddress() + ",";
                    obj.setBuyRequests(str);
                }
                else
                {
                    str= userAccount.getStudent().getEmailAddress()+ ","+ str;
                    obj.setBuyRequests(str);
                }

                JOptionPane.showMessageDialog(this, "Host Notified!");
            }
        }
        btnConnectHost.setEnabled(false);
        btnReport.setEnabled(false);
        clearFields();
    }//GEN-LAST:event_btnConnectHostActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblProductList.getSelectedRow();

        //fieldsEnableDisable(true);
        if (txtAreaComment.getText().length() > 5) {
            DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
            Purchase p = (Purchase) model.getValueAt(selectedRowIndex, 0);
            Map<String, ArrayList<Purchase>> latestDirectory = purchaseDirectory.getPurchaseDirectory();
          //  System.out.print("email is" + p.getContact());
            ArrayList<Purchase> perArr = latestDirectory.get(p.getContact());
            for (Purchase obj : perArr) {
                if (obj.equals(p)) {
                    String str = txtAreaComment.getText();
                    obj.setComment(str);
                    obj.setStatus("Reported");
                    JOptionPane.showMessageDialog(this, "Post reported and sent to complaint department!");
                    txtAreaComment.setEnabled(false);
                    btnConnectHost.setEnabled(false);
                    btnReport.setEnabled(false);
                    clearFields();
                    populateTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please provide reason for reporting in comment section!");
        }

    }//GEN-LAST:event_btnReportActionPerformed

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtQuantityKeyReleased

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        // TODO add your handling code here:

        
    }//GEN-LAST:event_txtPriceKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        StudentDashboard studentDashboardPanel = new StudentDashboard(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("studentDashboardPanel", studentDashboardPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblProductList.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view!");
            return;
        } else {
            txtAreaComment.setEnabled(true);
            btnConnectHost.setEnabled(true);
            btnReport.setEnabled(true);
            DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
            Purchase p = (Purchase) model.getValueAt(selectedRowIndex, 0);
            
            txtProductName.setText(p.getProductName());
            txtContactEmail.setText(userAccount.getStudent().getEmailAddress());
            txtPrice.setText(String.valueOf(p.getPrice()));
            txtAreaAddress.setText(p.getAddress());
            txtQuantity.setText(String.valueOf(p.getQuantity()));
            txtComment.setText(p.getComment());
            
          //  comboCategory.addItem(p.getCategory().toString());
            comboCategory.setSelectedItem(p.getCategory().toString());
            comboCondition.setSelectedItem(p.getContidion().toString());
            comboStatus.setSelectedItem(p.getStatusOfProduct().toString());
            
            System.out.print("path is " + p.getProductImage());
            ImageIcon imIcon = new ImageIcon(p.getProductImage());
    Image image = imIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(150, 100,  java.awt.Image.SCALE_SMOOTH);
ImageIcon imICon2 = new ImageIcon(newimg);
    lblImage.setIcon(imICon2);
        }
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConnectHost;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JComboBox<String> comboCondition;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblUploadImage;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTextArea txtAreaAddress;
    private javax.swing.JTextArea txtAreaComment;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtContactEmail;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
        model.setRowCount(0);
        Map<String, ArrayList<Purchase>> directory = ecosystem.getPurchaseDirectory().getPurchaseDirectory();
        ArrayList<Purchase> foundDirectory = new ArrayList<Purchase>();

        for (ArrayList<Purchase> perArr : directory.values()) {
            for (Purchase p : perArr) {
                if (p.getStatusOfProduct().equals("Available") && p.getStatus().equals("OK")) {
                    Object[] row = new Object[9];
                    row[0] = p;
                    row[1] = p.getAddress();
                    row[2] = p.getPrice();
                    row[3] = p.getQuantity();
                    row[4] = p.getContidion();
                    row[5] = p.getCategory();
                    row[6] = p.getComment();
                    row[7] = p.getStatusOfProduct();
                    row[8] = p.getStatus();
                    model.addRow(row);
                }
                else {
                System.out.print("null");
                }
            }
        }
    }

private void clearFields() {
        txtContactEmail.setText(userAccount.getStudent().getEmailAddress());
        txtAreaAddress.setText("");
        
        txtComment.setText("");
        
       // txtContactEmail.setText("");
        txtPrice.setText("");
        txtProductName.setText("");
        txtQuantity.setText("");
        lblImage.setIcon(null) ;
      
    }

private void enableFields(boolean b) {
        txtProductName.setEnabled(b);
        txtPrice.setEnabled(b);
        txtContactEmail.setEnabled(b);
        txtAreaAddress.setEnabled(b);
        
        txtComment.setEnabled(b);
        txtQuantity.setEnabled(b);
        comboCondition.setEnabled(b);
        comboCategory.setEnabled(b);
        comboStatus.setEnabled(b);
        txtAreaComment.setEnabled(b);

    }

}

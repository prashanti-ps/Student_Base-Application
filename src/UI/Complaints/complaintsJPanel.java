/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Complaints;

import business.EcoSystem;
import business.student.accomodation.Permanent;
import business.student.accomodation.PermanentDirectory;
import business.student.accomodation.Temporary;
import business.student.accomodation.TemporaryDirectory;
import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prashantii_s
 */
public class complaintsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form complaintsJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    TemporaryDirectory temporaryDirectory;
    PermanentDirectory permanentDirectory;
    Temporary temp;
    Permanent per;

    public complaintsJPanel() {

    }

    public complaintsJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.temporaryDirectory = ecosystem.getTemporaryDirectory();
        this.permanentDirectory = ecosystem.getPermanentDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ComplaintManagerTab = new javax.swing.JTabbedPane();
        sellingComplaintsJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buyingComplaintsJPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tempAccomodationsComplaintsJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TempComplaintsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tempSendToAdmin = new javax.swing.JButton();
        btnTempOK = new javax.swing.JButton();
        lblTempAddress = new javax.swing.JLabel();
        lblTempFacilities = new javax.swing.JLabel();
        lblTempPrice = new javax.swing.JLabel();
        lblTempContact = new javax.swing.JLabel();
        lblTempDistance = new javax.swing.JLabel();
        lblTempOccupancy = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTempComment = new javax.swing.JTextField();
        permAccomodationsComplaintsJPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PermanentComplaintsTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PermSendToAdminbtn = new javax.swing.JButton();
        btnPermOk = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPermComment = new javax.swing.JTextField();
        lblPermAddress = new javax.swing.JLabel();
        lblPermFacilities = new javax.swing.JLabel();
        lblPermRent = new javax.swing.JLabel();
        lblPermContact = new javax.swing.JLabel();
        lblPermTotalPpl = new javax.swing.JLabel();

        jLabel1.setText("Complaint Manager");

        ComplaintManagerTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ComplaintManagerTabStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout sellingComplaintsJPanelLayout = new javax.swing.GroupLayout(sellingComplaintsJPanel);
        sellingComplaintsJPanel.setLayout(sellingComplaintsJPanelLayout);
        sellingComplaintsJPanelLayout.setHorizontalGroup(
            sellingComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellingComplaintsJPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        sellingComplaintsJPanelLayout.setVerticalGroup(
            sellingComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellingComplaintsJPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        ComplaintManagerTab.addTab("Selling ", sellingComplaintsJPanel);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout buyingComplaintsJPanelLayout = new javax.swing.GroupLayout(buyingComplaintsJPanel);
        buyingComplaintsJPanel.setLayout(buyingComplaintsJPanelLayout);
        buyingComplaintsJPanelLayout.setHorizontalGroup(
            buyingComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buyingComplaintsJPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        buyingComplaintsJPanelLayout.setVerticalGroup(
            buyingComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buyingComplaintsJPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        ComplaintManagerTab.addTab("Buying ", buyingComplaintsJPanel);

        TempComplaintsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Price Per Day", "Complaint Against", "Comment", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TempComplaintsTable);

        jLabel2.setText("Address:");

        jLabel3.setText("Facilities:");

        jLabel4.setText("Price Per Day:");

        jLabel5.setText("Contact:");

        jLabel6.setText("Distance from university:");

        jLabel7.setText("Occupancy for:");

        tempSendToAdmin.setText("Send to Admin for Deletion");
        tempSendToAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempSendToAdminActionPerformed(evt);
            }
        });

        btnTempOK.setText("Mark as OK");
        btnTempOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempOKActionPerformed(evt);
            }
        });

        jLabel18.setText("Comment:");

        javax.swing.GroupLayout tempAccomodationsComplaintsJPanelLayout = new javax.swing.GroupLayout(tempAccomodationsComplaintsJPanel);
        tempAccomodationsComplaintsJPanel.setLayout(tempAccomodationsComplaintsJPanelLayout);
        tempAccomodationsComplaintsJPanelLayout.setHorizontalGroup(
            tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tempAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tempAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(tempAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                        .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel18)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tempAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTempAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTempPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTempFacilities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtTempComment, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tempAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                                .addComponent(tempSendToAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTempOK)
                                .addGap(14, 14, 14))
                            .addGroup(tempAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tempAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(124, 124, 124)
                                        .addComponent(lblTempContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(47, 47, 47))
                                    .addGroup(tempAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                        .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(tempAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                                .addComponent(lblTempDistance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap(305, Short.MAX_VALUE))
                                            .addGroup(tempAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                                .addComponent(lblTempOccupancy, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))))
        );
        tempAccomodationsComplaintsJPanelLayout.setVerticalGroup(
            tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tempAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(lblTempAddress)
                    .addComponent(lblTempContact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(lblTempFacilities)
                    .addComponent(lblTempDistance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(lblTempPrice)
                    .addComponent(lblTempOccupancy, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(tempAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempSendToAdmin)
                    .addComponent(btnTempOK)
                    .addComponent(jLabel18)
                    .addComponent(txtTempComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        tempAccomodationsComplaintsJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblTempAddress, lblTempContact, lblTempDistance, lblTempFacilities, lblTempOccupancy, lblTempPrice});

        ComplaintManagerTab.addTab("Temporary Accomodation ", tempAccomodationsComplaintsJPanel);

        PermanentComplaintsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Rent", "Complaint against", "Comments", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(PermanentComplaintsTable);

        jLabel8.setText("Address:");

        jLabel9.setText("Rent:");

        jLabel10.setText("Facilities:");

        jLabel11.setText("Contact:");

        PermSendToAdminbtn.setText("Send to Admin for Deletion");
        PermSendToAdminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PermSendToAdminbtnActionPerformed(evt);
            }
        });

        btnPermOk.setText("Mark as OK");
        btnPermOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermOkActionPerformed(evt);
            }
        });

        jLabel12.setText("Total People in house:");

        jLabel13.setText("Comment:");

        javax.swing.GroupLayout permAccomodationsComplaintsJPanelLayout = new javax.swing.GroupLayout(permAccomodationsComplaintsJPanel);
        permAccomodationsComplaintsJPanel.setLayout(permAccomodationsComplaintsJPanelLayout);
        permAccomodationsComplaintsJPanelLayout.setHorizontalGroup(
            permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(permAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(permAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26)
                        .addComponent(txtPermComment, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(PermSendToAdminbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPermOk)
                        .addGap(27, 27, 27))
                    .addGroup(permAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                        .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, permAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(44, 44, 44)
                                .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(permAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                        .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(permAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                                .addComponent(lblPermAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(199, 199, 199))
                                            .addGroup(permAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                                .addComponent(lblPermFacilities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(173, 173, 173)))
                                        .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(33, 33, 33)
                                        .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPermTotalPpl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblPermContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(permAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                                        .addComponent(lblPermRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(424, 424, 424)))
                                .addGap(134, 134, 134)))
                        .addContainerGap())))
        );
        permAccomodationsComplaintsJPanelLayout.setVerticalGroup(
            permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(permAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(lblPermAddress)
                    .addComponent(lblPermContact))
                .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(permAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblPermFacilities)))
                    .addGroup(permAccomodationsComplaintsJPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblPermTotalPpl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblPermRent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(permAccomodationsComplaintsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PermSendToAdminbtn)
                    .addComponent(btnPermOk)
                    .addComponent(jLabel13)
                    .addComponent(txtPermComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        permAccomodationsComplaintsJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblPermAddress, lblPermContact, lblPermFacilities, lblPermRent, lblPermTotalPpl});

        ComplaintManagerTab.addTab("Permanent Accomodtion ", permAccomodationsComplaintsJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1)
                .addContainerGap(431, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComplaintManagerTab, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComplaintManagerTab, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateTemporaryAccomodtionComplaintsTable() {
        DefaultTableModel model = (DefaultTableModel) TempComplaintsTable.getModel();
        model.setRowCount(0);
        String contact = "";
        Object[] row = new Object[4];
        Map<String, ArrayList<Temporary>> latestDirectory = temporaryDirectory.getTemporaryDirectory();
        for (String key : latestDirectory.keySet()) {
            for (Temporary value : latestDirectory.get(key)) {
                if (value.getStatusOfPost().equals("Reported")) {
                    contact = key;
                    row[0] = value;
                    row[1] = value.getHostName();
                    row[2] = value.getComment();
                    row[3] = value.getStatusOfPost();
                    model.addRow(row);
                }
            }
        }
    }

    private void populatePermanentAccomodtionComplaintsTable() {
        DefaultTableModel model = (DefaultTableModel) PermanentComplaintsTable.getModel();
        model.setRowCount(0);
        String contact = "";
        Object[] row = new Object[4];
        Map<String, ArrayList<Permanent>> latestDirectory = permanentDirectory.getPermanentDirectory();
        for (String key : latestDirectory.keySet()) {
            for (Permanent value : latestDirectory.get(key)) {
                if (value.getStatusOfPost().equals("Reported")) {
                    contact = key;
                    row[0] = value;
                    row[1] = value.getHostName();
                    row[2] = value.getComment();
                    row[3] = value.getStatusOfPost();
                    model.addRow(row);
                }
            }
        }
    }
    private void ComplaintManagerTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ComplaintManagerTabStateChanged
        if (ComplaintManagerTab.getSelectedIndex() == 2) {
            populateTemporaryAccomodtionComplaintsTable();
            initTempListerners();
        }
        if (ComplaintManagerTab.getSelectedIndex() == 3) {
            populatePermanentAccomodtionComplaintsTable();
            initPermListerners();
        }
    }//GEN-LAST:event_ComplaintManagerTabStateChanged

    private void PermSendToAdminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PermSendToAdminbtnActionPerformed
        int selectedRow = PermanentComplaintsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a post to send");
            return;
        } else {
            if (txtPermComment.getText().trim() != null && txtPermComment.getText().trim() != "") {
                per = (Permanent) PermanentComplaintsTable.getValueAt(selectedRow, 0);
                per.setStatusOfPost("Delete");
                per.setComment("From Complaint Manager: " + txtPermComment.getText().trim());
                JOptionPane.showMessageDialog(null, "Admin will delete the post!");
                populatePermanentAccomodtionComplaintsTable();
                lblPermAddress.setText(null);
                lblPermContact.setText(null);
                lblPermFacilities.setText(null);
                lblPermRent.setText(null);
                lblPermTotalPpl.setText(null);
                txtPermComment.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Please enter the comments first");
                return;
            }
        }
    }//GEN-LAST:event_PermSendToAdminbtnActionPerformed

    private void tempSendToAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempSendToAdminActionPerformed
        int selectedRow = TempComplaintsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a post to send");
            return;
        } else {
            if (null != txtTempComment.getText().trim() && !txtTempComment.getText().trim().equals("")) {
                temp = (Temporary) TempComplaintsTable.getValueAt(selectedRow, 0);
                temp.setStatusOfPost("Delete");
                temp.setComment("From Complaint Manager: " + txtTempComment.getText().trim());
                JOptionPane.showMessageDialog(null, "Admin will delete the post!");
                populateTemporaryAccomodtionComplaintsTable();
                lblTempAddress.setText(null);
                lblTempContact.setText(null);
                lblTempDistance.setText(null);
                lblTempFacilities.setText(null);
                lblTempOccupancy.setText(null);
                lblTempPrice.setText(null);
                txtTempComment.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter the comments first");
                return;
            }
        }
    }//GEN-LAST:event_tempSendToAdminActionPerformed

    private void btnTempOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempOKActionPerformed
        int selectedRow = TempComplaintsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a post");
            return;
        } else {
            txtTempComment.setText(null);
            temp = (Temporary) TempComplaintsTable.getValueAt(selectedRow, 0);
            temp.setStatusOfPost("Ok");
            temp.setComment("");
            JOptionPane.showMessageDialog(null, "Post will be kept in the list");
            populateTemporaryAccomodtionComplaintsTable();
            lblTempAddress.setText(null);
            lblTempContact.setText(null);
            lblTempDistance.setText(null);
            lblTempFacilities.setText(null);
            lblTempOccupancy.setText(null);
            lblTempPrice.setText(null);
            txtTempComment.setText(null);

        }
    }//GEN-LAST:event_btnTempOKActionPerformed

    private void btnPermOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermOkActionPerformed
        int selectedRow = PermanentComplaintsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a post");
            return;
        } else {
            txtPermComment.setText(null);
            per = (Permanent) PermanentComplaintsTable.getValueAt(selectedRow, 0);
            per.setStatusOfPost("Ok");
            per.setComment("");
            JOptionPane.showMessageDialog(null, "Admin will delete the post!");
            populateTemporaryAccomodtionComplaintsTable();
            lblPermAddress.setText(null);
            lblPermContact.setText(null);
            lblPermFacilities.setText(null);
            lblPermRent.setText(null);
            lblPermTotalPpl.setText(null);
        }
    }//GEN-LAST:event_btnPermOkActionPerformed
    private void initTempListerners() {
        TempComplaintsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = TempComplaintsTable.getSelectedRow();
                if (selectedRow >= 0) {
                    Temporary temp = (Temporary) TempComplaintsTable.getValueAt(selectedRow, 0);
                    if (null != temp) {
                        lblTempAddress.setText(temp.getAddress().trim());
                        lblTempContact.setText(temp.getContact().trim());
                        lblTempDistance.setText(String.valueOf(temp.getDistanceFromUniversity()));
                        lblTempFacilities.setText(temp.getFacilities().trim());
                        lblTempOccupancy.setText(String.valueOf(temp.getOccupancyFor()));
                        lblTempPrice.setText(String.valueOf(temp.getPricePerDay()));

                    }

                }
            }
        });
    }

    private void initPermListerners() {
        PermanentComplaintsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = PermanentComplaintsTable.getSelectedRow();
                if (selectedRow >= 0) {
                    Permanent per = (Permanent) PermanentComplaintsTable.getValueAt(selectedRow, 0);
                    if (null != per) {
                        lblPermAddress.setText(per.getAddress().trim());
                        lblPermContact.setText(per.getContact().trim());
                        lblPermFacilities.setText(per.getFacilities().trim());
                        lblPermRent.setText(String.valueOf(per.getRent()));
                        lblPermTotalPpl.setText(String.valueOf(per.getTotalPeopleInHouse()));

                    }

                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ComplaintManagerTab;
    private javax.swing.JButton PermSendToAdminbtn;
    private javax.swing.JTable PermanentComplaintsTable;
    private javax.swing.JTable TempComplaintsTable;
    private javax.swing.JButton btnPermOk;
    private javax.swing.JButton btnTempOK;
    private javax.swing.JPanel buyingComplaintsJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblPermAddress;
    private javax.swing.JLabel lblPermContact;
    private javax.swing.JLabel lblPermFacilities;
    private javax.swing.JLabel lblPermRent;
    private javax.swing.JLabel lblPermTotalPpl;
    private javax.swing.JLabel lblTempAddress;
    private javax.swing.JLabel lblTempContact;
    private javax.swing.JLabel lblTempDistance;
    private javax.swing.JLabel lblTempFacilities;
    private javax.swing.JLabel lblTempOccupancy;
    private javax.swing.JLabel lblTempPrice;
    private javax.swing.JPanel permAccomodationsComplaintsJPanel;
    private javax.swing.JPanel sellingComplaintsJPanel;
    private javax.swing.JPanel tempAccomodationsComplaintsJPanel;
    private javax.swing.JButton tempSendToAdmin;
    private javax.swing.JTextField txtPermComment;
    private javax.swing.JTextField txtTempComment;
    // End of variables declaration//GEN-END:variables
}

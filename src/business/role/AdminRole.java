/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import UI.Admin.adminDashboard;
import UI.Complaints.complaintsJPanel;
import business.EcoSystem;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author prashantii_s
 */
public class AdminRole extends Role {
    @Override
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new adminDashboard(userProcessContainer, account,business);
}
}

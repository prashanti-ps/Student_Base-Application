/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.role.AdminRole;
import business.admin.Admin;
import business.complaintManagement.ComplaintManager;
import business.role.ComplaintManagerRole;
import business.useraccount.UserAccount;

/**
 *
 * @author prashantii_s
 */
public class ConfigureASystem {
      public static EcoSystem configure(){
     EcoSystem system = EcoSystem.getInstance();
        
       
        
      Admin admin = system.getAdminDirectory().createAdmin("Prashanti Admin");
      ComplaintManager cm=system.getComplaintManagerDirectory().createComplaintManager("Pratik Complaint Manager");
      UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", admin,null,null, new AdminRole());
      UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("complaint", "complaint", null,cm,null, new ComplaintManagerRole());
        
        return system;
      }
}

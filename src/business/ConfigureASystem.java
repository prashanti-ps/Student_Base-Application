/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.role.AdminRole;
import business.admin.Admin;
import business.useraccount.UserAccount;

/**
 *
 * @author prashantii_s
 */
public class ConfigureASystem {
      public static EcoSystem configure(){
     EcoSystem system = EcoSystem.getInstance();
        
       
        
      Admin user = system.getAdminDirectory().createAdmin("Prashanti");
        
      UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", user, new AdminRole());
        
        return system;
      }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import business.role.Role;
import business.admin.Admin;
import business.complaintManagement.ComplaintManager;
import business.student.registration.Student;
import java.util.ArrayList;

/**
 *
 * @author prashantii_s
 */
public class UserAccountDirectory {
    
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Admin user,ComplaintManager cm,Student s,Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        if(user!=null)
        userAccount.setAdmin(user);
        if(cm!=null)
        userAccount.setCm(cm);
        if(s!=null)
        userAccount.setStudent(s);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public UserAccount addUserAccount(UserAccount userAccount){
        userAccountList.add(userAccount);
        return userAccount;
    }
     public void deleteUserAccount(UserAccount userAccount){
        userAccountList.remove(userAccount);
     }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}

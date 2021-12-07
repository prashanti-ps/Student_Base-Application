/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import business.role.Role;
import business.admin.Admin;

/**
 *
 * @author prashantii_s
 */
public class UserAccount {
        
    private String username;
    private String password;
    private Admin admin;
    private Role role;
    //private WorkQueue workQueue;

    public UserAccount() {
        //workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setAdmin(Admin user) {
        this.admin = user;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Admin getAdmin() {
        return admin;
    }


    
    
    @Override
    public String toString() {
        return username;
    }
    
}
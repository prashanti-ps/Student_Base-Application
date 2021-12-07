/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.admin;

import java.util.ArrayList;

/**
 *
 * @author prashantii_s
 */
public class AdminDirectory {
    private ArrayList<Admin> adminList;

    public AdminDirectory() {
        adminList = new ArrayList();
    }

    public ArrayList<Admin> getAdminList() {
        return adminList;
    }
    
    public Admin createAdmin(String name){
        Admin user = new Admin();
        user.setName(name);
        adminList.add(user);
        return user ;
    }
}

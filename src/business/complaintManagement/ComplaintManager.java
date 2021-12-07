/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.complaintManagement;

import business.useraccount.UserAccount;

/**
 *
 * @author prashantii_s
 */
public class ComplaintManager extends UserAccount {
    private String name;
    private int id;
    private static int count = 1;


    public ComplaintManager() {
      id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

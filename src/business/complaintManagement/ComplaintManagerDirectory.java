/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.complaintManagement;

import business.admin.Admin;
import java.util.ArrayList;

/**
 *
 * @author prashantii_s
 */
public class ComplaintManagerDirectory {
    private ArrayList<ComplaintManager> complaintManagerList;

    public ComplaintManagerDirectory() {
        complaintManagerList = new ArrayList();
    }

    public ArrayList<ComplaintManager> getcomplaintManagerList() {
        return complaintManagerList;
    }
    
    public ComplaintManager createComplaintManager(String name){
        ComplaintManager user = new ComplaintManager();
        user.setName(name);
        complaintManagerList.add(user);
        return user ;
    }
}

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

/**
 *
 * @author prashantii_s
 */
public class UserAccount {
        
    private String username;
    private String password;
    private Admin admin;
    private ComplaintManager cm;
    private Student student;
   

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ComplaintManager getCm() {
        return cm;
    }

    public void setCm(ComplaintManager cm) {
        this.cm = cm;
    }
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

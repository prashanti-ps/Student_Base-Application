/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.student.registration;

import static business.student.registration.StudentDirectory.studentHistory;
import java.util.ArrayList;

/**
 *
 * @author mayurimore
 */
public class Student {
    private String firstName;
    private String lastName;

    private String emailAddress;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public ArrayList<StudentDirectory> getOrderDirectoryList() {
        return studentHistory;
    }

    public void setOrderDirectoryList(ArrayList<OrderDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }
    
    
    
}

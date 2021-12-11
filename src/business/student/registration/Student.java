/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.student.registration;


import business.role.StudentRole;
import business.useraccount.UserAccount;

/**
 *
 * @author mayurimore
 */
public class Student extends UserAccount{
    private String firstName;
    private String lastName;

    private String emailAddress;
    private String password;

    public Student(String FirstName,String lastname, String password,String email){
        setUsername(email);
        setPassword(password);
        setRole(new StudentRole());
        this.emailAddress=email;
        this.firstName=FirstName;
        this.lastName=lastname;
        this.emailAddress=email;
        this.password=password;
    }
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
    
     @Override
    public String toString(){
        return this.firstName+" " +this.lastName;
    }
    
    
    
}

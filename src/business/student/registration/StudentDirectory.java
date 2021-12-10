/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.student.registration;

import java.util.ArrayList;

/**
 *
 * @author mayurimore
 */
public class StudentDirectory {
    public ArrayList<Student> studentDirectory;
     

    public StudentDirectory(){
        this.studentDirectory = new ArrayList<Student>();
    }

    public ArrayList<Student> getHistory() {
        return studentDirectory;
    }

    public void setHistory(ArrayList<Student> studentHistory) {
        this.studentDirectory = studentHistory;
    }
    
    public void addNewStudent(Student s){
    
        studentDirectory.add(s);
     
    }
    
    public void deleteStudent(Student ci){
        studentDirectory.remove(ci);
        
        
    }
    
    public ArrayList<Student> getStudentList() {
        return studentDirectory;
    }
}

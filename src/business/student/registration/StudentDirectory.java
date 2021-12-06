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
    public static ArrayList<Student> studentHistory = new ArrayList<Student>();
    
    public StudentDirectory(){
       
    }

    public ArrayList<Student> getHistory() {
        return studentHistory;
    }

    public void setHistory(ArrayList<Student> history) {
        this.studentHistory = history;
    }
    
    public Student addNewStudent(){
    
        Student student = new Student();
        studentHistory.add(student);
        return student;
    }
    
    public void  deletePerson(Student sd){
    
        studentHistory.remove(sd);
        
    }
    
    public  Student getPerson(int index){
    return studentHistory.get(index);
    }
    
}

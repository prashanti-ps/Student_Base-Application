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
    public ArrayList<Student> studentHistory;
    
    public StudentDirectory(){
        this.studentHistory = new ArrayList<Student>();
    }

    public ArrayList<Student> getHistory() {
        return studentHistory;
    }

    public void setHistory(ArrayList<Student> studentHistory) {
        this.studentHistory = studentHistory;
    }
    
    public Student addNewStudent(){
    
        Student student = new Student();
        studentHistory.add(student);
        return student;
    }
    
    public void deleteStudent(Student ci){
        studentHistory.remove(ci);
        
        
    }
    
    public ArrayList<Student> getStudentList() {
        return studentHistory;
    }
}

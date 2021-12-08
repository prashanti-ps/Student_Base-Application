/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.student.accomodation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pratik
 */
public class TemporaryDirectory {
    private Map<String,ArrayList<Temporary>> temporaryDirectory;
    
    public TemporaryDirectory()
    {
        this.temporaryDirectory=new HashMap<String,ArrayList<Temporary>>();
    }

    public Map<String, ArrayList<Temporary>> getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public void setTemporaryDirectory(Map<String, ArrayList<Temporary>> temporaryDirectory) {
        this.temporaryDirectory = temporaryDirectory;
    }

   public void addNewTemporaryAccomodation(String email, Temporary t)
   {
       ArrayList<Temporary> tempArr = new ArrayList<Temporary>();
       tempArr.add(t);
       this.temporaryDirectory.put(email,tempArr);
       
   }
   public void deleteObject(Temporary t)
   {
        temporaryDirectory.get(t.getContact()).remove(t);

        
   }
}

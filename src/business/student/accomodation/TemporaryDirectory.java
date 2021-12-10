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
      ArrayList<Temporary> perArr = temporaryDirectory.get(email);
       
       if(null != perArr)
       {
           perArr.add(t);
       this.temporaryDirectory.put(email,perArr);
       }
       else
       {
           ArrayList<Temporary> per =new ArrayList<Temporary>();
           per.add(t);
           this.temporaryDirectory.put(email,per);
       }
       
   }
   public void deleteObject(Temporary t)
   {
        temporaryDirectory.get(t.getContact()).remove(t);

        
   }
}

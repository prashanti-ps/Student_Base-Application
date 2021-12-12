/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.events;

import business.student.accomodation.Permanent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author prashantii_s
 */
public class EventDirectory {
    
    private Map<String,ArrayList<Event>> eventDirectory;
    
    public EventDirectory()
    {
        this.eventDirectory=new HashMap<String,ArrayList<Event>>();
    }

    public Map<String, ArrayList<Event>> getEventDirectory() {
        return eventDirectory;
    }

    public void setEventDirectory(Map<String, ArrayList<Event>> eventDirectory) {
        this.eventDirectory = eventDirectory;
    }
    
    public void addNewEvent(String email, Event p)
   {
       
       ArrayList<Event> perArr = eventDirectory.get(email);
       
       if(null != perArr)
       {
           perArr.add(p);
       this.eventDirectory.put(email,perArr);
       }
       else
       {
           ArrayList<Event> per =new ArrayList<Event>();
           per.add(p);
           this.eventDirectory.put(email,per);
       }
       
       
   }
    public void deleteObject(Event p)
   {
        eventDirectory.get(p.getContact()).remove(p);

        
   }
}

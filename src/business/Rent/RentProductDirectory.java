/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Rent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mayurimore
 */
public class RentProductDirectory {
    private  Map<String,ArrayList<RentProduct>> rentProductDirectory;
    
    public RentProductDirectory()
    {
        this.rentProductDirectory=new HashMap<String,ArrayList<RentProduct>>();
    }

    public Map<String, ArrayList<RentProduct>> getRentProductDirectory() {
        return rentProductDirectory;
    }

    public void setRentProductDirectory(Map<String, ArrayList<RentProduct>> rentProductDirectory) {
        this.rentProductDirectory = rentProductDirectory;
    }
    
    public void addNewRentProduct(String email, RentProduct p)
   {
       ArrayList<RentProduct> perArr = rentProductDirectory.get(email);
       if(null != perArr)
       {
           perArr.add(p);
       this.rentProductDirectory.put(email,perArr);
       }
       else{
       ArrayList<RentProduct> per = new ArrayList<RentProduct>();
       per.add(p);
       this.rentProductDirectory.put(email,per);
       }
       
   }
    
    public void deleteObject(RentProduct p)
   {
        rentProductDirectory.get(p.getContact()).remove(p);

        
   }
   
    
}

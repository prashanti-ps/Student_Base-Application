/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Purchase;

import business.student.accomodation.Permanent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mayurimore
 */
public class PurchaseDirectory {
    private  Map<String,ArrayList<Purchase>> purchaseDirectory;
    
    public PurchaseDirectory()
    {
        this.purchaseDirectory=new HashMap<String,ArrayList<Purchase>>();
    }

    public Map<String, ArrayList<Purchase>> getPurchaseDirectory() {
        return purchaseDirectory;
    }

    public void setPurchaseDirectory(Map<String, ArrayList<Purchase>> purchaseDirectory) {
        this.purchaseDirectory = purchaseDirectory;
    }
    
    public void addNewPurchaseProduct(String email, Purchase p)
   {
       ArrayList<Purchase> perArr = purchaseDirectory.get(email);
       if(null != perArr)
       {
           perArr.add(p);
       this.purchaseDirectory.put(email,perArr);
       }
       else{
       ArrayList<Purchase> per = new ArrayList<Purchase>();
       per.add(p);
       this.purchaseDirectory.put(email,per);
       }
       
   }

    
    public void deleteObject(Purchase p)
   {
        purchaseDirectory.get(p.getContact()).remove(p);

        
   }
   
}

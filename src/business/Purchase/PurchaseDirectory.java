/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Purchase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mayurimore
 */
public class PurchaseDirectory {
    private Map<String,ArrayList<Purchase>> purchaseDirectory;
    
    public PurchaseDirectory()
    {
        this.purchaseDirectory=new HashMap<String,ArrayList<Purchase>>();
    }

    public Map<String, ArrayList<Purchase>> getPurchaseDirectory() {
        return purchaseDirectory;
    }

    public void setPurchaseDirectory(Map<String, ArrayList<Purchase>> permanentDirectory) {
        this.purchaseDirectory = permanentDirectory;
    }
    
    public void addNewPurchaseProduct(String email, Purchase p)
   {
       ArrayList<Purchase> purchaseArr = new ArrayList<Purchase>();
       purchaseArr.add(p);
       this.purchaseDirectory.put(email,purchaseArr);
       
   }
   
}

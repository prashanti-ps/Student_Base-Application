/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.FAQ;

import java.util.ArrayList;

/**
 *
 * @author mayurimore
 */
public class FAQDirectory {
    private ArrayList<FAQ> faqDirectory;
    
    public FAQDirectory()
    {
        this.faqDirectory=new ArrayList<FAQ>();
    }

    public ArrayList<FAQ> getFaqDirectory() {
        return faqDirectory;
    }

    public void setFaqDirectory(ArrayList<FAQ> faqDirectory) {
        this.faqDirectory = faqDirectory;
    }
    
    public FAQ addNewFAQ(FAQ p)
   {
      
        faqDirectory.add(p);
        return p;
       }
    
    public void deleteCar(FAQ p){
        faqDirectory.remove(p);
    }
    
    
}

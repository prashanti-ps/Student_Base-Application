/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.FAQ;

/**
 *
 * @author mayurimore
 */
public class FAQ {
    
    private String category;
    private String FAQlink;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFAQlink() {
        return FAQlink;
    }

    public void setFAQlink(String FAQlink) {
        this.FAQlink = FAQlink;
    }
    
    @Override
    public String toString(){
        return category;
    }
    
}

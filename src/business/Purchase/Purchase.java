/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Purchase;

import java.awt.image.BufferedImage;

/**
 *
 * @author mayurimore
 */
public class Purchase {
    private String productName;
    private String price;
    private String Category;
    private String quantity;
    private String contidion;
    private String contactEmail;
    private String status;
    private String comment;
    private String report;
    private BufferedImage productImage;

    public BufferedImage getProductImage() {
        return productImage;
    }

    public void setProductImage(BufferedImage productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getContidion() {
        return contidion;
    }

    public void setContidion(String contidion) {
        this.contidion = contidion;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
    
}

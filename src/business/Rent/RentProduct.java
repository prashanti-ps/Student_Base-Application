/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Rent;

/**
 *
 * @author mayurimore
 */
public class RentProduct {
    
    private String productName;
    private int price;
    private String Category;
    private int quantity;
    private String contidion;
    private String contactEmail;
    private String status;
    private String comment;
    private String report;
    private String productImage;
    private String Address;
    private String StatusOfProduct;
    private String BuyRequests;
    private String contact;
    private int AvailibilityPeriod;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getStatusOfProduct() {
        return StatusOfProduct;
    }

    public void setStatusOfProduct(String StatusOfProduct) {
        this.StatusOfProduct = StatusOfProduct;
    }

    public String getBuyRequests() {
        return BuyRequests;
    }

    public void setBuyRequests(String BuyRequests) {
        this.BuyRequests = BuyRequests;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getAvailibilityPeriod() {
        return AvailibilityPeriod;
    }

    public void setAvailibilityPeriod(int AvailibilityPeriod) {
        this.AvailibilityPeriod = AvailibilityPeriod;
    }
    
    @Override
    public String toString(){
        return this.productName;
    }
    
}

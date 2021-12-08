/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.useraccount.UserAccountDirectory;
import java.util.ArrayList;
import business.role.Role;
import business.admin.AdminDirectory;
import business.complaintManagement.ComplaintManagerDirectory;
import business.student.accomodation.PermanentDirectory;
import business.student.accomodation.TemporaryDirectory;

/**
 *
 * @author prashantii_s
 */
public abstract class Organization {
    

    private String name;
    //private WorkQueue workQueue;
    private AdminDirectory adminDirectory;
    private ComplaintManagerDirectory complaintManagerDirectory;
    private UserAccountDirectory userAccountDirectory;
    private TemporaryDirectory temporaryDirectory;
    private PermanentDirectory permanentDirectory;
//    private CustomerDirectory customerDirectory;
//    private DeliveryManDirectory deliveryManDirectory;
//    private RestaurantDirectory restaurantDirectory;
//    private MenuDirectory itemList;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
         Student("Student"),
        ComplaintManager("ComplaintManager"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        //workQueue = new WorkQueue();
        adminDirectory = new AdminDirectory();
        complaintManagerDirectory= new ComplaintManagerDirectory();
        userAccountDirectory = new UserAccountDirectory();
        temporaryDirectory = new TemporaryDirectory();
        permanentDirectory = new PermanentDirectory();
//        customerDirectory = new CustomerDirectory();
//        deliveryManDirectory = new DeliveryManDirectory();
//        restaurantDirectory = new RestaurantDirectory();
//        itemList = new MenuDirectory();
        organizationID = counter;
        ++counter;
    }

    public ComplaintManagerDirectory getComplaintManagerDirectory() {
        return complaintManagerDirectory;
    }

    public void setComplaintManagerDirectory(ComplaintManagerDirectory complaintManagerDirectory) {
        this.complaintManagerDirectory = complaintManagerDirectory;
    }

    public TemporaryDirectory getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public void setTemporaryDirectory(TemporaryDirectory temporaryDirectory) {
        this.temporaryDirectory = temporaryDirectory;
    }

    public PermanentDirectory getPermanentDirectory() {
        return permanentDirectory;
    }

    public void setPermanentDirectory(PermanentDirectory permanentDirectory) {
        this.permanentDirectory = permanentDirectory;
    }

//    public CustomerDirectory getCustomerDirectory() {
//        return customerDirectory;
//    }
//
//    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
//        this.customerDirectory = customerDirectory;
//    }
//
//    public DeliveryManDirectory getDeliveryManDirectory() {
//        return deliveryManDirectory;
//    }
//
//    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
//        this.deliveryManDirectory = deliveryManDirectory;
//    }
//
//    public RestaurantDirectory getRestaurantDirectory() {
//        return restaurantDirectory;
//    }
//
//    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
//        this.restaurantDirectory = restaurantDirectory;
//    }
//
//    public MenuDirectory getItemList() {
//        return itemList;
//    }
//
//    public void setItemList(MenuDirectory itemList) {
//        this.itemList = itemList;
   // }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public AdminDirectory getAdminDirectory() {
        return adminDirectory;
    }
 
    public String getName() {
        return name;
    }

//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setWorkQueue(WorkQueue workQueue) {
//        this.workQueue = workQueue;
//    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}

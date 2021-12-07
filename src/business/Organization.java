/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.useraccount.UserAccountDirectory;
import java.util.ArrayList;
import business.role.Role;
import business.user.User;
import business.user.UserDirectory;

/**
 *
 * @author prashantii_s
 */
public abstract class Organization {
    

    private String name;
    //private WorkQueue workQueue;
    private UserDirectory userDirectory;
    private UserAccountDirectory userAccountDirectory;
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
        userDirectory = new UserDirectory();
        userAccountDirectory = new UserAccountDirectory();
//        customerDirectory = new CustomerDirectory();
//        deliveryManDirectory = new DeliveryManDirectory();
//        restaurantDirectory = new RestaurantDirectory();
//        itemList = new MenuDirectory();
        organizationID = counter;
        ++counter;
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

    public UserDirectory getUserDirectory() {
        return userDirectory;
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

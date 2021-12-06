/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.role.AdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author prashantii_s
 */
public class EcoSystem extends Organization{
    
    
    private static EcoSystem business;
//    private RestaurantDirectory restaurantDirectory;
//    private CustomerDirectory customerDirectory;
//    private DeliveryManDirectory deliveryManDirectory;
//    private WorkQueue workQueue;
    public EcoSystem(//RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory
    ) 
            {

//        this.restaurantDirectory = restaurantDirectory;
//        this.customerDirectory = customerDirectory;
//        this.deliveryManDirectory = deliveryManDirectory;
//        this.workQueue = workQueue;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminRole());
        return roleList;
    }
   // private EcoSystem(){
        //super(null);
       // networkList=new ArrayList<Network>();
    //}

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
    
}

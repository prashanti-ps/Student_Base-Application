/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Purchase.PurchaseDirectory;
import business.role.AdminRole;
import business.role.Role;
import business.student.accomodation.PermanentDirectory;
import business.student.accomodation.TemporaryDirectory;
import business.student.registration.StudentDirectory;
import java.util.ArrayList;

/**
 *
 * @author prashantii_s
 */
public class EcoSystem extends Organization{
    
    
    private static EcoSystem business;
    private TemporaryDirectory temporaryDirectory;
    private PermanentDirectory permanentDirectory;
    private StudentDirectory studentDirectory;
    private PurchaseDirectory purchaseDirectory;

    public EcoSystem( TemporaryDirectory temporaryDirectory, PermanentDirectory permanentDirectory, StudentDirectory studentDirectory, PurchaseDirectory purchaseDirectory)
    {

        this.temporaryDirectory = temporaryDirectory;
        this.permanentDirectory = permanentDirectory;
        this.studentDirectory=studentDirectory;
        this.purchaseDirectory = purchaseDirectory;
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
   private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
    
}

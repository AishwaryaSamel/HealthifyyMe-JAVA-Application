/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.Items;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Store.StoreDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Store.Store;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private CustomerRequestDirectory customerRequestDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private Store storeDirectory;
    
    private EcoSystem(){
        super(null);
        customerRequestDirectory = new CustomerRequestDirectory();
        enterpriseDirectory=new EnterpriseDirectory();
        networkList=new ArrayList<Network>();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public static EcoSystem getBusiness() {
        return business;
    }
    public CustomerRequestDirectory getCustomerRequestDirectory() {
        return customerRequestDirectory;
    }

    public void setCustomerRequestDirectory(CustomerRequestDirectory customerRequestDirectory) {
        this.customerRequestDirectory = customerRequestDirectory;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public void removeNetwork(Network network){
        networkList.remove(network);
        //return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}

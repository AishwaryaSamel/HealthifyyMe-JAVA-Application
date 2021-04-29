 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Store.StoreDirectory;
import java.util.ArrayList;

/**
 *
 * @author aishwaryasamel
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private StoreDirectory storeDirectory;
    private ArrayList<Items> itemsList;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    public StoreDirectory getStoreDirectory() {
        return storeDirectory;
    }
    public enum EnterpriseType{
        DietUnit("Diet Unit"),
        TrainerUnit("Trainer Unit"),
        DoctorUnit("Doctor Unit"),
        StoreUnit("Store Unit");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public ArrayList<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        this.itemsList =new ArrayList<>();
        organizationDirectory=new OrganizationDirectory();
    }
    public Items createMenuItem(){
        Items item = new Items(); 
        this.itemsList.add(item);
        return item;
}
      
    
     public void deleteItem(Items item){
        itemsList.remove(item); 
    }
      
}

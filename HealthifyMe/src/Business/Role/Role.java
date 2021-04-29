/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Customer("Customer"),
        Doctor("Doctor"), /*TBR*/
        DoctorAdmin("Doctor Admin"),
        TrainerAdmin("Trainer Admin"),
        DietAdmin("Diet Admin"),
        Nutritionist("Nutritionist"),
        Dietician("Dietician"),
        GeneralPhysician("General Physician"),
        Physiotherapist("Physiotherapist"),
        StoreManager("Store Manager"),
        DeliveryMan("Delivery Man"),
        FitnessTrainer("Fitness Trainer"),
        WeightTrainer("Weight Trainer");
               
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,  
            Enterprise enterprise, 
            Organization organization,
            UserAccount account, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
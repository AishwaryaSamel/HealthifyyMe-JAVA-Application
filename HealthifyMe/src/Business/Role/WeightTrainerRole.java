/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.WeightTrainingOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.WeightTrainerRole.WeightTrainerWorkAreaJPanel;
//import userinterface.WeightTrainer.WeightTrainerWorkAreaJPanel;

/**
 *
 * @author aishwaryasamel
 */
public class WeightTrainerRole extends Role {
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        
        return new WeightTrainerWorkAreaJPanel(userProcessContainer, enterprise, organization, account, business, network);
    }
    
}

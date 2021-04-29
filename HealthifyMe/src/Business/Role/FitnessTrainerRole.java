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
import Business.Organization.FitnessTrainingOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FitnessTrainerRole.FitnessTrainerWorkAreaJPanel;

/**
 *
 * @author aishwaryasamel
 */
public class FitnessTrainerRole extends Role {
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        return new FitnessTrainerWorkAreaJPanel(userProcessContainer, enterprise, organization, account, business, network);
    }
    
}

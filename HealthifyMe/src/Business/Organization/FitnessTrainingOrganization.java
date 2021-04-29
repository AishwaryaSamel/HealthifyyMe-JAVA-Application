/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FitnessTrainerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aishwaryasamel
 */
public class FitnessTrainingOrganization extends Organization {
    public FitnessTrainingOrganization() {
        super(Organization.Type.FitnessTraining.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FitnessTrainerRole());
        return roles;
    }
    
}

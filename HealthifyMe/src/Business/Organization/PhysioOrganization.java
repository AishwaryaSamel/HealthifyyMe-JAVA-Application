/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.PhysiotherapistRole;
import java.util.ArrayList;

/**
 *
 * @author aishwaryasamel
 */
public class PhysioOrganization extends Organization{
    public PhysioOrganization() {
        super(Organization.Type.Physiotherapist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PhysiotherapistRole());
        return roles;
    }
}

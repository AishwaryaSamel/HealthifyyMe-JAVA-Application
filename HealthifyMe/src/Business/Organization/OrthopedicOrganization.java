/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OrthopedicRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author risha
 */
public class OrthopedicOrganization extends Organization {
    public OrthopedicOrganization() {
        super(Type.Orthopedic.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OrthopedicRole());
        return roles;
    }
    
}

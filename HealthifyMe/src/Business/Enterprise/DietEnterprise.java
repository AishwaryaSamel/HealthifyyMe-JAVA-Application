/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aishwaryasamel
 */
public class DietEnterprise extends Enterprise {
    
    public DietEnterprise(String name){
        super(name,EnterpriseType.DietUnit);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

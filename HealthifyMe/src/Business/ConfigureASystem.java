package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
   
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
//        system.createAndAddNetwork().setName("Boston");
//        system.createAndAddNetwork().setName("Atlanta");
//        
//        for(Network n : system.getNetworkList()){
//            System.out.println(n.getEnterpriseDirectory().createAndAddEnterprise("Diet", Enterprise.EnterpriseType.Diet));
//            n.getEnterpriseDirectory().createAndAddEnterprise("Gym", Enterprise.EnterpriseType.Gym);
//            n.getEnterpriseDirectory().createAndAddEnterprise("Doctor", Enterprise.EnterpriseType.Doctor);
//            n.getEnterpriseDirectory().createAndAddEnterprise("Store", Enterprise.EnterpriseType.Store);
//        }
//        
        
        
        
        
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}

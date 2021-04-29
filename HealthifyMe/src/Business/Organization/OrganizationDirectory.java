/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author aishwaryasamel
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        /*if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new DeliveryOrganisation();
            organizationList.add(organization);
        }*/
         if (type.getValue().equals(Type.Nutrition.getValue())){
            organization = new NutritionOrganization();
            organizationList.add(organization);
        }
         /*TBD*/
         else if (type.getValue().equals(Type.Orthopedic.getValue())){
            organization = new OrthopedicOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.WeightTraining.getValue())){
            organization = new WeightTrainingOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FitnessTraining.getValue())){
            organization = new FitnessTrainingOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Physiotherapist.getValue())){
            organization = new PhysioOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.GeneralPractitioner.getValue())){
            organization = new GenPracOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Store.getValue())){
            organization = new StoreOrganization();
            organizationList.add(organization);
        }
         /*TBD*/
         else if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}
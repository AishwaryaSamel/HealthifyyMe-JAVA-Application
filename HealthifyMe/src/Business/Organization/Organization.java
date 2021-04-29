/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aishwaryasamel
 */
public abstract class Organization {

    public String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private CustomerDirectory customerDirectory;
    private int organizationID;
   private int min = 1000;
    private int max = 9999;
    private static int count = 0;

    
    public enum Type{
        Admin("Admin Organization"), 
        Nutrition("Nutrition Organization"), 
        Dietitian("Dietitian Organization"),
        WeightTraining("Weight Training"),
        FitnessTraining("Fitness Training"),
        Physiotherapist("Physiotherapist"),
        GeneralPractitioner("General Practitioner"),
        Orthopedic("Orthopedic Doctor"),
        Store("Store"),
        Delivery("DeliveryMan"),
        Lab("Lab Organization"),
        Doctor("Doctor Organisation");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        customerDirectory = new CustomerDirectory();
          Random r = new Random();
        count = r.nextInt(max-min) + min;
        organizationID = count;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}

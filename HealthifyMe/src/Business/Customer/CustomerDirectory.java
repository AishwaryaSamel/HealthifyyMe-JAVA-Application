/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author aishwaryasamel
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer createCustomer(Customer customer){
        //Customer customer = new Customer();
        //customer.setName(name);
        customerList.add(customer);
        return customer;
    }
    
    public void removeCustomer(Customer c){
        customerList.remove(c);
    }
    
    public boolean checkIfUsernameIsUnique(String email){
        for (Customer e : customerList){
            if (e.getEmail().equals(email))
                return false;
        }
        return true;
    }
       public Customer updateCustomer(Customer cus, String name, Double height, Double weight, String gender, int age, String address, String city, String zipcode, Boolean none,Boolean diabetes,Boolean cholestrol,Boolean hyper, Boolean pcos, Boolean thyroid){
        cus.setName(name);
        cus.setHeight(height);
        cus.setWeight(weight);
        cus.setGender(gender);
        cus.setAge(age);
        cus.setAddress(address);
        cus.setCity(city);
        cus.setZipcode(zipcode);
        cus.setNone(none);
        cus.setDiabetes(diabetes);
        cus.setThyroid(thyroid);
        cus.setHypertension(hyper);
        cus.setPcos(pcos);
        cus.setCholestrol(cholestrol);
        
        return cus;
    } 
    
}

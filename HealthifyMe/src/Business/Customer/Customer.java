/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Network.Network;
import java.util.Random;

/**
 *
 * @author aishwaryasamel
 */
public class Customer {
    
    private String name;
    private int id;
    private int age;
    private double height;
    private double weight;
    private double BMI;
    private String gender;
    private static int count = 0;
    private Network network;
    private String enterprise;
     private Boolean none;
    private Boolean diabetes;
    private Boolean cholestrol;
    private Boolean hypertension;
    private Boolean pcos;
    private Boolean thyroid;
    private String goal;
    private String email;
    private String address;
    private String city;
    private String zipcode;
    private int min = 1000;
    private int max = 9999;

    public Customer() {
        Random r = new Random();
        count = r.nextInt(max-min) + min;
        id = count;
    }

    public int getId() {
        return id;
    }

    public double getHeight() {
        return height;
    }

    public Network getNetwork() {
        return network;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }
    
    

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
    
    

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public Boolean getNone() {
        return none;
    }

    public void setNone(Boolean none) {
        this.none = none;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public Boolean getCholestrol() {
        return cholestrol;
    }

    public void setCholestrol(Boolean cholestrol) {
        this.cholestrol = cholestrol;
    }

    public Boolean getHypertension() {
        return hypertension;
    }

    public void setHypertension(Boolean hypertension) {
        this.hypertension = hypertension;
    }

    public Boolean getPcos() {
        return pcos;
    }

    public void setPcos(Boolean pcos) {
        this.pcos = pcos;
    }

    public Boolean getThyroid() {
        return thyroid;
    }

    public void setThyroid(Boolean thyroid) {
        this.thyroid = thyroid;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
   
    
    @Override
    public String toString() {
        return name;
    }
    
}

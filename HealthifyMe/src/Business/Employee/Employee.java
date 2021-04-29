/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.Random;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private int id;
    private int min = 1000;
    private int max = 9999;
    private static int count = 0;

    public Employee() {
         Random r = new Random();
        count = r.nextInt(max-min) + min;
        id = count;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}

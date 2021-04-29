/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @Sriram
 */
public class CustomerRequestDirectory {
     private ArrayList<CustomerRequestOrder> cusReqOrderList;

    public CustomerRequestDirectory() {
        cusReqOrderList = new ArrayList();
    }

    public ArrayList<CustomerRequestOrder> getCusReqOrderList() {
        return cusReqOrderList;
    }

    public void setCusReqOrderList(ArrayList<CustomerRequestOrder> cusReqOrderList) {
        this.cusReqOrderList = cusReqOrderList;
    } 

     public CustomerRequestOrder createOrder(){
        CustomerRequestOrder order = new CustomerRequestOrder(); 
        cusReqOrderList.add(order);
        return order;
    }
     
      public void deleteOrder(CustomerRequestOrder order){
        cusReqOrderList.remove(order); 
    }
      /*public CustomerRequestOrder searchOrder(String enterpriseName){
        for (CustomerRequestOrder order: cusReqOrderList) {
            if (order.getRestaurantName().equalsIgnoreCase(enterpriseName)) {
                return order;
            }
        }
        return null;
      }
      public Order updateOrder(Order order, String name, String address){
             order.setRestaurantName(name);
             return order;
         }*/
}

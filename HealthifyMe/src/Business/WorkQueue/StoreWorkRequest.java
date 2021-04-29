/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Items;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author risha
 */
public class StoreWorkRequest extends WorkRequest {
    
    private ArrayList<Items> cusList;
    private String cusMessage;
    private int totalBill=0;

    public StoreWorkRequest() {
        
    
    } 
    public ArrayList<Items> getCusList() {
        return cusList;
    }

    public void setCusList(ArrayList<Items> cusList) {
        this.cusList = cusList;
    }

    public String getCusMessage() {
        return cusMessage;
    }

    public void setCusMessage(String cusMessage) {
        this.cusMessage = cusMessage;
    }
    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
    
    
    
}

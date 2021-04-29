/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Store;
import java.util.ArrayList;

/**
 *
 * @author risha
 */
public class StoreDirectory {
    private ArrayList<Store> storeList;
    
    public StoreDirectory() {
        storeList = new ArrayList();
    }
    
    public ArrayList<Store> getStoreList() {
        return storeList;
    }
    
    public Store createItem(Store store){
        storeList.add(store);
        return store;
    }
    
    public Store updateItem(Store store,String itemName,String itemType, int price){
        store.setItemName(itemName);
        store.setItemType(itemType);
        store.setPrice(price);
        return store;
    }
}

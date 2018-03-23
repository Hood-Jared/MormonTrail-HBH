/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.controller;

import mormontrail.exception.InventoryControlException;
import mormontrail.exception.InventoryItemsException;

/**
 *
 * @author jared
 */
public class InventoryItems {



 
    void setDescription(String food) throws InventoryItemsException {
        throw new InventoryItemsException("Invalid Input.");
        }

    void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRequiredAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.exception;

/**
 *
 * @author jared
 */
public class InventoryItemsException extends Exception {
    
    public InventoryItemsException(String message){
        super(message);
    
    }
  
    public InventoryItemsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryItemsException(Throwable cause) {
        super(cause);
    }
    
  
    }


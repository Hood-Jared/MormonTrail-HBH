/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception.exception;

/**
 *
 * @author Chaskiel
 */
public class InventoryItemsException extends Exception {

    public InventoryItemsException() {
    }

    public InventoryItemsException(String string) {
        super(string);
    }

    public InventoryItemsException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public InventoryItemsException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}

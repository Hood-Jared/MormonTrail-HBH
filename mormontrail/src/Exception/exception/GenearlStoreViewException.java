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
public class GenearlStoreViewException extends Exception {

    public GenearlStoreViewException() {
    }

    public GenearlStoreViewException(String string) {
        super(string);
    }

    public GenearlStoreViewException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public GenearlStoreViewException(Throwable thrwbl) {
        super(thrwbl);
    }

    public GenearlStoreViewException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}

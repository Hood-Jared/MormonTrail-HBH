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
public class RiverCrossingControllerException extends Exception {

    public RiverCrossingControllerException() {
    }

    public RiverCrossingControllerException(String string) {
        super(string);
    }

    public RiverCrossingControllerException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public RiverCrossingControllerException(Throwable thrwbl) {
        super(thrwbl);
    }

    public RiverCrossingControllerException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}

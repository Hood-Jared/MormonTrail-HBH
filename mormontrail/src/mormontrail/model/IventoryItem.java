/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author jared
 */
public class IventoryItem implements Serializable{

    static String invItem1;
    static String invItem2;
    static String invItem3;
    static String invItem4;
    static int qtyMoney;
    static int qtyWagonWheel;
    static int qtyAmmo;
    static int qtyFood;
    
    
    
    public static void main(String[] args) {
        
        invItem1 = "Wagon Wheel(s)";
        invItem2 = "Pounds of Food Stuff";
        invItem3 = "Money";
        invItem4 = "Ammo";
        
       
    
    }
    @Override
    public int hashCode(){
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(invItem4);
    return qtyAmmo;
    }
}
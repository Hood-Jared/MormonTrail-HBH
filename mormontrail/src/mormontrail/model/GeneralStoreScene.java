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

public class GeneralStoreScene implements Serializable{
 
    static String gralItem1;  
    static int qtyGralItem1;
    static int qtyCostItem1;
    static String gralItem2;  
    static int qtyGralItem2;
    static int qtyCostItem2;
    static String gralItem3;  
    static int qtyGralItem3;
    static int qtyCostItem3;
    
    
 public static void main(String[] args) {
     
      gralItem1 = "Food Stuffs";  
      gralItem2 = "Wagon Wheels";  
      gralItem3 = "Ammo";  
      
    }
 
    @Override
    public String toString() {
        return gralItem3 + "Costs $5 per 50 shells";
    
}
}
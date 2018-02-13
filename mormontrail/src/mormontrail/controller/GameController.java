/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.controller;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author jared
 */

public class GameController implements Serializable{
    
   
    
    
  public int calcDailyFoodUsage(int amount,int noPeople)  {
            
   if (amount < 3 || amount > 5) 
   return -1;
   
   if (noPeople < 1 || noPeople > 5) 
   return -1;
   
   return amount * noPeople; 
   
}
           
        
           
        
            
    
}
    


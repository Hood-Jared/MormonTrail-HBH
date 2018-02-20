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
 * @author jared, heather, chas
 */

public class GameController implements Serializable{
    
   
    
    
  public static int calcDailyFoodUsage(int amount,int noPeople)  {
  
 /*calcDailyFoodUsage(noPeople, amount): int 
 
BEGIN 
 
 IF (noPeople < 1 OR noPeople > 5) THEN   RETURN -1 
 
 IF (amount < 3 OR amount > 5) THEN   RETURN -1 
 
 consumption = (amount * noPeople) 
 
 RETURN consumption 
 
END */
            
   if (amount < 3 || amount > 5) 
   return -1;
   
   if (noPeople < 1 || noPeople > 5) 
   return -1;
   
   return amount * noPeople; 
   
}
  
  public static int calcDailyTravel(int pace,int oxenStamina) {
		  
		  /* calcDailyTravel(pace, oxenStamina): int
				BEGIN
					IF (pace < 2 OR pace > 4) THEN RETURN -1
					IF (oxenStamina < 3 OR oxenStamina > 5) THEN RETURN -1
					RETURN pace*oxenStamina
				END */
		if (pace < 2 || pace > 4)
			return -1;
		if (oxenStamina < 3 || oxenStamina > 5)
			return -1;
		return pace * oxenStamina;
		
  }
           
        
           
        
            
    
}
    


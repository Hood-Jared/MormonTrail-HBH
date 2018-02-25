/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.controller;
import java.io.Serializable;
import java.util.Objects;
import mormontrail.model.Player;
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

	public static Player savePlayer(String playersName) {
			/* savePlayer(name): Player
			BEGIN
			if name is null OR length of name is < 1 THEN
			RETURN null
			ENDIF
			player = new Player object
			save the name in the player object
			save the player in the main class of the project
			RETURN player
			END */
		int length = playersName.length();
		if (playersName == null || length < 1) {
			return null;
		}	
		Player player = new Player();
		
		System.out.println("*** savePlayer()called ***");
		return new Player();
	}
           
       
        public static void displayGameController(){
		System.out.println("*** createNewGame called ***");
            
        }

    public static void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
      public static Player getPlayer() {
		System.out.println("*** getPlayer()called ***");
      return null;
	
	}  

    public static void createNewGame(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
    


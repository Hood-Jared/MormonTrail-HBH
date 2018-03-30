/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static mormontrail.Mormontrail.getCurrentGame;
import mormontrail.controller.GameController;
import mormontrail.exception.GameControllerException;
import mormontrail.model.Game;

/**
 *
 * @author Chaskiel
 */
class SaveMenuView extends View {
    
   
    public String getInput() {
         String input = "";
          
        console.println("push S to save the game");
        
        console.println("choose a spot to save at. ");
        try {
            input = keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(SaveMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return input;
         }
        
    
    
   
    @Override
    public boolean doAction(String value) {
    
       
       Game game = getCurrentGame();
       
       try {
           GameController.saveGame(game, value);
                       
             
       }
        catch (IOException ex){
            console.println(ex.getMessage());
            
            return false; 
        }
        catch (GameControllerException ex){
            console.println(ex.getMessage());
            
            return false; 
        }
       
       console.println("saved file to " + value);
        return true;
        
    }
        
        
        
       


    }




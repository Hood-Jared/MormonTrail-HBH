/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;

import mormontrail.model.Game;

/**
 *
 * @author Chaskiel
 */
class SaveMenuView extends View{
    
   
    private String[] getInputs() {
         String[] inputs = new String[1];   
          
        console.println("push S to save the game");
        
        console.println("choose a spot to save at. ");
        inputs[0]=getInput();
         
        return inputs;
         }
        
    
    
    
    @Override
    private boolean doAction(String[] inputs) {
      String filePath = inputs[0];
        char charSel = value.charAt(0);
       Game game = getCurrentGame();
       
       try {
             
       }
          
}



}
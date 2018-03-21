/*
 * To change = this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;
import Exception.exception.GenearlStoreViewException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import mormontrail.controller.GameController;
import mormontrail.view.StartProgramView;
import mormontrail.model.Player;


/**
 *
 * @author jared
 */

public class GeneralStoreView extends View{ 

public GeneralStoreView(){
 
            super("\n"
                + "Welcome to the General Store"
                + "\nF - Purchase Food "
                + "\nA - Purchase 50 rounds of Ammo"
                + "\nW - Purchase Wagon Wheel"
                + "\nE - Exit"
                 + "\n");
			
}
  public boolean doAction(String selection) {
    

        char charSel = selection.charAt(0);
		
        switch (charSel) {
           case 'F':
        {
            try {
                this.addInventoryFood();
            } catch (GenearlStoreViewException ex) {
                Logger.getLogger(GeneralStoreView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 'A':
                addInventoryAmmo();
                break;
            case 'W':
		addInventoryWheel();
                break;
            case 'E':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    
}

    private static int addInventoryFood() throws GenearlStoreViewException{
       
    
        System.out.println("How Many Pounds of Food do you want to Purchase?");
            
            Scanner input = new Scanner(System.in); 
           
    
            String sc = "";


        int amount = Integer.parseInt(sc);
               
         if (amount <= 100 || amount >= 5000){
                
            return amount;
            }
                
            else {
                System.out.println("Input is invalid - Please choose at least 100 lbs");
            }  
         
   throw new GenearlStoreViewException("choose a number between 100 to 5000.");
             
                  
    }       
    
        
    

    private void addInventoryAmmo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void addInventoryWheel() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

 }


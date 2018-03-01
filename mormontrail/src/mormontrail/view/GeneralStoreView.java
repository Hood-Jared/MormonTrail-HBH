/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;
import java.util.Scanner;
import mormontrail.controller.GameController;
import mormontrail.view.StartProgramView;
import mormontrail.model.Player;


/**
 *
 * @author jared
 */

public class GeneralStoreView { 


public boolean GeneralStoreMenu(){
 
   
        System.out.println("\nWelcome to the General Store"
                     + "\nF - Purchase Food "
                     + "\nA - Purchase 50 rounds of Ammo"
                     + "\nW - Purchase Wagon Wheel"
                     + "\nE - Exit"
                     + "\n");
		
		return true;
    
}


  public boolean doAction(String selection, Inventory inventory) {
			

        char charSel = selection.charAt(0);
		

        switch (charSel) {
            case 'F':
                this.addInventoryFood();
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

    private static int addInventoryFood() {
       
    
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
             
                  
        }
       
        
    

    private void addInventoryAmmo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void addInventoryWheel() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static class Inventory {

        public Inventory() {
        }
    }
}

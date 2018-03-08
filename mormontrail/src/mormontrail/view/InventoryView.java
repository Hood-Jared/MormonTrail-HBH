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
public class InventoryView extends View{ 

    private void showInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sellInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
public InventoryView() {
        super("\nInventory Menu"
            + "\nV - View Inventory"
            + "\nS - Sell Inventory"
            + "\nQ - Quit"
            + "\n");
        
 }
    @Override
    public boolean doAction(String selection) {
        
      
        char charSel = selection.charAt(0);
		
        switch (charSel) {
           case 'V':
                this.showInventory();
                break;
            case 'S':
                this.sellInventory();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }
       
        
			
}

        
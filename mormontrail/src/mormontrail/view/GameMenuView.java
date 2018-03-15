package mormontrail.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chaskiel
 */
public class GameMenuView extends View  {
    public GameMenuView() {
		super("\n HELP MENU"
			 + "\n V - View map"
			 + "\n I - View list of items in inventory"
			 + "\n L - View location"
                         + "\n M - Move Location"
                         + "\n H - Help"
                         + "\n Q - Quit"
			 + "\n"); 
	}

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        char charSel = value.charAt(0);
       
    
         
           switch (charSel) {

               /* case 'V': 
                   ViewMap viewMap = new ViewMap();
                   viewMap.display();
                   break;*/
                case 'I':
                    InventoryView inventoryView = new InventoryView();
                    inventoryView.display();
                    break;
                /*case 'L':
                   LocationView locationView = new LocationView();
                    locationView.display();
                    break;*/
                case 'H':
                    HelpMenuView helpMenuView = new HelpMenuView();
                    helpMenuView.display();
                    break;

                
                
                
            default:
                System.out.println("Invalid Input! - Please try again.");
                break;
            }
     return false;
             }
	
    }


	
	
package mormontrail.view;

import static mormontrail.Mormontrail.getCurrentGame;
import mormontrail.model.Game;
import mormontrail.model.Location;

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
                    
                case 'V':
                    this.displayMap();
                    break;

                
                
                
            default:
                System.out.println("Invalid Input! - Please try again.");
                break;
            }
     return false;
             }
	
             public void displayMap() {
                 System.out.println("display the map");
                 
                 
            Game game = getCurrentGame();
            
           Location[][] locations = game.getMap().getLocations();
                 
                 System.out.println("Im the map");
                 System.out.println("1    2    3    4    5    6    7    8    9    10");
                 
                 for(int i=0;i<10; i++){
                  System.out.println("---------------------------------------------------");
                  System.out.print(i+1);
                  
                  for (int j= 0; j<10;j++){
                      System.out.print("|");
                     Location location = locations [i][j];
                     
                  
                    if(location.isVisited()){
                         System.out.print(" LT ");
                         
                    }
                    else 
                        System.out.print(" ?? ");
                        
                    
                  }
                  System.out.print("|");
                 }
                     
                 
                 
                 
                 System.out.println("---------------------------------------------------");
                 
             }
    
    
    }


	
	
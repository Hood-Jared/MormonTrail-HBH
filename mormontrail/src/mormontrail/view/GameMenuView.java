package mormontrail.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import static mormontrail.Mormontrail.getCurrentGame;
import mormontrail.exception.MapControllerException;
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
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n HELP MENU"
                + "\n V - View map"
                + "\n I - View list of items in inventory"
                + "\n L - View location"
                + "\n M - Move Location"
                + "\n G - Hunting"
                + "\n H - Help"
                + "\n S - Save Current Game"
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

            case 'V': {
                try {
                    this.displayMap();
                } catch (MapControllerException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            case 'M':
                MoveActorView moveActorView = new MoveActorView();
                moveActorView.display();
                break;
                case 'G':
                HuntingView huntingView = new HuntingView();
                huntingView.display();
                break;
                
            case 'S':
                this.saveGame();
                break;

            default:
                ErrorView.display(this.getClass().getName(), "Invalid Input - Please try again.");
                break;
        }
        return false;
    }

    public void displayMap() throws MapControllerException {
        this.console.println("display the map");

        Game game = getCurrentGame();

        Location[][] locations = game.getMap().getLocations();

        this.console.println("Im the map");
        this.console.println("1    2    3    4    5    6    7    8    9    10");

        for (int i = 0; i < 10; i++) {
            this.console.println("---------------------------------------------------");
            this.console.print(i + 1);

            for (int j = 0; j < 10; j++) {
                this.console.print("|");
                Location location = locations[i][j];

                if (location.isVisited()) {
                    this.console.print(" LT ");

                } else {
                    this.console.print(" ?? ");
                }

            }
            this.console.print("|");
        }

        this.console.println("---------------------------------------------------");
    }
        private void saveGame(){
            SaveMenuView saveGameView = new SaveMenuView();
            saveGameView.display();
        }
    

    
}

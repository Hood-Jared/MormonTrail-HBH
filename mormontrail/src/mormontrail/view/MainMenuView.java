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

public class MainMenuView extends View {

    public MainMenuView() {
        super("\nMAIN MENU"
                + "\n I'm here now"
                + "\nN - Start New Game"
                + "\nG - Go to General Store"
                + "\nI - Inventory Menu"
                + "\nR - Restart Saved Game"
                + "\nH - Go to Help Menu"
                + "\nM - Go to game menu view"
                + "\nQ - Quit"
                + "\n");
    }

    /* private boolean displayWelcome() {
		System.out.println  ( "\n*       WELCOME TO THE MORMON TRAIL        *"
                +"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*"
                +"\n*                                          *"
                +"\n*          Get your family ready!          *"
                +"\n*     You're about to embark on a great    *"
                +"\n*       Adventure from start to finish.    *"
                +"\n*  Follow the trail and get thru dangers   *"
                +"\n*        Watch out for Deep Rivers!        *"
                +"\n*      Make sure you have enough food!     *"
                +"\n*  Make sure to rest enough along the way  *"
                +"\n*      and Enjoy life in the valley!       *"
                +"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*" );
		return true;
    } */
 /* private String getPlayerName(String args[]){
        
        boolean isValidName = false;
        String name = "";
   
        //System.out.println("Please enter your name: ");
        
        while(!isValidName){
  
            Scanner input = new Scanner(System.in);
            
            if (input != null ){
                isValidName = true;
                
                
            } else {
                System.out.println("Input is invalid - name must be at least 2 characters");
            }         
        }
        return name;
    } */
 /* private void displayWelcome(String playerName){
        System.out.println("============================");
        System.out.println("Welcome " + playerName + ".");
        System.out.println("Enjoy the game!");
        System.out.println("============================");
    } */
 /* public boolean mainMenuView() {
        System.out.println("\nMAIN MENU"
                     + "\nN - Start New Game"
                     + "\nR - Restart Saved Game"
                     + "\nH - Go to Help Menu"
                     + "\nE - Exit"
                     + "\n");
		
		return true;
    } */
    @Override
    public boolean doAction(String value/*, Player player*/) {

        value = value.toUpperCase();

        char charSel = value.charAt(0);

        switch (charSel) {
            case 'N':
                /*this.startNewGame(player);*/
                break;
            case 'R': // Get a Saved Game
                this.startSavedGame();
                break;
            case 'G':
                getGameMenu();
                break;
            case 'I':
                getInventoryMenu();
                break;
            case 'H':
                getMenu();
                break;
            case 'Q':
                return true;
            case 'M':
                getOtherMap();
                /*this.startNewGame(player);*/
                break;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Input - Please try again.");
                break;
        }
        return false;
    }

    /* public void startNewGame(Player player) {
        
            GameController.createNewGame(GameController.getPlayer());
            GameController.display();
         
    }*/
 /* public void restartGame() {
        
             StartExistingGameView gameMenu = new StartExistingGameView();
        gameMenu.display();
    }*/
    public void getGameMenu() {
        GeneralStoreView gsView = new GeneralStoreView();
        gsView.display();
    }

    public void getMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();

        /* boolean end = false;
		while (!end) {
			HelpMenuView helpMenuView = new HelpMenuView();
			helpMenuView.display();
			end = helpMenuView.doAction(getInput());
		}	*/
    }

    /* @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    private void getOtherMap() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void getInventoryMenu() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
    }

    private void startSavedGame() {
        StartSavedGameView startSavedView = new StartSavedGameView();
        startSavedView.display();
    }
}

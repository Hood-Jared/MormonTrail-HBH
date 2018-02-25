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


public class MainMenuView {

    // Heather's
	void displayMainMenuView() {
		System.out.println("*** displayMainMenuView called ***");
	}
	// End of Heather's
   
            
	private boolean displayWelcome() {
		System.out.println  ("\n       WELCOME TO THE MORMON TRAIL         *"
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
                +"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*");
		return true;
    }
    
    private String getPlayerName(String args[]){
        
        boolean isValidName = false;
        String name = "";
   
        System.out.println("Please enter your name: ");
        
        while(!isValidName){
  
            Scanner input = new Scanner(System.in);
            
            if (input != null ){
                isValidName = true;
                
                
            } else {
                System.out.println("Input is invalid - name must be at least 2 characters");
            }         
        }
        return name;
    }   
    
    private void displayWelcome(String playerName){
        System.out.println("============================");
        System.out.println("Welcome " + playerName + ".");
        System.out.println("Enjoy the game!");
        System.out.println("============================");
    }



	


public MainMenuView() {
        System.out.println("\nMAIN MENU"
                     + "\nN - Start New Game"
                     + "\nR - Restart Saved Game"
                     + "\nH - Go to Help Menu"
                     + "\nE - Exit"
                     + "\n");
    }



    public boolean doAction(String selection, Player player) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'N':
                this.startNewGame(player);
                break;
            case 'R':
                restartGame();
                break;
            case 'H':
                getMenu();
                break;
            case 'E':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }

    public void startNewGame(Player player) {
        
            GameController.createNewGame(GameController.getPlayer());
            GameController.display();
         
    }
    

    public void restartGame() {
        
             StartExistingGameView gameMenu = new StartExistingGameView();
        gameMenu.display();
    }

    public void getMenu() {
        HelpMenuView display = new HelpMenuView();
        display.display();
    }
   
  


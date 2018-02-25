/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;
import java.util.Scanner;
import mormontrail.controller.GameController;
import mormontrail.model.Player;
/**
 *
 * @author heatherholt, Jared
 */
public class MainMenuView {

   
            
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
    
    private String getPlayerName(){
        
        boolean isValidName = false;
        String name = "";
   
        System.out.println("Please enter your name: ");
        
        while(!isValidName){
  
            Scanner input = new Scanner(System.in);
            
            if (input != null && input.length() >= 2){
                isValidName = true;
                name = input;
                
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
        System.println("\nMAIN MENU"
                     + "\nN - Start New Game"
                     + "\nL - Start Saved Game"
                     + "\nH - Help Menu"
                     + "\nE - Exit"
                     + "\n");
    }



    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'N':
                this.startNewGame();
                break;
            case 'R':
                this.restartGame();
                break;
            case 'H':
                this.helpMenu();
                break;
            case 'E':
                return true;
            default:
                System.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }

    private void startNewGame() {
        try {
            GameControl gc = new GameControl();
            gc.createNewGame(Mormontrail.getPlayer());
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        } 
    }
    

    private void startSavedGame() {
        
        this.console.println("\n\nEnter the file path for the file where the game"
                + " was saved.");
        
        String filePath = this.getInput();

        try {
            // start a saved game
            GameControl.getSavedGame(filePath);    
        } 

        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void helpMenu() {
        System.println("HELP MENU CALLED");
        HelpMenuView display = new HelpMenuView();
        display.display();
    }
}


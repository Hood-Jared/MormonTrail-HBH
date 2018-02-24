/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;

/**
 *
 * @author heatherholt, Jared
 */
public class MainMenuView {

}
public MainMenuView() {
        System.println("\nMAIN MENU"
                     + "\nN - Start New Game"
                     + "\nS - Save Game"
                     + "\nL - Start Saved Game"
                     + "\nH - Help Menu"
                     + "\nQ - Quit"
                     + "\n");
    }



    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'N':
                this.startNewGame();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'L':
                this.startSavedGame();
                break;
            case 'H':
                this.helpMenu();
                break;
            case 'Q':
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
    
    private void saveGame() {
        this.System.println("\n\nEnter the file path for the file where the game"
                + " is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(Mormontrail.getCurrentGame(), filePath);
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


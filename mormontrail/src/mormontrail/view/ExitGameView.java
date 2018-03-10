/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;
import java.util.Scanner;
import mormontrail.controller.GameController;
import mormontrail.view.StartProgramView;
/**
 *
 * @author jared
 */
public class ExitGameView extends View {

    public ExitGameView() {
	   super("\nAre you Sure you want to Quit"
	       + "\n If you exit all progress will be lost"
                + "\nE - Exit Game"
                + "\nR - Return to Game"
                + "\n");
    }
    
@Override
public boolean doAction(String selection) {
        
        char charSel = selection.charAt(0);
		
        switch (charSel) {
            case 'E':
                this.endGame();                      
                break;
            case 'R':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    
}

    private void endGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
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
 * Jared Note *  GeneralStoreView, InventoryView, StartProgramView - Team Assignment.
 * @author Chaskiel, Jared, Heather
 */
public class StartProgramView extends View{
    
    
    public String getInputs(){
        
    /*  
        getInputs(): String[] {

 inputs = new String array one element long
 Display a description of the view

valid = false
WHILE valid == false (no input value has been enterd)

Display the prompt message
Get the value entered from the keyboard
Trim off leading and trailing blanks from the value
IF length of the value < 1 then
Display "You must enter a non-blank value”
Continue (move to the top of the loop and repeat)
ENDIF
Assign the value to the fist position in the inputs array
valid = true (ends the loop)
ENDWHILE

RETURN inputs 
        
       */
    
    
    
     String inputs = new String();
    
        System.out.println("The Game is Starting!");
       
        boolean valid = false; 
       
        while (valid == false){
          
        
      
        
          System.out.println("Please Enter your Name");
          
          Scanner input = new Scanner(System.in);
          String name = input.nextLine();
          String trim = name.trim();
          
          int length = trim.length ();
          
          if (length < 1){
                 System.out.println("re-enter a name with more than one letter");
                 
          }
          else{
              valid = true;
              return trim;
          }
   
      } 
    
 
        
    System.out.println("getInput (called");
    
    //String[] inputs = new String [1];
    inputs = "testInput";

    return inputs;
    }
   
    public String playersName;
	
	//Start of code by Heather
@Override	
    public boolean doAction(String input) {
		playersName = input;
		Player player= GameController.savePlayer(playersName); 
		if (player == null) {
			System.out.println("Could not create the player. Enter a different name.");
			return false;
		}		
		System.out.println("** Welcome to the game " + playersName +"! **");
		
		return true;
    }
	
	public String getMenuInput() {
		
		System.out.println("Choose an option from the menu:");

		Scanner menuInput = new Scanner(System.in);
		String selection = menuInput.nextLine();

		return selection;
		}
            
    public void display(Player player) {
    /*    endOfView = false
    DO
           inputs = getInputs()
            IF no inputs were entered OR the first input is Q 
                    Return
                   ENDIF
                   endOfView = doAction(inputs)
                           
              WHILE endOfView != true
          */
    boolean endOfView = false;
    
	String input = getInputs();
            if (input.equals("") || input.equals("Q"))
			{
                    return; 
            }
	doAction(input/*, player*/);
	
    do {
        MainMenuView mainMenuView = new MainMenuView();
		mainMenuView.display();
		//System.out.println("Menu Here");
		endOfView = mainMenuView.doAction(getInput()/*, player*/);
		//System.out.println("Menu Here 2");
    }
    while (endOfView != true);
	
	
        
    }

 
   
}


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
 * @author Chaskiel
 */
public class StartProgramView {
	
	//public String[] inputs;
	
    public StartProgramView(){
    
    }
    
    
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
    
    
    
     String[] inputs = new String [1];
    
        System.out.println("this is the discription of the view");
       
        boolean valid = false; 
       
        while (valid == false){
          
        
      
        
          System.out.println("enter your name");
          
          Scanner input = new Scanner(System.in);
          String name = input.nextLine();
         String trim = name.trim();
          
          int length = trim.length ();
          
          if (length < 1){
                 System.out.println("re enter a name with more than one letter");
                 
          }
          else{
              valid = true;
              return trim;
          }
   
      } 
    
        
        
    System.out.println("getInput (called");
    
    String[] inputs = new String [1];
    inputs[0] = "testInput";

    return inputs;
    }
   
    public String playersName;
	
    private boolean doAction(String[] inputs){
    
    /* doAction(inputs): boolean {
		playersName = get the first value in the inputs array
		player = savePlayer(playersName)
		IF player == null
		display “Could not create the player. “ +
		“Enter a different name.”
		RETURN false
		ENDIF
		DISPLAY "================================================= "
		+ "Welcome to the game " + playersName
		+ "We hope you have a lot of fun!”
		+ "================================================= "
		mainMenuView = Create a new MainMenuView object
		mainMenuView.displayMainMenuView()
		RETURN true
	} */
		playersName = inputs[0];
		Player player = GameController.savePlayer(playersName); 
		if (player == null) {
			System.out.println("Could not create the player. Enter a different name.");
			return false;
		}		
		System.out.println("**Welcome to the game " + playersName +"!");
		mainMenuView = new MainMenuView();
    }
            
    public void display() {
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
    
    do {
        String[] input = getInputs();
            if (input.equals("") || input.equals("Q")){
                    return; 
                  
        }
    endOfView = doAction(input);
    
    
    }
    while (endOfView != true);
        
    }
 
   
    private String getInputs(){
        
    }
}


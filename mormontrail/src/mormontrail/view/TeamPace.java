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




class TeamPaceView{
    
    
public void displayMainMenuView(){
    boolean done = false;
    do{
        String menuOption= this.getMenuOption();
        if (menuOption.toUpperCase().equals("Q"))
            return;
        
        done=this.doAction(menuOption);
        
    }while (!done);
    
                
}


private String getMenuOption() {
    System.out.println( "n***** get menu option() function called *****");
    return "N";
    
} 
private boolean doAction(char menuOption){
   
     String distance;
    int teleNum;
    String inputTeleNum;
    String yes = "YES";
    String no = "NO";

    Scanner userInput = new Scanner(System.in);

    while (true) {

        System.out.println("Enter a distance:");
        distance = userInput.next();

        System.out.println("Are you sure? type YES or NO:");

        String input = userInput.next();

        if (input.equals(yes)) {
            System.out.println("you went: " + distance + " miles");
        } else if (input.equals(no)) {
            System.out.println("Enter another amount:");

        }
    
    }
}
public String getInput(){
Scanner keyboard = new Scanner(System.in);
boolean valid = false;
String selection = null;

while (!valid){
    
    selection = keyboard.nextLine();
    selection = selection.trim();
    
    if (selection.length() <1){
        System.out.println("invalid slection ***try again");
        continue;
    }
    break;
}
return selection;
}

    private boolean doAction(String menuOption) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 }

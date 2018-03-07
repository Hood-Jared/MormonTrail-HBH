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




class RiverCrossingView{
    
    
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
   
    switch (menuOption){
            case 'A': System.out.println("go around "); 
               goAround(); 
               break;

             case 'B': System.out.println("Find a path "); 
                findPath();
                break;
                

             case 'C': System.out.println("Take a ferry "); 
                payFerry();
                break;

              default:
                System.out.println("Enter a diffrent output.");
                break;
    }    
    return false;
    
    
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
private void payFerry(){
 
    
}
private void findPath(){
    
}
private void goAround(){
    
}

    private boolean doAction(String menuOption) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }

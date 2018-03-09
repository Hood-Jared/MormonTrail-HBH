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




public class RiverCrossingView extends View{
        
        
        	public RiverCrossingView(){
               super( "\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*"
                +"\n*                                          *"
                +"\n*   You have come accross a huge river     *"
                +"\n* You must decide wheither to go accross   *"
                +"\n*        or find another way around        *"
                +"\n*      Going accross can save you time     *"
                +"\n*       or it can be a huge mistake        *"
                +"\n*           Chose your fate                *"
                +"\n*             A: Go around                  *"
                +"\n*             B: Find a path               *"
                +"\n*             C: Pay Ferry                 *"
                +"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*");
    
               
                }

                   
                    

                
/*public void displayMainMenuView (){
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
*/
public boolean doAction(String value){
   
    switch (value){
            case "A": System.out.println("go around "); 
               goAround(); 
               break;

             case "B": System.out.println("Find a path "); 
                findPath();
                break;
                

             case "C": System.out.println("Take a ferry "); 
                payFerry();
                break;

              default:
                System.out.println("Enter a diffrent output.");
                break;
    }    
    return false;
    
  /*  
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
*/

    



  
}

    private void goAround() {
       System.out.println("It works");
    }

    private void findPath() {
       System.out.println("It works");
    }

    private void payFerry() {
        System.out.println("It works");
    }

}

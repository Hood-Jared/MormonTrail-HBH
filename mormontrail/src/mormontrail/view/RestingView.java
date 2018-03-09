/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package mormontrail.view;
import java.util.Scanner;
/**
 *
 * @author Chaskiel
 */
public class RestingView {
    
    int miles;
    String resting; 
    
    Scanner userInput = new Scanner(System.in);
    
public void displayRestingView() {
    boolean endOfView = false;
    
    do {
        int input = getInput();
        
      if(input>20) 
         return;
      
       endOfView = this.doAction(input);
    }while (!endOfView);
   
}  
private int getInput(){
 System.out.print("Enter distance: ");
 
 int distance;
 Scanner input = new Scanner(System.in);
 distance = input.nextInt();
 
    return distance;
}
 
   private boolean doAction(int input){
      int hoursToRest;
     hoursToRest = input*24/20; 
     System.out.println("You must rest " + hoursToRest +" hours");
      
       return true; 
   }
    
    
    
    
}

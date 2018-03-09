/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;

import mormontrail.model.Player;

/**
 *
 * @author jared
 */
public class StartExistingGameView extends View {
    
    
    public StartExistingGameView(){
               super( "\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*"
                +"\n*                                          *"
                +"\n*          Welcome to mormontrail          *"
                +"\n* a game of excitment and many decsisions  *"
                +"\n*        travel accross the country        *"
                +"\n*      to get to your destination          *"
                +"\n*       There are many challenges          *"
                +"\n*                Good Luck                 *"
                +"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*");
    
               
                }
@Override 
public boolean doAction(String value) {
    value = value.toUpperCase();
                    return false;
                   
                    
}
    
    
    }
    


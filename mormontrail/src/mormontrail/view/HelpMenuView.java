/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;


import mormontrail.view.MainMenuView;
/**
 *
 * @author heatherholt
 */
public class HelpMenuView {

	public boolean helpMenuView() {
		System.out.println("\n HELP MENU"
			 + "\n G - Game Objective"
			 + "\n M - How to move"
			 + "\n T - Tips"
			 + "\n R - Return to previous menu"
			 + "\n");
		return true;
	}
	
	public boolean doAction(String selection) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'G':
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
					+"\n*                                          *"
					+"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*");
                break;
            case 'M':
                System.out.println  ("\n               HOW TO MOVE                 *"
					+"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*"
					+"\n*                                          *"
					+"\n*     Each day you can change your pace    *"
					+"\n*         to move faster or slower.        *"
					+"\n*      See how far there is to go and      *"
					+"\n*            how far you've been           *"
					+"\n*           in the Game Play Menu.         *"
					+"\n*                                          *"
					+"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*");
                break;
            case 'T':
                System.out.println  ("\n                    TIPS                    *"
					+"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*"
					+"\n*                                          *"
					+"\n*          Always Caulk the Wagon!         *"
					+"\n*                                          *"
					+"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*");
                break;
            case 'R':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }
	
}

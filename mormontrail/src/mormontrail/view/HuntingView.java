/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;

/**
 *
 * @author heatherholt
 */
public class HuntingView extends View {

    public HuntingView() {
        super("\n"
                + "\n------------------------------"
                + "\n   This is the Hunting View   "
                + "\n   Press Q to return to the   "
                + "\n   Press  P previous view     "
                + "\n    Press  R View report      "
                + "\n------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        char charSel = value.charAt(0);

        switch (charSel) {
            case 'Q':
                return true;
                
                 case 'R': 
                     this.console.println("\n         Hunted            *"
                        + "\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*"
                        + "\n*                                          *"
                        + "\n*                  Deer                    *"
                        + "\n*                   Elk                    *"
                        + "\n*                  Rabbit                  *"
                        + "\n*                   Bear                   *"
                        + "\n*                   Duck                   *"
                        + "\n*                                          *"
                        + "\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*");
                   
               
                break;
        }
        return false;
    }

    private void report() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

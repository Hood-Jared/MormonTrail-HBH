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
                + "\n         previous view        "
                + "\n        View report           "
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
                     report();
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Input - Please try again.");
                break;
        }
        return false;
    }

    private void report() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

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
public class DailyTrailStopView extends View {
	
	public DailyTrailStopView() {
	super ("\n"
			+ "\n----------------------------------------"
			+ "\n    This is the Daily Trail Stop View   "
			+ "\n     Press H to see the Hunting View    "
			+ "\n         Press Q to return to the       "
			+ "\n               previous view            "
			+ "\n----------------------------------------");
}

	@Override
	public boolean doAction(String value) {
		value = value.toUpperCase();
		char charSel = value.charAt(0);

		switch (charSel) {
			case 'H':
				getMenu();
				break;
			case 'Q':
				return true;
			default:
				System.out.println("Invalid Input - Please try again.");
				break;
		}
		return false;
		}
	
	public void getMenu() {
		boolean end = false;
		while (!end) {
			HuntingView huntingView = new HuntingView();
			huntingView.display();
			end = huntingView.doAction(getInput());
		}		
    }
}

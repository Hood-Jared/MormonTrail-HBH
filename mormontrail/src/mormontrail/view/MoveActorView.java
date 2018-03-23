/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.view;

import mormontrail.controller.MapControl;
import mormontrail.exception.MapControllerException;
import mormontrail.model.Actor;
import mormontrail.model.Location;
import mormontrail.model.Player;

/**
 *
 * @author heatherholt
 */
public class MoveActorView extends View {
	
	public MoveActorView () {
		super();
	}
	
	
	private String[] getInputs() {
		String[] inputs = new String[2];
		
		System.out.println("To move an actor, please enter the new row and column.");
		String input1 = getInput();
		inputs[0] = input1;
		
		String input2 = getInput();
		inputs[1] = input2;
		
		return inputs;
	}
	
	private boolean doAction(String[] inputs) {
		String row = inputs[0];
		String column = inputs[1];
		int newRow = 0;
		int newCol = 0;
		try {
			newRow = Integer.parseInt(row);
			newCol = Integer.parseInt(column);
		} catch (NumberFormatException e) {
			System.out.println("The row and column must be a number.");
			return false;
		}
		
		Player player = mormontrail.Mormontrail.getPlayer();
		Actor actor = player.getPlayerActor();
		
		try {
			Location newLocation = MapControl.moveActor(actor, newRow, newCol);
		} catch (MapControllerException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		System.out.println(/*RegularScene.getdescription()*/"Scene Description");
		return true;
	}

	@Override
	public boolean doAction(String value) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}

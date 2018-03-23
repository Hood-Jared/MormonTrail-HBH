/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import mormontrail.model.Game;
import mormontrail.model.Location;
import mormontrail.model.LocationType;
import mormontrail.model.Map;
import mormontrail.model.LocationType;
import mormontrail.model.Player;
import mormontrail.view.StartProgramView;

/**
 *
 * @author Chaskiel
 */
public class Mormontrail {

    private static Game currentGame = null;
    private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Location locationEight = new Location();
		
		locationEight.setName("Fort Bridger");
		locationEight.setSceneType(LocationType.Fort);
		locationEight.setNextSettlement(9);
		locationEight.setDistanceFromNauvoo(413.5);
		locationEight.setDistanceToSaltLake(224.8);
		
		System.out.println(locationEight.toString());
		
		Map mapOne = new Map();
		
		mapOne.setDescription("A map");
		mapOne.setLocationSequence(8);
//		mapOne.setLocation(locationEight);
		
		System.out.println(mapOne.toString());
         */

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display(player);

    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Mormontrail.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Mormontrail.player = player;
    }

}

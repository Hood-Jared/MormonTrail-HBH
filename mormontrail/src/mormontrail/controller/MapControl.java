/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.controller;

import mormontrail.exception.MapControllerException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import static mormontrail.controller.GameController.createMap;
import mormontrail.model.Actor;
import mormontrail.model.Game;
import mormontrail.model.Location;
import mormontrail.model.Map;

/**
 *
 * @author Chaskiel
 */
/*
public class MapControl {
    
    
    
    
    private double ;
    
    private double ;
}
 */
public class MapControl {
	private static	Location[][] locations;
	private static int numberOfRows;
	private static int numberOfColumns;

	public static int getNumberOfRows() {
		return numberOfRows;
	}

	public static void setNumberOfRows(int _numberOfRows) {
		numberOfRows = _numberOfRows;
	}

	public static  int getNumberOfColumns() {
		return numberOfColumns;
	}

	public static void setNumberOfColumns(int _numberOfColumns) {
		numberOfColumns = _numberOfColumns;
	}
	
    public void createMap() throws MapControllerException {
        createMap cm = new createMap();
        cm.display();

    }

    void setDescription(String current_Location) throws MapControllerException {
        throw new MapControllerException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRow(int i) throws MapControllerException {
        throw new MapControllerException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setColumn(int i) throws MapControllerException {
        throw new MapControllerException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Location[][] getLocations() throws MapControllerException {
        throw new MapControllerException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class createMap {

        public createMap() {
        }

        private void display() throws MapControllerException {
            throw new MapControllerException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static Location[][] createLocations(int rows, int columns) throws MapControllerException {
		if (rows < 1 || columns < 1) {
			throw new MapControllerException("Check rows and/or columns.");
		}
		
		Location[][] locations = null;
		setNumberOfRows(rows);
		setNumberOfColumns(columns);
		return locations;
    }

    private static Scene[] createScenes() {

        return null;

    }

    private static void assignItemsToScenes(InventoryItems[] items,
            Scene[] scenes) {

    }

    private static void assignScenesToLocations(Scene[] scenes,
            Location[][] locations) {

    }

    private static class Scene {

        public Scene() {
        }
    }

		public static Location moveActor(Actor actor, int newRow, int newColumn) throws MapControllerException {
		/* public static Location moveActor(actor, newRow, newColumn) {
		if actor is null then
		throw MapControlException
		endIf
		game = get the currentGame in the main class
		map = get the map in the game object
		locations = get the locations in the map
		if (newRow < 1 OR newRow > noOfRows in map OR
		newColumn < 1 OR newColumn > noOfColumns in map) then
		throw MapControlException
		endIf
		currentRow = get the row from the actor
		currentColumn = get the column from the actor
		oldLocation = get the location from the locations
		array at the current row and column
		newLocation = get the location at the new row and column
		set actor in the oldLocation to null
		set actor in the newLocation to the actor
		set row in actor to newRow
		set column in actor to newColumn
		return newLocation
	    } */
		
		if (actor == null) {
			throw new MapControllerException("Missing actor.");
		}
		
		//game = mormontrail.Mormontrail.getCurrentGame();
		//map = Game.getMap();
		//locations1 = Map.getLocations();
		
		if (newRow < 1 || newRow > numberOfRows || newColumn < 1 || newColumn > numberOfColumns) {
			throw new MapControllerException("Check row and/or column.");
		}
		
		int currentRow = actor.getRow();
		int currentColumn = actor.getColumn();
		Location oldLocation = locations[currentRow][currentColumn];
		
		Location newLocation = locations[newRow][newColumn];
		
		locations[currentRow][currentColumn].setActor(null);
		locations[newRow][newColumn].setActor(actor);
		
		actor.setRow(newRow);
		actor.setColumn(newColumn);
		
		return newLocation;
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
	private static PrintWriter outFile = null;
	private static BufferedReader inFile = null;
	private static PrintWriter logFile = null;

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
		
		try {
			Mormontrail.inFile = new BufferedReader(new InputStreamReader(System.in));
			
			Mormontrail.outFile = new PrintWriter(System.out, true);
			
			Mormontrail.logFile = new PrintWriter("logFile.txt");
			
			StartProgramView startProgramView = new StartProgramView();
			startProgramView.display(player);
		
		} catch (Throwable e) {
			System.out.println("Exception: " + e.toString() +
								"\nCause: " + e.getCause() +
								"\nMessage: " + e.getMessage());
			e.printStackTrace();;
		}
		
		finally {
			
			try {
				if (Mormontrail.inFile != null)
					Mormontrail.inFile.close();
				if (Mormontrail.outFile != null)
					Mormontrail.outFile.close();
				if (Mormontrail.logFile != null)
					Mormontrail.logFile.close();
			} catch (IOException ex) {
				System.out.println("Error closing files");
				return;
			}
		}

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

	public static PrintWriter getOutFile() {
		return outFile;
	}

	public static void setOutFile(PrintWriter outFile) {
		Mormontrail.outFile = outFile;
	}

	public static BufferedReader getInFile() {
		return inFile;
	}

	public static void setInFile(BufferedReader inFile) {
		Mormontrail.inFile = inFile;
	}

	public static PrintWriter getLogFile() {
		return logFile;
	}

	public static void setLogFile(PrintWriter logFile) {
		Mormontrail.logFile = logFile;
	}
	
	
	

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import mormontrail.exception.GameControllerException;
import mormontrail.exception.InventoryItemsException;
import mormontrail.exception.MapControllerException;
import java.io.Serializable;
import static java.lang.System.console;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Random;
import static javafx.beans.binding.Bindings.length;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;
import mormontrail.Mormontrail;
import static mormontrail.controller.LocationsController.createLocations;
import mormontrail.model.Actor;
import mormontrail.model.Game;
import mormontrail.model.InventoryItem;
import mormontrail.controller.InventoryItems;
import mormontrail.model.ActorType;
import static mormontrail.model.ItemType.food;
import mormontrail.model.Location;
import mormontrail.model.Map;
import mormontrail.model.Player;
import java.io.PrintWriter;

/**
 *
 * @author jared, heather, chas
 */
public class GameController implements Serializable {

    public static void saveGame(Game game, String filePath) throws GameControllerException, IOException {
        
        if (game== null ||filePath.isEmpty()){
           throw new GameControllerException();
        }
        ObjectOutputStream output = new ObjectOutputStream(
           new FileOutputStream (filePath));           
            output.writeObject(game);
            
        
           
    }

    private Player player;
    private InventoryItems[] inventory;
    private Map map;
    
    
   

    public static int calcDailyFoodUsage(int amount, int noPeople) {

        /*calcDailyFoodUsage(noPeople, amount): int 
 
BEGIN 
 
 IF (noPeople < 1 OR noPeople > 5) THEN   RETURN -1 
 
 IF (amount < 3 OR amount > 5) THEN   RETURN -1 
 
 consumption = (amount * noPeople) 
 
 RETURN consumption 
 
END */
        if (amount < 3 || amount > 5) {
            return -1;
        }

        if (noPeople < 1 || noPeople > 5) {
            return -1;
        }

        return amount * noPeople;

    }

    public static int calcDailyTravel(int pace, int oxenStamina) {

        /* calcDailyTravel(pace, oxenStamina): int
				BEGIN
					IF (pace < 2 OR pace > 4) THEN RETURN -1
					IF (oxenStamina < 3 OR oxenStamina > 5) THEN RETURN -1
					RETURN pace*oxenStamina
				END */
        if (pace < 2 || pace > 4) {
            return -1;
        }
        if (oxenStamina < 3 || oxenStamina > 5) {
            return -1;
        }
        return pace * oxenStamina;

    }

    public static Player savePlayer(String playersName) throws GameControllerException {
        /* savePlayer(name): Player
			BEGIN
			if name is null OR length of name is < 1 THEN
			RETURN null
			ENDIF
			player = new Player object
			save the name in the player object
			save the player in the main class of the project
			RETURN player
			END */
        int length = playersName.length();
        if (playersName == null || length < 1) {
            return null;
        }
        Player player = new Player();
        Mormontrail.setPlayer(player);

        return player;
    }

    public static void displayGameController() {
        System.out.println("*** createNewGame called ***");

    }

    public static void display() throws GameControllerException {
        throw new GameControllerException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Player getPlayer() throws GameControllerException {
        System.out.println("*** getPlayer()called ***");
        throw new GameControllerException("Not supported yet.");

    }

    public static void createNewGame(Player player) throws MapControllerException, InventoryItemsException {
        if (player == null) {
            return;
        }

        Game game = new Game();
        game.setPlayer(player);
        Mormontrail.setCurrentGame(game);

        Actor[] actors = createActors();
        game.setActors(actors);
        player.setPlayerActor(actors[ActorType.Me.ordinal()]);

        InventoryItems[] items = createItems();
        game.setInventory(items);
        MapControl map = createMap(3, 3, items);
        game.setMap(map);

    }

    public static InventoryItems[] /*int[]*/ createItems(/*Array items*/) throws InventoryItemsException {

        InventoryItems[] num = /*{1, 2, 3}*/ null;
        InventoryItems food = new InventoryItems();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);

        InventoryItems ammo = new InventoryItems();
        ammo.setDescription("Ammo");
        ammo.setQuantityInStock(0);
        ammo.setRequiredAmount(0);

        InventoryItems wheel = new InventoryItems();
        wheel.setDescription("Wagon Wheel");
        wheel.setQuantityInStock(0);
        wheel.setRequiredAmount(0);

        return num;
    }

    public static MapControl createMap(int noOfRows,
            int noOfColumns,
            InventoryItems[] items) throws MapControllerException {

        if (noOfRows < 0 || noOfColumns < 0); else // if( items > 0 || int.length < 1);
        {
            return null;
        }

        MapControl location = new MapControl();
        location.setDescription("Current Location");
        location.setRow(0);
        location.setColumn(0);

        return location;

    }

    public static Actor[] createActors() {
        Actor[] actors = null;
        Actor ma = new Actor("Ma", 3, 40, 1, 2, 4, 150, 4);
        actors[ActorType.Ma.ordinal()] = ma;
        Actor pa = new Actor("Pa", 4, 42, 0, 4, 2, 300, 4);
        actors[ActorType.Pa.ordinal()] = pa;
        Actor brother = new Actor("Brother", 4, 18, 0, 3, 2, 200, 4);
        actors[ActorType.Brother.ordinal()] = brother;
        Actor sister = new Actor("Sister", 3, 15, 1, 2, 4, 100, 4);
        actors[ActorType.Sister.ordinal()] = sister;
        Actor me = new Actor("Player1", 3, 17, 1, 3, 3, 150, 4);
        actors[ActorType.Me.ordinal()] = me;

        return actors;
    }

   
    public static void getSavedGame(String filepath) throws GameControllerException {
        Game game = null;

        try (FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();
        } catch (Exception e) {
            throw new GameControllerException(e.getMessage());
        }

        Mormontrail.setCurrentGame(game);
    }

}

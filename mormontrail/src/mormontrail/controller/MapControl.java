/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.controller;

import mormontrail.exception.MapControllerException;
import java.io.Serializable;
import java.util.Objects;
import static mormontrail.controller.GameController.createMap;
import mormontrail.model.Location;

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

    private static Location[][] createLocations(int rows,
            int columns) {
        return null;

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

}

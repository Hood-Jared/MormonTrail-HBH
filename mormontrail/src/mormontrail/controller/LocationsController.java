package mormontrail.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Objects;
import mormontrail.Mormontrail;
import mormontrail.model.Location;
import mormontrail.model.Player;
/**
 *
 * @author Chaskiel
 */
public class LocationsController {
    
    public static Location[][] createLocations (int rows, int columns){
		
			
	if (rows <1 || columns < 1){
           return null;
        }
            
        Location [][] locations = new  Location [rows][columns];
             
        for (int i = 0; i< rows; i++){
            
        
            for (int j = 0; j< columns; j++){
            
              Location  temp = new Location();
                
               temp.setRows(i);
               temp.setColumns(j);
               temp.setVisited(false);
          
                       locations [i][j]= temp;
            }
      
            
    }
        return locations; 
    }
}
        


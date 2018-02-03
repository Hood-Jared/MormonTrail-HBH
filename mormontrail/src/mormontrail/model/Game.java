/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.model;

/**
*
* @author Chaskiel, Jared, Heather
*/

import java.io.Serializable;
import java.util.Objects;


public class Game implements Serializable{
   private String name;
   
    public Game() {
   }

    public String getDaysOnTrail() {
        return daysOnTrail;
    }

    public String getPace() {
        return name;
    }
    
}
